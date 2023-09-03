package DeltaWare;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer 
{
    	static List list=new ArrayList();
	
	Scanner sc2=new Scanner(System.in);
	
	public void name()
	{
		System.out.println("Please enter your name:");
		String name =sc2.nextLine();
		list.add(0, name);	
	}
	
	
	public void address()
	{
		System.out.println("Please enter your address:");
		String address =sc2.nextLine();
		list.add(1, address);		
	}
	
	public void cusDetails()
	{
		Customer cus=new Customer();
		cus.name();
		cus.address();
		System.out.println("===================");
		System.out.println("Please check your details");
		String name=(String) list.get(0);
		String add=(String) list.get(1);
    	System.out.println("Name:"+name);
		System.out.println("Address:"+add);
		
	}

}
