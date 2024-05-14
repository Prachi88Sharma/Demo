package ObjectCollab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee();
        Address address=new Address();
        Scanner sc=new Scanner(System.in);
        employee.setName(sc.nextLine());
        address.setStreet("2");
        address.setCity("raipur");
        address.setState("cg");
        address.setPin(122345);
        System.out.println(employee.getName());
        System.out.println(address.toString());

    
}
}
