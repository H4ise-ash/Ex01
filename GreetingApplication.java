import java.util.Scanner;

public class GreetingApplication{

    //Constructor
    public GreetingApplication(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.next();
        
        System.out.println("Hello, " + name + "!");

        sc.close();
    }
    
    public static void main(String args[]){
        GreetingApplication geeting = new GreetingApplication();
    }
}