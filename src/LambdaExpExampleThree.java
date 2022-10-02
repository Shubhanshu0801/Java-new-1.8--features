
//public class LambdaExpExampleThree {
//	public static void main(String[] args) {
//		Samp s = new Samp();
//		System.out.println(s.square(4));
//	}
//}
//class Samp implements Interfa {
//	@Override
//	public int square(int n) {
//		return n*n;	
//	}
//}
interface Interfa {
	public int square(int n);
}



//Converting above program into Lambda Exp.
public class LambdaExpExampleThree {
	public static void main(String[] args) {
		Interfa i = n -> n*n;
		System.out.println(i.square(4));
		System.out.println(i.square(5));
	}
}