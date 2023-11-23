package OPPS;

import java.util.ArrayList;

public class student_clint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>ll=new ArrayList<>();
		
		ArrayList<Integer>ll1=new ArrayList<>();
		ll.add(10);
		ll1.add(130);
		System.out.println("hey");
		
		Student s1 = new Student();
		s1.name = "kaju";
		s1.age = 19;
		s1.introduce_Yourself();
		Student s2 = new Student();
		s2.name = "kamlesh";
		s2.age = 12;
		s2.introduce_Yourself();
		
		s1.SayHey("Ramu");
		s1.fun(9);

	}

}
