/**
 * PemilihanBilangan10
 */
import java.util.Scanner;
public class PemilihanBilangan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan sebuah  angka : ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka "+angka+" Termasuk bilangan genap");
        } else {
            System.out.println("Angka "+angka+" Termasuk bilangan ganjil");
        }
    }
}