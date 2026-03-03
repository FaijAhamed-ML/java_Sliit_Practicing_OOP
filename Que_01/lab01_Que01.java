package Que_01;
import java.util.Scanner;

public class lab01_Que01 {
    static void main(String[] args) {

        Scanner get = new Scanner(System.in);
        System.out.println("Enter your Employement type(1,2 or3): ");
        int EmpType = get.nextInt();
        System.out.println("Enter your basic salary: ");
        float BasicSalary = get.nextFloat();
        System.out.println("Enter your Over time hours: ");
        double OtHours = get.nextDouble();

        calcOtRate Rate1 = new calcOtRate(EmpType);
        Rate1.calcOtRate();

        SalaryCalc Salary1 = new SalaryCalc(OtHours,BasicSalary,EmpType,Rate1.Ot_Rate);
        Salary1.salarycalculation();
        System.out.println("Employee Total Slary is :"+Salary1.TotalSalary);


    }
}
