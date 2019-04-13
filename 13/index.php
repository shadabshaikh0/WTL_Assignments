<?php
    $conn=mysqli_connect("localhost", "root", "Shadab@786", "test");

    $sql="select * from student order by rollno";

    $result = mysqli_query($conn,$sql);
?>    
<table><tr><th>Roll No</th><th>Name</th></tr>
<?php
    if( mysqli_num_rows($result) >  0 ){

      while(  $row = mysqli_fetch_assoc($result) ){
        echo "<tr><td>".$row["rollno"]."</td><td>".$row["name"]."</td></tr>";
      }

    }
    echo '</table>';
?>

