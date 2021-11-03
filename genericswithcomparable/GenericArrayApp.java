package genericswithcomparable;


public class GenericArrayApp {

	public static void main(String[] args) {
		GenericArray<Integer> intArray = new GenericArray<>();
		for(int j = 0; j < 20; j++) {
			intArray.add(j);
		}
		System.out.println(intArray.length());
		
		System.out.println(intArray.search(23));
		
		intArray.selectionSort();
		for(int i = 0; i <intArray.size; i++) {
			System.out.println(intArray.toString());
		}
	}

}
