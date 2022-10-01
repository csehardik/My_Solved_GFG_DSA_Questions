import java.util.HashSet;
import java.util.Iterator;
public class Iterating_a_set_using_iterator {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(5);
		set.add(7);
		set.add(8);
		set.add(6);
		
		set.remove(2);
		
		Iterator it = set.iterator(); // iterators are used to traverse through the HashSet
		
		// the below while loop tells that until the set has value present in it return/print the values present in the set.
		
		while(it.hasNext()) { //hasNext gives true or false until the set contains any value
			System.out.println(it.next());//.next gives the values the set contains
		}

	}

}
