<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calendar</title>
<link rel="stylesheet" type="text/css" href="bootstrap/Css.css">
	<link rel="stylesheet" type="text/css" href="angular-validate/font-awesome-4.6.3/css/font-awesome.css">
	<!-- bootstrap -->
	<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<script type="text/javascript" src="bootstrap/js/jquery-3.1.0.min.js"></script>
    <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
    <!-- Plugin -->
    <link href="plugin/fullcalendar.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="plugin/lib/cupertino/jquery-ui.min.css">
	<link href="plugin/fullcalendar.print.css" rel="stylesheet" media="print" />
	<script src="plugin/lib/moment.min.js"></script>
	<script src="plugin/lib/jquery.min.js"></script>
	<script src="plugin/fullcalendar.min.js"></script>
	<script src="plugin/lib/jquery-ui.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="plugin/locale/vi.js"></script>
	<script type="text/javascript" src="angular-validate/angular.min.js"></script>
	<script type="text/javascript" src="bootstrap/js.js"></script>
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
				<div class="row">
					<div class="col-md-12">
						<form class="navbar-form" role="search" style="margin-bottom: 10px">
				            <div id="form-search" class="input-group">
				                <input id="input-search" type="text" class="form-control" placeholder="Search..." name="q">
				                <div class="input-group-btn" >
				                    <button class="btn btn-default" type="submit" ><i class="glyphicon glyphicon-search"></i></button>
				                </div>
				            </div>
		            	</form>
					</div>
					<!--  <div class="col-md-12">
			            <div class="input-group" id="adv-search">
			                <input type="text" class="form-control" placeholder="Tên Sự Kiện" />
			                <div class="input-group-btn">
			                    <div class="btn-group" role="group">
			                        <div class="dropdown dropdown-lg">
			                            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="flase"><span class="caret"></span></button>
			                            <div class="dropdown-menu dropdown-menu-right" role="menu">
			                                <form class="form-horizontal" role="form">
				                                  <div class="form-group">
				                                    <label for="filter">Tên Sự Kiện</label>
				                                    <input class="form-control" type="text" placeholder="Tên Sự Kiện"/>
				                                  </div>
				                                  <div class="form-group">
				                                    <label for="contain">Từ</label>
				                                    <input class="form-control" type="text" placeholder="Thời gian bắt đầu"/>
				                                  </div>
				                                  <div class="form-group">
				                                    <label for="contain">Đến</label>
				                                    <input class="form-control" type="text" placeholder="Thời gian kết thúc"/>
				                                  </div>
				                                  <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
			                                </form>
			                            </div>
			                        </div>
			                        <button type="button" class="btn btn-primary"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
			                    </div>
			                </div>
			            </div>
			        </div>
			    </div>-->
			</div>
			<div id="main-form" ng-app="demoApp" ng-controller="RegisterCtrl">
				<h1>Thông Tin Tài Khoản</h1>
				<div id="form-dangki">
					<form id="register-form" class="form-horizontal" name="form" ng-submit="register()" novalidate>
						
						<div class="form-group">
						    <label for="username" class="col-xs-3 control-label">Họ Tên</label>
							<div class="col-xs-4">
								<input class="form-control" name="username" ng-model="username" type="text" 
								placeholder="Họ Tên" ng-maxlength="20" ng-pattern="/^[a-zA-Z ]+$/" required>
						    </div>
							<div class="col-xs-4">
								<i class="fa fa-check text-success" ng-show="form.username.$dirty && form.username.$valid"></i>
								<div ng-show="form.username.$dirty && form.username.$invalid" class="text-danger">
									<i class="fa fa-times text-danger"></i>
									<span ng-show="form.username.$error.required">Họ tên không được bỏ trống</span>
									<span ng-show="form.username.$error.maxlength">Họ tên phải ngắn hơn 20 kí tự</span>
									<span ng-show="form.username.$error.pattern">Họ tên chỉ bao gồm các kí tự chữ cái</span>
								</div>
							</div>
						</div>

						<div class="form-group">
						   	<label for="birthday" class="col-xs-3 control-label">Ngày sinh</label>
							<div class="col-xs-4">
							   	<input class="form-control" name="birthday" ng-model="birthday" type="text"  placeholder="dd-mm-yyyy" 
							   	ng-pattern="/^(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-((19[0-9]{2})|(20[0-1]{1}[0-4]{1}))$/">
							</div>
							<div class="col-xs-4">
							   	<i class="fa fa-check text-success" ng-show="form.birthday.$dirty && form.birthday.$valid"></i>
								<div ng-show="form.birthday.$dirty && form.birthday.$invalid" class="text-danger">
									<i class="fa fa-times text-danger"></i>
									<span>Nhập ngày sinh theo đúng định dạng dd-mm-yyyy {{birthday}}</span>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="email" class="col-xs-3 control-label">Email</label>
							<div class="col-xs-4">
							    <input class="form-control" name="email" ng-model="email" type="email" placeholder="Email" required>
							</div>
							<div class="col-xs-4">
								<i class="fa fa-check text-success" ng-show="form.email.$dirty && form.email.$valid"></i>
								<div ng-show="form.email.$dirty && form.email.$invalid" class="text-danger">
									<i class="fa fa-times text-danger"></i>
									<span ng-show="form.email.$error.required">Bạn chưa nhập địa chỉ email</span>
									<span ng-show="form.email.$error.email">Không đúng định dạng email</span>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="phonenumber" class="col-xs-3 control-label">Số Điện Thoại</label>
							<div class="col-xs-4">
							    <input class="form-control" name="phonenumber" ng-model="phonenumber" type="text" 
							    placeholder="Số Điện Thoại" ng-minlength="10" ng-maxlength="11" ng-pattern="/^[0-9]+$/" required>
							</div>
							<div class="col-xs-4">
								<i class="fa fa-check text-success" ng-show="form.phonenumber.$dirty && form.phonenumber.$valid"></i>
								<!--Dấu check thể hiện việc nhập dữ liệu được nhập là hợp lệ-->
								<div ng-show="form.phonenumber.$dirty && form.phonenumber.$invalid" class="text-danger">
									<i class="fa fa-times text-danger"></i>
									<span ng-show="form.phonenumber.$error.required">Ban chưa nhập số điện thoại</span>
									<span ng-show="form.phonenumber.$error.minlength">Số điện thoại không phù hợp</span>
									<span ng-show="form.phonenumber.$error.maxlength">Số điện thoại không phù hợp</span>
									<span ng-show="form.phonenumber.$error.pattern">Số điện thoại chỉ gồm kí tự 0-9</span>
								</div>
							</div>
						</div>
					</form>

				</div>
				<div id="button-dangnhap" class="btn-group">
					<button type="submit" class="btn btn-primary" ng-disabled="!form.$dirty || (form.$dirty && form.$invalid)">Đồng Ý
					</button>
					<button type="submit" class="btn btn-primary">Trở Lại</button>
				</div>
			</div>
		</div>
		</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>