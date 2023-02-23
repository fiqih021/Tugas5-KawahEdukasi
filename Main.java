public class Main {
    public static void main(String[] args) {
        Persegi p = new Persegi();
        Segitiga s = new Segitiga();
        Lingkaran l = new Lingkaran();
        PersegiPanjang pp = new PersegiPanjang();

        System.out.println("keliling persegi = " + p.keliling());
        System.out.println("Luas Persegi = " + p.luas());

        System.out.println("keliling Segitiga = " + s.keliling());
        System.out.println("Luas segitiga = " + s.luas());

        System.out.println("keliling lingkaran = " + l.keliling());
        System.out.println("Luas Lingkaran = " + l.luas());

        System.out.println("keliling Persegi Panjang = " + pp.keliling());
        System.out.println("luas persegi panjang = " + pp.luas());

    }
}
