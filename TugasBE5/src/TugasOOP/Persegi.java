package TugasOOP;

public class Persegi implements BangunDatar {
    Persegi(){
    }
    @Override
    public double luas(int a, int b) {
        return (a * a);
    }
    @Override
    public double keliling (int a, int b,int c) {
        return (4 * a);
    }
}