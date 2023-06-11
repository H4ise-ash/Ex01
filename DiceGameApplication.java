public class DiceGameApplication{

    //Constructor
    public DiceGameApplication(){
        System.out.println("Rolling dice...");
        Dice d1 = new Dice();
        d1.generate();
        System.out.println("Die 1: " + d1.getNumber());
        Dice d2 = new Dice();
        d2.generate();
        System.out.println("Die 2: " + d2.getNumber());

        Culc culclator = new Culc();
        System.out.println("Total value: " + culclator.Sum(d1.getNumber(), d2.getNumber()));
    }




    public static void main(String args[]){
        DiceGameApplication DGA = new DiceGameApplication();
    }
}