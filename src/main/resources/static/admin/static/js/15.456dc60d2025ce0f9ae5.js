webpackJsonp([15],{DWdr:function(t,e){},kl2x:function(t,e,i){"use strict";Object.defineProperty(e,"__esModule",{value:!0});i("0xDb");var a={data:function(){return{policyIdList:[],policyId:"",statuses:[{value:1,title:"生效"},{value:2,title:"失效"},{value:null,title:"全部"}],status:"",dataList:[],total:-1,currentPage:1,pageSize:10,start:"",end:"",plateNo:"",exitStation:"",exitStationList:[],resultDetail:{},viewDialogVisible:!1,startTime:"",endTime:"",timeRange:[],registId:"",jsonData:"",search:{id:"",title:""}}},mounted:function(){},created:function(){this.queryBase()},watch:{},methods:{queryBase:function(){var t=this,e=new FormData;null!=t.search.id&&""!=t.search.id&&e.append("id",t.search.id),null!=t.search.title&&""!=t.search.title&&e.append("title",t.search.title);var i={};e.forEach(function(t,e){return i[e]=t}),t.$http.post(t.api.queryBaseTTitle,i,{},function(e){t.dataList=e.content},function(e){t.$message({type:"warning",message:"请求异常",duration:1e3})})},deleteByPrimaryKey:function(t){var e=this;this.$confirm("是否删除该条数据？","提示",{confirmButtonText:"确定",cancelButtonText:"取消",center:!0}).then(function(){e.$http.get(e.api.deleteTTitleByPrimaryKey,{params:{id:t}},function(t){0==t.code?1==t.content?(e.$message({type:"success",message:"删除成功",duration:2e3}),e.queryBase()):e.$message({type:"warning",message:"删除失败",duration:2e3}):e.$message({type:"error",message:t.msg,duration:2e3})},function(t){console.log(t),e.$message({type:"error",message:"请求异常",duration:2e3})})})},routerToView:function(t){var e="";e=e+"id="+t,window.open("#/TTitleModuleView?"+e,"_self")},routerToEdit:function(t){var e="";e=e+"id="+t,window.open("#/TTitleModuleEdit?"+e,"_self")},routerToAdd:function(){window.open("#/TTitleModuleAdd","_self")},searchEvent:function(){this.queryBase()},searchRest:function(){this.search.id="",this.search.title="",this.queryBase()}}},n={render:function(){var t=this,e=t.$createElement,i=t._self._c||e;return i("div",{staticClass:"app-container"},[i("div",{staticClass:"mt20"},[i("el-form",{attrs:{inline:!0,size:"mini"}},[i("el-form-item",{attrs:{label:"id"}},[i("el-input",{attrs:{placeholder:"请输入"},model:{value:t.search.id,callback:function(e){t.$set(t.search,"id",e)},expression:"search.id"}})],1),t._v(" "),i("el-form-item",{attrs:{label:"title"}},[i("el-input",{attrs:{placeholder:"请输入"},model:{value:t.search.title,callback:function(e){t.$set(t.search,"title",e)},expression:"search.title"}})],1),t._v(" "),i("el-form-item",[i("el-button",{staticClass:"el-button-search",attrs:{type:"primary"},on:{click:function(e){return t.searchEvent()}}},[t._v("查询")])],1),t._v(" "),i("el-form-item",[i("el-button",{staticClass:"el-button-search",attrs:{type:"primary"},on:{click:function(e){return t.searchRest()}}},[t._v("重置\n                ")])],1),t._v(" "),i("el-form-item",[i("el-button",{staticClass:"el-button-search",attrs:{type:"primary"},on:{click:function(e){return t.routerToAdd()}}},[t._v("添加\n                ")])],1)],1)],1),t._v(" "),i("div",{staticClass:"app-list"},[i("div",{staticClass:"app-tab"},[i("table",[t._m(0),t._v(" "),t._m(1),t._v(" "),i("tbody",t._l(t.dataList,function(e,a){return i("tr",[i("td",[t._v(t._s(a+1))]),t._v(" "),i("td",[t._v(t._s(e.id))]),t._v(" "),i("td",[t._v(t._s(e.title))]),t._v(" "),i("td",[i("span",{on:{click:function(i){return t.routerToView(e.id)}}},[t._v("查看")]),t._v(" "),i("span",{on:{click:function(i){return t.routerToEdit(e.id)}}},[t._v("编辑")]),t._v(" "),i("span",{on:{click:function(i){return t.deleteByPrimaryKey(e.id)}}},[t._v("删除")])])])}),0)]),t._v(" "),i("p",{directives:[{name:"show",rawName:"v-show",value:0==t.total,expression:"total == 0"}],staticClass:"no-data-tip"},[t._v("没有找到相关数据！")]),t._v(" "),i("div",[i("pre",[t._v(t._s(t.jsonData))])])]),t._v(" "),i("div",{directives:[{name:"show",rawName:"v-show",value:t.total>0,expression:"total > 0"}],staticClass:"mt20"},[i("el-pagination",{attrs:{background:"","current-page":t.currentPage,"page-size":t.pageSize,layout:"total,prev, pager, next",total:t.total},on:{"current-change":t.handleCurrentChange,"update:currentPage":function(e){t.currentPage=e},"update:current-page":function(e){t.currentPage=e}}})],1)])])},staticRenderFns:[function(){var t=this.$createElement,e=this._self._c||t;return e("thead",[e("tr",[e("th",[this._v("id")]),this._v(" "),e("th",[this._v("id")]),this._v(" "),e("th",[this._v("title")]),this._v(" "),e("th",[this._v("操作")])])])},function(){var t=this.$createElement,e=this._self._c||t;return e("tr",[e("th",[this._v("序号")]),this._v(" "),e("th"),this._v(" "),e("th",[this._v("栏目名称")]),this._v(" "),e("th",[this._v("操作")])])}]};var s=i("VU/8")(a,n,!1,function(t){i("DWdr")},null,null);e.default=s.exports}});