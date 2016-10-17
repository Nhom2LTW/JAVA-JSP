<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calendar</title>
<link rel="stylesheet" type="text/css"
	href="angular-validate/font-awesome-4.6.3/css/font-awesome.css">
<script type="text/javascript" src="angular-validate/angular.min.js"></script>
<!-- bootstrap -->
<script type="text/javascript" src="bootstrap/js/jquery-3.1.0.min.js"></script>
<script type="text/javascript" src="datepick/moment.min.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="datepick/bootstrap-datetimepicker.min.js"></script>
<script type="text/javascript" src="datepick/vi.js"></script>
<link rel="stylesheet" type="text/css"
	href="bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="datepick/bootstrap-datetimepicker.min.css">
<!--  -->
<script type="text/javascript" src="bootstrap/js.js"></script>
<link rel="stylesheet" type="text/css" href="bootstrap/Css.css">
<script>
		$(document).ready(function(){
		    $("#nut").click(function(){
		        $("#container").show();
		    });
		});
</script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div id="main">
	<div id="main-container">
		<div id="main-user">
			<div class="col-md-6" style="height: 60px; background-color: #2F4F4F">
				<div>
					<button id="button-TAO" type="button" class="btn btn-danger" 
					onclick="location.href='taosukien.jsp'">TẠO</a></button>
				</div>
			</div>
			<div class="col-md-6" style="background-color: #2F4F4F">
				<form style="margin-left: 266px">
					<img src="img/main-user.png">
					<div class="btn-group">
						<button type="button" class="btn btn-success">Đức Việt</button>
						<button type="button" class="btn btn-success dropdown-toggle"
							data-toggle="dropdown">
							<span class="caret"></span> <span class="sr-only">Toggle
								Dropdown</span>
						</button>
						<ul id="nut" class="dropdown-menu" role="menu">
							<li><a href="#" onclick="location.href='tttaikhoang.jsp'">Thông Tin Tài Khoản</a></li>
							<li><a href="#" onclick="location.href='doimk.jsp'">Đổi Mật Khẩu</a></li>
							<li class="divider"></li>
							<li><a href="#" onclick="location.href='dangnhap.jsp'">Đăng Xuất</a></li>
						</ul>
					</div>
				</form>
			</div>
		</div>
			<div id="main-menu">
				<div class="col-md-12">
					<form class="navbar-form" role="search">
						<div id="form-search" class="input-group">
							<input id="input-search" type="text" class="form-control"
								placeholder="Search..." name="q">
							<div class="input-group-btn">
								<button class="btn btn-default" type="submit">
									<i class="glyphicon glyphicon-search"></i>
								</button>
							</div>
						</div>
					</form>
				</div>
			</div>
			<div id="main-form" ng-app="demoApp" ng-controller="RegisterCtrl">
				<h1>Tạo Sự Kiện</h1>
				<div id="form-taosk">
					<form class="form-horizontal" name="form" ng-submit="register()">
						<div class="form-group">
							<label class="col-xs-4 control-label">Tên Sự Kiện</label>
							<div class="col-xs-4">
								<input class="form-control" name="tensukien"
									ng-model="tensukien" type="text" placeholder="Tên sự kiện"
									ng-pattern="/^[a-zA-Z 0-9]+$/" required>
							</div>
							<div class="col-xs-4" style="padding-top: 7px">
								<i class="fa fa-check text-success"
									ng-show="form.tensukien.$dirty && form.tensukien.$valid"></i>
								<div ng-show="form.tensukien.$dirty && form.tensukien.$invalid"
									class="text-danger">
									<i class="fa fa-times text-danger"></i> <span
										ng-show="form.tensukien.$error.required">Tên Sự Kiện
										không được bỏ trống</span> <span
										ng-show="form.tensukien.$error.pattern">Chỉ bao gồm các
										kí tự a-z 0-9</span>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="diadiem" class="col-xs-4 control-label">Địa
								điểm</label>
							<div class="col-xs-4">
								<input class="form-control" name="diadiem" ng-model="diadiem"
									type="text" placeholder="Địa điểm"
									ng-pattern="/^[a-zA-Z 0-9]+$/" required>
							</div>
							<div class="col-xs-4" style="padding-top: 7px">
								<i class="fa fa-check text-success"
									ng-show="form.diadiem.$dirty && form.diadiem.$valid"></i>
								<div ng-show="form.diadiem.$dirty && form.diadiem.$invalid"
									class="text-danger">
									<i class="fa fa-times text-danger"></i> <span
										ng-show="form.diadiem.$error.required">Địa điểm không
										được bỏ trống</span> <span ng-show="form.diadiem.$error.pattern">Chỉ
										bao gồm các kí tự a-z 0-9</span>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="thoigian" class="col-xs-4 control-label">Thời
								Gian</label>
							<div class="col-xs-8 form-group"
								style="height: 36px; margin-bottom: 0px">
								<div class='col-xs-5' style="width: 200px">
									<div class="form-group">
										<div class='input-group date' id='datetimepicker6'>
											<input type='text' class="form-control" /> <span
												class="input-group-addon"> <span
												class="glyphicon glyphicon-calendar"></span>
											</span>
										</div>
									</div>
								</div>
								<label class="col-xs-1 control-label">Đến</label>
								<div class='col-xs-5' style="width: 200px">
									<div class="form-group">
										<div class='input-group date' id='datetimepicker7'>
											<input type='text' class="form-control" /> <span
												class="input-group-addon"> <span
												class="glyphicon glyphicon-calendar"></span>
											</span>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="nhac" class="col-xs-4 control-label">Chế độ
								nhắc</label>
							<div class="col-xs-4">
								<div class="btn-group">
									<button type="button" class="btn btn-default">Môt lần</button>
									<button type="button" class="btn btn-default dropdown-toggle"
										data-toggle="dropdown">
										<span class="caret"></span> <span class="sr-only">Toggle
											Dropdown</span>
									</button>
									<ul class="dropdown-menu" role="menu">
										<li><a href="#">Một lần</a></li>
										<li><a href="#">Lặp</a></li>
									</ul>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="htlap" class="col-xs-4 control-label">Hình
								thức Lặp</label>
							<div class="col-xs-4">
								<div class="btn-group">
									<button type="button" class="btn btn-default">Mỗi Ngày</button>
									<button type="button" class="btn btn-default dropdown-toggle"
										data-toggle="dropdown">
										<span class="caret"></span> <span class="sr-only">Toggle
											Dropdown</span>
									</button>
									<ul class="dropdown-menu" role="menu">
										<li><a href="#">Mỗi ngày</a></li>
										<li><a href="#">Mỗi thứ-2</a></li>
										<li><a href="#">Mỗi thứ-3</a></li>
										<li><a href="#">Mỗi thứ-4</a></li>
										<li><a href="#">Mỗi thứ-6</a></li>
										<li><a href="#">Mỗi thứ-7</a></li>
										<li><a href="#">Mỗi Chủ Nhật</a></li>
									</ul>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="htnhac" class="col-xs-4 control-label">Hình
								thức nhắc</label>
							<div class="col-xs-4">
								<div class="btn-group">
									<button type="button" class="btn btn-default">Email</button>
									<button type="button" class="btn btn-default dropdown-toggle"
										data-toggle="dropdown">
										<span class="caret"></span> <span class="sr-only">Toggle
											Dropdown</span>
									</button>
									<ul class="dropdown-menu" role="menu">
										<li><a href="#">Email</a></li>
										<li><a href="#">Số Điện Thoại</a></li>
									</ul>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="loinhac" class="col-xs-4 control-label">Lời
								nhắc</label>
							<div class="col-xs-4">
								<input class="form-control" name="loinhac" ng-model="loinhac"
									type="text" placeholder="Lời Nhắc"
									ng-pattern="/^[a-zA-Z 0-9]+$/" required>
							</div>
							<div class="col-xs-4" style="padding-top: 7px">
								<i class="fa fa-check text-success"
									ng-show="form.loinhac.$dirty && form.loinhac.$valid"></i>
								<div ng-show="form.loinhac.$dirty && form.loinhac.$invalid"
									class="text-danger">
									<i class="fa fa-times text-danger"></i> <span
										ng-show="form.loinhac.$error.required">Lời Nhắc không
										được bỏ trống</span> <span ng-show="form.loinhac.$error.pattern">Chỉ
										bao gồm các kí tự a-z 0-9</span>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="ghichu" class="col-xs-4 control-label">Ghi
								chú</label>
							<div class="col-xs-4">
								<input class="form-control" name="ghichu" ng-model="ghichu"
									type="text" placeholder="Ghi Chú"
									ng-pattern="/^[a-zA-Z 0-9]+$/" required>
							</div>
							<div class="col-xs-4" style="padding-top: 7px">
								<i class="fa fa-check text-success"
									ng-show="form.ghichu.$dirty && form.ghichu.$valid"></i>
								<div ng-show="form.ghichu.$dirty && form.ghichu.$invalid"
									class="text-danger">
									<i class="fa fa-times text-danger"></i> <span
										ng-show="form.ghichu.$error.pattern">Chỉ bao gồm các kí
										tự a-z 0-9</span>
								</div>
							</div>
						</div>
						<div id="button-dangnhap" class="btn-group">
							<a href="Calendar.html"><button type="button"
									class="btn btn-primary">Tạo</button></a> <a href="DangNhap.html"><button
									type="button" class="btn btn-primary">Trở Lại</button></a>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>