<!DOCTYPE html>
<html>
    <head>
        <meta cherset="UTF-8">
        <title>SetCookie</title>  
    </head>
    <body>
        <?php            
            echo "<h1>印出session</h1>";
            session_start();
            var_dump($_SESSION);
            ?>
    </body>
</html>