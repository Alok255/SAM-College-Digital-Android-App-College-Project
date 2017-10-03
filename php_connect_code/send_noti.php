<?php
 
 $name = $_GET['name'];
 $username = $_GET['username'];
 $email = $_GET['email'];
 
 if($name == '' || $username == '' || $email == ''){
 echo 'please fill all values';
 }else{
 require_once('dbConnect.php');
 $sql = "SELECT * FROM users4 WHERE username='$username'";
 
 $check = mysqli_fetch_array(mysqli_query($con,$sql));
 
 if(isset($check)){
 echo 'Notification already exist';
 }else{ 
 $sql = "INSERT INTO users4 (name,username,email) VALUES('$name','$username','$email')";
 if(mysqli_query($con,$sql)){
 echo 'Your Notification Submitted Successfully ';
 }else{
 echo 'oops! Please try again!';
 }
 }
 mysqli_close($con);
 }
 
 ?>