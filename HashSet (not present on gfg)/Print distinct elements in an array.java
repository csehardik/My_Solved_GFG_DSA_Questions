import java.util.HashSet;
public class Count_Distinct_Elements_Using_hashing {

	public static void main(String[] args) {
		
		int arr[] = {1,2,4,5,4,1,0,6,8,10};
		System.out.println(countDistinct(arr));

	}

	private static int countDistinct(int arr[]) {
		HashSet<Integer> set = new HashSet<>();
		for(int elements:arr) {
			set.add(elements);
		}
		System.out.println(set);
		//return set.size();
	}
	
}
