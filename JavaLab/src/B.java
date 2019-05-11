

public class B extends A {

	private int bi;

	public B(int ai, int bi) {
		super(ai);
		this.bi = bi;
	}

	public void bm() {
		System.out.println("ai : " + am1() + "\nbi : " + bi);
	}

	@Override
	public void am2(String s) {
		System.out.print(new StringBuilder().append(s).reverse().toString() + " ");
	}

	public static void main(String args[]) {
		B b = new B(10, 20);
		b.bm();
		A a = b;
		a.am2("APPLE");
	}

}
// ai : 10
// bi : 20
// ELPPA
