package prereq;

import java.util.Scanner;

public class GoodsWebsite {

   public static void main(String[] args) {
      
      Listing item1 = new Listing();
      Listing item2 = new Listing();
      Listing item3 = new Listing();

      Scanner userIn = new Scanner(System.in);
      String title, description;
      double price; 

      // TODO: Create three listings, setting the properties

      title = userIn.next();
      price = userIn.nextDouble();
      description = userIn.next();

      item1.setTitle(title);
      item1.setPrice(price);
      item1.setDescription(description);

      title = userIn.next();
      price = userIn.nextDouble();
      description = userIn.next();

      item2.setTitle(title);
      item2.setPrice(price);
      item2.setDescription(description);

      title = userIn.next();
      price = userIn.nextDouble();
      description = userIn.next();

      item3.setTitle(title);
      item3.setPrice(price);
      item3.setDescription(description);
      
      
      // TODO: Output all of the item
      item1.printInfo();
      item2.printInfo();
      item3.printInfo();
   }
}