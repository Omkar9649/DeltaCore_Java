package DeltaWare;

import java.util.Scanner;

interface Price1{
	public void price();
}

public class Price {
	
	 Scanner sc=new Scanner(System.in);
	 ProductsList prlist=new ProductsList();
	 
	/* If object is created gobally then got Stackoverflow error 
	 Price pr=new Price();
	 hence created locally 
	 */
	
 
	//here we override price method from interface Price1(Run time Polymorphism
	public void price() {
		
		 Price pr=new Price();
		System.out.println("Please enter your details before payment");
		System.out.println("===================");
		Customer cu=new Customer();
		cu.cusDetails();
		System.out.println("===================");
		System.out.println("Please the Payment option:");
		System.out.println("1)UPI");
		System.out.println("2)CASH ON DELIVERY");
		System.out.println("===================");
	   
	    int opt=sc.nextInt();
	  
	    if(opt==1 || opt==2) {
	    	pr.navigation();
	    	
	    }
	    else {
	       System.out.println("Invalid Payment Selection");
	       System.out.println("Please select proper payment method");
	       System.out.println("===================");
	       pr.price();
			
		}
	    
	  
		
		
		
	}
	
	public void navigation() 
	{
		 Price pr=new Price();
		 Owner ow=new Owner();
		System.out.println("You will get the product on your address");
	      System.out.println("Thank You");
	      System.out.println("===================");
	      ow.setName("omkar");
	      ow.setNum(7021295588l);
	      System.out.println("Owner details:");
	      System.out.println("Name:"+ow.getName());
	      System.out.println("Contact"+ow.getNum());
	      System.out.println("===================");
	      System.out.println("If you want to buy more products press 1 or press 2 for exit");
	      System.out.println("===================");
	      int cho=sc.nextInt();
	      if(cho==1) {
	    	  prlist.productsList();
	      }
	      else if(cho==2) {
	    	  Driver.main(null);
	      }
	      else {
			System.out.println("Please choose correct option ");
			System.out.println("===================");
			pr.navigation();
		}
	      
	      
		
	}
	
	
}
