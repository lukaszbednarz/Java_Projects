package book.page278;

public class Duck {
	private int size;

	public static void main (String[] args) {
		//System.out.println("Size is " + getSize());  // Won't compile
	}

	public void setSize(int s) {
		size = s;
	}

	public int getSize() {
		return size;
	}
}