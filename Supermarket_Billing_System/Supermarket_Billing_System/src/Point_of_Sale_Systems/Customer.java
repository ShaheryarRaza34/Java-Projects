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
public class Customer {
    private int customer_password;
    private String customer_name;
    public Customer(int customer_password,String customer_name){
        this.customer_password=customer_password;
        this.customer_name=customer_name;
    }
    public void set_id(int customer_password){
        this.customer_password=customer_password;
    }
    public void set_name(String customer_name){
        this.customer_name=customer_name;
    }
    public int get_id(){
        return customer_password;
    }
    public String get_name(){
        return customer_name;
    }
}
