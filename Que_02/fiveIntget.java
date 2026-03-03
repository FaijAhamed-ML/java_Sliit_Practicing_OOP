package Que_02;
import java.util.Scanner;
public class fiveIntget {
    static void main(String[] args) {
        Scanner get= new Scanner(System.in);

        int[] numbers= new int[5];

        for(int i=0; i<numbers.length; i++){
            System.out.print("Enter Your num "+i+": ");
            numbers[i]=get.nextInt();
        }

        int max_num=numbers[0];
        for(int j=0; j<numbers.length; j++){
            if (max_num<numbers[j]){
                max_num=numbers[j];
            }
        }

        int sum=numbers[0];
        for (int k=1;k<numbers.length;k++){
            sum+=numbers[k];
        }
        System.out.println("\nmaximum number of these number is :"+max_num);
        System.out.println("Sum of all numbers is :"+sum);
    }
}
