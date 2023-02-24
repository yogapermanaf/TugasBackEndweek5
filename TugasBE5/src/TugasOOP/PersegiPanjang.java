package TugasOOP;

public class PersegiPanjang implements BangunDatar {
    PersegiPanjang(){

    }

    @Override
    public double luas(int a, int b) {
        return (a * b);
    }
    @Override
    public double keliling (int a, int b, int c) {
        return (2* (a + b));
    }
}
