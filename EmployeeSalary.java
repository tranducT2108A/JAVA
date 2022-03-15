package session4;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        double salary =0.0, bonus = 0.0, taxAmount, netSalary;
        String designation;
        int yearServed;

        Scanner input =  new Scanner (System.in);

        System.out.println("1.Manager \n 2.System Analyst \n 3.Developer \n 4.Accountant");
        System.out.println("Enter the Employee's designation");
        designation = input.nextLine();

        switch (designation){
            case "Manager":
                salary = 21346.876;
                break;
                case "System Analyst":
                salary = 216729.564;
                break;
                case "Developer":
                salary = 14525.345;
                break;
                case "Accountant":
                salary = 13215.123;
                break;
        }
        System.out.println("\t Employee Salary Details");
        System.out.println("-------------------");
        System.out.printf("Employee Designation:", designation);
        System.out.printf("---------------------");

        System.out.println("Enter the number of years served in the company:");
        yearServed = input.nextInt();

        if (yearServed >=5){
            if (salary > 20000){
                bonus = salary * 0.09;
            } else if (salary > 1400&& salary<=20000){
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }
        } else  if (yearServed >= 3 ) {
            if (salary > 20000) {
                bonus = salary * 0.07;
            } else if (salary > 14000 && salary <= 20000){
                bonus = salary * 0.03;
            } else {
                bonus = salary * 0.01;
            }
        }  else {
            bonus = salary * 0.05;
        }

        System.out.printf("Employee's Annual Bonus Amount:", bonus);


    }
}
