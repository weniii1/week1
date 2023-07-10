<?php

$type = exif_imagetype("p.jpg");
echo "<h1>類型:".$type."<br>";

$weight = getimagesize ("p.jpg")[0];
echo "<h1>寬:".$weight."<br>";

$height = getimagesize ("p.jpg")[1];
echo "<h1>高:".$height."<br>";

$format = getimagesize ("p.jpg")[2];
echo "<h1>格式:".$format."<br>";

$imName = getimagesize ("p.jpg")[3];
echo "<h1>名稱:".$imName."<br>";
?>