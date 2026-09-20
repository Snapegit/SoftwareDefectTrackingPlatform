const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootjxdz6143/",
            name: "springbootjxdz6143",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootjxdz6143/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "软件缺陷跟踪管理平台"
        } 
    }
}
export default base
