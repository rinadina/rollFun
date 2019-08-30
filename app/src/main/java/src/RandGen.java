package src;
import java.util.Random;

public class RandGen{
    int numGenerated;
    Random random;

    public RandGen() {
       random=new Random(); //making random into an object of type Random
    }

    public int getNum (int bound){
        numGenerated= random.nextInt(bound);
        return numGenerated;
    }

    public static void main (String[] args){
        RandGen randomGenerator= new RandGen(); //making randomGenerator into a new object of type RandGen.
        // Need to create a new object under RandGen since main is treated as outside of the RandGen class.
        System.out.println(randomGenerator.getNum(6));

    }

}
