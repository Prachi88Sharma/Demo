class Company{
void cname()
{
System.out.println("Company Name : Wipro");
}
}
class Employee extends Company{
    void name()
    {
        System.out.println("Employee Name :- ABC");
    }
}

public class Single {
    public static void main(String args[]){
        Employee e =new Employee();
        e.cname();
        e.name();
    }
    
}
