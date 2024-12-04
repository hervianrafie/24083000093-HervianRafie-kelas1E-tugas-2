/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author Administrator
 */
public class MatematikaCanggihBeraksi {
  public static void main(String[] args) {
        MatematikaCanggih MaT = new MatematikaCanggih();

        MaT.setPertambahan(23, 34);
        System.out.println("Hasil dari Pertambahan (2 int) = " + MaT.getPertambahan());

        MaT.setPertambahan(12, 28, 14);
        System.out.println("Hasil dari Pertambahan (3 int) = " + MaT.getPertambahan());

        MaT.setPertambahan(9.3, 6.7);
        System.out.println("Hasil dari Pertambahan (2 double) = " + MaT.getDoublePertambahan());

        MaT.setPertambahan(14.8, 13.9, 14.1);
        System.out.println("Hasil dari Pertambahan (3 double) = " + String.format("%.2f",MaT.getDoublePertambahan()));

        MaT.setPengurangan(23, 34);
        System.out.println("Hasil dari Pengurangan (2 int) = " + MaT.getPengurangan());

        MaT.setPengurangan(12, 28, 14);
        System.out.println("Hasil dari Pengurangan (3 int) = " + MaT.getPengurangan());

        MaT.setPengurangan(9.3, 6.7);
        System.out.println("Hasil dari Pengurangan (2 double) = " + MaT.getDoublePengurangan());

        MaT.setPengurangan(14.8, 13.9, 14.1);
        System.out.println("Hasil dari Pengurangan (3 double) = " + String.format("%.2f",MaT.getDoublePengurangan()));

        MaT.setPerkalian(23, 34);
        System.out.println("Hasil dari Perkalian (2 int) = " + MaT.getPerkalian());

        MaT.setPerkalian(12, 28, 14);
        System.out.println("Hasil dari Perkalian (3 int) = " + MaT.getPerkalian());

        MaT.setPerkalian(9.3, 6.7);;
        System.out.println("Hasil dari Perkalian (2 double) = " + MaT.getDoublePerkalian());

        MaT.setPerkalian(14.8, 13.9, 14.1);
        System.out.println("Hasil dari Perkalian (3 double) = " + String.format("%.2f",MaT.getDoublePerkalian()));

        MaT.setPembagian(23, 34);
        System.out.println("Hasil dari Pembagian (2 int) = " + MaT.getPembagian());

        MaT.setPembagian(12, 28, 14);
        System.out.println("Hasil dari Pembagian (3 int) = " + MaT.getPembagian());

        MaT.setPembagian(9.3, 6.7);
        System.out.println("Hasil dari Pembagian (2 double) = " + MaT.getDoublePembagian());

        MaT.setPembagian(14.8, 13.9, 14.1);
        System.out.println("Hasil dari Pembagian (3 double) = " + String.format("%.2f",MaT.getDoublePembagian()));

        MaT.setModulus(23, 34);
        System.out.println("Hasil dari Modulus (2 int) = " + MaT.getModulus());

        MaT.setModulus(12, 28, 14);
        System.out.println("Hasil dari Modulus (3 int) = " + MaT.getModulus());

        MaT.setModulus(9.3, 6.7);
        System.out.println("Hasil dari Modulus (2 double) = " + MaT.getDoubleModulus());

        MaT.setModulus(14.8, 13.9, 14.1);
        System.out.println("Hasil dari Modulus (3 double) = " + String.format("%.2f",MaT.getDoubleModulus()));
    }
}   

