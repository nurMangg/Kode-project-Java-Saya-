import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class InputOutputSederhana extends Frame {

    public static void main(String[] args) throws IOException {
        /* System.out.println("Masukkan Satu Huruf Kemudian Tekan EENTER");
        int myInput;
        myInput = System.in.read;

         System.Out.Println("Huruf yang ditekan menjadi ASCII dengan kode = " + myInput);
         */

        Scanner myInput = new Scanner(System.in);
        System.out.println("Masukkan Nama Lengkap = ");
        String namaSaya = myInput.nextLine();
        System.out.println("Nama Lengkap Anda Adalah = " + namaSaya);

        System.out.println("Masukkan nilai Alas = ");
        double alas = myInput.nextDouble();
        System.out.println("Masukkan nilai Tinggi = ");
        double tinggi = myInput.nextDouble();
        double LuasSegitiga = alas * tinggi;
        System.out.println("Luas Segitiga Adalah = " + LuasSegitiga);
    }
}
