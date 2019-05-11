package p1;

public class S {

	public static void main(String[] args) {
		S.changeMainThread(3, 9); 
	}

	public static void changeMainThread(int sec, int priority) {
	
		Thread mainThread = Thread.currentThread();
		System.out.println("Current Thread: "+ mainThread.toString());
		// for question 3, it's not depends on parameter priority
		// if it depends on, then change the parameter 9 to priority
		mainThread.setPriority(9); 
		
		mainThread.setName("ExamThread");
		System.out.println("Current Thread: " + mainThread.toString());
		
		try {
			System.out.println("Thread is trying sleeping for 3s...");
			// for question 3, it's not depends on parameter sec
			// if it depends on, then change the parameter 3000 to (sec * 1000)
			mainThread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Sleeping complete!");

		
	} 

//			Current Thread: Thread[main,5,main] 
//			Current Thread: Thread[ExamThread,9,main] 
//			Threading is trying sleeping for 3s... 
//			Sleeping complete!

}
