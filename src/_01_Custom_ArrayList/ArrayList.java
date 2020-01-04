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
		T[] temp = (T[]) new Object[arrlst.length+1];
		
		for (int i = 0; i < arrlst.length; i++) {
			temp[i] = arrlst[i];
		}
		
		temp[temp.length-1] = val;
		
		arrlst = temp;
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		T[] temp = (T[]) new Object[arrlst.length+1];
		
		for (int i = 0; i < arrlst.length; i++) {
			temp[i] = arrlst[i];
		}
		
		temp[loc] = val;
		
		arrlst = temp;
		
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] temp = (T[]) new Object[arrlst.length+1];
		
		for (int i = 0; i < arrlst.length; i++) {
			if (i == loc) {
				temp[i] = val;
				for (int j = i+1; j < arrlst.length+1; j++) {
					temp[j] = arrlst[j-1];
				}
				break;
			} else {
				temp[i] = arrlst[i];
			}
		}
			
		arrlst = temp;
		
	}
		
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] temp = (T[]) new Object[arrlst.length-1];
				
		for (int i = 0; i < arrlst.length; i++) {
			if (i<loc) {
				temp[i] = arrlst[i];
			} else if (i>loc) {
				temp[i-1] = arrlst[i];
			}
		}
					
		arrlst = temp;
		
	}
	
	public int size() {
		return arrlst.length;
		
	}
	
	public boolean contains(T val) {
		boolean result = false;
		
		for (int i = 0; i < arrlst.length; i++) {
			if (arrlst[i] == val) {
				result = true;
			}
		}
		
		return result;
	}

}