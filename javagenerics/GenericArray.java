package javagenerics;

public class GenericArray<T> {
	private T[] data;
	int size = 0;
	
	public GenericArray() {
		data = (T[])(new Object[50]);
	}
	
	public GenericArray(int n) {
		data = (T[])(new Object[n]);
	}
	
	public void add(T element) {
		data[size] = element;
		size++;
	}
	
	public int length() {
		return size;
	}
}
