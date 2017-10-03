<?php     //start php tag
//include connect.php page for database connection
$hostname="mysql.hostinger.in"; //local server name default localhost
$username="u117818899_ankit";  //mysql username default is root.
$password="samcet4@";       //blank if no password is set for mysql.
$database="u117818899_ankit";  //database name which you created
$con=new mysqli($hostname,$username,$password);


if ($con->connect_error)
  {
  die('Could not connect: ' . $con->connect_error);
  }
 
mysql_select_db("u117818899_ankit", $con);
 
//if submit is not blanked i.e. it is clicked.
if($_REQUEST['name']=='' || $_REQUEST['email']=='' || $_REQUEST['password']==''|| $_REQUEST['enroll']=='')
{
//echo "please fill the empty field.";
header('location:student.php?msg=1');
}
else
{
$sql="insert into student(name,email,enroll,password) values('".$_REQUEST['name']."', '".$_REQUEST['email']."', '".$_REQUEST['enroll']."', '".$_REQUEST['password']."')";

if ($con->query($sql) === TRUE) {
  header('location:student.php');
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

 }
mysqli_close($con)




?>
