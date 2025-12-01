#include <iostream>
#include <string>
using namespace std;

string rupiah(int n){
    string s = to_string(n), r = "";
    int c = 0;
    for(int i = s.size()-1; i >= 0; i--){
        r = s[i] + r;
        c++;
        if(c == 3 && i != 0){
            r = "." + r;
            c = 0;
        }
    }
    return string("Rp ") + r;
}

int main(){
    string nama, cek, nim;

    while(true){
        cout << "Masukkan nama: ";
        getline(cin, nama);
        cout << "Nama sudah benar? (TRUE/FALSE): ";
        getline(cin, cek);
        for(char &c : cek) c = toupper(c);
        if(cek == "TRUE") break;
    }

    while(true){
        cout << "Masukkan NIM angka saja: ";
        getline(cin, nim);
        bool ok = true;
        for(char c : nim) if(!isdigit(c)) ok = false;
        if(ok) break;
    }

    int saldo = stoi(nim);

    cout << "Nama: " << nama << endl;
    cout << "Saldo awal: " << rupiah(saldo) << endl;

    while(true){
        cout << "\n===== MENU ATM =====\n";
        cout << "1. Cek Saldo\n";
        cout << "2. Tarik Tunai\n";
        cout << "3. Setor Tunai\n";
        cout << "4. Transfer\n";
        cout << "5. Keluar\n";

        string p;
        getline(cin, p);

        if(p == "1"){
            cout << rupiah(saldo) << endl;
        }
        else if(p == "2"){
            int x;
            cout << "Nominal tarik: ";
            cin >> x;
            cin.ignore();
            if(x <= saldo) saldo -= x;
            else cout << "Saldo tidak cukup\n";
        }
        else if(p == "3"){
            int x;
            cout << "Nominal setor: ";
            cin >> x;
            cin.ignore();
            saldo += x;
        }
        else if(p == "4"){
            int x;
            cout << "Nominal transfer: ";
            cin >> x;
            cin.ignore();
            if(x <= saldo){
                string rek;
                cout << "Rekening tujuan: ";
                getline(cin, rek);
                cout << "Transfer ke " << rek << " berhasil\n";
                saldo -= x;
            } else cout << "Saldo tidak cukup\n";
        }
        else if(p == "5"){
            return 0;
        }
        else {
            cout << "Pilihan salah\n";
        }
    }
}