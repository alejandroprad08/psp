package Ejercicio1;

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
