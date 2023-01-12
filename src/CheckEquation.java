import java.util.Scanner;
public class CheckEquation  {
    /*
      the user enter his/her name and the program will read only the first name also he/she will enter the id number or -1
      to exit the  program will chick if the number is valid or not if not the program Asks user to  enter the id number or -1
      to exit if the number is valid a program will display a menu asking the user what he/she wants to do next then the
      program go to menu methode.

     */
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int num =0;
        while(num != -1 ){
            System.out.print("Enter your name : ");
            String name =input.next();
            String y = input.nextLine();
            System.out.println("Welcome " + name);
            System.out.println("if you want to exit enter -1 ");
            System.out.print("Enter the id number : ");
            num = input.nextInt();
            if (num == -1){
                System.out.println("Good By");
                break;
            }
            while (!Equation.isBalanced(num)){
                System.out.println("Invalid number");
                System.out.println("Enter the id number : ");
                System.out.println("Enter -1 to exit: ");

                num = input.nextInt();
            }
            if (num == -1){
                System.out.println("Good By");
                break;
            }
            menu();

        }
    }
    /*
    this methode if user enter 4 he /she will exit from the menu if user enter 1 program will go to the methode
    that solve quadratic  equation if user enter 2 program will go to the methode that find quadratic  equation roots
    if user enter 3 program will go to the methode that combine two quadratic  equations.

     */
    public static void menu(){
        Scanner input = new Scanner (System.in);
        while (true){
            System.out.println("If you want to solve quadratic  equation enter 1\n" +
                    "If you want to find quadratic  equation roots enter 2 \n" +
                    "If you want to combine two quadratic  equations  enter 3 \n" +
                    "If you want to exit the menu 4");
            int operation = input.nextInt();
            switch (operation){
                case 1 : System.out.println(Equation.solveEquation ());
                    break;
                case 2 : Equation.findEquationRoots() ;
                    break;
                case 3 : Equation.combineEquations();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid input :");
                    break;
            }
        }
    }
}


