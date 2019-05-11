package lab3;

public class MathClass extends NumberClass {

	public MathClass() {
		objectCount++;
	}

	public int getObjectCount() {
		methodUsedSoFar++;
		return objectCount;

	}

	public static void main(String args[]) {

		MathClass mOb = new MathClass();
		mOb.abs("-6475888888999123");
		MathClass mOb2 = new MathClass();
		mOb2.abs(-123.99f);
		mOb.abs(12);
		mOb2.printSome(7, 13, 20, 8, 4, 12, 16); // use variable length argument
		System.out.println(mOb.getObjectCount() + " Objects of MathClass has been created.");
		System.out.println(" Methods of MathClass has been called " + mOb.methodUsedSoFar + " times.");
	}

	// abs(-6475888888999123)=6475888888999123
	// abs(-123.99)=123.99
	// abs(12)=12
	// 3 Numbers that are the sum of their preceding two numbers : 20 12 16
	// 2 Objects of MathClass has been created.
	// Methods of MathClass has been called 5 times.
}
