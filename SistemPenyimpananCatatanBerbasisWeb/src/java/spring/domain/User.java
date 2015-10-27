/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.domain;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 *
 * @author LabGSG-15
 */

@Table(name = "user")
public class User {
    
   @Column(name = "user_id")
   private int id;
   @Column(name = "user_name", nullable = false, length = 50)
   private String nama;
   @Column(name = "user_username", nullable = false, length = 20)
   private String username;
   @Column(name = "user_password", nullable = false, length = 20)
   private String pass;
   @Column(name = "user_phone", nullable = false, length = 20)
   private String phone;
   @Column(name = "user_akses", nullable = false, length = 20)
   private String akses;
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPass() {
        return pass;
    }

    public String getAkses() {
        return akses;
    }

    public void setAkses(String akses) {
        this.akses = akses;
    }

}
