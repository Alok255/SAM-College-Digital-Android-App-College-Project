<?php
ob_start();
include "send_mail_db.php";
if(isset($_POST['ok']))
{
$email_subject="this is from website";
$email_from="commonid@commonid.16mb.com";
$a=$_POST['uid'];
$b=$_POST['u1'];
$c=md5($_POST['p1']);
$d=$_POST['c1'];
$email_to=$d;
$email_message="thanks for reg please click on this link http://techandroid.16mb.com/index.php?id=".$a."\t".$p."\t".$b;
$p=$_FILES['file']['name'];
move_uploaded_file($_FILES['file']['tmp_name'],"img/".$p);
$sql="insert into userreg values($a,'$b','$c','$d','$p')";	
$rs=mysql_query($sql) or die(mysql_error());
echo $rs;
if($rs>0)
echo "data is inserted succcccccccccccc0";
$headers = 'From: '.$email_from."\r\n".

'Reply-To: '.$email_from."\r\n" .

'X-Mailer: PHP/' . phpversion();

@mail($email_to, $email_subject, $email_message, $headers); 



}
// this code genrate auto uid from database 
$sql="select max(uid) from userreg";
$rs=mysql_query($sql);
$row=mysql_fetch_array($rs);
$r=$row[0]+1;
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>

<body>
<form action="" method="post" enctype="multipart/form-data">
uid <input type="text" name="uid" value="<?php echo $r;?>" /><br />
uname <input type="text" name="u1" /><br/>
password<input type="password" name="p1" /><br />
reg date <input type="email" name="c1" />
profile <input type="file" name="file" />

<input type="submit" name="ok" />

</form>
</body>
</html>