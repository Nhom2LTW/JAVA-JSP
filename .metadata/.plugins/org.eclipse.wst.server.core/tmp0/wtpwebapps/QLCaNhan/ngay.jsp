<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calendar</title>
<link rel="stylesheet" type="text/css" href="bootstrap/Css.css">
<script type="text/javascript" src="bootstrap/js.js"></script>
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
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div id="main">
	<jsp:include page="maincontainer.jsp"></jsp:include>
		<div id="main-menu">
			<div class="col-md-12">
				<form class="navbar-form" role="search" style="margin-bottom: 10px">
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
		<div>
			<div class="col-xs-12">
				<div class="col-xs-4">
					<div class="btn-group"
						style="margin-top: 20px; margin-bottom: 10px;">
						<button type="button" class="btn btn-default">Hôm Nay</button>
						<button type="button"
							class="btn btn-default glyphicon glyphicon-chevron-left"></button>
						<button type="button"
							class="btn btn-default glyphicon glyphicon-chevron-right"></button>
					</div>
				</div>
				<div class="col-xs-4">
					<h2 style="color: #003300">10 Tháng-10 2016</h2>
				</div>
				<div class="col-xs-4">
					<div class="btn-group"
						style="margin-top: 20px; margin-bottom: 10px;">
						<button type="button" class="btn btn-default" onclick="location.href='ngay.jsp'">Ngày</button>
						  <button type="button" class="btn btn-default" onclick="location.href='tuan.jsp'">Tuần</button>
						  <button type="button" class="btn btn-default" onclick="location.href='thang.jsp'">Tháng</button>
						  <button type="button" class="btn btn-default">LịchBiểu</button>
					</div>
				</div>
			</div>
			<table id="tableday">
				<thead>
					<tr>
						<th class="time"></th>
						<th class="nameday-day">Thứ-2</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td class="time">1am</td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time"></td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time">2am</td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time"></td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time">3am</td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time"></td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time">4am</td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time"></td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time">5am</td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time"></td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time">6am</td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time"></td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time">7am</td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time"></td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time">8am</td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time"></td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time">9am</td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time"></td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time">10am</td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time"></td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time">11am</td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time"></td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time">12pm</td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time"></td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time">1pm</td>
						<td class="day"></td>
					</tr>
					<tr>
						<td class="time"></td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time">2pm</td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time"></td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time">3pm</td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time"></td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time">4pm</td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time"></td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time">5pm</td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time"></td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time">6pm</td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time"></td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time">7pm</td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time"></td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time">8pm</td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time"></td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time">9pm</td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time"></td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time">10pm</td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time"></td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time">11pm</td>
						<td class="day123"></td>
					</tr>
					<tr>
						<td class="time"></td>
						<td class="day123"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>