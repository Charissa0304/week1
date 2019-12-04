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
  function fh(){
	  history.back();
  }
</script>
<body>
   <form action="look" method="post">
     <table>
     <tr>
          <td></td>
          <td>
            <input type="hidden" name="gid" value="${g.gid }">
          </td> 
        </tr>
        <tr>
          <td>商品名称</td>
          <td>
            <input type="text" name="gname" value="${g.gname }">
          </td> 
        </tr>
        <tr>
          <td>发布时间</td>
          <td>
            <input type="text" name="datea" value="${g.datea }">
          </td> 
        </tr>
        
        <tr>
          <td>品牌</td>
          <td>
            <select name="bid">
              <option value="">请选择品牌</option>
              <c:forEach items="${brands }" var="b">
               <option value="${b.bid }" ${g.bid==b.bid?'selected':'' }>${b.bname }</option>
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
               <option value="${t.tid }" ${g.tid==t.tid?'selected':'' }>${t.tname }</option>
              </c:forEach>
            </select>
          </td> 
        </tr>
        <tr>
          <td>价格</td>
          <td>
            <input type="text" name="price" value="${g.price }">
          </td> 
        </tr>
        <tr>
          <td></td>
          <td>
            <input type="button" value="返回" onclick="fh()">
          </td> 
        </tr>
     </table>
   </form>
</body>
</html>