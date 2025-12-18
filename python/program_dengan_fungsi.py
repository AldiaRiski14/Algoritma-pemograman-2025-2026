# Variabel global untuk menyimpan data Buku
buku = []
def show_data():
    if len(buku) <= 0:
        print ('BELUM ADA DATA BUKU')
    else:
        for indeks in range(len(buku)):
            print ('%d. %s' % (indeks+1, buku[indeks]))
            def insert_data():
                buku_baru = raw_input('judul buku: ')
                buku.append(buku_baru)
                def edit_data():
                    show_data()
                    indeks = input('Inputan ID buku: ')
                    if(indeks > len(buku)):
                        print ('ID salah')
                    else:
                        judul_baru = raw_input('Judul buku baru: ')
                        buku[indeks] = judul_baru
                        def delete_data():
                         show_data()
                        indeks = input('Inputkan ID buku: ')
                        if(indeks > len(buku)):
                            print ('ID salah')
                        else:
                            buku.remove(buku[indeks])

                        buku.pop(indeks)
                        def show_menu():
                            print('\n')
                            print('----------- MENU ----------')
                            print('[1] show data')
                            print('[2] insert data')
                            print('[3] edit data')
                            print('[4] delete data')
                            print('[5] exit')
                            
                            menu = input('Pilih menu> ')
                            print('\n')
                            
                            if menu == 1:
                                show_data()
                            elif menu == 2:
                                insert_data()
                            elif menu == 3:
                                edit_data()
                            elif menu == 4:
                                delete_data()
                            elif menu == 5:
                                exit()
                            else:
                                print ('salah pilih!')
                                
                                if __name__ == '__main__':
                                    while(True):
                                        show_menu()
                