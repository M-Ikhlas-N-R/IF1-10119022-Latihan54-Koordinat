package com.minr;
/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : latihan inheritance
 *
 */
public class Main {
    public static void main(String[] args) {
        WarnaKoordinat warnaKoordinat1 = new WarnaKoordinat(10, 4, "Jingga");
        System.out.printf("Warna Koordinat : %s", warnaKoordinat1.getNamaWarna());
        System.out.printf("\nKoordinat Sumbu x : %d, y : %d", warnaKoordinat1.getX(), warnaKoordinat1.getY());
    }
}
