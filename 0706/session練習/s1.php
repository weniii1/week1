<!DOCTYPE html>
<html>
    <head>
        <meta cherset="UTF-8">
        <title>SetCookie</title>  
    </head>
    <body>
        <?php
            echo "<h1>session建立</h1>";
            session_start();
            $_SESSION['user']='poorguy';
            $_SESSION['acc']='poorguy0101';
            ?>
    </body>
</html>