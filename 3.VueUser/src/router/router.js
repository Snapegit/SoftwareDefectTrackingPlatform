import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Messages from '../pages/messages/list'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import xiangmuleibieList from '../pages/xiangmuleibie/list'
import xiangmuleibieDetail from '../pages/xiangmuleibie/detail'
import xiangmuleibieAdd from '../pages/xiangmuleibie/add'
import yonglileibieList from '../pages/yonglileibie/list'
import yonglileibieDetail from '../pages/yonglileibie/detail'
import yonglileibieAdd from '../pages/yonglileibie/add'
import quexianleibieList from '../pages/quexianleibie/list'
import quexianleibieDetail from '../pages/quexianleibie/detail'
import quexianleibieAdd from '../pages/quexianleibie/add'
import xiangmuxinxiList from '../pages/xiangmuxinxi/list'
import xiangmuxinxiDetail from '../pages/xiangmuxinxi/detail'
import xiangmuxinxiAdd from '../pages/xiangmuxinxi/add'
import ceshiyongliList from '../pages/ceshiyongli/list'
import ceshiyongliDetail from '../pages/ceshiyongli/detail'
import ceshiyongliAdd from '../pages/ceshiyongli/add'
import quexianxinxiList from '../pages/quexianxinxi/list'
import quexianxinxiDetail from '../pages/quexianxinxi/detail'
import quexianxinxiAdd from '../pages/quexianxinxi/add'
import quexianwentiList from '../pages/quexianwenti/list'
import quexianwentiDetail from '../pages/quexianwenti/detail'
import quexianwentiAdd from '../pages/quexianwenti/add'
import syslogList from '../pages/syslog/list'
import syslogDetail from '../pages/syslog/detail'
import syslogAdd from '../pages/syslog/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'messages',
					component: Messages
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'xiangmuleibie',
					component: xiangmuleibieList
				},
				{
					path: 'xiangmuleibieDetail',
					component: xiangmuleibieDetail
				},
				{
					path: 'xiangmuleibieAdd',
					component: xiangmuleibieAdd
				},
				{
					path: 'yonglileibie',
					component: yonglileibieList
				},
				{
					path: 'yonglileibieDetail',
					component: yonglileibieDetail
				},
				{
					path: 'yonglileibieAdd',
					component: yonglileibieAdd
				},
				{
					path: 'quexianleibie',
					component: quexianleibieList
				},
				{
					path: 'quexianleibieDetail',
					component: quexianleibieDetail
				},
				{
					path: 'quexianleibieAdd',
					component: quexianleibieAdd
				},
				{
					path: 'xiangmuxinxi',
					component: xiangmuxinxiList
				},
				{
					path: 'xiangmuxinxiDetail',
					component: xiangmuxinxiDetail
				},
				{
					path: 'xiangmuxinxiAdd',
					component: xiangmuxinxiAdd
				},
				{
					path: 'ceshiyongli',
					component: ceshiyongliList
				},
				{
					path: 'ceshiyongliDetail',
					component: ceshiyongliDetail
				},
				{
					path: 'ceshiyongliAdd',
					component: ceshiyongliAdd
				},
				{
					path: 'quexianxinxi',
					component: quexianxinxiList
				},
				{
					path: 'quexianxinxiDetail',
					component: quexianxinxiDetail
				},
				{
					path: 'quexianxinxiAdd',
					component: quexianxinxiAdd
				},
				{
					path: 'quexianwenti',
					component: quexianwentiList
				},
				{
					path: 'quexianwentiDetail',
					component: quexianwentiDetail
				},
				{
					path: 'quexianwentiAdd',
					component: quexianwentiAdd
				},
				{
					path: 'syslog',
					component: syslogList
				},
				{
					path: 'syslogDetail',
					component: syslogDetail
				},
				{
					path: 'syslogAdd',
					component: syslogAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
