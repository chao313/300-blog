var queryBase = "http://127.0.0.1:8000/demomaster/TTitleController/queryBase";
var host = "";

/* 设置后台项目名称 */
var BASE_URL = host + '/demomaster';


function queryUrlParam(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); // 匹配目标参数
    var result = window.location.search.substr(1).match(reg); // 对querystring匹配目标参数
    if (result != null) {
        return decodeURIComponent(result[2]);
    } else {
        return null;
    }
}

/*后台的URL*/

/* TPic */
/*根据主键更新TPic */
var updateTPicByPrimaryKey = BASE_URL + '/TPicController/updateByPrimaryKey';
/*单条插入TPic */
var insertTPic = BASE_URL + '/TPicController/insert';
/*根据主键删除TPic */
var deleteTPicByPrimaryKey = BASE_URL + '/TPicController/deleteByPrimaryKey';
/*根据主键查询TPic */
var queryTPicByPrimaryKey = BASE_URL + '/TPicController/queryByPrimaryKey';
/*多条件查询TPic */
var queryBaseTPic = BASE_URL + '/TPicController/queryBase';
/*批量插入TPic */
var insertsTPic = BASE_URL + '/TPicController/inserts';
/*多条件更新TPic */
var updateBaseTPic = BASE_URL + '/TPicController/updateBase';

/* TAuthor */
/*根据主键更新TAuthor */
var updateTAuthorByPrimaryKey = BASE_URL + '/TAuthorController/updateByPrimaryKey';
/*单条插入TAuthor */
var insertTAuthor = BASE_URL + '/TAuthorController/insert';
/*根据主键删除TAuthor */
var deleteTAuthorByPrimaryKey = BASE_URL + '/TAuthorController/deleteByPrimaryKey';
/*根据主键查询TAuthor */
var queryTAuthorByPrimaryKey = BASE_URL + '/TAuthorController/queryByPrimaryKey';
/*多条件查询TAuthor */
var queryBaseTAuthor = BASE_URL + '/TAuthorController/queryBase';
/*批量插入TAuthor */
var insertsTAuthor = BASE_URL + '/TAuthorController/inserts';
/*多条件更新TAuthor */
var updateBaseTAuthor = BASE_URL + '/TAuthorController/updateBase';

/* TBlog */
/*根据主键更新TBlog */
var updateTBlogByPrimaryKey = BASE_URL + '/TBlogController/updateByPrimaryKey';
/*单条插入TBlog */
var insertTBlog = BASE_URL + '/TBlogController/insert';
/*根据主键删除TBlog */
var deleteTBlogByPrimaryKey = BASE_URL + '/TBlogController/deleteByPrimaryKey';
/*根据主键查询TBlog */
var queryTBlogByPrimaryKey = BASE_URL + '/TBlogController/queryByPrimaryKey';
/*多条件查询TBlog */
var queryBaseTBlog = BASE_URL + '/TBlogController/queryBase';
/*批量插入TBlog */
var insertsTBlog = BASE_URL + '/TBlogController/inserts';
/*多条件更新TBlog */
var updateBaseTBlog = BASE_URL + '/TBlogController/updateBase';

/* TComment */
/*根据主键更新TComment */
var updateTCommentByPrimaryKey = BASE_URL + '/TCommentController/updateByPrimaryKey';
/*单条插入TComment */
var insertTComment = BASE_URL + '/TCommentController/insert';
/*根据主键删除TComment */
var deleteTCommentByPrimaryKey = BASE_URL + '/TCommentController/deleteByPrimaryKey';
/*根据主键查询TComment */
var queryTCommentByPrimaryKey = BASE_URL + '/TCommentController/queryByPrimaryKey';
/*多条件查询TComment */
var queryBaseTComment = BASE_URL + '/TCommentController/queryBase';
/*批量插入TComment */
var insertsTComment = BASE_URL + '/TCommentController/inserts';
/*多条件更新TComment */
var updateBaseTComment = BASE_URL + '/TCommentController/updateBase';

