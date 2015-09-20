<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Event | Home</title>
<meta name="description"
	content="Documentation and reference library for ZURB Foundation. JavaScript, CSS, components, grid and more." />
<meta name="author"
	content="ZURB, inc. ZURB network also includes zurb.com" />
<meta name="copyright" content="Rebakure, inc. Copyright (c) 2015" />
<meta name="description"
	content="This is the official website for rebakure organization." />
<meta name="author" content="Rebakura Team" />
<meta name="copyright" content="Rebakure.org Copyright (c) 2015" />
<link rel="stylesheet" href="styles/foundation.css" />
<script src="scripts/modernizr.js"></script>
</head>
<body>
	<div class="row">

		<div class="large-12 columns">
			<h1>Hello World!!!</h1>
			<!-- 
			<div class="row">
				<div class="large-12 hide-for-small">
					<div id="featured" data-orbit style="max-height: 280px;">
						<img src="images/Image_13.jpg" alt="slide image"> <img
							src="images/Image_23.jpg" alt="slide image"> <img
							src="images/Image_33.jpg" alt="slide image">
					</div>
				</div>
			</div>
			 -->
			<div class="row">
				<ul class="accordion" data-accordion>
					<%
						for (int i = 0; i < 5; i++) {
					%>

					<li class="accordion-navigation"><a href="#panel<%=(i + 1)%>a">Accordion
							<%=(i + 1)%></a>

						<div id="panel<%=(i + 1)%>a" class="content">

							<div class="orbit-container">
								<div class="orbit-slides-container" id="featured" data-orbit=""
									style="max-height: 150px; height: 520px;">
									<img class="active" src="images/Image_13.jpg" alt="slide image">
									<img src="images/Image_23.jpg" alt="slide image"> <img
										src="images/Image_33.jpg" alt="slide image">
								</div>
								<a class="orbit-prev" href="#"><span></span></a><a
									class="orbit-next" href="#"><span></span></a>
								<div class="orbit-timer paused">
									<span></span>
									<div style="width: 6.87%;" class="orbit-progress"></div>
								</div>
								<div class="orbit-slide-number">
									<span>1</span> of <span>3</span>
								</div>
								<div class="orbit-bullets-container">
									<ol class="orbit-bullets">
										<li class="active" data-orbit-slide="0"></li>
										<li data-orbit-slide="1"></li>
										<li data-orbit-slide="2"></li>
									</ol>
								</div>
							</div>
							<br/>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
								Nullam sit amet sem id mauris accumsan egestas. Duis auctor
								dolor leo, in cursus ex sagittis at. Cras vel mollis elit.
								Nullam fringilla libero erat, eget imperdiet metus euismod nec.
								Curabitur cursus dapibus dolor. Nulla condimentum, lacus at
								efficitur viverra, dolor mauris fringilla eros, eget elementum
								ipsum velit at purus. Aliquam erat volutpat. Curabitur eu
								eleifend urna. Donec eu neque quis sapien pulvinar bibendum sed
								sed est. Morbi vulputate vel enim in cursus. Nulla dapibus nulla
								vel sapien bibendum,</p>

						</div></li>


					<%
						}
					%>
					<!-- 
					<li class="accordion-navigation"><a href="#panel2a">Accordion
							2</a>
						<div id="panel2a" class="content">Panel 2. Lorem ipsum dolor
							sit amet, consectetur adipisicing elit, sed do eiusmod tempor
							incididunt ut labore et dolore magna aliqua. Ut enim ad minim
							veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip
							ex ea commodo consequat.</div></li>
					<li class="accordion-navigation"><a href="#panel3a">Accordion
							3</a>
						<div id="panel3a" class="content">Panel 3. Lorem ipsum dolor
							sit amet, consectetur adipisicing elit, sed do eiusmod tempor
							incididunt ut labore et dolore magna aliqua. Ut enim ad minim
							veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip
							ex ea commodo consequat.</div></li>  -->
				</ul>
			</div>
			<br>
		</div>

	</div>
	<footer> </footer>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
	<script src="scripts/foundation.js"></script>
	<script src="scripts/foundation.accordion.js"></script>
	<script type="text/javascript">
		$(document).foundation('accordion', 'reflow');
	</script>

</body>
</html>