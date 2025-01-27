package Ejercicio2;

public class StudentTest {
	public static void main(String[] args) throws InterruptedException{
		Student student1 = new Student("Elghetto", 10);
		Student student2 = new Student("Sergi", 15);
		Student student3 = new Student("Marquis", 17);
		
		student1.start();
		student2.start();
		student3.start();
		
		Thread.sleep(200);
		System.out.println("All students are doing the exam");
	}
}

class Student extends Thread{
	private String studentName;
	private int examingTime;
	
	public Student (String studentName, int examingTime) {
		super();
		this.studentName = studentName;
		this.examingTime = examingTime;
	}
	
	@Override
	public void run() {
		System.out.println(studentName + " started the exam");
		try {
			Thread.sleep(examingTime * 1000L);
		} catch(InterruptedException e) {
			System.out.println(studentName + " was interrupted while doing the exam");
		}
		System.out.println(studentName + " finished the exam");
	}
}
