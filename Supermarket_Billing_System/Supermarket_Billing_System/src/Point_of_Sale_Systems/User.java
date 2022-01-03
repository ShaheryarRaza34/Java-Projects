/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Point_of_Sale_Systems;

/**
 *
 * @author Admin
 */
public class User {
    private int user_password;
    private String user_name;
    public User(int user_password,String user_name){
        this.user_password=user_password;
        this.user_name=user_name;
    }
    public void set_password(int user_password){
        this.user_password=user_password;
    }
    public void set_name(String user_name){
        this.user_name=user_name;
    }
    public int get_password(){
        return user_password;
    }
    public String get_name(){
        return user_name;
    }
}
