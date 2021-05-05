
package com.mycompany.homework3;


public class Student extends User {
    
    private String camp;

    public Student() {
    }
    
    
    
   
    
    public Student(String camp, int id, String firstName, String lastName, String password, String email) {
        super(id, firstName, lastName, password, email);
        this.camp = camp;
    }

    public String getCamp() {
        return camp;
    }

    public void setCamp(String camp) {
        this.camp = camp;
    }
    
    
}
