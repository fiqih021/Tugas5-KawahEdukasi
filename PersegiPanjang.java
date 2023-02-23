class PersegiPanjang extends Lahan {

    private double panjang = 10;
    private double lebar = 5;

    @Override
    double keliling() {
        // TODO Auto-generated method stub
        return 2*panjang + 2*lebar;
    }

    @Override
    double luas() {
        // TODO Auto-generated method stub
        return panjang*lebar;
    }

    
}  