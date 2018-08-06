/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author user
 */
public class User {
    String SchoolID;
    String Username;
    String Password;

    public User(String SchoolID, String Username, String Password) {
        super();
        this.SchoolID = SchoolID;
        this.Username = Username;
        this.Password = Password;
    }

    public String getSchoolID() {
        return SchoolID;
    }

    public void setSchoolID(String SchoolID) {
        this.SchoolID = SchoolID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
