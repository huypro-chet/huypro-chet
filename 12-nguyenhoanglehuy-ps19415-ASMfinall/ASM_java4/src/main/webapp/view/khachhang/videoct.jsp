<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/comlic/taglib.jsp"%>
<!DOCTYPE html>
<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="<c:url value='/template/khachhang/assets/css/video.css'/>">
<link
	href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap"
	rel="stylesheet">
<title>${sanpham.tensp}</title>
<%@ include file="/comlic/head.jsp"%>
</head>

<body>

	<%@ include file="/comlic/header.jsp"%>
	<!-- ***** Header Area End ***** -->

	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="page-content">

					<!-- ***** Banner Start ***** -->
					<div class="main-banner">
						<div class="row">
							<div class="col-lg-7">
								<div class="header-text">
									<h6>WELCOME FC BARCELONA</h6>
									<h4>
										<em>BARCELONA IS FOREVER TOP </em>FOREVER BEAUTIFUL
									</h4>
									<div class="main-button">
										<a href="#">XEM</a>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!-- ***** Banner End ***** -->

					<!-- ***** Most Popular Start ***** -->
					<div class="most-popular1">
						<div class="row">
							<div class="col-lg-12">
								<div class="heading-section">
									<h4>
										<em>VIDEO</em>${sanpham.tensp}
									</h4>
								</div>
								<div class="gird grid__col-10">
									<div class="row">
										<div class="row_video">
											<div class="item-video">
												<iframe class="video2" style="width: 100%" height=500px
													src="https://www.youtube.com/embed/${sanpham.codelink }"></iframe>
												<h3>${sanpham.tensp}</h3>
												<h6>${sanpham.motasp}</h6>
											<c:if test="${not empty sessionScope.CurrenTaikhoan}">
												<div class="main-button">
													<a href="<c:url value='/videoct?action=like&id=${sanpham.codelink}'/>">
														 <c:choose>
															<c:when test="${flaglikebtn==true}">
																UNLIKE
															</c:when>
															<c:otherwise>
																LIKE
															</c:otherwise>
														</c:choose> 
													</a>
												</div>
											<!-- <div class="main-button1">
													<a href="<c:url value='/videoct?action=like&id=${sanpham.codelink}'/>">SHARE</a>
												</div>-->
											</c:if>
											</div>
										</div>
									</div>
								</div>
							</div>
							<!-- ***** Most Popular End ***** -->

							<!-- ***** Gaming Library Start ***** -->

							<!-- ***** Gaming Library End ***** -->
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="/comlic/Footter.jsp"%>
</body>

</html>