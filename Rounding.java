public class Rounding {
  public Rounding () {
   double number = 3.0;
   for ( int i = 1; i <= 50; i ++) {
     
     number *= 10.0;
     System.out.println(number);
   }
  }
  public static void main(String[] args) {
    Rounding bob = new Rounding();
    
  }
}