<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calendar</title>
<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css">
	<script type="text/javascript" src="bootstrap/js/jquery-3.1.0.min.js"></script>
	<script type="text/javascript" src="datepick/moment.min.js"></script>
	<script type="text/javascript" src="datepick/bootstrap-datetimepicker.min.js"></script>
	<script type="text/javascript" src="datepick/vi.js"></script>
	<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
	<link 	rel="stylesheet" type="text/css" href="datepick/bootstrap-datetimepicker.min.css">
	<!-- Angular validation -->
	<link rel="stylesheet" type="text/css" href="angular-validate/font-awesome-4.6.3/css/font-awesome.css">
	<script type="text/javascript" src="angular-validate/angular.min.js"></script>
	<!-- Customize -->
	<link rel="stylesheet" type="text/css" href="bootstrap/Css.css">
	<script type="text/javascript" src="bootstrap/js.js"></script>
	<!-- ajax -->
	<script type="text/javascript" src="bootstrap/js/jquery.min.js"></script>
	<script>
		$(document).ready(function(){
		    $("#").click(function(){
		        $("#container").show();
		    });
		    $("#").click(function(){
		        $("#container").hide();
		    });
		});
</script>
</head>
<body>
<div class="container">
    	<div class="row">
			<div class="col-md-6">
				<div class="panel panel-chitiet">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-6">
								<a href="#" class="active" id="chitiet-form-link">Chi Tiết</a>
							</div>
							<div class="col-xs-6">
								<a href="#" id="khachmoi-form-link">Khách Mời</a>
							</div>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12" ng-app="demoApp" ng-controller="RegisterCtrl">
								<form id="chitiet-form" method="post" style="display:block;" name="form" ng-submit="register()">
									<div class="form-group">
			                        	<div class="row">
			                        		<div class="col-md-12">
												<div class="col-md-4"><label class="control-label lb">Tên Sự Kiện</label></div>
												<div class="col-md-8">
													<input class="form-control" name="tensukien" ng-model="tensukien" type="text" 
													placeholder="Tên sự kiện" ng-pattern="/^[a-zA-Z 0-9]+$/" required>
													<i class="fa fa-check text-success" ng-show="form.tensukien.$dirty && form.tensukien.$valid"></i>
													<div ng-show="form.tensukien.$dirty && form.tensukien.$invalid" class="text-danger">
														<i class="fa fa-times text-danger"></i>
														<span ng-show="form.tensukien.$error.required">Tên Sự Kiện không được bỏ trống</span>
														<span ng-show="form.tensukien.$error.pattern">Chỉ bao gồm các kí tự a-z 0-9</span>
													</div>
												</div>
											</div>
										</div>
									</div> 
									<div class="form-group">
			                        	<div class="row">
			                        		<div class="col-md-12">
												<div class="col-md-4"><label class="control-label lb">Địa Điểm</label></div>
												<div class="col-md-8">
													<input class="form-control" name="diadiem" ng-model="diadiem" type="text" 
													placeholder="Địa điểm" ng-pattern="/^[a-zA-Z 0-9]+$/" required>
													<i class="fa fa-check text-success" ng-show="form.diadiem.$dirty && form.diadiem.$valid"></i>
													<div ng-show="form.diadiem.$dirty && form.diadiem.$invalid" class="text-danger">
														<i class="fa fa-times text-danger"></i>
														<span ng-show="form.diadiem.$error.required">Địa điểm không được bỏ trống</span>
														<span ng-show="form.diadiem.$error.pattern">Chỉ bao gồm các kí tự a-z 0-9</span>
													</div>
												</div>
											</div>
										</div>
									</div> 
									<div class="form-group">
										<div class="row">
										<div class="col-md-4">
											<label for="htnhac" class="control-label lb">ThờiGian</label>
										</div>
										<div class="col-md-12">
											<div class=" col-md-5 col-md-offset-2">
												<div class="form-group" style="margin-bottom: 0;">
												    <div class='input-group date' id='datetimepicker6'>
												        <input type='text' class="form-control"/>
												        <span class="input-group-addon">
												             <span class="glyphicon glyphicon-calendar"></span>
												        </span>
												    </div>
												</div>
											</div>
											<div class="col-md-5">
												<div class="form-group" style="margin-bottom: 0;">
												    <div class='input-group date' id='datetimepicker7'>
												        <input type='text' class="form-control"/>
												        <span class="input-group-addon">
												            <span class="glyphicon glyphicon-calendar"></span>
												        </span>
												    </div>
												</div>
											</div>
										</div>
										</div>
									</div>
									<div class="form-group">
										<div class="row">
										<div class="col-md-12">
											<div class="col-md-4"><label for="htnhac" class="control-label lb">Chế Độ Nhắc</label></div>
											<div class="col-md-8">
												<div class="btn-group">
						                              <button type="button" class="btn btn-default">Một Lần</button>
						                              <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
						                                <span class="caret"></span>
						                                <span class="sr-only">Toggle Dropdown</span>
						                              </button>
						                              <ul class="dropdown-menu" role="menu">
						                                <li><a href="#">Một Lần</a></li>
						                                <li><a href="#">Lặp</a></li>
						                              </ul>
					                            </div>
				                            </div>
			                            </div>
			                            </div>		
									</div>
									<div class="form-group">
										<div class="row">
										<div class="col-md-12">
											<div class="col-md-4"><label for="htnhac" class="control-label lb">Hình thức Lặp</label></div>
											<div class="col-md-8">
												<div class="btn-group">
						                              <button type="button" class="btn btn-default">Mỗi Ngày</button>
						                              <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
						                                <span class="caret"></span>
						                                <span class="sr-only">Toggle Dropdown</span>
						                              </button>
						                              <ul class="dropdown-menu" role="menu">
						                                <li><a href="#"></a></li>
						                                <li><a href="#"></a></li>
						                              </ul>
					                            </div>
				                            </div>
			                            </div>
			                            </div>		
									</div>
									<div class="form-group">
										<div class="row">
										<div class="col-md-12">
											<div class="col-md-4"><label for="htnhac" class="control-label lb">Hình thức nhắc</label></div>
											<div class="col-md-8">
												<div class="btn-group">
						                              <button type="button" class="btn btn-default">Email</button>
						                              <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
						                                <span class="caret"></span>
						                                <span class="sr-only">Toggle Dropdown</span>
						                              </button>
						                              <ul class="dropdown-menu" role="menu">
						                                <li><a href="#">Email</a></li>
						                                <li><a href="#">Số Điện Thoại</a></li>
						                              </ul>
					                            </div>
				                            </div>
			                            </div>
			                            </div>		
									</div>
									<div class="form-group">
			                        	<div class="row">
			                        		<div class="col-md-12">
												<div class="col-md-4"><label class="control-label lb">Lời Nhắc</label></div>
												<div class="col-md-8">
													<input class="form-control" name="loinhac" ng-model="loinhac" type="text" 
													placeholder="Lời Nhắc" ng-pattern="/^[a-zA-Z 0-9]+$/" required>
													<i class="fa fa-check text-success" ng-show="form.loinhac.$dirty && form.loinhac.$valid"></i>
													<div ng-show="form.loinhac.$dirty && form.loinhac.$invalid" class="text-danger">
														<i class="fa fa-times text-danger"></i>
														<span ng-show="form.loinhac.$error.required">Lời Nhắc không được bỏ trống</span>
														<span ng-show="form.loinhac.$error.pattern">Chỉ bao gồm các kí tự a-z 0-9</span>
													</div>
												</div>
											</div>
										</div>
									</div> 
			                        <div class="form-group">
			                        	<div class="row">
			                        		<div class="col-md-12">
												<div class="col-md-4"><label class="control-label lb">Ghi chú</label></div>
												<div class="col-md-8">
													<input class="form-control" name="ghichu" ng-model="ghichu" type="text" 
													placeholder="Ghi Chú" ng-pattern="/^[a-zA-Z 0-9]+$/" required>
													<i class="fa fa-check text-success" ng-show="form.ghichu.$dirty && form.ghichu.$valid"></i>
													<div ng-show="form.ghichu.$dirty && form.ghichu.$invalid" class="text-danger">
														<i class="fa fa-times text-danger"></i>
														<span ng-show="form.ghichu.$error.pattern">Chỉ bao gồm các kí tự a-z 0-9</span>
													</div>
												</div>
											</div>
										</div>
									</div> 
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="chitiet-submit" id="chitiet-submit" tabindex="4" class="form-control btn btn-chitiet" value="Chỉnh Sửa">
											</div>
										</div>
									</div>
								</form>
								<form id="khachmoi-form" method="post" role="form" style="display: none;" name="form2" ng-submit="register()">
									<div class="form-group">
			                        	<div class="row">
			                        		<div class="col-md-12">
												<div class="col-md-4"><label class="control-label lb">Email</label></div>
												<div class="col-md-8">
													<input class="form-control" name="email" ng-model="email" type="email" placeholder="Email" required>
													<i class="fa fa-check text-success" ng-show="form2.email.$dirty && form2.email.$valid"></i>
													<div ng-show="form2.email.$dirty && form2.email.$invalid" class="text-danger">
														<i class="fa fa-times text-danger"></i>
														<span ng-show="form2.email.$error.required">Ban chưa nhập địa chỉ email</span>
														<span ng-show="form2.email.$error.email">Không đúng định dạng email</span>
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="khachmoi-submit" id="khachmoi-submit" tabindex="4" class="form-control btn btn-khachmoi" value="Thêm">
											</div>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>