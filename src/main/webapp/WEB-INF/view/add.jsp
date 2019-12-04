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
  function  add(){
	  var param=$("form").serialize();
	  
	  $.post(
		"add",
		param,
		function(obj){
			if(obj){
				alert("添加成功");
				location.href="list";
			}else{
				alert("添加失败");
			}
		},
		"json"
	  );
  }
</script>
<body>
   <form action="add" method="post">
     <table>
        <tr>
          <td>商品名称</td>
          <td>
            <input type="text" name="gname">
          </td> 
        </tr>
        <tr>
          <td>发布时间</td>
          <td>
            <input type="text" name="datea">
          </td> 
        </tr>
        
        <tr>
          <td>品牌</td>
          <td>
            <select name="bid">
              <option value="">请选择品牌</option>
              <c:forEach items="${brands }" var="b">
               <option value="${b.bid }">${b.bname }</option>
              </c:forEach>
            </select>
          </td> 
        </tr>
        <tr>
          <td>分类</td>
          <td>
            <select name="tid">
              <option value="">请选择类别</option>
              <c:forEach items="${types }" var="t">
               <option value="${t.tid }">${t.tname }</option>
              </c:forEach>
            </select>
          </td> 
        </tr>
        <tr>
          <td>价格</td>
          <td>
            <input type="text" name="price">
          </td> 
        </tr>
        <tr>
          <td></td>
          <td>
            <input type="button" value="添加" onclick="add()">
          </td> 
        </tr>
     </table>
   </form>
</body>
</html>