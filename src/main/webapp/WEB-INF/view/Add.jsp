<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/index_work.css"
	rel="stylesheet">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<div align="center">
		<h2>增商品页面</h2>
		<form action="<%=request.getContextPath()%>/goods/add" method="post">
			<table>
				<tr>
					<td>名称：</td>
					<td><input type="text" name="gname"></td>
				</tr>
				<tr>
					<td>英文名称：</td>
					<td><input type="text" name="gEnglishName"></td>
				</tr>
				<tr>
					<td>品牌：</td>
					<td><select name="bid">
							<c:forEach items="${findBrand }" var="br">
								<option value="${br.bid }">${br.bname }</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>种类：</td>
					<td><select name="sid">
							<c:forEach items="${findGoodskind }" var="gs">
								<option value="${gs.sid }">${gs.sname }</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>尺寸：</td>
					<td><input type="text" name="gsize"></td>
				</tr>
				<tr>
					<td>单价：</td>
					<td><input type="text" name="gprice"></td>
				</tr>
				<tr>
					<td>数量：</td>
					<td><input type="text" name="gnumber"></td>
				</tr>
				<tr>
					<td>标签：</td>
					<td><input type="text" name="gtip"></td>
				</tr>
				<tr>
					<td>图片：</td>
					<td></td>
				</tr>
			</table>
			<button id="btn">添加</button>
		</form>
		
	</div>
</body>
<script type="text/javascript">
	$("#btn").click(function () {
		$.post("<%=request.getContextPath()%>/goods/add",$("form").serialize(),function(back){
			if(back>0){
				alert("添加成功");
				location="<%=request.getContextPath()%>/goods/toList";
			}else{
				alert("添加失败");
				return;
			}
			}, "json");
	});
</script>
</html>