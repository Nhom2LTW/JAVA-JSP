<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calendar</title>
</head>
<body>
<div id="main">
	<div id="main-container">
			<div id="main-user">
				<div class="col-md-6" style="height: 60px;background-color: #2F4F4F">
					<!-- <div><button id="button-TAO" type="button" class="btn btn-danger">TẠO</button></div> -->
				</div>
				<div class="col-md-6" style="background-color: #2F4F4F">
					<form style="margin-left: 266px">
						<img src="img/main-user.png" >
						<div class="btn-group">
						  <button type="button" class="btn btn-success">Admind</button>
						  <button type="button" class="btn btn-success dropdown-toggle" data-toggle="dropdown">
						    <span class="caret"></span>
						    <span class="sr-only">Toggle Dropdown</span>
						  </button>
						  <ul class="dropdown-menu" role="menu">
						    <li><a href="#">Đổi Mật Khẩu</a></li>
						    <li class="divider"></li>
						    <li><a href="DangNhap.html">Đăng Xuất</a></li>
						  </ul>
						</div>
					</form>
				</div>
			</div>
			<div id="main-menu" ng-app="demoApp" ng-controller="RegisterCtrl">
				<div class="col-md-12">
					<form class="navbar-form" role="search">
			            <div id="form-search" class="input-group">
			                <input id="input-search" type="text" class="form-control" placeholder="Search account..." name="q">
			                <div class="input-group-btn">
			                    <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
			                </div>
			            </div>
	            	</form>
				</div>
			</div>
			<div id="main-form">
				<h1>User</h1>
				<div id="main-admin">
					<div class="table-reponsive">
						<table class="table user-list">
							<thead>
								<tr>
									<th><span>User</span></th>
									<th><span>Trạng Thái</span></th>
									<th><span>Chức Năng</span></th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>
										<a href="#">DucViet</a>
									</td>
									<td>
										active
									</td>
									<td>
										<button>Khóa</button>
									</td>
								</tr>
								<tr>
									<td>
										<a href="#">MinhTien123</a>
									</td>
									<td>
										active
									</td>
									<td>
										<button>Khóa</button>
									</td>
								</tr>
							</tbody>	
						</table>
					</div>
					<ul class="pagination">
					  <li><a href="#">&laquo;</a></li>
					  <li><a href="#">1</a></li>
					  <li><a href="#">2</a></li>
					  <li><a href="#">3</a></li>
					  <li><a href="#">4</a></li>
					  <li><a href="#">5</a></li>
					  <li><a href="#">&raquo;</a></li>
					</ul>
				</div>
			</div>
		</div>
</div>
</body>
</html>