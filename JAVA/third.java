package pro.java;

class Student {
    String name;
    int age;
    char grade;

    
    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

   
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
    public void displayDetails1() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

}
public class Basic {
    public static void main(String[] args) {
        
        Student student1 = new Student("parveen", 18, 'A');
        Student student2 = new Student("kunal", 18, 'A');

       
        student1.displayDetails();
        student2.displayDetails1();
    }
}