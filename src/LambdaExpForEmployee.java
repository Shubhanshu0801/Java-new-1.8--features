import java.util.*;

class Employee {
	
	int empNo;
	String name;
	
	Employee(int empNo, String name) {
		this.empNo = empNo;
		this.name = name;
	}
	
	public String toString() {
		return empNo + ":" + name;
	}
	
}
public class LambdaExpForEmployee {

	public static void main(String[] args) {
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(104, "Rishi"));
		l.add(new Employee(105, "Ashutosh"));
		l.add(new Employee(101, "Shubhanshu"));
		l.add(new Employee(103, "Himanshu"));
		l.add(new Employee(102, "Ishnai"));
		System.out.println(l);
		
		// Sorting based on employee number
		Comparator<Employee> c = (e1, e2) -> (e1.empNo<e2.empNo)?-1:(e1.empNo>e2.empNo)?1:0;
		Collections.sort(l, c);
		System.out.println(l);
		
		// Sorting based on name
		// s1.compareTo(s2); ---> for alphabetical order
		// compareTo ---> if applied for numbers, then ascending order
		// default natural sorting order is internally implemented by using compareTo method of Comparable in collections
		Collections.sort(l, (e1, e2) -> e1.name.compareTo(e2.name));
		System.out.println(l);
		
	}

}
