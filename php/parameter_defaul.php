<?php
function perkenalan($nama, $salam="Assalamualaikum"){
 echo $salam.", ";
 echo "Perkenalkan, nama saya ".$nama."<br/>";
 echo "Senang berkenalan dengan anda<br/>";
}
perkenalan("Muhardian", "Hi");
echo "<hr>";
$saya = "Aldia Riski Fauzi";
$ucapanSalam = "Selamat pagi";
perkenalan($saya);
?>
