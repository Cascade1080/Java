import java.util.Scanner;
public class Calculator {
    /* This is a calculator program and my first real project.  This program will do the following:
        Add, Subtract, Multiply and Divide two inputs from the console

        Things to add:
        - read an input that determines the function being used
        - include a 'mean' method

     */
    int inputA;
    int inputB;
    int answer;
    public Calculator(){

    }

    public int addition(int a, int b){
        inputA = a;
        inputB = b;
        int add = inputA + inputB;
        return add;
    }
    public int choice(int an, int a, int b){
        inputA = a;
        inputB = b;
        answer = an;
        if(answer == 1) {
            int addition = inputA + inputB;
            return addition;
        }else if(answer == 2){
            int subtraction = inputA - inputB;
            return subtraction;
        }else if(answer == 3) {
            int multiplication = inputA * inputB;
            return multiplication;
        }else if(answer == 4) {
            int division = inputA / inputB;
            return division;
        }else {
            return 0;
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calculator sm = new Calculator();

        System.out.println("Please type the function (add(1), subtract(2), multiply(3), divide(4): ");
        int answer = sc.nextInt();
        System.out.println("You have chosen " + answer + ". Please enter the first number: ");
        int inputA = sc.nextInt();
        System.out.println("Please enter the second number: ");
        int inputB = sc.nextInt();
        System.out.println(sm.choice(answer, inputA, inputB));

    }
}
