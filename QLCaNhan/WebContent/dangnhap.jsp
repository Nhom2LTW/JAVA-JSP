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
<script type="text/javascript" src="angular-validate/angular.min.js"></script>
<script type="text/javascript" src="bootstrap/js.js"></script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

	<div id="main">
		<div id="main-container">
			<div id="main-menu" style="background-color: #2F4F4F;">
				<ul class="nav nav-tabs" role="tablist">
					<li class="active"><a href="#">Đăng Nhập</a></li>
					<li><a href="dangky.jsp">Đăng Kí</a></li>
					<li><a href="lienhe.jsp">Liên Hệ</a></li>
					
				</ul>
			</div>
			<div id="main-form" ng-app="demoApp" ng-controller="RegisterCtrl">
				<h1>Đăng Nhập</h1>
				<div id="form-dangnhap">
					<form id="register-form" class="form-horizontal" name="form"
						ng-submit="register()" novalidate>
						<div class="form-group">
							<label for="accountname" class="col-xs-3 control-label">Tên
								đăng nhập</label>
							<div class="col-xs-4">
								<input class="form-control" name="accountname"
									ng-model="accountname" type="text" placeholder="Tên đăng nhập"
									ng-minlength="6" ng-maxlength="20"
									ng-pattern="/^[a-zA-Z0-9]+$/" required>
							</div>
							<div class="col-xs-4">
								<i class="fa fa-check text-success"
									ng-show="form.accountname.$dirty && form.accountname.$valid"></i>
								<div
									ng-show="form.accountname.$dirty && form.accountname.$invalid"
									class="text-danger">
									<i class="fa fa-times text-danger"></i> <span
										ng-show="form.accountname.$error.required">Tên đăng
										nhập không được bỏ trống</span> <span
										ng-show="form.accountname.$error.minlength">Tên đăng
										nhập phải dài hơn 6 kí tự</span> <span
										ng-show="form.accountname.$error.maxlength">Tên đăng
										nhập phải ngắn hơn 20 kí tự</span> <span
										ng-show="form.accountname.$error.pattern">Tên đăng nhập
										chỉ bao gồm các kí tự a-z và 0-9</span>
								</div>
							</div>
						</div>


						<div class="form-group">
							<label for="password" class="col-xs-3 control-label">Mật
								khẩu</label>
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
										ng-show="form.password.$error.required">Mật khẩu
										không được bỏ trống</span> <span
										ng-show="form.password.$error.minlength">Mật khẩu
										phải dài hơn 6 kí tự</span> <span
										ng-show="form.password.$error.maxlength">Mật khẩu
										phải ngắn hơn 30 kí tự</span>
								</div>
							</div>
						</div>
						<div id="button-dangnhap" class="btn-group">
							<a href="ngay.jsp"><button type="button"
									class="btn btn-primary">Đồng Ý</button></a> <a href="dangnhap.jsp"><button
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