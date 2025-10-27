<?php
$tugas = readline("Masukkan nilai tugas: ");
$uts = readline("Masukkan nilai UTS: ");
$uas = readline("Masukkan nilai UAS: ");

$nilai_akhir = ($tugas * 0.3) + ($uts * 0.3) + ($uas * 0.4);

echo "Nilai Akhir: " . $nilai_akhir . "\n";

if ($nilai_akhir >= 60) {
    echo "Status: LULUS\n";
} else {
    echo "Status: TIDAK LULUS\n";
}
?>