package supermarket;
import java.util.Scanner;
public class Billingsystem {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//Ask User the number of items.
		System.out.println("Enter the number of items: ");
		int numItems= sc.nextInt();
		//Array to store the items
		String [] itemNames= new String[numItems];
		double [] price= new double[numItems];
		int [] Quantities= new int[numItems];
		double [] subtotals=new double[numItems];
		double Totalbill=0;
		//input for each item
		for(int i=0; i<numItems;i++){
			System.out.println("\nItem "+ (i+1)+":");
			System.out.println("Enter the item name: ");
			itemNames[i]=sc.next();
			System.out.println("Enter the Price per unit: ");
			price[i]=sc.nextDouble();
			System.out.println("Enter the Quantity to purchase: ");
			Quantities[i]=sc.nextInt();
			
			subtotals[i]=price[i]*Quantities[i];
			Totalbill +=subtotals[i];
		}
		// Apply discount if it is possible
		double discount = 0;
		if (Totalbill>50000) {
			discount=Totalbill*0.05;
		}
		double finalAmount=Totalbill-discount;
		
	// print receipt
		System.out.println("\n====SUPERMARKET RECEIPT====");
		System.out.println("Item\tQty\tPrice\tsubtotal");
		System.out.println("----------------------------");
		for(int i=0;i<numItems;i++) {
			System.out.println(itemNames[i]+ "\t" +Quantities[i]+"\t"+price[i]+"\t"+subtotals[i]);
		}
		System.out.println("---------------------------");
		System.out.println("Grand Total(Before Discount): "+Totalbill);
		System.out.println(" Discount: "+discount);
		System.out.println("Final Amount Payable: "+finalAmount);
		System.out.println("====================================");
		sc.close();
		
	}

}
