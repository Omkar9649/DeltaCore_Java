package DeltaWare;

import java.util.Scanner;
import DeltaWare.ProductsList;


public class Driver {
	public static void main(String[] args) 
	{
		
		System.out.println("********Welcome to DELTACORE********");
		System.out.println("We Offer the best quality products with low low price possible");
		System.out.println("===================");
		System.out.println("Please press 1 for information about our products list");
		System.out.println("===================");
		 
		Scanner sc=new Scanner(System.in);		
		ProductsList pr=new ProductsList();
		
		
		int num= sc.nextInt();
		if(num==1)
		{
			pr.productsList();
		}
		else {
			//here we call main method
			Driver.main(args);
		}
		
      	
		
	}

}
