// Java program to remove elements
import java.util.*;

public class GFG {

	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<>();

		ll.add("Hack");
		ll.add("Fest");
		ll.add(1, "For");

		System.out.println("Initial LinkedList " + ll);

		// Function call
		ll.remove(1);

		System.out.println("After the Index Removal " + ll);

		ll.remove("Geeks");

		System.out.println("After the Object Removal "
						+ ll);
	}
}
