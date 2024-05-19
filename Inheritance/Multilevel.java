 class Shapes {
    public void display() {
      System.out.println("display");
   }
}
class Rectangle extends Shapes {
   public void area() {
      System.out.println("area");
   }
}
class Cube extends Rectangle {
   public void volume() {
      System.out.println("volume");
   }
}
public class Multilevel {
   public static void main(String[] arg) {
      Cube cube = new Cube();
      cube.display();
      cube.area();
      cube.volume();
   }
    
}
