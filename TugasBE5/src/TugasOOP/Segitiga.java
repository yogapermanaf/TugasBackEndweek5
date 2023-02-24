package TugasOOP;

public class Segitiga implements BangunDatar {
    Segitiga() {

    }

    @Override
    public double luas(int a, int b) {
        return (0.5 * a * b);
    }

    @Override
    public double keliling(int a, int b, int c) {
        return (a + b + c );
    }
}