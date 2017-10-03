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
 $sql = "SELECT * FROM users3 WHERE username='$username' OR email='$email'";
 
 $check = mysqli_fetch_array(mysqli_query($con,$sql));
 
 if(isset($check)){
 echo 'Question already exist';
 }else{ 
 $sql = "INSERT INTO users3 (name,username,password,email,enrollment) VALUES('$name','$username','$password','$email','$enrollment')";
 if(mysqli_query($con,$sql)){
 echo 'Your Question Submitted Successfully ';
 }else{
 echo 'oops! Please try again!';
 }
 }
 mysqli_close($con);
 }
 
 ?>