<!DOCTYPE html>
<html>
    <head>
        <meta cherset="UTF-8">
        <title>登入處理</title>  
    </head>
    <body>
        <?php
        session_start();

        if(isset($_SESSION['log'])){
            echo "isset!";
            header("location: 3.php");
            exit;
        }
        $user=$_GET['user'];
        $password=$_GET["password"];
        if($user!="Alice"){
            header("location: 0.php");
            exit;
        }
        if($password!="123"){
            header("location: 0.php");
            exit;
        }   
        $_SESSION['log']='ok';
        echo "Ok";
        header("location: 3.php");
        exit;
        ?>
    </body>
</html>