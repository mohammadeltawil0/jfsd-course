public class Student {

	private String name;
	private int age;
	
	private static String schoolName;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setSchoolName(String sname) {
		schoolName = sname;
	}
	
	public void displayDetails() {
		System.out.println("name  : " + name);
		System.out.println("age  : " + age);
		System.out.println("School Name : " + schoolName);
	}
	
	public static void display() {
		//System.out.println("name : " + name);		//error
		System.out.println("School Name : " + schoolName);

	}
}
