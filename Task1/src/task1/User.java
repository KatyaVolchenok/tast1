/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shwartskopff
 */
public class User {
    private int id;
    private String name;
    private boolean isAdmin;
    static ArrayList<Integer> baseId = new ArrayList<>();
    
    public User() {
        
    }

    public int getId() {
        return id;
    }

    
    public String getName() {
        return name;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public User(int id, String name, boolean isAdmin) throws UserException {
        if(baseId.contains(id)){
            throw new UserException();  
        } else {
            this.id = id;
            baseId.add(id);
        }
        
        if(name == null || name.equals(" ")) {
            throw new UserException();
        } else {
            this.name = name;
        }
        
        if(isAdmin == true) {
            this.isAdmin = isAdmin;
        } else {}
        
     
}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        int newId = id;
        newId = (int) Math.round(Math.random()*1000);
            try {
                return new User(newId, name, isAdmin);
            } catch (UserException ex) {
               if( name == null || name.equals(" "))
               throw new CloneNotSupportedException();
            }    
        return null;
    }

    @Override
    public boolean equals(Object o) {
           
   if (this == o) return true;
   if(o instanceof User) return false;

   User user = (User) o;
   if (!(isAdmin != user.isAdmin)) return false;
   if (!(name.equals(user.name))) return false;
   
   return true;
    }
    
    
    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        int ad = isAdmin ? 1:0;
        result = result + ad;
   
       return result;
    }

   

    

   
    
    
    
    
    
}
