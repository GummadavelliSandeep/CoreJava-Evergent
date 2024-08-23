package com.evergent.corejava.oops;

public class MethodFlow {
//	No Parameters with no return type
	public void Show() {
		System.out.println("No parameter wit no return type");
	}

//	Parameters  with no return type
	public void MyData(int a, int b) {
		System.out.println(a + b);
	}

//	Parameters with return type
	public int MyData1(int a, int b) {
		return a + b;
	}

//	No parameters with return type
	public int MyData2() {
		return 100;
	}

	public static void main(String[] args) {
		MethodFlow mf = new MethodFlow();
		mf.Show();
		mf.MyData(10, 20);
		int value = mf.MyData1(2, 4);
		System.out.println(value);
		int value2 = mf.MyData2();
		System.out.println(value2);

	}

}
