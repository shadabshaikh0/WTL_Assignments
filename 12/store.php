<?php
$conn=mysqli_connect("localhost", "root", "Shadab@786", "test");

if(isset($_POST["submit"]))
{
    $name=$_POST["name"];
    $roll=$_POST["rollno"];

    $sql="insert into student (rollno, name) values ($roll,'$name')";

    $result=mysqli_query($conn,$sql);

    if($result)
    {
    	echo "Record of $roll inserted suceessfully";
    }
    else
    {
    	echo "Insertion of record failed.\nError: ".mysqli_error($conn);
    }
}
?>

