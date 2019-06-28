/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author acer
 */
class User {
    private int pno;
    private String name;
    private String address;
    private String gender;
    
    public User(int pno, String name, String address, String gender) {
        this.pno = pno;
        this.name = name;
        this.address = address;
        this.gender = gender;
    }
    
    public int getPno() {
        return pno;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getGender() {
        return gender;
    }
}
