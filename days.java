package domain;
import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=kb.nextInt();
        System.out.println(n);
        
        if(n==1){
            System.out.println(n  + ". Sunday");
        }
        else if(n==2){
            System.out.println(n +". Monday");
        }
        else if(n==3){
            System.out.println(n + ". Tuesday");
        }
        else if(n==4){
            System.out.println(n + ". Wednesday");
        }
        else if(n==5){
            System.out.println(n + ". Thursday");
        }
        else if(n==6){
            System.out.println(n + ". Friday");
        }
        else if(n==7){
            System.out.println(n + ". Saturday");
        }
        else if(n>7){
            System.out.println("Invalid number");
        }
    }

}
