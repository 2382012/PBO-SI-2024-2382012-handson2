import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nomorHari;
        System.out.print("masukan nomor diantara 1 sampai 7 : ");
        nomorHari = scanner.nextInt();
        String namaHari = "";

        if (nomorHari == 1) {
            namaHari = "Minggu";
        }else if (nomorHari == 2) {
            namaHari = "senin";
        } else if (nomorHari == 3) {
            namaHari = "selasa";
        } else if (nomorHari == 4) {
            namaHari = "Rabu";
        } else if (nomorHari == 5) {
            namaHari = "kamis";
        } else if (nomorHari == 6) {
            namaHari = "jumat";
        } else if (nomorHari == 7) {
            namaHari = "sabtu";
        } else {
            System.out.print("masukkan nomor diantara 1 - 7");
            System.exit(0);
        }
        System.out.print("Nama hari:" + namaHari);
        }
    }

