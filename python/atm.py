def rupiah(n):
    return "Rp {:,}".format(n).replace(",", ".")

while True:
    nama = input("Masukkan nama: ")
    cek = input("Nama sudah benar? (TRUE/FALSE): ").upper()
    if cek == "TRUE":
        break

while True:
    nim = input("Masukkan NIM angka saja: ")
    if nim.isdigit():
        break

saldo = int(nim)

print("Nama:", nama)
print("Saldo awal:", rupiah(saldo))

while True:
    print("\n===== MENU ATM =====")
    print("1. Cek Saldo")
    print("2. Tarik Tunai")
    print("3. Setor Tunai")
    print("4. Transfer")
    print("5. Keluar")

    p = input("Pilih: ")

    if p == "1":
        print(rupiah(saldo))

    elif p == "2":
        x = int(input("Nominal tarik: "))
        if x <= saldo:
            saldo -= x
        else:
            print("Saldo tidak cukup")

    elif p == "3":
        x = int(input("Nominal setor: "))
        saldo += x

    elif p == "4":
        x = int(input("Nominal transfer: "))
        if x <= saldo:
            rek = input("Rekening tujuan: ")
            print("Transfer ke", rek, "berhasil")
            saldo -= x
        else:
            print("Saldo tidak cukup")

    elif p == "5":
        break

    else:
        print("Pilihan salah")