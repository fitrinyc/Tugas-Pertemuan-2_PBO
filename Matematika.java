/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pertemuan4;

/**
 *
 * @author lenovo
 */
class Matematika implements OperasiMatematika {
    public int pertambahan(int a, int b) {
        return a + b;
    }
    public int pengurangan(int a, int b) {
        return a - b;
    }
    public int perkalian(int a, int b) {
        return a * b;
    }
    public int pembagian(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Tidak dapat melakukan pembagian oleh nol.");
            return 0;
        }
    }
}