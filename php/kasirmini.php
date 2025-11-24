<?php

$nama = readline("masukan nama barang : ");
$harga = (float) readline("masukan harga barang : ");
$jumlah = (int) readline("masukan jumlah beli : ");

$total = $harga * $jumlah;

if ($total > 67300) {
    $diskon = $total * 0.03;
} else {
    $diskon = 0;
}

$total_bayar = $total - $diskon;

echo "\n==== STRUK BELANJA ====\n";
echo "Nama Barang   : $nama\n";
echo "Harga Satuan  : $harga\n";
echo "Jumlah Beli   : $jumlah\n";
echo "Total Harga   : $total\n";
echo "Diskon        : $diskon\n";
echo "Total Bayar   : $total_bayar\n";
echo "=======================\n";
?>