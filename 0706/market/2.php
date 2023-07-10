<!DOCTYPE html>
<html>
    <head>
        <meta cherset="UTF-8">
        <title>登出</title>  
    </head>
    <body>
        <?php
        session_start();
            session_unset();
            session_destroy();
                header("location: 0.php");
                exit;
        ?>
    </body>
</html>