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
					<li><a href="dangnhap.jsp">Đăng Nhập</a></li>
					<li class="active"><a href="dangky.jsp">Đăng Ký</a></li>
					<li><a href="lienhe.jsp">Liên Hệ</a></li>
				</ul>
			</div>
			<div id="main-form" ng-app="demoApp" ng-controller="RegisterCtrl">
				<h1>Đăng Ký</h1>
				<div id="form-dangki">
					<form id="register-form" class="form-horizontal" name="form"
						ng-submit="register()" novalidate>

						<div class="form-group">
							<label for="username" class="col-xs-3 control-label">Họ
								Tên</label>
							<div class="col-xs-4">
								<input class="form-control" name="username" ng-model="username"
									type="text" placeholder="Họ Tên" ng-maxlength="20"
									ng-pattern="/^[a-zA-Z ]+$/" required>
							</div>
							<div class="col-xs-4">
								<i class="fa fa-check text-success"
									ng-show="form.username.$dirty && form.username.$valid"></i>
								<div ng-show="form.username.$dirty && form.username.$invalid"
									class="text-danger">
									<i class="fa fa-times text-danger"></i> <span
										ng-show="form.username.$error.required">Họ tên không
										được bỏ trống</span> <span
										ng-show="form.username.$error.maxlength">Họ tên phải
										ngắn hơn 20 kí tự</span> <span
										ng-show="form.username.$error.pattern">Họ tên chỉ bao
										gồm các kí tự chữ cái</span>
								</div>
							</div>
						</div>

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

						<div class="form-group">
							<label for="repassword" class="col-xs-3 control-label">Xác
								Nhận Mật Khẩu</label>
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

						<div class="form-group">
							<label for="birthday" class="col-xs-3 control-label">Ngày
								sinh</label>
							<div class="col-xs-4">
								<input class="form-control" name="birthday" ng-model="birthday"
									type="text" placeholder="dd-mm-yyyy"
									ng-pattern="/^(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-((19[0-9]{2})|(20[0-1]{1}[0-4]{1}))$/">
							</div>
							<div class="col-xs-4">
								<i class="fa fa-check text-success"
									ng-show="form.birthday.$dirty && form.birthday.$valid"></i>
								<div ng-show="form.birthday.$dirty && form.birthday.$invalid"
									class="text-danger">
									<i class="fa fa-times text-danger"></i> <span>Nhập
										ngày sinh theo đúng định dạng dd-mm-yyyy {{birthday}}</span>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="email" class="col-xs-3 control-label">Email</label>
							<div class="col-xs-4">
								<input class="form-control" name="email" ng-model="email"
									type="email" placeholder="Email" required>
							</div>
							<div class="col-xs-4">
								<i class="fa fa-check text-success"
									ng-show="form.email.$dirty && form.email.$valid"></i>
								<div ng-show="form.email.$dirty && form.email.$invalid"
									class="text-danger">
									<i class="fa fa-times text-danger"></i> <span
										ng-show="form.email.$error.required">Bạn chưa nhập
										địa chỉ email</span> <span ng-show="form.email.$error.email">Không
										đúng định dạng email</span>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="phonenumber" class="col-xs-3 control-label">Số
								Điện Thoại</label>
							<div class="col-xs-4">
								<input class="form-control" name="phonenumber"
									ng-model="phonenumber" type="text" placeholder="Số Điện Thoại"
									ng-minlength="10" ng-maxlength="11" ng-pattern="/^[0-9]+$/"
									required>
							</div>
							<div class="col-xs-4">
								<i class="fa fa-check text-success"
									ng-show="form.phonenumber.$dirty && form.phonenumber.$valid"></i>
								<!--Dấu check thể hiện việc nhập dữ liệu được nhập là hợp lệ-->
								<div
									ng-show="form.phonenumber.$dirty && form.phonenumber.$invalid"
									class="text-danger">
									<i class="fa fa-times text-danger"></i> <span
										ng-show="form.phonenumber.$error.required">Ban chưa
										nhập số điện thoại</span> <span
										ng-show="form.phonenumber.$error.minlength">Số điện
										thoại không phù hợp</span> <span
										ng-show="form.phonenumber.$error.maxlength">Số điện
										thoại không phù hợp</span> <span
										ng-show="form.phonenumber.$error.pattern">Số điện thoại
										chỉ gồm kí tự 0-9</span>
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