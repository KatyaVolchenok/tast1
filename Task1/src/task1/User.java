/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.ArrayList;




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
        
        if(name == null || name.trim().isEmpty()) {
            throw new UserException();
        } else {
            this.name = name;
        }
        
        if(isAdmin) {
            this.isAdmin = isAdmin;
        } else {}
        
     
}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        
        int newId = (int) Math.round(Math.random()*1000);
            try {
                return new User(newId, name, isAdmin);
            } catch (UserException ex) {
               if( name == null || name.trim().isEmpty())
               throw new CloneNotSupportedException();
            }    
        return null;
    }

    @Override
    public boolean equals(Object obj) {
           
   if(this == obj) {
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        User user = (User) obj;
        return this.name.equals(user.name) && this.isAdmin == user.isAdmin;
    }
    
    
    @Override
    public int hashCode() {
        int result =0;
        int ad = (this.isAdmin == true) ? 1 : -1;
        result = name.hashCode() + ad;
        return super.hashCode();
    }

}
