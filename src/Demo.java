import java.util.*;
public class Demo {

	public static void main(String[] args) {
		LinkedList<String> placetovisit=new LinkedList<String>();
	placetovisit.add("Casablanca");
	placetovisit.add("Marakesh");
	placetovisit.add("Tanger");
	placetovisit.add("Fes");
	placetovisit.add("Rabat");
	printList(placetovisit);
	}
	private static void printList(LinkedList<String> linkedlist)
	{
		Iterator<String> i=linkedlist.iterator();
		while(i.hasNext())
		{
		System.out.println("Now visiting "+i.next());	
		}
		System.out.println();
	}
}
