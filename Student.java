package OPPS;

public class Student {
	String name;
	int age;

	public void introduce_Yourself() {
		// non static
		// class ka data member

		System.out.println(" My name is " + name + " and age is " + age);

	}

	public void SayHey(String name) {
		System.out.println(this.name + " Say Hey " + name);

	}

	public static void fun(int x) {
		System.out.println(" i am in fun " + x);
	}
}
