package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] arrlst;
	
	public ArrayList() {
		arrlst = (T[]) new Object[0];	
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return arrlst[loc];
	}
	
	public void add(T val) {
		T[] temp = (T[]) new Object[0];	
		
		arrlst[arrlst.length+1] = val;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}