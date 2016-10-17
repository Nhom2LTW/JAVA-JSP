<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calendar</title>
<link rel="stylesheet" type="text/css" href="bootstrap/Css.css">
<link rel="stylesheet" type="text/css"
	href="angular-validate/font-awesome-4.6.3/css/font-awesome.css">
<!-- bootstrap -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="bootstrap/js/jquery-3.1.0.min.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<!-- Plugin -->
<link href="plugin/fullcalendar.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css"
	href="plugin/lib/cupertino/jquery-ui.min.css">
<link href="plugin/fullcalendar.print.css" rel="stylesheet"
	media="print" />
<script src="plugin/lib/moment.min.js"></script>
<script src="plugin/lib/jquery.min.js"></script>
<script src="plugin/fullcalendar.min.js"></script>
<script src="plugin/lib/jquery-ui.min.js" type="text/javascript"></script>
<script type="text/javascript" src="plugin/locale/vi.js"></script>
<script type="text/javascript" src="angular-validate/angular.min.js"></script>
<script type="text/javascript" src="bootstrap/js.js"></script>

<script>
	$(document).ready(function() {

		$('#calendar').fullCalendar({
			theme : true,
			header : {
				left : 'prev,next today',
				center : 'title',
				right : 'month,agendaWeek,agendaDay,listWeek'
			},
			navLinks : true, // can click day/week names to navigate views
			editable : true,
			eventLimit : true, // allow "more" link when too many events
			lang : 'vi'
		});

	});
</script>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div id="main">
		<div id="main-container">
			<div id="main-user">
				<div class="col-md-6"
					style="height: 60px; background-color: #2F4F4F">
					<div>
						<button id="button-TAO" type="button" class="btn btn-danger" onclick="location.href='taosukien.jsp'">TẠO</a></button>
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
							<ul class="dropdown-menu" role="menu">
								<li><a href="#">Thông Tin Tài Khoản</a></li>
								<li><a href="#">Đổi Mật Khẩu</a></li>
								<li class="divider"></li>
								<li><a href="DangNhap.html">Đăng Xuất</a></li>
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
				<h1>Đổi Mật Khẩu</h1>
				<div id="form-dangki">
					<form id="register-form" class="form-horizontal" name="form"
						ng-submit="register()" novalidate>

						<div class="form-group">
							<label for="oldpassword" class="col-xs-3 control-label">Mật
								khẩu Cũ</label>
							<div class="col-xs-4">
								<input class="form-control" name="oldpassword"
									ng-model="oldpassword" type="password" placeholder="Mật khẩu"
									ng-minlength="6" ng-maxlength="30" required>
							</div>
							<div class="col-xs-4">
								<i class="fa fa-check text-success"
									ng-show="form.oldpassword.$dirty && form.oldpassword.$valid"></i>
								<div
									ng-show="form.oldpassword.$dirty && form.oldpassword.$invalid"
									class="text-danger">
									<i class="fa fa-times text-danger"></i> <span
										ng-show="form.oldpassword.$error.required">Nhập Mật
										Khẩu Cũ</span> <span ng-show="form.oldpassword.$error.minlength">Mật
										khẩu phải dài hơn 6 kí tự</span> <span
										ng-show="form.oldpassword.$error.maxlength">Mật khẩu
										phải ngắn hơn 30 kí tự</span>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="password" class="col-xs-3 control-label">Mật
								khẩu Mới</label>
							<div class="col-xs-4">
								<input class="form-control" name="password" ng-model="password"
									type="password" placeholder="Mật khẩu" ng-minlength="6"
									ng-maxlength="30" required>
							</div>
							<div class="col-xs-4">
								<i class="fa fa-check text-success"
									ng-show="form.password.$dirty && form.password.$valid"></i>
								<div ng-show="form.password.$dirty && form.password.$invalid"
									class="text-danger">
									<i class="fa fa-times text-danger"></i> <span
										ng-show="form.password.$error.required">Nhập Mật Khẩu
										Mới</span> <span ng-show="form.password.$error.minlength">Mật
										khẩu phải dài hơn 6 kí tự</span> <span
										ng-show="form.password.$error.maxlength">Mật khẩu
										phải ngắn hơn 30 kí tự</span>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="repassword" class="col-xs-3 control-label">Xác
								Nhận Mật Khẩu Mới</label>
							<div class="col-xs-4">
								<input class="form-control" name="repassword"
									ng-model="repassword" type="password"
									placeholder="Xác nhận mật khẩu" password-match="password"
									required>
							</div>
							<div class="col-xs-4">
								<i class="fa fa-check text-success"
									ng-show="form.repassword.$dirty && form.repassword.$valid"></i>
								<div
									ng-show="form.repassword.$dirty && form.repassword.$invalid"
									class="text-danger">
									<i class="fa fa-times text-danger"></i> <span
										ng-show="form.repassword.$error.required">Xác nhận lại
										mật khẩu</span> <span ng-show="form.repassword.$error.unique">Không
										chính xác</span>
								</div>
							</div>
						</div>
					</form>
				</div>
				<div id="button-dangnhap" class="btn-group">
					<button type="submit" class="btn btn-primary"
						ng-disabled="!form.$dirty || (form.$dirty && form.$invalid)">Đồng
						Ý</button>
					<button type="submit" class="btn btn-primary">Trở Lại</button>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>