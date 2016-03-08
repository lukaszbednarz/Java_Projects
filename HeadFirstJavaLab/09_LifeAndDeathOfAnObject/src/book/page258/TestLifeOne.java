package book.page258;

public class TestLifeOne {
	public void read() {
		int s = 42;
		sleep();
	}

	public void sleep() {
		//s = 7; BAD!! Not legal to use ‘s’ here!
	}
}
