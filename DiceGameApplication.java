public class DiceGameApplication{

    //Constructor
    public DiceGameApplication(){
        String name;
        GreetingApplication greeting = new GreetingApplication();
        name = greeting.getName();

        System.out.println("Rolling dice...");
        Dice d1 = new Dice();
        d1.generate();
        System.out.println("Die 1: " + d1.getNumber());
        Dice d2 = new Dice();
        d2.generate();
        System.out.println("Die 2: " + d2.getNumber());

        Culc culclator = new Culc();
        int sum = culclator.Sum(d1.getNumber(), d2.getNumber());
        System.out.println("Total value: " + sum);

        Judge j = new Judge(7);
        if(j.rum(sum)){
            System.out.println(name + " won!");
        }
    }




    public static void main(String args[]){
        DiceGameApplication DGA = new DiceGameApplication();
    }
}