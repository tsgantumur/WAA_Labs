<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/mystyle.css">
<meta charset="ISO-8859-1">
<h4>Calculator</h4>
</head>
<body>
	<form action="result.do" method="post">

		<input name="add1" type=date step=7 min=2016-03-03 class="textBox" />+
		<input name="add2" type="text" class="textBox" />=
		<input name="sum" type="text" class="textBox" />
		<br> 
		<input name="mult1" type="text" class="textBox" />*
		<input name="mult2" type="text" class="textBox" />=
		<input name="product" type="text" class="textBox" />
		<br>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>