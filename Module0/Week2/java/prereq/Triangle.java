package prereq;

public class Triangle {
   private double base;
   private double height;
   
   public void setBase(double userBase){
      base = userBase;
   }

   public void setHeight(double userHeight) {
      height = userHeight;
   }
   
   public double getArea() {
      double area = base * height * .5;
      return area;
   }
   
   public void printInfo() {
      System.out.printf("Base: %.2f\n", base);
      System.out.printf("Height: %.2f\n", height);
      System.out.printf("Area: %.2f\n", getArea());
   }
}