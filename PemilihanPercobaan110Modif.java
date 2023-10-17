import java.util.Scanner;
public class PemilihanPercobaan110Modif {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        System.out.println("Masukkan sebuah angka : ");
        int angka = input10.nextInt();

        String jenisAngka = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " adalah bilangan " + jenisAngka);
    }
}
