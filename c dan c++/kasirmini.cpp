#include <iostream>
using namespace std;

int main() {
    string nama;
    double harga;
    int jumlah;

    cout << "Masukkan nama barang: ";
    getline(cin, nama);

    cout << "Masukkan harga barang: ";
    cin >> harga;

    cout << "Masukkan jumlah barang: ";
    cin >> jumlah;

    double total = harga * jumlah;
    double diskon;

    if (total > 67300){
        diskon = total * 0.03;
    } else{
        diskon = 0;
    }

    double total_bayar = total - diskon;

    cout << "\n==== STRUK BELANJA ====\n";
    cout << "Nama Barang   : " << nama << endl;
    cout << "Harga Satuan  : " << harga << endl;
    cout << "Jumlah Beli   : " << jumlah << endl;
    cout << "Total Harga   : " << total << endl;
    cout << "Diskon        : " << diskon << endl;
    cout << "Total Bayar   : " << total_bayar << endl;
    cout << "=======================\n";

    return 0;

}