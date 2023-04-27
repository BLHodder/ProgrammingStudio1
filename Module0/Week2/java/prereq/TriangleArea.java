package prereq;

import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();
      double base, height;
      

      // TODO: Read and set base and height for triangle1 (use setBase() and setHeight())
      base = scnr.nextDouble();
      height = scnr.nextDouble();
      triangle1.setBase(base);
      triangle1.setHeight(height);
      // TODO: Read and set base and height for triangle2 (use setBase() and setHeight())
      base = scnr.nextDouble();
      height = scnr.nextDouble();
      triangle2.setBase(base);
      triangle2.setHeight(height);
      // TODO: Determine larger triangle (use getArea())
      
      System.out.println("Triangle with larger area:");
      // TODO: Output larger triangle's info (use printInfo())
      if (triangle1.getArea() < triangle2.getArea()) {
         triangle2.printInfo();
      } else {
         triangle1.printInfo();
   }
}
}
