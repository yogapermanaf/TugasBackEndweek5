package TugasOOP;
    public class Main {
        public static void main(String[] args) {
            // Membuat objek dari class Persegi
            Persegi oPersegi = new Persegi();
            double luasPersegi = oPersegi.luas(5, 0);
            double kelilingPersegi = oPersegi.keliling(5, 0, 0);

            // Membuat objek dari class PersegiPanjang
            PersegiPanjang oPersegiPanjang = new PersegiPanjang();
            double luasPersegiPanjang = oPersegiPanjang.luas(10, 5);
            double kelilingPersegiPanjang = oPersegiPanjang.keliling(10, 5, 0);

            // Membuat objek dari class Segitiga
            Segitiga oSegitiga = new Segitiga();
            double luasSegitiga = oSegitiga.luas(10, 7);
            double kelilingSegitiga = oSegitiga.keliling(10, 9, 8);

            // Membuat objek dari class Lingkaran
            Lingkaran oLingkaran = new Lingkaran();
            double luasLingkaran = oLingkaran.luas(7);
            double kelilingLingkaran = oLingkaran.keliling(7);

            // Menampilkan hasil perhitungan luas dan keliling ke layar
            System.out.println("Luas dan Keliling Tanah Pak Dengklek:");
            System.out.println("Persegi - Luas: " + luasPersegi + " cm^2, Keliling: " + kelilingPersegi + " cm");
            System.out.println("Persegi Panjang - Luas: " + luasPersegiPanjang + " cm^2, Keliling: " + kelilingPersegiPanjang + " cm");
            System.out.println("Segitiga - Luas: " + luasSegitiga + " cm^2, Keliling: " + kelilingSegitiga + " cm");
            System.out.println("Lingkaran - Luas: " + luasLingkaran + " cm^2, Keliling: " + kelilingLingkaran + " cm");
        }
}
