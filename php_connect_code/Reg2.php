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
 $sql = "SELECT * FROM users2 WHERE username='$username' OR email='$email'";
 
 $check = mysqli_fetch_array(mysqli_query($con,$sql));
 
 if(isset($check)){
 echo 'Attendance already exist';
 }else{ 
 $sql = "INSERT INTO users2 (name,username,password,email) VALUES('$name','$username','$password','$email')";
 if(mysqli_query($con,$sql)){
 echo 'Attendance Successfully';
 }else{
 echo 'oops! Please try again!';
 }
 }
 mysqli_close($con);
 }
 
 ?>