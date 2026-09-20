<template>
<div :style='{"width":"100%","padding":"20px 10%","margin":"10px auto","position":"relative","background":"#fff"}'>
    <el-form
	  :style='{"width":"100%","padding":"20px 0","position":"relative","background":"#f9f9f9"}'
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="150px"
    >
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="缺陷名称" prop="quexianmingcheng">
            <el-input  v-model="ruleForm.quexianmingcheng" 
                placeholder="缺陷名称" clearable :readonly=" false  ||ro.quexianmingcheng"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}'  label="缺陷类别" prop="quexianleibie">
            <el-select v-model="ruleForm.quexianleibie" placeholder="请选择缺陷类别"  >
              <el-option
                  v-for="(item,index) in quexianleibieOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="缺陷图片" v-if="type!='cross' || (type=='cross' && !ro.quexiantupian)" prop="quexiantupian">
            <file-upload
            tip="点击上传缺陷图片"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.quexiantupian?ruleForm.quexiantupian:''"
            @change="quexiantupianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' class="upload" v-else label="缺陷图片" prop="quexiantupian">
                <img v-if="ruleForm.quexiantupian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.quexiantupian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.quexiantupian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="管理项目" prop="guanlixiangmu">
            <el-input  v-model="ruleForm.guanlixiangmu" 
                placeholder="管理项目" clearable :readonly=" false  ||ro.guanlixiangmu"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="缺陷资料" prop="quexianziliao">
            <file-upload
            tip="点击上传缺陷资料"
            action="file/upload"
            :limit="1"
            :multiple="true"
            :fileUrls="ruleForm.quexianziliao?ruleForm.quexianziliao:''"
            @change="quexianziliaoUploadChange"
            ></file-upload>
          </el-form-item>  
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="发现时间" prop="faxianshijian">
              <el-date-picker
				  :disabled=" false  ||ro.faxianshijian"
                  value-format="yyyy-MM-dd HH:mm:ss"
                  v-model="ruleForm.faxianshijian" 
                  type="datetime"
                  placeholder="发现时间">
              </el-date-picker>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="缺陷描述" prop="quexianmiaoshu">
            <el-input
              type="textarea"
              :rows="8"
              placeholder="缺陷描述"
              v-model="ruleForm.quexianmiaoshu">
            </el-input>
          </el-form-item>

      <el-form-item :style='{"padding":"0","margin":"0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"4px","background":"#654B3C","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"1px solid #654B3C","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#654B3C","borderRadius":"4px","background":"rgba(255, 255, 255, 1)","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
      return {
        id: '',
        baseUrl: '',
        ro:{
            quexianmingcheng : false,
            quexianleibie : false,
            quexiantupian : false,
            quexianmiaoshu : false,
            guanlixiangmu : false,
            quexianziliao : false,
            faxianshijian : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          quexianmingcheng: '',
          quexianleibie: '',
          quexiantupian: '',
          quexianmiaoshu: '',
          guanlixiangmu: '',
          quexianziliao: '',
          faxianshijian: '',
        },
        quexianleibieOptions: [],


        rules: {
          quexianmingcheng: [
          ],
          quexianleibie: [
          ],
          quexiantupian: [
          ],
          quexianmiaoshu: [
          ],
          guanlixiangmu: [
          ],
          quexianziliao: [
          ],
          faxianshijian: [
          ],
        },
		centerType: false,
      };
    },
    computed: {



    },
    components: {
    },
    created() {
		if(this.$route.query.centerType){
			this.centerType = true
		}
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
      this.ruleForm.faxianshijian = this.getCurDateTime()
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='quexianmingcheng'){
              this.ruleForm.quexianmingcheng = obj[o];
              this.ro.quexianmingcheng = true;
              continue;
            }
            if(o=='quexianleibie'){
              this.ruleForm.quexianleibie = obj[o];
              this.ro.quexianleibie = true;
              continue;
            }
            if(o=='quexiantupian'){
              this.ruleForm.quexiantupian = obj[o].split(",")[0];
              this.ro.quexiantupian = true;
              continue;
            }
            if(o=='quexianmiaoshu'){
              this.ruleForm.quexianmiaoshu = obj[o];
              this.ro.quexianmiaoshu = true;
              continue;
            }
            if(o=='guanlixiangmu'){
              this.ruleForm.guanlixiangmu = obj[o];
              this.ro.guanlixiangmu = true;
              continue;
            }
            if(o=='quexianziliao'){
              this.ruleForm.quexianziliao = obj[o];
              this.ro.quexianziliao = true;
              continue;
            }
            if(o=='faxianshijian'){
              this.ruleForm.faxianshijian = obj[o];
              this.ro.faxianshijian = true;
              continue;
            }
          }
        }else if(type=='edit'){
			this.info()
		}
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
          }
        });
        this.$http.get('option/quexianleibie/quexianleibie', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.quexianleibieOptions = res.data.data;
          }
        });
      },

    // 多级联动参数
      // 多级联动参数
      info() {
        this.$http.get(`quexianxinxi/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

			//更新跨表属性
			var crossuserid;
			var crossrefid;
			var crossoptnum;
			this.$refs["ruleForm"].validate(valid => {
				if(valid) {
					if(this.type=='cross'){
						var statusColumnName = localStorage.getItem('statusColumnName');
						var statusColumnValue = localStorage.getItem('statusColumnValue');
						if(statusColumnName && statusColumnName!='') {
							var obj = JSON.parse(localStorage.getItem('crossObj'));
							if(!statusColumnName.startsWith("[")) {
								for (var o in obj){
									if(o==statusColumnName){
										obj[o] = statusColumnValue;
									}
								}
								var table = localStorage.getItem('crossTable');
								this.$http.post(table+'/update', obj).then(res => {});
							} else {
								crossuserid=Number(localStorage.getItem('frontUserid'));
								crossrefid=obj['id'];
								crossoptnum=localStorage.getItem('statusColumnName');
								crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
							}
						}
					}
					if(crossrefid && crossuserid) {
						this.ruleForm.crossuserid=crossuserid;
						this.ruleForm.crossrefid=crossrefid;
						var params = {
							page: 1,
							limit: 10,
							crossuserid:crossuserid,
							crossrefid:crossrefid,
						}
						this.$http.get('quexianxinxi/list', {
							params: params
						}).then(res => {
							if(res.data.data.total>=crossoptnum) {
								this.$message({
									message: localStorage.getItem('tips'),
									type: 'success',
									duration: 1500,
								});
								return false;
							} else {
								// 跨表计算


								this.$http.post(`quexianxinxi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
									if (res.data.code == 0) {
										this.$message({
											message: '操作成功',
											type: 'success',
											duration: 1500,
											onClose: () => {
												this.$router.go(-1);
											}
										});
									} else {
										this.$message({
											message: res.data.msg,
											type: 'error',
											duration: 1500
										});
									}
								});
							}
						});
					} else {


						this.$http.post(`quexianxinxi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
							if (res.data.code == 0) {
								this.$message({
									message: '操作成功',
									type: 'success',
									duration: 1500,
									onClose: () => {
										this.$router.go(-1);
									}
								});
							} else {
								this.$message({
									message: res.data.msg,
									type: 'error',
									duration: 1500
								});
							}
						});
					}
				}
			});
		},
		// 获取uuid
		getUUID () {
			return new Date().getTime();
		},
		// 返回
		back() {
			this.$router.go(-1);
		},
      quexiantupianUploadChange(fileUrls) {
          this.ruleForm.quexiantupian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
      quexianziliaoUploadChange(fileUrls) {
          this.ruleForm.quexianziliao = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item ::v-deep .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #666;
	  font-weight: 500;
	  width: 150px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item ::v-deep .el-form-item__content {
	  margin-left: 150px;
	}
	
	.add-update-preview .el-input ::v-deep .el-input__inner {
	  border: 1px solid #000000;
	  border-radius: 4px;
	  padding: 0 12px;
	  outline: none;
	  color: #000;
	  width: 400px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-select ::v-deep .el-input__inner {
	  border: 1px solid #000000;
	  border-radius: 4px;
	  padding: 0 10px;
	  outline: none;
	  color: #000;
	  width: auto;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor ::v-deep .el-input__inner {
	  border: 1px solid #000000;
	  border-radius: 4px;
	  padding: 0 10px 0 30px;
	  outline: none;
	  color: #000;
	  width: auto;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview ::v-deep .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview ::v-deep .upload .upload-img {
	  border: 1px dashed #000;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #000;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview ::v-deep .el-upload-list .el-upload-list__item {
	  border: 1px dashed #000;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #000;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview ::v-deep .el-upload .el-icon-plus {
	  border: 1px dashed #000;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #000;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview .el-textarea ::v-deep .el-textarea__inner {
	  border: 1px solid #000000;
	  border-radius: 4px;
	  padding: 12px;
	  color: #000;
	  width: 400px;
	  font-size: 14px;
	  min-height: 120px;
	  height: auto;
	}
</style>
