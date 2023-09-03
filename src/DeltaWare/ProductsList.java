package DeltaWare;

import java.util.Scanner;

public class ProductsList
{

	//to create object of ProductsList class we used ref variable "pr"
	
		public void productsList() 
		{
			System.out.println("Our products");
			System.out.println("1)Tool Gears");
			System.out.println("2)Panels");
			System.out.println("3)DocTonar");
			System.out.println("===================");
			System.out.println("For more details and buying the product please choose the product");
			System.out.println("===================");
			
			
			Scanner sc2=new Scanner(System.in);
			int pnum=sc2.nextInt();
			
			ProductsDetails detail= new ProductsDetails();
			switch (pnum) 
			{
			case 1:detail.product1();
		           break;
		     
			case 2:detail.product2();
			        break;
			     
			case 3:detail.product3();
			       break;
			  
//			default :System.out.println("Please Choose Valid Option");
//			         ProductsList pr1= new ProductsList();
//			         pr1.productsList();
//				     break;
			
			}			
		}
		
	}


