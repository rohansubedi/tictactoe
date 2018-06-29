import java.util.*;
public class tictactoe {

    public static void main(String[] args) {
        String name1;
        String name2;
        Scanner input = new Scanner(System.in);
        boolean gameOver = false;
        int player1input;
        int player2input;


        System.out.println("Player 1 name: ");
        name1 = input.nextLine();

        System.out.println("Player 2 name: ");
        name2 = input.nextLine();

        int board[] = new int[9];


        while (gameOver != true) {
            //Player 1 first turn
            System.out.println(name1 + "'s turn! Choose a number from 0 - 8");
            player1input = input.nextInt();

            //Player 1 first turn; invalid location
            while (!(player1input <= 8)) {
                System.out.println("Invalid, Please try again!");
                player1input = input.nextInt();
            }

            //Player 1 first turn; Location taken
            while (board[player1input] != 0) {
                System.out.println("Location Already Taken. Please try again!");
                player1input = input.nextInt();


                board[player1input] = 1;
            }

            //Player 2 first turn
            System.out.println(name2 + "'s turn! Choose a number from 0 - 8");
            player2input = input.nextInt();

            //Player 2 first turn; invalid location
            while (!(player2input <= 8)) {
                System.out.println("Invalid location! try again!");
                player2input = input.nextInt();
            }

            //Player 2 first turn; Common entries
            while (player2input == player1input) {
                System.out.println("Location already taken! please try again!");
                player2input = input.nextInt();
            }

            //Player 2 first turn; Location taken
            while (board[player2input] != 0) {
                System.out.println("Invalid. Please try again!");
                player2input = input.nextInt();
            }

            board[player2input] = 2;

            //Player 1 second turn
            System.out.println(name1 + "'s turn! Choose a number from 0 - 8");
            player1input = input.nextInt();

            //Player 1 second turn; Invalid location
            while (!(player1input <= 8)) {
                System.out.println("Invalid, Please try again!");
                player1input = input.nextInt();
            }

            //Player 1 second turn; Common entries
            while (player1input == player2input) {
                System.out.println("Location already taken! Please try again!");
                player1input = input.nextInt();
            }

            //Player 1 second turn; Location already taken
            while (board[player1input] != 0) {
                System.out.println("Location already taken! Please try again!");
                player1input = input.nextInt();
            }

            board[player1input] = 1;

            //Player 2 second turn
            System.out.println(name2 + "'s turn! Choose a number from 0 - 8");
            player2input = input.nextInt();

            //Player 2 second turn; Invalid Location
            while (!(player2input <= 8)) {
                System.out.println("Invalid location! try again!");
                player2input = input.nextInt();
            }

            //Player 2 second turn; Common entries
            while (player2input == player1input) {
                System.out.println("Location already taken! please try again!");
                player2input = input.nextInt();
            }

            //Player 2 second turn; location taken
            while (board[player2input] != 0) {
                    System.out.println("Location already taken! Please try again!");
                    player2input = input.nextInt();
                }

            board[player2input] = 2;

            //Player 1 third turn

            System.out.println(name1 + "'s turn! Choose a number from 0 - 8");
            player1input = input.nextInt();

            //Player 1 third turn; Invalid location
            while (!(player1input <= 8)) {
                System.out.println("Invalid, Please try again!");
                player1input = input.nextInt();
            }

            //Player 1 third turn; Common entries
            while (player1input == player2input) {
                System.out.println("Location already taken! Please try again!");
                player1input = input.nextInt();

            }

            //Player 1 third turn; Location already taken
            while (board[player1input] != 0) {
                System.out.println("Location already taken! Please try again!");
                player1input = input.nextInt();
            }

            board[player1input] = 1;

            /*Check player 1 for victory
            if(board[player1input] == board[0] && board[player1input] == board[1] && board[player1input] == board[2]){
                gameOver = true;
            }*/

            //Player 2 third turn
            System.out.println(name2 + "'s turn! Choose a number from 0 - 8");
            player2input = input.nextInt();

            //Player 2 third turn; Invalid Location
            while (!(player2input <= 8)) {
                System.out.println("Invalid location! try again!");
                player2input = input.nextInt();
            }

            //Player 2 third turn; Common entries
            while (player2input == player1input) {
                System.out.println("Location already taken! please try again!");
                player2input = input.nextInt();
            }

            //Player 2 third turn; location taken
            while (board[player2input] != 0) {
                System.out.println("Location already taken! Please try again!");
                player2input = input.nextInt();
            }

            board[player2input] = 2;

            //Check Player 2 for victory

            //Player 1 fourth turn; Invalid location
            while (!(player1input <= 8)) {
                System.out.println("Invalid, Please try again!");
                player1input = input.nextInt();
            }

            //Player 1 fourth turn; Common entries
            while (player1input == player2input) {
                System.out.println("Location already taken! Please try again!");
                player1input = input.nextInt();

            }

            //Player 1 fourth turn; Location already taken
            while (board[player1input] != 0) {
                System.out.println("Location already taken! Please try again!");
                player1input = input.nextInt();
            }

            board[player1input] = 1;

            //Player 2 fourth turn; Invalid Location
            while (!(player2input <= 8)) {
                System.out.println("Invalid location! try again!");
                player2input = input.nextInt();
            }

            //Player 2 fourth turn; Common entries
            while (player2input == player1input) {
                System.out.println("Location already taken! please try again!");
                player2input = input.nextInt();
            }

            //Player 2 fourth turn; location taken
            while (board[player2input] != 0) {
                System.out.println("Location already taken! Please try again!");
                player2input = input.nextInt();
            }

            board[player2input] = 2;

            //Player 1 fifth turn; Invalid location
            while (!(player1input <= 8)) {
                System.out.println("Invalid, Please try again!");
                player1input = input.nextInt();
            }

            //Player 1 fifth turn; Common entries
            while (player1input == player2input) {
                System.out.println("Location already taken! Please try again!");
                player1input = input.nextInt();

            }

            //Player 1 fifth turn; Location already taken
            while (board[player1input] != 0) {
                System.out.println("Location already taken! Please try again!");
                player1input = input.nextInt();
            }

            board[player1input] = 1;


            gameOver = true;
            }
            String testString = Arrays.toString(board);
        System.out.println(testString);









            //if(board[player1input]



        }
    }






