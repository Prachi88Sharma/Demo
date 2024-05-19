class Mother{  
void put()
{
    System.out.println("Class Mother");}  
}  
class Daughter extends Mother{  
void greet()
{
    System.out.println("class Daughter");
}  
}  
class Son extends Mother{  
void get()
{
    System.out.println("Class Son");}  
}  
public class Hirarchical {
    public static void main(String args[]){  
Son s=new Son();  
s.put();
s.get();  
    
}
}
