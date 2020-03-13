
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dalto
 */
public class PaintJobEstimator {
   public static void main(String[] args)
{int i, numrun, sqft=0,gallons;
double cpg,costlabor,costpaint,totalcost,labor;
Scanner in=new Scanner(System.in);
System.out.print("How many rooms you have? ");
numrun=in.nextInt();
for(i=0;i<numrun;i++)
   {System.out.print("what is the square footage of room "+(i+1)+"? ");
   sqft+=in.nextInt();
   }
   System.out.print("What is the cost per gallon of paint? ");
   cpg=in.nextDouble();
   gallons=numGallons(sqft);
   costpaint=Paint(cpg,gallons);
    labor=LaborHours(sqft);
   costlabor=LaborCost(labor);     
   totalcost=Total(costpaint,costlabor);
   Output(totalcost,sqft,costpaint,costlabor,labor,gallons);
  
}
public static double LaborHours(int sqft)
   {return sqft/115.;
   }
public static int numGallons(int sqft)
   {return (int)Math.ceil(sqft/115.); //round up assuming can't buy part of a gallon of paint
   }
public static double Paint(double cpg, int gal)
   {return cpg*gal;         
   }
public static double LaborCost(double labor)
   {return labor*(18.00*8);              //assuming you can spend part of an hour painting
   }
public static double Total(double paint,double labor)
   {return paint+labor;
   }
public static void Output(double total, int sqft, double paint, double labor,double hours,int gallons)
   {DecimalFormat dec2 = new DecimalFormat("#0.00");
    System.out.println("It will cost $"+Double.parseDouble(dec2.format(total))+" to paint "+sqft+" sq ft");
    System.out.println("cost breakdown");
    System.out.println("Paint costs $"+Double.parseDouble(dec2.format(paint))+" Labor cost $"+Double.parseDouble(dec2.format(labor)));
    System.out.println("Labor Hours "+Double.parseDouble(dec2.format(hours))+" Paint used "+Double.parseDouble(dec2.format(gallons))+" gallon");
    }
} 
