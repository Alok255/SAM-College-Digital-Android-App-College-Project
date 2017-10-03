<?php

define('HOST','mysql.hostinger.in');
 define('USER','u714338846_andy');
 define('PASS','samcet4@');
 define('DB','u714338846_andy');
 
 $con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to Connect');

	if($_SERVER['REQUEST_METHOD']=='GET'){
		$id = $_GET['id'];
		$sql = "select * from images where id = '$id'";
		
		$r = mysqli_query($con,$sql);
		
		$result = mysqli_fetch_array($r);
		
		header('content-type: image/jpeg');
	
		echo base64_decode($result['image']);
		
		mysqli_close($con);
		
	}else{
		echo "Error";
	}
	
	?>