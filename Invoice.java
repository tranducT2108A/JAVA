package session3;

import java.util.Scanner;

public class Invoice {
    public static void main(String[] args) {
        int orderedShirts , orderedTrouse, points = 0;
        int priceOfShirt = 300;
        int priceOfTrouse = 700;
        int costOfShirts, costOfTrousers, totalCost;
        double discount, netPay;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of Shirts to order:");
        orderedShirts = input.nextInt();
        System.out.println("Enter the number of Trousers to oder");
        orderedTrouse = input.nextInt();

        costOfShirts = priceOfShirt * orderedShirts;
        costOfTrousers = priceOfTrouse * orderedTrouse;
        totalCost = costOfShirts + costOfTrousers;

        discount = totalCost > 3000? totalCost * 10 / 100 : 0;
        netPay = totalCost - discount;

        points =  (int) (netPay > 3000? netPay / 100 : 0 );

        System.out.println("\nItem \t\t Quantity \t Price \t Total:");
        System.out.println("--------------------------------------");
        System.out.printf("Shirts \t\t %d \t\t %d \t\t %d \n", orderedShirts, priceOfShirt, costOfShirts);
        System.out.printf("Trouser \t %d \t\t %d \t %2f \n", discount);
        System.out.println("-----------------------------" +"-------------");
        System.out.printf("Net Total \t \t\t \t\t %2f \n", netPay);
        System.out.println("-------------"+"----------");
        System.out.printf("Points Earned \n %d \n", points);



    }
}
