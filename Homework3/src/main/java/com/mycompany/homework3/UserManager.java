
package com.mycompany.homework3;


public class UserManager {
    public void add(User user){
        System.out.println(user.getId() + "eklendi");
        
    }
    public void delete(User user) {
        System.out.println(user.getId() + "silindi");
    }
    
    
}
