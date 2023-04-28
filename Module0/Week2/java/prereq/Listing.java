package prereq;

public class Listing {
   // These are examples properties
   private String title, description;
   private double price;
   

   // TODO: Add more properties
   // TODO: Add your setter/getter here
   public void setTitle(String title) {
      this.title = title;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getTitle() {
      return title;
   }

   public double getPrice() {
      return price;
   }

   public String getDescription() {
      return description;
   }

   
   
   public void printInfo() {
      // TODO: Complete this to print out the information of the Listing
      System.out.println("Item: " + title);
      System.out.println("Price: " + price);
      System.out.println("Description: " + description);
   }
}