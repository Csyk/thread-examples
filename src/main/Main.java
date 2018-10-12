package main;

public class Main {

	public static void main(String[] args) {
		RunnableDemo r1 = new RunnableDemo("first");
		r1.start();

		RunnableDemo r2 = new RunnableDemo("second");
		r2.start();
	}
}
