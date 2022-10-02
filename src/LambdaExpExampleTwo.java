
//public class LambdaExpExampleTwo {
//	public static void main(String[] args) {
//		Sample s = new Sample();
//		s.add(10, 20);
//	}
//}
//class Sample implements Inter {
//	@Override
//	public void add(int a, int b) {
//		System.out.println("The sum is: " + (a+b));	
//	}	
//}
interface Inter {
	public void add(int a, int b);
}



//Converting above program into Lambda Exp.
public class LambdaExpExampleTwo {
	public static void main(String[] args) {
		Inter i = (a, b) -> System.out.println("The sum is: " + (a+b));
		i.add(10, 20);
	}
}