/* TTitle */
/*根据主键更新TTitle */
var updateTTitleByPrimaryKey = BASE_URL + '/TTitleController/updateByPrimaryKey';
/*单条插入TTitle */
var insertTTitle = BASE_URL + '/TTitleController/insert';
/*根据主键删除TTitle */
var deleteTTitleByPrimaryKey = BASE_URL + '/TTitleController/deleteByPrimaryKey';
/*根据主键查询TTitle */
var queryTTitleByPrimaryKey = BASE_URL + '/TTitleController/queryByPrimaryKey';
/*多条件查询TTitle */
var queryBaseTTitle = BASE_URL + '/TTitleController/queryBase';
/*批量插入TTitle */
var insertsTTitle = BASE_URL + '/TTitleController/inserts';
/*多条件更新TTitle */
var updateBaseTTitle = BASE_URL + '/TTitleController/updateBase';

/* TStatistics */
/*根据主键更新TStatistics */
var updateTStatisticsByPrimaryKey = BASE_URL + '/TStatisticsController/updateByPrimaryKey';
/*单条插入TStatistics */
var insertTStatistics = BASE_URL + '/TStatisticsController/insert';
/*根据主键删除TStatistics */
var deleteTStatisticsByPrimaryKey = BASE_URL + '/TStatisticsController/deleteByPrimaryKey';
/*根据主键查询TStatistics */
var queryTStatisticsByPrimaryKey = BASE_URL + '/TStatisticsController/queryByPrimaryKey';
/*多条件查询TStatistics */
var queryBaseTStatistics = BASE_URL + '/TStatisticsController/queryBase';
/*批量插入TStatistics */
var insertsTStatistics = BASE_URL + '/TStatisticsController/inserts';
/*多条件更新TStatistics */
var updateBaseTStatistics = BASE_URL + '/TStatisticsController/updateBase';


