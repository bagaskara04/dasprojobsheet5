import java.util.Scanner;
public class PemilihanPercobaan210 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);

        System.out.print("Nilai UAS   : ");
        float uas = input10.nextFloat();
        System.out.print("Nilai UTS   : ");
        float uts = input10.nextFloat();
        System.out.print("Nilai kuis  : ");
        float kuis = input10.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input10.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak Remidi";
        System.out.println("Nilai akhir = " + total + " Sehingga " + message);

        if (total >= 80) {
            System.out.println("Nilai Huruf A, Nilai setara 4, Kualifikasi Sangat Baik");
        } else if(total >=73) {
            System.out.println("Nilai huruf B+, Nilai setara 3,5, Kualifikasi Lebih dari baik");
        } else if(total >=65){
            System.out.println("Nilai huruf B, Nilai setara 3, Kualifikasi Baik");
        } else if(total >=60){
            System.out.println("Nilai huruf C+, Nilai setara 2,5, Kualifikasi Lebih dari cukup");
        } else if(total >=50){
            System.out.println("Nilai huruf C, Nilai setara 2, Kualifikasi cukup");
        } else if(total >=39){
            System.out.println("Nilai huruf D, Nilai setara 1, Kualifikasi kurang");
        } else{
            System.out.println("Nilai huruf E, Nilai setara 0, Gagal");
        }
    }
}

