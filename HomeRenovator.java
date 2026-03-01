import java.util.Scanner;
public class HomeRenovator{
  private static final double DOOR_AREA = 21.0;
  private static final double WINDOW_AREA =12.0;
  private static final double PAINT_COVERAGE=350.0;

  private static final double PAINT_PRICE = 34.99;
  private static final double TAX_RATE = 0.06;
  private static final double LAMINATE_PRICE = 2.25;
  private static final double HARDWOOD_PRICE = 5.50;
  private static final double TILE_PRICE = 3.90;

  private static final double LAMNINATE_WASTE = 0.07;
  private static final double HARDWOOD_PRICE = 0.10;
  private static final double TILE_WASTE = 0.08;
  private static double subTotal = 0.0;

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int choice;
        do {
          printMenu();
          choice = getIntInput(sc,"choice:");
          switch(choice){
            case 1:   
            paintRoom(sc);
              break;
            case 2:
            flooring(sc);
            break;
            case 3:
            viewTotals();
              break;
            case 0:
      System.out.println("\n Exiting Home Rennovator...");
      System.out.println("\n Thanks you for using the program!");
              break;
            default:
    System.out.println("\n Invalid menu option. Try again.");
          }
      if(choice !=0){
        System.out.println("\n (Press Enter to Continue....)");
        sc.nextLine(); }
      } while(choice !=0);
       sc.close();
  }

  private static void printMenu(){
    System.out.println("\n=== Home Rennovator ===");
    System.out.println("1) Paint Room");
    System.out.println("2) Flooring");
    System.out.println("3) View Totals");
    System.out.println("0) Exit");
  }
  private static void paintRoom(Scanner sc){
    System.out.println("\n-- Paint Room --");
    double length = getPositiveDouble(sc,"Enter room length (ft): ");
    double width = getPositiveDouble(sc,"Enter room width (ft): ");
    double height = getPositiveDouble(sc,"Enter room height (ft): ");
    double length = getPositiveDouble(sc,"Enter room length (ft): ");
    int doors = getNonNegativeInt(sc,"Enter number of doors: ");
    int windows = getNonNegativeInt(sc,"Enter number of windows: ");

    double perimeter = 2* (length + width);
    double wallArea = perimeter * height;
    double openingArea = (doors * DOOR_AREA) + (windows * WINDOW_AREA);
    double netArea = wallArea - openingArea;

     if(netArea < 0) netArea = 0;
    double gallons = Math.ceil(netArea / PAINT_COVERAGE);
    double materialCost = gallons * PAINT_PRICE;
    double tax = materialCost * TAX_RATE;
    double lineTotal = materilaCost + tax;
    subTotal += materialCost;
System.out.printf("\nWall area: %.2f sq ft\n",wallArea);
System.out.printf("Opening area: %.2f sq ft\n",openingArea);
System.out.printf("Net paint area: %.2f sq ft\n",netArea);
System.out.printf("Gallons required: %.2f \n",gallons);
System.out.printf("Material cost(@ $%.2f/gal): $%.2f\n",PAINT_PRICE,materialCost);
System.out.printf("Line total(with tax): $%.2f\n",lineTotal);
System.out.printf("\n[Paint module complete Added $%,2f to running total.]\n",lineTotal);
  }


    
    
    
    
    
    
    

          
          
              
              
              
  

