import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();
      double b1;
      double h1;
      double b2;
      double h2;

      b1 = scnr.nextDouble();
      h1 = scnr.nextDouble();
      b2 = scnr.nextDouble();
      h2 = scnr.nextDouble();

      triangle1.setBase(b1);
      triangle1.setHeight(h1);
      triangle2.setBase(b2);
      triangle2.setHeight(h2);


      // TODO: Read and set base and height for triangle1 (use setBase() and setHeight())
      
      // TODO: Read and set base and height for triangle2 (use setBase() and setHeight())
   
      // TODO: Determine larger triangle (use getArea())
     
      
      
      System.out.println("Triangle with larger area:");
      // TODO: Output larger triangle's info (use printInfo())
      if (triangle1.getArea() > triangle2.getArea()){
         triangle1.printInfo();
      } 
      else {
         triangle2.printInfo();
      }
   }
}
