<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>CarManagerSystem</title>
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
		crossorigin="anonymous">
	<link
		href="//cdn.datatables.net/2.0.8/css/dataTables.dataTables.min.css"
		rel="stylesheet">
	<link rel="stylesheet" type="text/css"
		href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"
		integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g=="
		crossorigin="anonymous" referrerpolicy="no-referrer">
	<link href="${pageContext.request.contextPath}/css/styles.css"
		rel="stylesheet">
</head>

<body class="bg-dark text-light">

	<nav class="navbar navbar-dark bg-dark">
		<form class="container" method="get">
			<a class="navbar-brand text-center" href="">CarManagerSystem <i
				class="fa-solid fa-car"></i></a>
			<div class="d-flex align-items-center">
				<p class="mb-0 me-3">
					Bienvenido <strong>${sessionScope.username}</strong>
					(${sessionScope.email})
				</p>
				<a href="${pageContext.request.contextPath}/logout"
					class="btn btn-secondary" role="button">Cerrar sesión</a>
			</div>
		</form>
	</nav>

	<div class="container">
		<h2 class="text-center text-light">Direcciones</h2>

		<table class="table table-dark table-striped" id="tblDirecciones">
			<thead>
				<tr>
					<th></th>
					<th>Usuario</th>
					<th>Correo</th>
					<th>Dirección</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="a" items="${addresses}">
					<tr>
						<td><c:out value="${a.getUser().getId()}" /></td>
						<td><c:out value="${a.getUser().getUsername()}" /></td>
						<td><c:out value="${a.getUser().getEmail()}" /></td>
						<td><c:out value="${a.getStreet()} ${a.getNumber()}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>   
				
	</div>




	<script src="https://code.jquery.com/jquery-3.7.1.min.js"
		integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
		crossorigin="anonymous"></script>
	<script src="https://cdn.datatables.net/2.0.8/js/dataTables.min.js"></script>

	<script>
		$(document).ready(() => {
			$('#tblDirecciones').DataTable();
		});
	</script>

</body>
</html>