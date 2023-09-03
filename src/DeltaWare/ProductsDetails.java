package DeltaWare;

import java.util.Scanner;

//Here ProductsDetails inherit ProductsList
public class ProductsDetails extends ProductsList 
{ 
	Scanner sc1=new Scanner(System.in);
	//getting error by creating object globally
   //ProductsDetails details1= new ProductsDetails();
	Price pr=new Price();
	
	 public void product1() 
	 {
	   System.out.println("Product Id:1001");
	   System.out.println("Product Description:");
	   System.out.println("Gear Tools Production Specification");
	   System.out.println("Price:Rs.1000");
	   System.out.println("===================");
	   System.out.println("To buy the product please enter product id");
	   System.out.println("===================");
	   int id=sc1.nextInt();
	   if(id==1001) {
		   pr.price();
		   
	   }
	   else {
		   System.out.println("Please enter correct product id");
		   System.out.println("===================");
		   ProductsDetails d1=new ProductsDetails();
//		   details1.product1();
		   d1.product1();
		   
	       }
	   
	 }
	
	
     public void product2() 
     {
       System.out.println("Product Id:2001");
  	   System.out.println("Product Description:");
  	   System.out.println("Switch Gear Panels");
  	   System.out.println("Price:Rs.2000");
  	   System.out.println("===================");
	   System.out.println("To buy the product please enter product id");
	   System.out.println("===================");
  	   int id=sc1.nextInt();
	   if(id==2001) {
		   pr.price();
		   
	   }
	   else {
		   System.out.println("Please enter correct product id");
//		   details1.product2();
		   System.out.println("===================");
		   ProductsDetails d1=new ProductsDetails();
		   d1.product2();
		   
	       }
	   
		
	 }
     
     
     public void product3()
     {
       System.out.println("Product Id:2008");
  	   System.out.println("Product Description:");
  	   System.out.println("Document Solar Objects");
  	   System.out.println("Price:Rs.3000");
  	   System.out.println("===================");
	   System.out.println("To buy the product please enter product id");
	   System.out.println("===================");
  	   int id=sc1.nextInt();
	   if(id==2008) {
		   pr.price();
		   
	   }
	   else {
		   System.out.println("Please enter correct product id");
		   System.out.println("===================");
		   ProductsDetails d1=new ProductsDetails();
//		   details1.product1();
		   d1.product3();
		   
	       }
	   
 	 }
	

}
