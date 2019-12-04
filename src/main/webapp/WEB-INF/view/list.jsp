<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/resource/mystyles.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
</head>
<script type="text/javascript">
//全选
   function qx(){
	  $("[name='gid']").attr("checked",true);
		  
   }
   //添加
   function add(){
	   location.href="toAdd";
   }
   //修改
   function update(gid){
	   location.href="toUpdate?gid="+gid;
   }
   //查询
   function look(gid){
	   
	   location.href="toLook?gid="+gid
   }
   //批量删除
   function delAll(){
	   var gid="";
	   $("[name='gid']:checked").each(function(){
		   gid+=","+$(this).val();
	   })
	   gid=gid.substring(1);
	   if(confirm("确定要删除吗")){
		   $.post(
			"delete",
			{"gid":gid},
			function(obj){
				if(obj){
					alert("删除成功");
					location.href="list";
				}else{
					alert("删除失败");
				}
			},
			"json"
		   );
	   }
   }
</script>
<body>
  <form action="list" method="post">
     商品名称:<input type="text" name="gname" value="${gname }">
     <input type="submit" value="搜索">
     <input type="button" value="添加" onclick="add()">
  </form>
  <table>
    <tr>
      <td>
        <input type="checkbox" value="全选" onclick="qx()">全选
      </td>
      <td>编号</td>
       <td>商品名称</td>
        <td>发布时间</td>
         <td>品牌</td>
          <td>分类</td>
          <td>价格</td>
           <td>操作</td>
    </tr>
    <c:forEach items="${list }" var="g">
      <tr>
         <td><input type="checkbox" name="gid" value="${g.gid }"></td>
         <td>${g.gid }</td>
         <td>${g.gname }</td>
         <td>${g.datea }</td>
         <td>${g.bnames }</td>
         <td>${g.tnames }</td>
         <td>${g.price }</td>
         
         <td>
           <input type="button" value="详情" onclick="look(${g.gid})">
           <input type="button" value="编辑" onclick="update(${g.gid})">
            
         </td>
      </tr>
    </c:forEach>
    <tr>
      <td colspan="10">
      <input type="button" value="批量删除" onclick="delAll()">
         当前是${info.pageNum }/${info.pages } 页,共有${info.total }条数据
         <a href="list?pageNum=1&gname=${gname }">首页</a>
          <a href="list?pageNum=${info.prePage }&gname=${gname }">上一页</a>
           <a href="list?pageNum=${info.nextPage }&gname=${gname }">下一页</a>
            <a href="list?pageNum=${info.pages }&gname=${gname }">尾页</a>
      </td>
    </tr>
  </table>
</body>
</html>