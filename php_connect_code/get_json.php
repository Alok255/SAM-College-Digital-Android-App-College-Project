<?php
 /*
 require_once('dbConnect.php');
 
$sql = "select * from users2";
 
$res = mysqli_query($con,$sql);
 
$result = array();
 
while($row = mysqli_fetch_array($res)){
array_push($result,
array('id'=>$row[0],
'name'=>$row[1],
'username'=>$row[2],

'password'=>$row[3],
'email'=>$row[4]
));
}
 
echo json_encode(array("result"=>$result));
 
mysqli_close($con);
 
 */
  require_once('dbConnect.php');
 
$sql = "select * from users1";
 
$res = mysqli_query($con,$sql);
 
$result = array();
 
while($row = mysqli_fetch_array($res)){
array_push($result,
array('id'=>$row[0],
'name'=>$row[1],
'address'=>$row[2],
'sem'=>$row[3],
'dat'=>$row[4]
));
}
 
echo json_encode(array("result"=>$result));
 
mysqli_close($con);
 
?>
?>