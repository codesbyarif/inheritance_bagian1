public class Lingkaran extends BangunDatar {
    float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    @Override
    public float luas() {
     double luas =  3.14 * r * r;
     float luas1 = (float) luas;
     return luas1;
    }

    @Override
    public float keliling() {
      double keliling = 2 * 3.14 * r;
      float keliling1 = (float) keliling;
      return keliling1;
    }

    
}
