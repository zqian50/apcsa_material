import java.util.Random;

public class MyRandom{
  public static void main(String[]args){

    Random rng = new Random(); // no seed defined, Java uses the systmem nano time as seed 
    for(int i =  0; i < 5; i++ ){
      System.out.print(rng.nextInt() % 1000 + " ");
    }
    System.out.println();

    //specified seed can be used to reproduce sequences
    rng = new Random(100);//seed is specified  to reproduce sequences
    for(int i =  0; i < 5; i++ ){
      System.out.print(rng.nextInt() % 1000 + "");
    }
    System.out.println();
    
    rng = new Random(); // no seed
    // Add a seed and check what happens?
    for(int i =  0; i < 5; i++ ){
      System.out.print(rng.nextInt(4) + " ");
    }
    System.out.println();
  }
}
