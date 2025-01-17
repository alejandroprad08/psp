package Ejercicio1;

public class Student_InterfaceTest {
	public static void main(String[] args) throws InterruptedException{
		Student_Interface studentI1 = new Student_Interface("Elghetto", 10);
		Student_Interface studentI2 = new Student_Interface("Sergi", 15);
		Student_Interface studentI3 = new Student_Interface("Marquis", 17);
		
		Thread thread1 = new Thread(studentI1);
		Thread thread2 = new Thread(studentI2);
		Thread thread3 = new Thread(studentI3);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		Thread.sleep(200);
		System.out.println("All students are doing the exam");		
	}
}
