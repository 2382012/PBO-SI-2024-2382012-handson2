import java.util.Scanner;
// pake klo kita tau case nya dari 1 - 7 (arrange nya)
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nomorHari;
        System.out.print("Masukkan nomor diantara 1 -7: ");
        nomorHari = scanner.nextInt();
        String namaHari = "";

        switch (nomorHari) {
            case 1:
                namaHari = "Minggu";
                break;
            case 2:
                namaHari = "Senin";
                break;
            case 3:
                namaHari = "Selasa";
                break;
            case 4:
                namaHari = "Rabu";
                break;
            case 5:
                namaHari = "Kamis";
                break;
            case 6:
