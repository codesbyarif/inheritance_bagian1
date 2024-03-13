public class Segitiga extends BangunDatar {
    // Segitiga Siku siku
    float alas, tinggi;
    float sisiMiring;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        pitagoras();
       
    }
    public float pitagoras (){

         double miring = Math.sqrt(Math.pow(this.alas, 2) + Math.pow(this.tinggi, 2));
         return  this.sisiMiring = (float) miring;
    }
    @Override
    public float luas() {
      double luas = 0.5 * alas * tinggi;
      float luas1 = (float) luas;
      return luas1;
    }

    @Override
    public float keliling() {
      double keliling = alas + tinggi + sisiMiring;
      float keliling1 = (float) keliling;
      return keliling1;

    }

    
}
