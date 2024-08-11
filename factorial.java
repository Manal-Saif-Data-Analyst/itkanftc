import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=kb.nextInt();
        System.out.println(factorial(n));
        
    }

    public static int factorial(int a){
        int factor = 1;
        for(int n=a; n >= 1; n--){
           factor *= n;
           
        }
         return factor;
    }
}
