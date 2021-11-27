/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author Shwartskopff
 */
public class Main {
    public static void main(String[] args) throws UserException, CloneNotSupportedException {
        User user1 = new User(24, "Sergey", false);
        User user2 = new User(33,"Alexsander", true);
        User user3 = new User(28,"Vladimir", false);
        User user4 = (User)user1.clone();
        User user5 = (User)user2.clone();
        
        System.out.println("User4 Name =  " + user4.getName());
        System.out.println("User4 Id =  " + user4.getId());
        System.out.println("User5 Name =  " + user5.getName());
        System.out.println("User5 Id =  " + user5.getId());
        
        System.out.println("User1 == User1 :  " + user1.equals(user1));
        System.out.println("User1 == User2 :  " + user1.equals(user2));
        System.out.println("User1 == User3 :  " + user1.equals(user3));
        System.out.println("User1 == User4 :  " + user1.equals(user4));
        System.out.println("User2 == User1 :  " + user2.equals(user1));
        System.out.println("User2 == User3 :  " + user2.equals(user3));
        System.out.println("User2 == User4 :  " + user2.equals(user4));
        
       
        System.out.println("User2 hashCode = " + user2.hashCode());
        
        
    }
}
