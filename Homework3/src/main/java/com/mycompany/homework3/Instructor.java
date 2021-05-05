
package com.mycompany.homework3;

public class Instructor extends User {
    
    private String givencamp;

    public Instructor() {
    }
    
    

    public Instructor(String givencamp, int id, String firstName, String lastName, String password, String email) {
        super(id, firstName, lastName, password, email);
        this.givencamp = givencamp;
    }

    public String getGivencamp() {
        return givencamp;
    }

    public void setGivencamp(String givencamp) {
        this.givencamp = givencamp;
    }
    
    
    
}
