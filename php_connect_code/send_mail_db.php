

<?php


 $mysql_hostname  =  "mysql.hostinger.in";
  $mysql_user  =  "u342250270_send";
  $mysql_password  =  "samcet4@"; 
$mysql_database  =  "u342250270_send";
 $bd  =  mysql_connect($mysql_hostname,  $mysql_user,  $mysql_password)  or  die("Could  not  connect  database");
 mysql_select_db($mysql_database,  $bd)  or  die("Could  not  select  database");
 $db  = @mysqli_connect($mysql_hostname,$mysql_user,$mysql_password,$mysql_database); 


?>