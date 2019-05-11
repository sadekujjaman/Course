

public abstract class A {

	private int ai;

	public A(int ai){
		this.ai = ai;
	}
	
	public int am1() {
		return ai;
	}

	public abstract void am2(String s); // Prints reversed string.

}
