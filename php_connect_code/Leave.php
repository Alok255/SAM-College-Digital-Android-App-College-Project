<?php
 define('HOST','localhost');
 define('USER','root');
 define('PASS','');
 define('DB','leave');
 
 $con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to Connect');
  
 
 
 $name = $_GET['name'];
 $username = $_GET['username'];
 $password = $_GET['password'];
 $email = $_GET['email'];
 
 if($name == '' || $username == '' || $password == '' || $email == ''){
 echo 'please fill all values';
 }else{

 $sql = "SELECT * FROM leave WHERE username='$username' OR email='$email'";
 
 $check = mysqli_fetch_array(mysqli_query($con,$sql));
 
 if(isset($check)){
 echo 'username or email already exist';
 }else{ 
 $sql = "INSERT INTO leave (name,username,password,email) VALUES('$name','$username','$password','$email')";
 if(mysqli_query($con,$sql)){
 echo 'successfully registered';
 }else{
 echo 'oops! Please try again!';
 }
 }
 mysqli_close($con);
 }
 
 ?>