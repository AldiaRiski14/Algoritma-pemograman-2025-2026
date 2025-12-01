<?php

function rupiah($n){
    return "Rp " . number_format($n, 0, ',', '.');
}

while(true){
    $nama = readline("Masukkan nama: ");
    $cek = strtoupper(readline("Nama sudah benar? (TRUE/FALSE): "));
    if($cek === "TRUE") break;
}

while(true){
    $nim = readline("Masukkan NIM angka saja: ");
    if(ctype_digit($nim)) break;
}

$saldo = (int)$nim;

echo "Nama: $nama\n";
echo "Saldo awal: " . rupiah($saldo) . "\n";

while(true){
    echo "\n===== MENU ATM =====\n";
    echo "1. Cek Saldo\n";
    echo "2. Tarik Tunai\n";
    echo "3. Setor Tunai\n";
    echo "4. Transfer\n";
    echo "5. Keluar\n";

    $p = readline("Pilih: ");

    switch($p){
        case "1":
            echo rupiah($saldo) . "\n";
            break;

        case "2":
            $x = (int)readline("Nominal tarik: ");
            if($x <= $saldo) $saldo -= $x;
            else echo "Saldo tidak cukup\n";
            break;

        case "3":
            $x = (int)readline("Nominal setor: ");
            $saldo += $x;
            break;

        case "4":
            $x = (int)readline("Nominal transfer: ");
            if($x <= $saldo){
                $rek = readline("Rekening tujuan: ");
                echo "Transfer ke $rek berhasil\n";
                $saldo -= $x;
            } else echo "Saldo tidak cukup\n";
            break;

        case "5":
            exit;

        default:
            echo "Pilihan salah\n";
    }
}
?>