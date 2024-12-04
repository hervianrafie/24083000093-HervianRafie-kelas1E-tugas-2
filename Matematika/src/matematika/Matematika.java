/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematika;

/**
 *
 * @author Administrator
 */

public class Matematika {

    int tambah;
    int kurang;
    int kali;
    int bagi;
    double doubleTambah1;
    double doubleKurang1;
    double doubleKali1;
    double doubleBagi1;

    void setPertambahan (int a, int b){
        tambah = a + b;
    }
    void setPertambahan (int a, int b, int c){
        tambah = a + b + c;
    }
    void setPertambahan (double a, double b){
        doubleTambah1 = a + b;
    }
    void setPertambahan (double a, double b, double c){
        doubleTambah1 = a + b + c;
    }
    void setPengurangan(int a, int b){
        kurang = a - b;
    }
    void setPengurangan(int a, int b, int c){
        kurang = a - b - c;
    }
    void setPengurangan(double a, double b){
        doubleKurang1 = a - b;
    }
    void setPengurangan(double a, double b, double c){
        doubleKurang1 = a - b - c;
    }
    void setPerkalian(int a, int b){
        kali = a * b;
    }
    void setPerkalian(int a, int b,int c){
        kali = a * b * c;
    }
    void setPerkalian(double a, double b){
        doubleKali1 = a * b ;
    }
    void setPerkalian(double a, double b, double c){
        doubleKali1 = a * b * c;
    }
    void setPembagian(int a, int b){
        bagi = a / b;
    }
    void setPembagian(int a, int b,int c){
        bagi = a / b / c;
    }
    void setPembagian(double a, double b){
        doubleBagi1 = a / b;
    }
    void setPembagian(double a, double b, double c){
        doubleBagi1 = a / b / c;
    }
    int getPertambahan (){
        return tambah;
    }
    double getDoublePertambahan (){
        return doubleTambah1;
    }
    int getPengurangan (){
        return kurang;
    }
    double getDoublePengurangan (){
        return doubleKurang1;
    }
    int getPerkalian (){
        return kali;
    }
    double getDoublePerkalian (){
        return doubleKali1;
    }
    int getPembagian(){
        return bagi;
    }
    double getDoublePembagian (){
        return doubleBagi1;
    }
}
