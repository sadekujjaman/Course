package lab3;

import java.util.ArrayList;
import java.util.List;

public class NumberClass {
	static int methodUsedSoFar;
	static int objectCount;

	public void incrementMethodUsedSoFar() {
		methodUsedSoFar++;
	}

	public void abs(byte num) {

		incrementMethodUsedSoFar();
		float prev = num;
		if(num < 0)
			num = (byte) (num * (-1));
		System.out.println("abs(" + prev + ")=" + num);
	}

	public void abs(short num) {
		incrementMethodUsedSoFar();
		short prev = num;
		if(num < 0)
			num = (short) (num * (-1));
		System.out.println("abs(" + prev + ")=" + num);
	}

	public void abs(int num) {
		incrementMethodUsedSoFar();
		int prev = num;
		if(num < 0)
			num = (num * (-1));
		System.out.println("abs(" + prev + ")=" + num);
	}

	public void abs(long num) {
		incrementMethodUsedSoFar();
		long prev = num;
		if(num < 0)
			num = (num * (-1));
		System.out.println("abs(" + prev + ")=" + num);
	}

	public void abs(float num) {
		incrementMethodUsedSoFar();
		float prev = num;
		if(num < 0)
			num = (num * (-1));
		System.out.println("abs(" + prev + ")=" + num);
	}

	public void abs(double num) {
		incrementMethodUsedSoFar();
		double prev = num;
		if(num < 0)
			num = (num * (-1));
		
		System.out.println("abs(" + prev + ")=" + num);
	}

	public void abs(String num) {
		incrementMethodUsedSoFar();
		String prev = num;
		char c = num.charAt(0);
		if(c == '-'){
			num = num.substring(1);
		}
		System.out.println("abs(" + prev + ")=" + num);
	}
	
	

	public void printSome(int... arr) {
		incrementMethodUsedSoFar();
		int count = 0;
		
		int len = arr.length;
		List<Integer> list = new ArrayList<>();
		if(len >= 3){
			int first = arr[0];
			int second = arr[1];
			
			for(int i = 2; i < len; i++){
				if(arr[i] == first + second){
					list.add(arr[i]);
					count++;
				}
				first = arr[i - 1];
				second = arr[i];
			}
		}
		
	  System.out.print(count + " Numbers that are the sum of their preceding two numbers");
		if(list.size() > 0){
			System.out.print(": ");
		}
	  for(Integer e : list){
		  System.out.print(e + " ");
	  }
		System.out.println();
		
		
		
	}

}
