<html>
<head>
<title> Franchise REGISTRATION FORM</title>
<style>
.loginbox{width:40%;
height:300px;
border:solid;
margin-left:auto;
margin-right:auto;}
h1{margin:0px;
text-align:center;}
.un{width:90%;
height:30px;
font-size:24px;
margin-top:10px;
margin-left:10px;
}

</style>
</head>
<body>
<?php
if(isset($_REQUEST['msg']))
{
	echo "<centre><p >please fill the empty field.</p></centre>";
}
?>
<div class="loginbox">
<form name="registration" method="post" action="registration.php">
<!-- we will create registration.php after registration.html -->
Franchise Name:<input type="text" name="name" value="" class="un"></br>
EMAIL-ID:<input type="text" name="email" value="" class="un"></br>
PASSWORD:<input type="text" name="password" value="" class="un"></br>
Franchise Code:<input type="text" name="franchise" value="" class="un"></br>
<input type="submit" name="submit" value="submit" class="un">
<div>
</form>

</body>
</head>
</html>
