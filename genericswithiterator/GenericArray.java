package genericswithiterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenericArray<T extends Comparable<T>> {
	private T[] data;
	int size = 0;
	public GenericArray(){
		data = (T[])(new Comparable[50]);
	}
	public GenericArray(int n){
		data = (T[])(new Comparable[n]);
	}
	public void add(T element){
		data[size] = element;
		size++;
	}
	public int length(){
		return size;
	}

	public boolean search(T element){
		int j = 0;
		boolean found = false;
		while(j < size && !found){
			if(data[j].compareTo(element) == 0) 
				found = true;
			else 
				j++;
		}
		return found;
	}
	
	public void selectionSort() {
 		for (int i = 0; i < size - 1; ++i) {
 			int minIndex = i;
 			for (int j = i+1; j < size; ++j) {
 				if (data[j].compareTo(data[minIndex])<0) {
 					minIndex = j;
 				}
			}
			T temp = data[i];
			data[i] = data[minIndex];
			data[minIndex] = temp;
		}	
	} 
	
	public Iterator<T> iterator(){
	    return new ArrayIterator<T>(data, size);
	}

	
	private static class ArrayIterator<T> implements Iterator<T>{
		private T[] data;
		private int index = 0;
		private int size;

		ArrayIterator(T[] d, int s){
			data = d;
			size = s;
		}
		public boolean hasNext(){
			return index < size;
		}

		public T next(){
			if(index == size){
				throw new NoSuchElementException();}
			T item = (T)data[index]; 
			index++;
			return item;
		}
		
		public void remove(){}

	} // class end

}
