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

public class Item {
    private String item;
    public Item(){}
    public Item(String item){//konstruktor untuk nama sperpart
        this.item = item;}
    public String getItem() {//mengambil nama sperpart
        return item;}
    public void setItem(String item) {//menympan nama sperpart
        this.item = item;
    }
}
