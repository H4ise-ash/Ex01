import java.util.Scanner;

public class GreetingApplication{
    private String name;
    //Constructor
    public GreetingApplication(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        name = sc.next();
        
        System.out.println("Hello, " + name + "!");

        sc.close();
    }

    public String getName(){
        return name;
    }
    
    /*public static void main(String args[]){
        GreetingApplication geeting = new GreetingApplication();
    }*/
}