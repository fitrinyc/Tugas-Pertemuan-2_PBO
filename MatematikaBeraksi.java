/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_pertemuan4;

/**
 *
 * @author lenovo
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Matematika matematika = new Matematika();
        int angka1 = 20;
        int angka2 = 10;

        int hasilPertambahan = angka1 + angka2;
        System.out.println("Pertambahan : " + angka1 + " + " + angka2 + " = " + hasilPertambahan);
        int hasilPengurangan = angka1 - angka2;
        System.out.println("Pengurangan : " + angka1 + " - " + angka2 + " = " + hasilPengurangan);
        int hasilPerkalian = angka1 * angka2;
        System.out.println("Perkalian : " + angka1 + " * " + angka2 + " = " + hasilPerkalian);
        int hasilPembagian = angka1 / angka2;
        System.out.println("Pembagian : " + angka1 + " / " + angka2 + " = " + hasilPembagian);

        tampilanBingo();
    }

    public static void tampilanBingo() {
        String[] lines = {
            "There was a farmer who had a dog,",
            "And Bingo was his name-o.",
            "B-I-N-G-O",
            "B-I-N-G-O",
            "B-I-N-G-O",
            "And Bingo was his name-o.",
            "There was a farmer who had a dog,",
            "And Bingo was his name-o.",
            "(clap)-I-N-G-O",
            "(clap)-I-N-G-O",
            "(clap)-I-N-G-O",
            "And Bingo was his name-o.",
            "There was a farmer who had a dog,",
            "And Bingo was his name-o.",
            "(clap)-(clap)-N-G-O",
            "(clap)-(clap)-N-G-O",
            "(clap)-(clap)-N-G-O",
            "And Bingo was his name-o.",
            "There was a farmer who had a dog,",
            "And Bingo was his name-o.",
            "(clap)-(clap)-(clap)-G-O",
            "(clap)-(clap)-(clap)-G-O",
            "(clap)-(clap)-(clap)-G-O",
            "And Bingo was his name-o.",
            "There was a farmer who had a dog,",
            "And Bingo was his name-o.",
            "(clap)-(clap)-(clap)-(clap)-O",
            "(clap)-(clap)-(clap)-(clap)-O",
            "(clap)-(clap)-(clap)-(clap)-O",
            "And Bingo was his name-o.",
            "There was a farmer who had a dog,",
            "And Bingo was his name-o.",
            "(clap)-(clap)-(clap)-(clap)-(clap)",
            "(clap)-(clap)-(clap)-(clap)-(clap)",
            "(clap)-(clap)-(clap)-(clap)-(clap)",
            "And Bingo was his name-o."
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
    
}
