// Importing required I/O classes
import java.io.*;

class ThreadNaming extends Thread {

	@Override public void run() {
		// Display message
		System.out.println(
			"Searching for current thread name...");
		System.out.println(
			Thread.currentThread().getName());
	}
}

class Main {
	public static void main(String[] args) {

		ThreadNaming t1 = new ThreadNaming();
		ThreadNaming t2 = new ThreadNaming();
		t1.start();
		t2.start();
	}
}
