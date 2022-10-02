
//public class LambdaExpExample {
//	public static void main(String[] args) {
//		Interf i = new Demo();
//		i.m1();
//	}
//}
//
//class Demo implements Interf {
//	@Override
//	public void m1() {
//		System.out.println("Hello");
//	}
//}

// Converting above program into Lambda Exp.
interface Interf {
	public void m1();
}

public class LambdaExpExample {
	public static void main(String[] args) {
		Interf i = () -> System.out.println("Hello");
		i.m1();
	}
}