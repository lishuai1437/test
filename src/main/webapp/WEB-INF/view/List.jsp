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
		<form action="<%=request.getContextPath()%>/goods/toList">
			商品名：<input type="text" name="gname" value="${gname }">
			<button>查询</button>
		</form>
		<a href="<%=request.getContextPath()%>/goods/toAdd"><button>添加</button></a>
		<button id="ps">批删</button>
		<table>
			<thead>
				<tr>
					<th>选择</th>
					<th>编号</th>
					<th>名称</th>
					<th>英文名称</th>
					<th>尺寸</th>
					<th>价格</th>
					<th>数量</th>
					<th>标签</th>
					<th>图片</th>
					<th>品牌</th>
					<th>种类</th>
					<th colspan="3">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list.list }" var="li">
					<tr>
						<td><input type="checkbox" name="ids" value="${li.gid }"></td>
						<td>${li.gid }</td>
						<td>${li.gname }</td>
						<td>${li.gEnglishName }</td>
						<td>${li.gsize }</td>
						<td>${li.gprice }</td>
						<td>${li.gnumber }</td>
						<td>${li.gtip }</td>
						<td><img alt="" src="${li.gpic }" width="80px" height="60px"></td>
						<td>${li.bname }</td>
						<td>${li.sname }</td>
						<td><button onclick="toDel(${li.gid })">删除</button></td>
						<td><a
							href="<%=request.getContextPath()%>/goods/toDetail/${li.gid }"><button>详情</button></a></td>
						<td><a
							href="<%=request.getContextPath()%>/goods/toUpdate/${li.gid }"><button>修改</button></a></td>
					</tr>
				</c:forEach>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="14"><input type="hidden" name="first" value="1">
						<input type="hidden" name="pre"
						value="${list.hasPreviousPage ? list.prePage : 1 }"> <input
						type="hidden" name="next"
						value="${list.hasNextPage ? list.nextPage : list.navigateLastPage }">
						<input type="hidden" name="last" value="${list.navigateLastPage }">

						<button id="first">首页</button>
						<button id="pre">上一页</button>
						<button id="next">下一页</button>
						<button id="last">尾页</button></td>
				</tr>
			</tfoot>
		</table>
	</div>
</body>
<script type="text/javascript">
	$(function () {
		function toDel(gid) {
			alert("确定要删除吗？");
			$.post("<%=request.getContextPath()%>/goods/toDel",{ids:gid},function(back){
				if(back>0){
					alert("删除成功");
					location="<%=request.getContextPath()%>/goods/toList";
				}
			},"json");
		}
		$("#ps").click(function () {
			alert("确定要删除吗？");
			var ids=$("[name='ids']:checked").map(function () {
				return $(this).val();
			}).get().join(",");
			toDel(ids);
		});
		
		$("#first").click(function () {
			var gname=$("[name='gname']").val();
			var first=$("[name='first']").val();
			location="<%=request.getContextPath()%>/goods/toList?pageNum="+first+"&gname="+gname;
		});
		$("#pre").click(function () {
			var gname=$("[name='gname']").val();
			var pre=$("[name='pre']").val();
			location="<%=request.getContextPath()%>/goods/toList?pageNum="+pre+"&gname="+gname;
		});
		$("#next").click(function () {
			var gname=$("[name='gname']").val();
			var next=$("[name='next']").val();
			location="<%=request.getContextPath()%>/goods/toList?pageNum="+next+"&gname="+gname;
		});
		$("#last").click(function () {
			var gname=$("[name='gname']").val();
			var last=$("[name='last']").val();
			location="<%=request.getContextPath()%>/goods/toList?pageNum="+ last + "&gname=" + gname;
		});

	});
</script>
</html>