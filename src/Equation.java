import java.util.Scanner;
public class Equation {
    /*
    this methode get the sum of two equation the user enter the value of a,b,c  (a(x^2)+bx+c) Respectively in the
    first equation then the user enter the value of second equation then print the sum of these two equation.
     */
    public static void combineEquations(){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter value of a,b,c in the first Equation ");
        double a = 0, b = 0, c = 0;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        System.out.println("Enter value of a,b,c in the second Equation ");
        a += input.nextDouble();
        b += input.nextDouble();
        c += input.nextDouble();
        System.out.println("(" + a + ")" +  "X^2 + " + "(" + b + ")" + "x + " + "(" + c + ")");

    }
    /*
    this methode calculate the roots /root of quadratic Equation also calculate the imaginary roots ,the user enter the
    value of a,b,c (a(x^2)+bx+c) Respectively first it calculate ((b^2)-4ac) if it equal zero calculate just one root and
    print the root if it  positive number calculate two roots and print the roots if it  negative  number calculate two
    roots and print the roots.
     */
    public static void findEquationRoots(){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter value of a,b,c ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double y , answer = 0, answer2 = 0;
        y= b*b-4*a*c;
        if (y == 0) {
            answer = (-b) / (2 * a);
            System.out.println("the root= " + answer);
        }
        if (y > 0) {
            answer = (-b -Math.sqrt(y) ) / (2 * a);
            System.out.println("the firt root= " + answer);
            answer2 = (-b + Math.sqrt(y)) / (2 * a);
            System.out.println("the second root= " + answer2);
        }

        else {
            System.out.println(" The imaginary roots are  ");
            answer = (-b - Math.sqrt(-y)) / (2 * a);
            System.out.println("the firt root= " + answer);
            answer2 = (-b + Math.sqrt(-y)) / (2 * a);
            System.out.println("the second root= " + answer2);
        }

    }
     /*
    in this methode the user enter the value of x and a ,b,c  (a(x^2)+bx+c) Respectively
    and the methode will solve the quadratic Equation and return the answer
     */
    public static double solveEquation (){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter value of x ");
        double x = input.nextDouble();
        System.out.println("Enter value of a,b,c ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double answer = a*Math.pow(x,2) + b*x + c ;
        return answer;

    }
    /*
    this function check if number is balanced by taking each digit of the number
    and check if it even or odd by take the %2 if the answer is 0 then the digit is
    even and added it to the even sun else the number is odd and added it to odd sun
    if the odd sun equal even sum then return true (the number is balanced)
    else the number is not balanced
    */
    public static boolean isBalanced (int num){

        int digit=0, evenSum=0 ,oddSum=0, previous=0;
        while (num > 0) {

            digit = num % 10;
            if (digit == previous){
                return false;
            }
            if (digit % 2 == 0)
                evenSum += digit;
            else
                oddSum +=digit;
            num = num /10;
            previous = digit;
        }
        if (oddSum == evenSum)
            return true;
        else
            return false;
    }

}
