package lab2;

public class GameClass extends C implements I, Runnable {

	private int countFiveSix;
	private int currentNumber;
	
	private int diceNumber;
    Thread player;
	public GameClass(String st) {
		player = new Thread( Thread.currentThread().getThreadGroup(), this, st);
		
		currentNumber = 0;
		countFiveSix = 0;
		player.start();
//		ThreadGroup mainThreadGroup = Thread.currentThread().getThreadGroup();
//		System.out.println(mainThreadGroup);
	}

	public void run() {
		
		while(currentNumber < 5){
			rollDice();
			countFiveSix++;
			if(isX(diceNumber)){
				currentNumber++;
			}
			try{
				Thread.sleep(200);
			}
			catch(Exception e){
				
			}
			
		}
		printAnswer();
	}
	
	public void printAnswer(){
		System.out.println(player.toString() + "Got 5 sixes after " + countFiveSix  + " attempts.");
		
	}
	
	public static void main(String args[]) {
		ThreadGroup mainThreadGroup = Thread.currentThread().getThreadGroup();
		System.out.println(mainThreadGroup);
		GameClass objB1 = new GameClass("PlayerOne");
		GameClass objB2 = new GameClass("PlayerTwo");
		
		try{
			objB1.player.join();
			objB2.player.join();
		}catch(Exception e){
			
		}
		
		System.out.println("Main Thread Closing.");

	}

	@Override
	public boolean isX(int n) {
		
		return n == x;
	}

	@Override
	void rollDice() {
		diceNumber = (int)(Math.random() * 6 + 1);
	}
}

// Thread[PlayerOne,5,main]Got 5 sixes after attempts.
// Thread[PlayerTwo,5,main]Got 5 sixes after 10 attempts.
// End of Main Thread.
