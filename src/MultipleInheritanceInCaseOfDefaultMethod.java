interface Left {
	default void m1() {
		System.out.println("Left m1 method");
	}
}

interface Right {
	default void m1() {
		System.out.println("Right m1 method");
	}
}

public class MultipleInheritanceInCaseOfDefaultMethod implements Left, Right{

	public static void main(String[] args) {
		
		MultipleInheritanceInCaseOfDefaultMethod d = new MultipleInheritanceInCaseOfDefaultMethod();
		d.m1();

	}

	public void m1() {
		Right.super.m1();
		Left.super.m1();
	}

}
