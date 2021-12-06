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
    static ArrayList<Integer> list = new ArrayList<>();
    
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
        if(list.contains(id)){
            throw new UserException();  
        } else {
            this.id = id;
            list.add(id);
        }
        
        if(name == null || name.trim().isEmpty()) {
            throw new UserException();
        } else {
            this.name = name;
        }
            this.isAdmin = isAdmin;
       
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
        int name = this.name.hashCode();
        int isAdmin = ((Boolean)this.isAdmin).hashCode();
        return name + isAdmin;
    }
  
}
