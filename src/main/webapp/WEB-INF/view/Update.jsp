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
<div>
<h2>商品修改页面</h2>
		<form action="">
		<input type="text" name="gid" value="${goods.gid }">
			<table>
				<tr>
					<td>名称：</td>
					<td><input type="text" name="gname" value="${goods.gname }"></td>
				</tr>
				<tr>
					<td>英文名称：</td>
					<td><input type="text" name="gEnglishName"  value="${goods.gEnglishName }"></td>
				</tr>
				<tr>
					<td>品牌：</td>
					<td><select name="bid">
							<c:forEach items="${findBrand }" var="br">
								<option value="${br.bid }" ${goods.brand.bid==br.bid ? 'selected' : '' }>${br.bname }</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>种类：</td>
					<td><select name="sid">
							<c:forEach items="${findGoodskind }" var="gs">
								<option value="${gs.sid }"  ${goods.gs.bid==gs.sid ? 'selected' : '' }>${gs.sname }</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>尺寸：</td>
					<td><input type="text" name="gsize"  value="${goods.gsize }"></td>
				</tr>
				<tr>
					<td>单价：</td>
					<td><input type="text" name="gprice" value="${goods.gprice }"></td>
				</tr>
				<tr>
					<td>数量：</td>
					<td><input type="text" name="gnumber" value="${goods.gnumber }"></td>
				</tr>
				<tr>
					<td>标签：</td>
					<td><input type="text" name="gtip" value="${goods.gtip }"></td>
				</tr>
				<tr>
					<td>图片：</td>
					<td></td>
				</tr>
			</table>
		</form>
		<button id="btn">修改</button>
	</div>
</body>
<script type="text/javascript">
	$("#btn").click(function () {
		$.post("<%=request.getContextPath()%>/goods/update",$("form").serialize(),function(back){
			if(back>0){
				alert("修改成功");
				location="<%=request.getContextPath()%>/goods/toList";
			}
			}, "json");
	});
</script>
</html>