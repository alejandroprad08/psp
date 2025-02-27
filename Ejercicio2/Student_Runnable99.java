package Ejercicio2;

public class Student_Runnable99 {
    public static void main(String[] args) {
      
        for (int studentNumber = 0; studentNumber < 8; studentNumber++) {
            Student student = new Student("Student Number: " + studentNumber, 5);
            
            Thread thread = new Thread(student);
            thread.start();
        }
        System.out.println("All students started their exam");
    }
}


class Student implements Runnable {
    private String studentName; 
    private int examTime; 
    
    public Student(String studentName, int examTime) {
        this.studentName = studentName;
        this.examTime = examTime;
    }
    
    @Override
    public void run() {
        System.out.println(studentName + " started the exam");
        try {
            Thread.sleep(examTime * 1000L);
        } catch (InterruptedException e) {
            System.out.println(studentName + " was interrupted during the exam");
        }
        System.out.println(studentName + " finished the exam");
    }
}
