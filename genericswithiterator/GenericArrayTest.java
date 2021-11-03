package genericswithiterator;

import java.util.Iterator;

public class GenericArrayTest {

	public static void main(String[] args) {
		GenericArray<Integer> intArray = new GenericArray<Integer>();
		for(int j = 0; j < 20; j++){
			intArray.add(((int)(Math.random()*50)));
		}

		System.out.println("The length of the array is: " + intArray.length());
		
		Iterator<Integer> intIterator = intArray.iterator();
		while(intIterator.hasNext()){
			System.out.println("Content of array: " + intIterator.next()+ " ");
		}
		
		intArray.selectionSort();
		intIterator = intArray.iterator();
		while(intIterator.hasNext()){
			System.out.println("Array after selection sort: " + intIterator.next()+ " ");
		}
		
		// Creating a String type array
		GenericArray<String> st = new GenericArray<>();
		st.add("Adam"); 
		st.add("John");
		st.add("Declan");
		st.add("Owen");
		st.add("Bary");
		
		// iteration through objects
		Iterator<String> stIterator = st.iterator();
		while(stIterator.hasNext()){
			System.out.println("The names before sorting: " + stIterator.next()+ " ");
		}
		
		st.selectionSort();
		
		// iteration through objects
		stIterator = st.iterator();
		while(stIterator.hasNext()){
			System.out.println("The names after sorting: " + stIterator.next()+ " ");
		}	
	}

}
