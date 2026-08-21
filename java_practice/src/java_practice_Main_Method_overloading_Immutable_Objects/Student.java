package java_practice_Main_Method_overloading_Immutable_Objects;

public final class Student {
	final int age;
	final String name;
	private final College college;
	
	public Student(int age, String name , College college) {
		this.age = age ;
		this.name = name;
		this.college = new College(college.name, college.address);
	}
	public int getAge() {
		return this.age;
	}
	public College getCollege() {
		return new College(this.college.name, this.college.address);
	}
public String getName() {
	return this.name;
}
	public static void main(String[] args) {
		
		College college = new College("III T T", "Srirangam" );
		
		Student  s1 = new Student(10, "name", college);
		System.out.println(s1.name);
		System.out.println(s1.getAge());
		System.out.println(s1.getName());
		System.out.println(s1. age);
		System.out.println(s1.getCollege().name);
		s1.getCollege().name = "IIIt Allahabad";
		System.out.println(s1.getCollege().name);
		s1.getCollege().name = "IIt Delhi";
		System.out.println(s1.getCollege().name);
	}

}
final class College{
	String name;
	String address;
	 public College(String name, String address) {
		this.name = name;
		this.address = address;
	}
}