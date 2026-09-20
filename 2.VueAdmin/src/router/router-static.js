import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import ceshiyongli from '@/views/modules/ceshiyongli/list'
    import quexianleibie from '@/views/modules/quexianleibie/list'
    import yonglileibie from '@/views/modules/yonglileibie/list'
    import syslog from '@/views/modules/syslog/list'
    import quexianwenti from '@/views/modules/quexianwenti/list'
    import xiangmuleibie from '@/views/modules/xiangmuleibie/list'
    import yonghu from '@/views/modules/yonghu/list'
    import quexianxinxi from '@/views/modules/quexianxinxi/list'
    import messages from '@/views/modules/messages/list'
    import config from '@/views/modules/config/list'
    import xiangmuxinxi from '@/views/modules/xiangmuxinxi/list'
    import newstype from '@/views/modules/newstype/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公告栏',
        component: news
      }
      ,{
	path: '/ceshiyongli',
        name: '测试用例',
        component: ceshiyongli
      }
      ,{
	path: '/quexianleibie',
        name: '缺陷类别',
        component: quexianleibie
      }
      ,{
	path: '/yonglileibie',
        name: '用例类别',
        component: yonglileibie
      }
      ,{
	path: '/syslog',
        name: '系统日志',
        component: syslog
      }
      ,{
	path: '/quexianwenti',
        name: '缺陷问题',
        component: quexianwenti
      }
      ,{
	path: '/xiangmuleibie',
        name: '项目类别',
        component: xiangmuleibie
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/quexianxinxi',
        name: '缺陷信息',
        component: quexianxinxi
      }
      ,{
	path: '/messages',
        name: '留言反馈',
        component: messages
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/xiangmuxinxi',
        name: '项目信息',
        component: xiangmuxinxi
      }
      ,{
	path: '/newstype',
        name: '公告栏分类',
        component: newstype
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