var vue = new Vue({
    el: "#body",
    data: {
        alertError: "系统错误，请联系管理员！",
        alertSuccess: "操作成功",

        BASE_URL: BASE_URL,

        host: host,

        titles: [{
            id: '',
            title: ''
        }],

        /*存储TPic多个结果*/
        TPics: [{
            id: null,
            picPath: null,
            alt: null
        }]
        ,
        /*存储TAuthor多个结果*/
        TAuthors: [{
            id: null,
            qq: null,
            weChat: null
        }]
        ,
        /*存储TBlog多个结果*/
        TBlogs: [{
            id: null,
            title: null,
            img: null,
            time: null,
            type: null,
            lookSum: null,
            content: null
        }]
        ,
        /*存储TComment多个结果*/
        TComments: [{
            id: null,
            name: null,
            email: null,
            content: null,
            blongBlogId: null,
            createTime: null
        }]
        ,
        /*存储TTitle多个结果*/
        TTitles: [{
            id: null,
            title: null
        }]
        ,
        /*存储TStatistics多个结果*/
        TStatisticss: [{
            id: null,
            total: null,
            runTime: null
        }]

        ,

        /*存储TPic单个结果*/
        TPic: {
            id: null,
            picPath: null,
            alt: null
        }
        ,
        /*存储TAuthor单个结果*/
        TAuthor: {
            id: null,
            qq: null,
            weChat: null
        }
        ,
        /*存储TBlog单个结果*/
        TBlog: {
            id: null,
            title: null,
            img: null,
            time: null,
            type: null,
            lookSum: null,
            content: null
        }
        ,
        /*存储TComment单个结果*/
        TComment: {
            id: null,
            name: null,
            email: null,
            content: null,
            blongBlogId: null,
            createTime: null
        }
        ,
        /*存储TTitle单个结果*/
        TTitle: {
            id: null,
            title: null
        }
        ,
        /*存储TStatistics单个结果*/
        TStatistics: {
            id: null,
            total: null,
            runTime: null
        }

        ,
        /*存储TPic插入结果*/
        TPicInsert: {
            id: null,
            picPath: null,
            alt: null
        }
        ,
        /*存储TAuthor插入结果*/
        TAuthorInsert: {
            id: null,
            qq: null,
            weChat: null
        }
        ,
        /*存储TBlog插入结果*/
        TBlogInsert: {
            id: null,
            title: null,
            img: null,
            time: null,
            type: null,
            lookSum: null,
            content: null
        }
        ,
        /*存储TComment插入结果*/
        TCommentInsert: {
            id: null,
            name: null,
            email: null,
            content: null,
            blongBlogId: null,
            createTime: null
        }
        ,
        /*存储TTitle插入结果*/
        TTitleInsert: {
            id: null,
            title: null
        }
        ,
        /*存储TStatistics插入结果*/
        TStatisticsInsert: {
            id: null,
            total: null,
            runTime: null
        }

        ,
        /*存储TPic主键更新*/
        TPicUpdateByPrimaryKey: {
            source: {
                picPath: null,
                alt: null
            }
            ,
            target: {
                id: null,
            }
        }
        ,
        /*存储TAuthor主键更新*/
        TAuthorUpdateByPrimaryKey: {
            source: {
                qq: null,
                weChat: null
            }
            ,
            target: {
                id: null,
            }
        }
        ,
        /*存储TBlog主键更新*/
        TBlogUpdateByPrimaryKey: {
            source: {
                title: null,
                img: null,
                time: null,
                type: null,
                lookSum: null,
                content: null
            }
            ,
            target: {
                id: null,
            }
        }
        ,
        /*存储TComment主键更新*/
        TCommentUpdateByPrimaryKey: {
            source: {
                name: null,
                email: null,
                content: null,
                blongBlogId: null,
                createTime: null
            }
            ,
            target: {
                id: null,
            }
        }
        ,
        /*存储TTitle主键更新*/
        TTitleUpdateByPrimaryKey: {
            source: {
                title: null
            }
            ,
            target: {
                id: null,
            }
        }
        ,
        /*存储TStatistics主键更新*/
        TStatisticsUpdateByPrimaryKey: {
            source: {
                total: null,
                runTime: null
            }
            ,
            target: {
                id: null,
            }
        }

        ,
        /*存储TPic更新*/
        TPicUpdateBase: {
            source: {
                id: null,
                picPath: null,
                alt: null
            }
            ,
            target: {
                id: null,
                picPath: null,
                alt: null
            }
        }
        ,
        /*存储TAuthor更新*/
        TAuthorUpdateBase: {
            source: {
                id: null,
                qq: null,
                weChat: null
            }
            ,
            target: {
                id: null,
                qq: null,
                weChat: null
            }
        }
        ,
        /*存储TBlog更新*/
        TBlogUpdateBase: {
            source: {
                id: null,
                title: null,
                img: null,
                time: null,
                type: null,
                lookSum: null,
                content: null
            }
            ,
            target: {
                id: null,
                title: null,
                img: null,
                time: null,
                type: null,
                lookSum: null,
                content: null
            }
        }
        ,
        /*存储TComment更新*/
        TCommentUpdateBase: {
            source: {
                id: null,
                name: null,
                email: null,
                content: null,
                blongBlogId: null,
                createTime: null
            }
            ,
            target: {
                id: null,
                name: null,
                email: null,
                content: null,
                blongBlogId: null,
                createTime: null
            }
        }
        ,
        /*存储TTitle更新*/
        TTitleUpdateBase: {
            source: {
                id: null,
                title: null
            }
            ,
            target: {
                id: null,
                title: null
            }
        }
        ,
        /*存储TStatistics更新*/
        TStatisticsUpdateBase: {
            source: {
                id: null,
                total: null,
                runTime: null
            }
            ,
            target: {
                id: null,
                total: null,
                runTime: null
            }
        }

        ,
        /*存储TPic多条件查询条件*/
        TPicQueryBase: {
            id: null,
            picPath: null,
            alt: null
        }
        ,
        /*存储TAuthor多条件查询条件*/
        TAuthorQueryBase: {
            id: null,
            qq: null,
            weChat: null
        }
        ,
        /*存储TBlog多条件查询条件*/
        TBlogQueryBase: {
            id: null,
            title: null,
            img: null,
            time: null,
            type: null,
            lookSum: null,
            content: null
        }
        ,
        /*存储TComment多条件查询条件*/
        TCommentQueryBase: {
            id: null,
            name: null,
            email: null,
            content: null,
            blongBlogId: null,
            createTime: null
        }
        ,
        /*存储TTitle多条件查询条件*/
        TTitleQueryBase: {
            id: null,
            title: null
        }
        ,
        /*存储TStatistics多条件查询条件*/
        TStatisticsQueryBase: {
            id: null,
            total: null,
            runTime: null
        }


    },
    created() {

    },
    methods: {
        /*处理queryByPrimaryKey*/
        /*主键更新TPic*/
        updateTPicByPrimaryKey() {
            let self = this;
            axios.post(updateTPicByPrimaryKey, self.TPicUpdateByPrimaryKey)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        if (data.content == true)
                            alert("delete 成功");
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*插入TPic*/
        insertTPic() {
            let self = this;
            axios.post(insertTPic, self.TPicInsert)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        if (data.content == true)
                            alert("insert 成功");
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*主键删除TPic*/
        deleteTPicByPrimaryKey(id) {
            let self = this;
            axios.post(deleteTPicByPrimaryKey, {
                params: {
                    id: id
                }
            }).then(function (response) {
                let data = response.data;
                console.log(data);
                if (data.code == 0) {
                    if (data.content == true)
                        alert("delete 成功");
                } else {
                    alert(data.msg);
                }
            }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*主键查询TPic*/
        queryTPicByPrimaryKey(id) {
            let self = this;
            axios.get(queryTPicByPrimaryKey, {
                params: {
                    id: id
                }
            }).then(function (response) {
                let data = response.data;
                console.log(data);
                if (data.code == 0) {
                    self.TPic = data.content;
                    console.log(self.TPic);
                } else {
                    alert(data.msg);
                }
            }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*多条件查询TPic*/
        queryBaseTPic() {
            let self = this;
            axios.post(queryBaseTPic, self.TPicQueryBase)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        self.TPics = data.content;
                        console.log(self.TPic);
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*多条件更新TPic*/
        updateBaseTPic() {
            let self = this;
            axios.post(updateBaseTPic, self.TPicUpdateBase)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        if (data.content == true)
                            alert("delete 成功");
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*主键更新TAuthor*/
        updateTAuthorByPrimaryKey() {
            let self = this;
            axios.post(updateTAuthorByPrimaryKey, self.TAuthorUpdateByPrimaryKey)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        if (data.content == true)
                            alert("delete 成功");
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*插入TAuthor*/
        insertTAuthor() {
            let self = this;
            axios.post(insertTAuthor, self.TAuthorInsert)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        if (data.content == true)
                            alert("insert 成功");
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*主键删除TAuthor*/
        deleteTAuthorByPrimaryKey(id) {
            let self = this;
            axios.post(deleteTAuthorByPrimaryKey, {
                params: {
                    id: id
                }
            }).then(function (response) {
                let data = response.data;
                console.log(data);
                if (data.code == 0) {
                    if (data.content == true)
                        alert("delete 成功");
                } else {
                    alert(data.msg);
                }
            }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*主键查询TAuthor*/
        queryTAuthorByPrimaryKey(id) {
            let self = this;
            axios.get(queryTAuthorByPrimaryKey, {
                params: {
                    id: id
                }
            }).then(function (response) {
                let data = response.data;
                console.log(data);
                if (data.code == 0) {
                    self.TAuthor = data.content;
                    console.log(self.TAuthor);
                } else {
                    alert(data.msg);
                }
            }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*多条件查询TAuthor*/
        queryBaseTAuthor() {
            let self = this;
            axios.post(queryBaseTAuthor, self.TAuthorQueryBase)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        self.TAuthors = data.content;
                        console.log(self.TAuthor);
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*多条件更新TAuthor*/
        updateBaseTAuthor() {
            let self = this;
            axios.post(updateBaseTAuthor, self.TAuthorUpdateBase)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        if (data.content == true)
                            alert("delete 成功");
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*主键更新TBlog*/
        updateTBlogByPrimaryKey() {
            let self = this;
            axios.post(updateTBlogByPrimaryKey, self.TBlogUpdateByPrimaryKey)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        if (data.content == true)
                            alert("delete 成功");
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*插入TBlog*/
        insertTBlog() {
            let self = this;
            axios.post(insertTBlog, self.TBlogInsert)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        if (data.content == true)
                            alert("insert 成功");
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*主键删除TBlog*/
        deleteTBlogByPrimaryKey(id) {
            let self = this;
            axios.post(deleteTBlogByPrimaryKey, {
                params: {
                    id: id
                }
            }).then(function (response) {
                let data = response.data;
                console.log(data);
                if (data.code == 0) {
                    if (data.content == true)
                        alert("delete 成功");
                } else {
                    alert(data.msg);
                }
            }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*主键查询TBlog*/
        queryTBlogByPrimaryKey(id) {
            let self = this;
            axios.get(queryTBlogByPrimaryKey, {
                params: {
                    id: id
                }
            }).then(function (response) {
                let data = response.data;
                console.log(data);
                if (data.code == 0) {
                    self.TBlog = data.content;
                    console.log(self.TBlog);
                } else {
                    alert(data.msg);
                }
            }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*多条件查询TBlog*/
        queryBaseTBlog() {
            let self = this;
            axios.post(queryBaseTBlog, self.TBlogQueryBase)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        self.TBlogs = data.content;
                        console.log(self.TBlog);
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*多条件更新TBlog*/
        updateBaseTBlog() {
            let self = this;
            axios.post(updateBaseTBlog, self.TBlogUpdateBase)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        if (data.content == true)
                            alert("delete 成功");
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*主键更新TComment*/
        updateTCommentByPrimaryKey() {
            let self = this;
            axios.post(updateTCommentByPrimaryKey, self.TCommentUpdateByPrimaryKey)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        if (data.content == true)
                            alert("delete 成功");
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*插入TComment*/
        insertTComment() {
            let self = this;
            axios.post(insertTComment, self.TCommentInsert)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        if (data.content == true)
                            alert("insert 成功");
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*主键删除TComment*/
        deleteTCommentByPrimaryKey(id) {
            let self = this;
            axios.post(deleteTCommentByPrimaryKey, {
                params: {
                    id: id
                }
            }).then(function (response) {
                let data = response.data;
                console.log(data);
                if (data.code == 0) {
                    if (data.content == true)
                        alert("delete 成功");
                } else {
                    alert(data.msg);
                }
            }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*主键查询TComment*/
        queryTCommentByPrimaryKey(id) {
            let self = this;
            axios.get(queryTCommentByPrimaryKey, {
                params: {
                    id: id
                }
            }).then(function (response) {
                let data = response.data;
                console.log(data);
                if (data.code == 0) {
                    self.TComment = data.content;
                    console.log(self.TComment);
                } else {
                    alert(data.msg);
                }
            }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*多条件查询TComment*/
        queryBaseTComment() {
            let self = this;
            axios.post(queryBaseTComment, self.TCommentQueryBase)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        self.TComments = data.content;
                        console.log(self.TComment);
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*多条件更新TComment*/
        updateBaseTComment() {
            let self = this;
            axios.post(updateBaseTComment, self.TCommentUpdateBase)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        if (data.content == true)
                            alert("delete 成功");
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*主键更新TTitle*/
        updateTTitleByPrimaryKey() {
            let self = this;
            axios.post(updateTTitleByPrimaryKey, self.TTitleUpdateByPrimaryKey)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        if (data.content == true)
                            alert("delete 成功");
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*插入TTitle*/
        insertTTitle() {
            let self = this;
            axios.post(insertTTitle, self.TTitleInsert)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        if (data.content == true)
                            alert("insert 成功");
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*主键删除TTitle*/
        deleteTTitleByPrimaryKey(id) {
            let self = this;
            axios.post(deleteTTitleByPrimaryKey, {
                params: {
                    id: id
                }
            }).then(function (response) {
                let data = response.data;
                console.log(data);
                if (data.code == 0) {
                    if (data.content == true)
                        alert("delete 成功");
                } else {
                    alert(data.msg);
                }
            }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*主键查询TTitle*/
        queryTTitleByPrimaryKey(id) {
            let self = this;
            axios.get(queryTTitleByPrimaryKey, {
                params: {
                    id: id
                }
            }).then(function (response) {
                let data = response.data;
                console.log(data);
                if (data.code == 0) {
                    self.TTitle = data.content;
                    console.log(self.TTitle);
                } else {
                    alert(data.msg);
                }
            }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*多条件查询TTitle*/
        queryBaseTTitle() {
            let self = this;
            axios.post(queryBaseTTitle, self.TTitleQueryBase)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        self.TTitles = data.content;
                        console.log(self.TTitle);
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*多条件更新TTitle*/
        updateBaseTTitle() {
            let self = this;
            axios.post(updateBaseTTitle, self.TTitleUpdateBase)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        if (data.content == true)
                            alert("delete 成功");
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*主键更新TStatistics*/
        updateTStatisticsByPrimaryKey() {
            let self = this;
            axios.post(updateTStatisticsByPrimaryKey, self.TStatisticsUpdateByPrimaryKey)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        if (data.content == true)
                            alert("delete 成功");
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*插入TStatistics*/
        insertTStatistics() {
            let self = this;
            axios.post(insertTStatistics, self.TStatisticsInsert)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        if (data.content == true)
                            alert("insert 成功");
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*主键删除TStatistics*/
        deleteTStatisticsByPrimaryKey(id) {
            let self = this;
            axios.post(deleteTStatisticsByPrimaryKey, {
                params: {
                    id: id
                }
            }).then(function (response) {
                let data = response.data;
                console.log(data);
                if (data.code == 0) {
                    if (data.content == true)
                        alert("delete 成功");
                } else {
                    alert(data.msg);
                }
            }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*主键查询TStatistics*/
        queryTStatisticsByPrimaryKey(id) {
            let self = this;
            axios.get(queryTStatisticsByPrimaryKey, {
                params: {
                    id: id
                }
            }).then(function (response) {
                let data = response.data;
                console.log(data);
                if (data.code == 0) {
                    self.TStatistics = data.content;
                    console.log(self.TStatistics);
                } else {
                    alert(data.msg);
                }
            }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*多条件查询TStatistics*/
        queryBaseTStatistics() {
            let self = this;
            axios.post(queryBaseTStatistics, self.TStatisticsQueryBase)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        self.TStatisticss = data.content;
                        console.log(self.TStatistics);
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        /*多条件更新TStatistics*/
        updateBaseTStatistics() {
            let self = this;
            axios.post(updateBaseTStatistics, self.TStatisticsUpdateBase)
                .then(function (response) {
                    let data = response.data;
                    console.log(data);
                    if (data.code == 0) {
                        if (data.content == true)
                            alert("delete 成功");
                    } else {
                        alert(data.msg);
                    }
                }).catch(
                function (response) {
                    //失败回调
                    alert(this.alertErrorValue)
                })
        },
        queryTBlogByType(type) {
            let self = this;
            self.TBlogQueryBase.type = type;
            this.queryBaseTBlog();
        },
        insertTCommentByTBlogId(TblogId) {
            let self = this;
            self.TCommentInsert.blongBlogId = TblogId;
            self.insertTComment();
            self.TCommentInsert = {};
            this.queryTCommentByBlogId(TblogId);
        },
        queryTCommentByBlogId(TblogId) {
            let self = this;
            self.TCommentQueryBase.blongBlogId = TblogId;
            this.queryBaseTComment();
        },

    }
});