public class Logika {
    public static void main(String[] args) {
        boolean a = true;// kalo salah satu false maka hasilnya false
        boolean b = false;

        // AND
        boolean hasil = a && b;
        System.out.println(hasil);

        //OR akan false klo 22nya sama
        hasil = a || b;
        System.out.println(hasil);
    }
}
