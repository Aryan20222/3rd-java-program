import java.util.*;
public class Calculator{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("");

        System.out.print("Enter value of A : ");

        int a = sc.nextInt();

        System.out.print("Enter Value of B : ");

        int b = sc.nextInt();

        System.out.print("Enter Operator : ");
        
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' : System.out.println("Sum is : " + (a + b));
                       break;
            case '-' : System.out.println("Subtraction is : " + (a - b)); 
                       break;
            case '*' : System.out.println("Multiplication is : " + (a * b));   
                       break;
            case '/' : System.out.println("Division is : " + (a/b)); 
                       break;
            case '%' : System.out.println("Remainder is " + (a%b) );   
                       break;                                   
            default : System.out.println("Error");
        }
        sc.close();
    }
}