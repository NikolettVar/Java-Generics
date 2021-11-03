package javagenerics;

public class GenericArrayTest {

	public static void main(String[] args) {
	
		GenericArray<Integer> intArray = new GenericArray<>();
		for(int j = 0; j < 20; j++) {
			intArray.add(j);
		}
		System.out.println(intArray.length());
		
		GenericArray<String> stArray = new GenericArray<>();
		stArray.add("Monday");
		stArray.add("Tuesday");
		System.out.println(stArray.length());

	}

}
