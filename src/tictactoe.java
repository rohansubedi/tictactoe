import java.util.*;
public class tictactoe {

    public static void main(String[] args) {
        String name1;
        String name2;
        Scanner input = new Scanner(System.in);
        boolean gameOver = false;
        int x;
        int o;
        int[] n = new int[3];


        System.out.println("Player 1 name: ");
        name1 = input.nextLine();

        System.out.println("Player 2 name: ");
        name2 = input.nextLine();

        int board[] = new int[100];


        while (gameOver != true) {
            System.out.println(name1 + "'s turn! Choose a number from 0 - 8");
            x = input.nextInt();

            while (!(x <= 8)) {
                System.out.println("Invalid, Please try again!");
                x = input.nextInt();
                while (board[x] != 0) {
                    System.out.println("Invalid. Please try again!");
                    x = input.nextInt();

                }
                board[x] = 1;
            }


            System.out.println(name2 + "'s turn! Choose a number from 0 - 8");
            o = input.nextInt();
            while (!(o <= 8)) {
                System.out.println("Invalid location! try again!");
                o = input.nextInt();}
                while(o == x ){
                System.out.println("Location already taken! please try again!");
                o = input.nextInt();



                    while (board[o] != 0) {
                        System.out.println("Invalid. Please try again!");
                        o = input.nextInt();
                    }
                }
                board[o] = 2;

            System.out.println(name1 + "'s turn! Choose a number from 0 - 8");
            x = input.nextInt();

            while (!(x <= 8)) {
                System.out.println("Invalid, Please try again!");
                x = input.nextInt();}
                while(x == o){
                    System.out.println("Location already taken! Please try again!");
                    while (board[x] != 0) {
                        System.out.println("Invalid. Please try again!");
                        x = input.nextInt();
                    }
                }
                board[x] = 1;
            }










            //if(board[x]

            //gameOver = true;

        }
    }






