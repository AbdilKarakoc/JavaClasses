package ReviewCollection;

public class CollectionDemo {

	public static void main(String[] args) {
		Student[] studentArray=new Student[3];
		Student student1=new Student(1234,18,"John Smith");
		studentArray[0]=student1;
		studentArray[1]=new Student(2345,19,"James White");
		studentArray[2]=new Student(3456,18,"Mary Lamb");
		studentArray[3]=new Student(4567,19,"Sasha Kallashnikov");
		
		Student[] studentArrayNew=new Student [6];
		
		
		
	}

}

class Student{
	int studentNumber;
	int age;
	String name;
	public Student(int studentNumber, int age,String name){
		this.studentNumber=studentNumber;
		this.age=age;
		this.name=name;
	}
}

