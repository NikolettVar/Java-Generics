package genericswithcomparable;
//I just want to add this to github toogit

public class GenericArray<T extends Comparable<T>> {
	private T[] data;
	int size = 0;
	
	
	public GenericArray() {
		data = (T[])(new Comparable[20]);
	}
	
	public GenericArray(int n) {
		data = (T[])(new Comparable[n]);
	}
	
	public void add(T element) {
		data[size] = element;
		size++;
	}
	
	public int length() {
		return size;
	}
	
	public boolean search(T element) {
		int j = 0;
		boolean found = false;
		
		while(j < size && !found) {
			if(data[j].compareTo(element) == 0) {
				found = true;
			}
			else {
				j++;
			}
		}
		
		return found;
	}
	
	public void selectionSort() {
		for(int i = 0; i <size-1; ++i) {
			int minIndex = i;
			for(int j = i+1; j < size; ++j) {
				if(data[j].compareTo(data[minIndex]) < 0) {
					minIndex = j;
				}
			}
			T temp = data[i];
			data[i] = data[minIndex];
			data[minIndex] = temp;
		}
	}
	
	
	    public String toString(){ //not perfect, see Iterator instead for printing!
		 	String str = " ";
		 
	        for(int i = 0; i < data.length; i++){
	            str += "\n" + data[i];	
	           
	        }
	        return str;
	    
	 }
}
	
	
	

