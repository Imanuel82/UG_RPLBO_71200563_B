import java.util.Scanner;

public class Main {
    public static void main(String argsp[]) {
        TabunganKonvensional K_71200563 = new TabunganKonvensional();
        TabunganBerjangka I_71200563 = new TabunganBerjangka();
        Scanner input = new Scanner(System.in);

        System.out.println("Pilihan:\n" +
                "1. Penyetoran\n" +
                "2. Penarikan\n" +
                "3. Lihat saldo\n" +
                "Masukkan pilihan: ");
        int pilihan = input.nextInt();
        if(pilihan == 1) {
            K_71200563.penyetoran(200000);
            I_71200563.penyetoran(1000000);
        } else if(pilihan == 2) {
            K_71200563.penarikan(50000);
            I_71200563.penarikan(50000);
        } else if(pilihan == 3) {
            K_71200563.getSaldo();
            I_71200563.getSaldo();
        }


    }
}