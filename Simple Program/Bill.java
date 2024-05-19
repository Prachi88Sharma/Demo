
import java.util.Scanner;
public class Bill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Unit to calculate Electricity Bill :- ");
       double unit = sc.nextDouble();
       double bill;
       if(unit>0 && unit<=100)
       {
           bill=unit*2;
           System.out.println("Your total bill is :- "+ bill);
       }
       if(unit>100 && unit<=200)
       {
           bill=(100*2)+(unit-100)*3;
           System.out.println("Your total bill is :- "+ bill);
       }
       if(unit>200 && unit<=300)
       {
           bill=(100*2)+(100*3)+(unit-200)*4;
           System.out.println("Your total bill is :- "+ bill);
       }
       if(unit>300 && unit<=400)
       {
           bill=(100*2)+(100*3)+(100*4)+(unit-300)*5;
           System.out.println("Your total bill is :- "+ bill);
       }
       if(unit>500)
       {
           bill=unit*6;
           System.out.println("Your total bill is :- "+ bill);
       }
        
    }
    
}
