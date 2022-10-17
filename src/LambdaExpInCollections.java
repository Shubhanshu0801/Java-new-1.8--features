import java.util.*;


public class LambdaExpInCollections {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(10);
		System.out.println(l);
		Comparator<Integer> c = (I1, I2) -> 
		(I1<I2)?-1:(I1>I2)?+1:0;
		Collections.sort(l, c);
		System.out.println(l);

	}

}









