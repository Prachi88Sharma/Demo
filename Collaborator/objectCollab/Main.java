
package objectCollab;
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        Student student=new Student();
        School school=new School();
        Subject subject=new Subject();
        Scanner sc=new Scanner(System.in);
        student.setName(sc.nextLine());
        school.setSchoolName("\nGDVK\n");
        school.setStreet("\nStreet no-2\n");
        school.setCity("\nraipur\n");
        school.setState("\ncg\n");
        school.setPin(122345);
        System.out.println(student.getName());
        System.out.println(school.toString());


    }

}
