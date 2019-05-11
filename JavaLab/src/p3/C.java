package p3;

import p1.S;
import p2.B;

public class C extends B implements I {

	public C(int ai, int bi) {
		super(ai, bi);

	}

	@Override
	public void im(int n) {

		long ans = 1;
		while(n > 0){
			ans *= n;
			n--;
		}
		System.out.println(ans);
	}

	public static void main(String args[]) {

		C c = new C(40, 25);
		c.bm();
		c.am2("Factorial");
		c.im(c.fi);
		S.changeMainThread(2, 8);
	}

}
// ai : 40
// bi : 25
// lairotcaF 120
// Current Thread: Thread[main,5,main]
// Current Thread: Thread[ExamThread,9,main]
// Threading is trying sleeping for 3s... Sleeping complete!
