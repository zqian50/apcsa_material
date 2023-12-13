import java.util.Random;

public class MyRandomSeed{
  public static void main(String[]args){

    //no seed is provided, Java uses the systmem nano time as seed 
    Random range = new Random(); 
    int seed = range.nextInt(); // generate a random seed to create different Random objects
    // seed = seed_here;
    
    System.out.println("The seed is : " + seed);
    range = new Random(seed);
    for(int i =  0; i < 5; i++ ){
      System.out.print(range.nextInt() % 1000 + " ");
    }
    System.out.println();
  }
}
