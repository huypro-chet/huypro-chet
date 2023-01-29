<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DÒ XỔ SỐ</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.8.3/angular.min.js"
	integrity="sha512-KZmyTq3PLx9EZl0RHShHQuXtrvdJ+m35tuOiwlcZfs/rE7NZv29ygNA8SFCkMXTnYZQK2OX0Gm2qKGfvWEtRXA=="
	crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/angular-messages/1.8.3/angular-messages.min.js"
	integrity="sha512-a+xgEyXVK7r+KKIDYyHtFfLi9LItmFDff6Z4/5lrGmL03u1vtFCjQXQz3dSIwOapB3YIRMBO1+IQj6ptnxAh/A=="
	crossorigin="anonymous" referrerpolicy="no-referrer"></script>
</head>

<body ng-app="myapp" ng-controller="mycontroller">
	<header>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="container-fluid">
				<a class="navbar-brand" href="#">HUY LEE</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="#">Check tickets</a></li>
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="#">Contact</a></li>
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="#">News</a></li>
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="#">Action</a></li>

					</ul>
					<form class="d-flex">
						<input class="form-control me-2" type="search"
							placeholder="Search" aria-label="Search">
						<button class="btn btn-outline-success" type="submit">Search</button>
					</form>
				</div>
			</div>
		</nav>
	</header>
	<main>
		<div class="container">
			<div class="row">
				<div class="col-4">
					<form action="/KQXS" class="Do-KQXS" name="DoKQXS" method="post"
						novalidate>
						<div class="d-lg-flex justify-content-around">
							<select name="chontinh" id="tinh-id" class="form-select col-5"
								aria-label="Default select example"
								onchange="chonTinhOnChange()">

							</select>
							<div class="col-2 hidden-lg"></div>
							<select name="chonngay" id="ngay-id" class="form-select col-5"
								aria-label="Default select example">
							</select>
						</div>
						<div class="d-flex" style="margin-left: -58%;">
							<div class="mb-3 mt-3 me-4 col-12">
								<label for="mave" class="form-label">DÃY SỐ CỦA BẠN</label> <input
									type="text" class="form-control" id="mave" name="mave"
									aria-describedby="maveHelp" placeholder="Nhập dãy số..."
									ng-model="MaVeModel" minlength="5" maxlength="6" required
									pattern="^[0-9]+$">
							</div>
							<div class="mb-3 mt-5 col-8">
								<button type="submit" class="btn btn-primary"
									formaction="/Result" onclick="getListGiai()"
									style="background-color: #A40E0D; border: none;">KẾT
									QUẢ</button>
							</div>
							<h1>${message}</h1>
						</div>
						<!-- ERROR FOR MAVE -->
						<div ng-if="DoKQXS.$submitted || DoKQXS.mave.$dirty"
							ng-messages="DoKQXS.mave.$error"
							style="color: #D10024; margin-left: -58%;" role="alert">
							<div ng-message="required">
								<strong>Dãy số không được để trống!</strong>
							</div>
							<div ng-message="pattern">
								<strong>Chỉ được nhập số!</strong>
							</div>
							<div ng-message="minlength">
								<strong>Vui lòng nhập đúng dãy số trên vé!</strong>
							</div>
							<div ng-message-default>
								<strong>Dãy số không phù hợp!</strong>
							</div>
						</div>
					</form>

				</div>
			</div>
			<div class="row">
				<div class="col-4">
					<script language="javascript"
						src="https://www.minhngoc.net.vn/jquery/jquery-1.7.2.js"></script>
					<link rel="stylesheet" type="text/css"
						href="https://www.minhngoc.net.vn/style/bangketqua_mini.css" />
					<div id="box_kqxs_minhngoc">
						<script language="javascript">
							bgcolor = "#9c0303";
							titlecolor = "#ffffff";
							dbcolor = "#0000c2";
							fsize = "14px";
							kqwidth = "500px";
						</script>
						<script language="javascript"
							src="https://www.minhngoc.net.vn/getkqxs${tinh != null ? tinh : '/tp-hcm'}${ngay}.js"></script>
					</div>
				</div>
			</div>
		</div>
	</main>
	<footer>
		<p class="mt-5 p-4 bg-dark text-white text-center">@2023 - Bản
			Quyền Huylee Huymat890@gmail.com</p>
	</footer>

	<script type="text/javascript">
		// đổ dữ liệu thong tin tinh do ve so
		for (var option of document.getElementById("box_kqxs_tinh").options) {
			document.getElementById("tinh-id").add(option);
		}

		// đổ dữ liệu thong tin ngay do ve so
		for (var option of document.getElementById("box_kqxs_ngay").options) {
			document.getElementById("ngay-id").add(option);
		}

		// cập nhật bang do
		document.getElementById("box_kqxs_tinh").onchange();

		// Thêm sk the tinh
		var chonTinhOnChange = function () {
			// cập nhật lại bảng kết quả 
			let scriptEle = document.createElement("script");
			let tinh = document.getElementById("tinh-id").value;
			let ngay = document.getElementById("ngay-id").value;
			let src = "//www.minhngoc.com.vn/getkqxs/" + tinh + "/" + ngay + ".js";
			scriptEle.setAttribute("src", src);
			document.getElementById("box_kqxs_minhngoc").appendChild(scriptEle);

			scriptEle.onload = function () {
				// đổ dữ liệu thẻ select ngày
				document.getElementById("ngay-id").innerText = null;
				for (var option of document.getElementById("box_kqxs_ngay").options) {
					document.getElementById("ngay-id").add(option);
				}
			}
			document.getElementById("box_kqxs_tinh").onchange();
			document.getElementById("box_kqxs_ngay").onchange();
		}

		// Gửi list giải về cho server
		
			// cập nhật lại bảng kết quả xổ số khi dò kết quả
			let scriptEle = document.createElement("script");
			let tinh = document.getElementById("tinh-id").value;
			let ngay = document.getElementById("ngay-id").value;
			let src = "//www.minhngoc.com.vn/getkqxs/" + tinh + "/" + ngay + ".js";
			scriptEle.setAttribute("src", src);
			document.getElementById("box_kqxs_minhngoc").appendChild(scriptEle);

			scriptEle.onload = function () {
				// tao json giai do ve
				var listGiai = {
					tinh: document.getElementById("box_kqxs_tinh").value,
					ngay: document.getElementById("box_kqxs_ngay").value,
					giaidb: document.getElementsByClassName("giaidb")[0].innerText,
					giai1: document.getElementsByClassName("giai1")[0].innerText,
					giai2: document.getElementsByClassName("giai2")[0].innerText,
					giai3: document.getElementsByClassName("giai3")[0].innerText,
					giai4: document.getElementsByClassName("giai4")[0].innerText,
					giai5: document.getElementsByClassName("giai5")[0].innerText,
					giai6: document.getElementsByClassName("giai6")[0].innerText,
					giai7: document.getElementsByClassName("giai7")[0].innerText,
					giai8: document.getElementsByClassName("giai8")[0].innerText
				}
				console.log(listGiai)
				$.ajax({
					type: "POST",
					url: window.location.href,
					data: listGiai,
					success: function (result) {
						console.log("Post JSON Success")
					},
					error: function (result) {
						console.log("Post JSON error")
					}
				})
			}
		

		var app = angular.module("myapp", ['ngMessages']);
		app.controller("mycontroller", function ($scope, $window, $rootScope) {

		});
	</script>
</body>
</html>