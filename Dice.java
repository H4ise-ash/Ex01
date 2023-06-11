import java.util.Random;

public class Dice{
    //Field
    private int num;

    //Constructor
    public Dice(){
        num = -1;
    }

    //Getter
    public int getNumber(){
        return num;
    }

    //Method
    public void generate(){
        Random rand = new Random();
        num = rand.nextInt(6) + 1;
    }

}
