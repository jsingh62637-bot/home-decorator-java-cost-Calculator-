# home-decorator-java-cost-Calculator-
Java Program to calculate room painting and flooring costs with waste percentage and tax calculation
Home Renovator is a java program ( console based Application) which is designed to help the users to estimate the cost of the Renovation, Painting, Flooring.
The program performs the accurate calculations, material cost estimation, tax computations and maintains a running subtotalfor multiple renovation task. 
The Program Includes for the following modules
1) Modular Approach
2) Input  Validation
3) Use of constants
4) Cost of Calculation Logice
5) Use of Menu driven
   Features are following
   A) Paint Menu Module
   B) Flooring module
   C) View Totals
   D) Input Validation
   The following formulas used
   a) Paint calculation logic
   b) Flooring calculation logic
   For paint module the following code had been used
   double perimeter = 2 * (length + width);
     double wallArea = perimeter * height;
    double openingsArea = (doors * DOOR_AREA) + (windows * WINDOW_AREA);
    double netArea = wallArea - openingsArea;
       if(netArea < 0) netArea=0;
        double gallons = Math.ceil(netArea / PAINT_COVERAGE;
   double materialCost = gallons * PAINT_PRICE;
        double tax = materialCost * TAX_RATE;
         double lineTotal = materialCost + tax;
   For Flooring the follwing code had been used
   double area = length * width;
          double adjustedArea = area * (1 + waste);
          double materialCost = adjustedArea * price;
          double tax = materialCost * TAX_RATE;
          double lineTotal = materialCost + tax;
            subTotal += materialCost;
   For the viewing totals the following logic had been used

 double tax = subTotal * TAX_RATE ;
double grandTotal = subTotal + tax;
 Example Calculation..
One Room 10x12x8
1 door
2 windows
Program calculates 
Wall Area 
Opeining Area
Net Paint Area 
Gallons Required
Material Cost
Total with Tax
Key concepts Demostrated 
Java Methods, Loops (while, do while), Conditional statements ( switch, if else), Iput validationd, Mathematical calculations, Formatted output, Runnig Totals.
This Projects is demostrating the expenses for painting walls, flooring etc.


   
   
   
   
   
