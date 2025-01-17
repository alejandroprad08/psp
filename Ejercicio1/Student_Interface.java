package Ejercicio1;

public class Student_Interface implements Runnable{
	private String studentName;
	private int examingTime;
	
	public Student_Interface (String studentName, int examingTime) {
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
