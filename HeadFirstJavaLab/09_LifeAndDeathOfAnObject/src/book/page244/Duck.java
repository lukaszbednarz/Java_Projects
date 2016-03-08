package book.page244;

public class Duck {

	int size;

	public Duck(int duckSize) {
		System.out.println("Quack");
		size = duckSize;
		System.out.println("size is " + size);
	}

	public void setSize(int newSize) {
		size = newSize;
	}
}
