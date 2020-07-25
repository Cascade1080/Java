import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    int rock = 1;
    int paper = 2;
    int scissors = 3;
    String player1;
    String player2;
    String item1;
    String item2;
    Integer verdictD;
    boolean yornmaster;

    public RockPaperScissors(){

    }

    public void verdict(int a, int b){

        if(a == rock && b == scissors){
            System.out.println("Rock Crushes Scissors.");
            verdictD = 1;
        } else if (a == scissors && b == rock){
            System.out.println("Rock Crushes Scissors.");
            verdictD = 2;
        } else if (a == scissors && b == paper){
            System.out.println("Scissors Cuts Paper.");
            verdictD = 1;
        } else if (a == paper && b == scissors){
            System.out.println("Scissors Cuts Paper.");
            verdictD = 2;
        } else if (a == paper && b == rock) {
            System.out.println("Paper Covers Rock.");
            verdictD = 1;
        } else if (a == rock && b == paper) {
            System.out.println("Paper Covers Rock.");
            verdictD = 2;
        } else if (a == b){
                System.out.println("It's a Tie!");
                verdictD = 3;
            }

        }


    public void shoot1(int a){

        if(a == 1){
            item1 = "Rock";
        }else if (a == 2){
            item1 = "Paper";
        }else {
            item1 = "Scissors";
        }

    }
    public void shoot2(int a){

        if(a == 1){
            item2 = "Rock";
        }else if (a == 2){
            item2 = "Paper";
        }else {
            item2 = "Scissors";
        }

    }



    public boolean play() {

        System.out.println("Rock... Paper... Scissors... Shoot!");
        Random rand = new Random();   //invokes the Random Class

        int rand_int1 = rand.nextInt(3) + 1; //creates random number 1
        int rand_int2 = rand.nextInt(3) + 1; //creates random number 2

        //System.out.println(rand_int1);  //prints random number 1
        //System.out.println(rand_int2);  //prints random number 2
        shoot1(rand_int1); //draws a number for player 1
        System.out.println(player1 + " throws down a " + item1);

        shoot2(rand_int2);  //draws a number for player 2
        System.out.println(player2 + " throws down a " + item2);

        verdict(rand_int1, rand_int2);  //prints the verdict
        if (verdictD == 1) {
            System.out.println(player1 + " Wins!");
        } else if (verdictD == 2) {
            System.out.println(player2 + " Wins!");
        } else {
            System.out.println("It's a Tie!");
        }


        System.out.println("Press 'y' to start next game");
        Scanner yorn = new Scanner(System.in);
        String answer3 = yorn.nextLine();
        /*if (answer3 == "y") {
            yornmaster = true;
        } else {
            yornmaster = false;
        }*/

        return yornmaster;
    }


    public String playerOne(){
        Scanner play1 = new Scanner(System.in);

        System.out.println("Player 1 name:");
        player1 = play1.nextLine();
        return player1;

    }

    public String playerTwo(){
        Scanner play2 = new Scanner(System.in);

        System.out.println("Player 2 name:");
        player2 = play2.nextLine();
        return player2;
    }

    public static void main(String[] args){
        System.out.println("*** Rock, Paper, Scissors ***");
        System.out.println("Would you like to play best out of 5? (yes or no):");
        RockPaperScissors game = new RockPaperScissors();
        Scanner answer = new Scanner(System.in);
        String ans = answer.nextLine();
        int i = 1;
        
         if(ans.equals("yes")) {
             game.playerOne();
             game.playerTwo();
             game.play();

             while(i <= 4){
                 game.play();
                 i++;
             }


         }else if(ans.equals("no")){
             System.out.println("Maybe next time!");
        }


    }
}
