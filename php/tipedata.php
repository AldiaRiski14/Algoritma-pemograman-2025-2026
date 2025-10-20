<?php
$char = 'A';
$nama = "Aldia Riski Fauzi";
$umur = 19;
$nilai = 89.25;
$status = "TRUE";

echo "---Belajar Tipe Data --- <br><br>";
echo "Tipe data Char : " .$char. "<br>";
echo "Tipe data String :  $nama <br>";
echo "Tipe data int : " .$umur;
print "<br>";
printf("Tipe Data Float : %.5f<br><br>",$nilai);
echo "Tipe data Boolean : <br><br>";
if ($status)
    echo "Status : Aktif ";
 else 
    echo "Status : Tidak Aktif";

?>