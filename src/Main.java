import java.util.*;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer("Asmaa",5405.9);
		Customer anothercustomer;
	anothercustomer=customer;
	anothercustomer.setBalance(11.8);
	System.out.println("Balance for customer "+ customer.getName()+" is "+customer.getBalance());
	ArrayList<Integer> intList=new ArrayList<Integer>();
	intList.add(1);
	intList.add(4);
	intList.add(3);
	for(int x:intList)
		System.out.println(x);
	
	
	intList.add(1, 2);
	
	for(int x:intList)
		System.out.println(x);
	}

}
