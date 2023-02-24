package TugasOOP;

public class Lingkaran implements BangunDatar {

    private double pi = 3.1415;

    Lingkaran() {

    }

    @Override
    public double luas(int a, int b) {
        return 0;
    }

    @Override
    public double keliling(int a, int b,int c) {
        return 0;
    }

    public double luas(int r) {
        return (pi * r * r);
    }

    public double keliling(int r) {
        return (2 * pi * r);
    }
}