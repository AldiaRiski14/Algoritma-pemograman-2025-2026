nama = input("masukan nama barang : ")
harga = float(input("masukan harga barang : "))
jumlah = int(input("masukan jumlah beli : "))

total = harga * jumlah

if total > 67300:
    diskon = total * 0.03
else:
    diskon = 0

total_bayar = total - diskon

print("\n==== STRUK BELANJA ====")
print(f"Nama Barang   : {nama}")
print(f"Harga Satuan  : {harga}")
print(f"Jumlah Beli   : {jumlah}")
print(f"Total Harga   : {total}")
print(f"Diskon        : {diskon}")
print(f"Total Bayar   : {total_bayar}")
print("=======================")
