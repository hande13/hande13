
package com.mycompany.homework3;


public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(1);
        student1.setFirstName("Hande");
        student1.setLastName("İğci");
        student1.setEmail("asdf@gmail.com");
        student1.setCamp("Java");
        
        Instructor instructor= new Instructor() ;
        instructor.setId(1);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");
        instructor.setPassword("asdfgh");
        instructor.setEmail("engindemirog@gmail.com");
        instructor.setGivencamp("Java");
        
        StudentManager studentManager= new StudentManager();
        studentManager.add(student1);
        
        InstructorManager  instructorManager = new InstructorManager();
        instructorManager.add(instructor);
        
        
        
    }
            
}
