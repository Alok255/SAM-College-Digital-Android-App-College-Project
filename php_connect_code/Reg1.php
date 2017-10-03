<?php
 
 $name = $_GET['name'];
 $username = $_GET['username'];
 $password = $_GET['password'];
 $email = $_GET['email'];
 $enrollment = $_GET['enrollment'];
 
 if($name == '' || $username == '' || $password == '' || $email == ''){
 echo 'please fill all values';
 }else{
 require_once('dbConnect.php');
 $sql = "SELECT * FROM users1 WHERE username='$username' OR email='$email'";
 
 $check = mysqli_fetch_array(mysqli_query($con,$sql));
 
 if(isset($check)){
 echo 'Your Application already exist';
 }else{ 
 $sql = "INSERT INTO users1 (name,username,password,email,enrollment) VALUES('$name','$username','$password','$email','$enrollment')";
 if(mysqli_query($con,$sql)){
 echo 'Application Submitted Successfully ';
 }else{
 echo 'oops! Please try again!';
 }
 }
 mysqli_close($con);
 }
 
 ?>