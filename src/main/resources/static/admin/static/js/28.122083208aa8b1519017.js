webpackJsonp([28],{"6QYC":function(t,e){},e0an:function(t,e,s){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var i={name:"moduleDetail",props:{isEdit:{type:Boolean,default:!1}},data:function(){return{postForm:{id:"",title:""}}},created:function(){var t=this.$route.query&&this.$route.query.id;this.queryByPrimaryKey(t)},watch:{},methods:{queryByPrimaryKey:function(t){var e=this;e.$http.get(e.api.queryTTitleByPrimaryKey,{params:{id:t}},function(t){0==t.code?(e.postForm=t.content,e.$message({type:"success",message:"查询成功",duration:2e3})):e.$message({type:"error",message:t.msg,duration:2e3})},function(t){e.$message({type:"warning",message:"请求异常",duration:1e3})})},routerToList:function(){window.open("#/TTitleModuleList","_self")}}},r={render:function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",{staticClass:"app-form mt20 ml40"},[s("h5",{staticClass:"form-tit"},[t._v("查看")]),t._v(" "),s("section",[s("el-form",{ref:"postForm",attrs:{model:t.postForm,rules:t.rules,"label-width":"180px",size:"mini","inline-message":!0}},[s("div",{staticClass:"mt30 ml15"},[s("el-form-item",{attrs:{label:"id："}},[s("el-input",{attrs:{maxlength:"100",disabled:!0},model:{value:t.postForm.id,callback:function(e){t.$set(t.postForm,"id",e)},expression:"postForm.id"}})],1),t._v(" "),s("el-form-item",{attrs:{label:"title："}},[s("el-input",{attrs:{maxlength:"100",disabled:!0},model:{value:t.postForm.title,callback:function(e){t.$set(t.postForm,"title",e)},expression:"postForm.title"}})],1)],1)])],1),t._v(" "),s("div",{staticClass:"mt40 ml40"},[s("el-button",{staticClass:"el-button-search",attrs:{type:"primary"},on:{click:function(e){return t.routerToList()}}},[t._v("返回列表")])],1)])},staticRenderFns:[]};var o=s("VU/8")(i,r,!1,function(t){s("6QYC")},null,null);e.default=o.exports}});