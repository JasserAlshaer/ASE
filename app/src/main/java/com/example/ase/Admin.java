package com.example.ase;
import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Admin {
    public  String AdminName;
    public String Email;
    public String Password;


    public Admin() {
    }

    public Admin(String adminName, String email, String password) {
        AdminName = adminName;
        Email = email;
        Password = password;
    }
}
