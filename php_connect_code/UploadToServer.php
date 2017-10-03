<?php
 
   include 'config.inc.php';
   
  $file_path = "uploads/";
     
    $file_path = $file_path . basename( $_FILES['uploaded_file']['name']);
    if(move_uploaded_file($_FILES['uploaded_file']['tmp_name'], $file_path) ){
        $sql="insert into fileup values('$file_path')";	
$rs=mysql_query($sql) or die(mysql_error());
echo $rs;
if($rs>0)
echo "data is inserted succcccccccccccc0";
    } else{
        echo "fail";
	}
    
?>