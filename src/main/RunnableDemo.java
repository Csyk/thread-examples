package main;

public class RunnableDemo implements Runnable{
	private Thread thread;
	private String threadName;

	public RunnableDemo(String name) {
		this.threadName = name;
		System.out.println("Creating " +  threadName );
	}

	@Override
	public void run(){
		System.out.println("Running " +  threadName );
		for(int i = 0; i < 4; i++){
			System.out.println("Thread: " + threadName + ", " + i);
		}
		System.out.println("Thread " +  threadName + " exiting.");
	}

	public void start(){
		System.out.println("Starting " +  threadName );
		if(thread == null){
			thread = new Thread(this, threadName);
			thread.start();
		}
	}
}
