public class Sepeda {
    public static void main(String[] args) {
        
        Lingkaran lingkaran = new Lingkaran(7);
        PersegiPanjang persegiPanjang = new PersegiPanjang(4,5);
        Segitiga segitiga = new Segitiga(3, 4); // Segitiga siku siku

        System.out.println("Luas Lingkaran :" + lingkaran.luas());
        System.out.println("keliling Lingkaran :" + lingkaran.keliling());
        
        System.out.println("Luas Segitiga :" + segitiga.luas());
        System.out.println("Keliling Segitiga :" + segitiga.keliling());
        
        System.out.println("Luas Persegi Panjang : " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang : " + persegiPanjang.keliling());
       
    }
}
