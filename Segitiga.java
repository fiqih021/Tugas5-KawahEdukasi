public class Segitiga extends Lahan {
    double sisiAlas = 10;
    double tinggi = 7;
    double sisiNaik1 = 8;
    double sisiNaik2 = 9;

    @Override
    double luas() {
        // TODO Auto-generated method stub
        return (sisiAlas * tinggi) / 2;
    }

    @Override
    double keliling() {
        // TODO Auto-generated method stub
        return sisiAlas + sisiNaik1 + sisiNaik2;
    }

}
