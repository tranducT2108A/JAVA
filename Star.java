package session5;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        int row;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the maximum number of rows for displaying status");
        row = input.nextInt();

        for (int i = 1; i <= row; i++) {

            for (int space = row; space >=i; space--){
               System.out.println(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.println("*");
            }

            System.out.println();
        }

        }
    }
