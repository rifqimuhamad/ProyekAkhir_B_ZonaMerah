/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code.Pengguna.Fiture.System;

/**
 *
 * @author Kintan Khairunnisa(1402019052)
 * @author Muhammad Rizky Yuhari(1402019075)
 * @author Rangga Pujangga(1402019090)
 * @author Muhamad Rifqi(1402019058)

 */
public class ItemPembelian extends Item implements Harga {
    private String namaItem;
    private int hargaItem;
    private int jumlahItem;
    
    public ItemPembelian(){
        
    }
    public String getNamaItem() {//Mengambil nama item
        return namaItem;
    }

    public void setNamaItem(String namaItem) {// untuk menyeimpan nama item
        this.namaItem = namaItem;
    }
    public int getJumlahItem() {// Mengambil jumlah item
        return jumlahItem;
    }
    public void setJumlahItem(int jumlahItem) {// menyimpan jumlah Item
        this.jumlahItem = jumlahItem;
    }

    public ItemPembelian(String nama, int jumlah,int harga){
        super(nama);
        this.hargaItem = harga;
        this.jumlahItem = jumlah;
    }

    @Override
    public void setHarga(int harga) {// untuk menyimpan harga
       this.hargaItem = harga ;
    }
    @Override
    public int getHarga() {//Mengambil harga
        return hargaItem;
    }
        
        
}
