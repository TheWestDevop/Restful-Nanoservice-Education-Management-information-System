/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrecheRestFulAPI;

import java.io.Serializable;



/**
 *
 * @author user
 */
public class CrecheBean implements Serializable {
    String StudentID;
    String StudentFirstName;
    String StudentLastName;
    String StudentGender;
    String StudentAge;
    String StudentClass;
    String StudentAddress;
    String StudentParentContact;
    String StudentParentGuardian;
    String StudentCountry;
    String StudentSchool;

    
    
     private static final long serialVersionUID = 1L;
 
    
    public CrecheBean() {
        super();
    }

          public  CrecheBean(String StudentID, String StudentFirstName,
            String StudentLastName,
            String StudentGender, String StudentAge, String StudentClass, 
            String StudentAddress, String StudentParentContact, String StudentCountry, 
            String StudentPassPortname, String PassPortPath,String StudentParentGuardian,String StudentSchool) {
        
        this.StudentID = StudentID;
        this.StudentFirstName = StudentFirstName;
        this.StudentLastName = StudentLastName;
        this.StudentGender = StudentGender;
        this.StudentAge = StudentAge;
        this.StudentClass = StudentClass;
        this.StudentAddress = StudentAddress;
        this.StudentParentContact = StudentParentContact;
        this.StudentCountry = StudentCountry;
        this.StudentParentGuardian = StudentParentGuardian;
        this.StudentSchool = StudentSchool;
    }

    public String getStudentParentGuardian() {
        return StudentParentGuardian;
    }

    public void setStudentParentGuardian(String StudentParentGuardian) {
        this.StudentParentGuardian = StudentParentGuardian;
    }      
   
    public String getStudentSchool() {
        return StudentSchool;
    }

    public void setStudentPassword(String StudentSchool) {
        this.StudentSchool = StudentSchool;
    }
    
  

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getStudentFirstName() {
        return StudentFirstName;
    }

    public void setStudentFirstName(String StudentFirstName) {
        this.StudentFirstName = StudentFirstName;
    }

    public String getStudentLastName() {
        return StudentLastName;
    }

    public void setStudentLastName(String StudentLastName) {
        this.StudentLastName = StudentLastName;
    }

    public String getStudentGender() {
        return StudentGender;
    }

    public void setStudentGender(String StudentGender) {
        this.StudentGender = StudentGender;
    }

    public String getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(String StudentAge) {
        this.StudentAge = StudentAge;
    }

    public String getStudentClass() {
        return StudentClass;
    }

    public void setStudentClass(String StudentClass) {
        this.StudentClass = StudentClass;
    }

    public String getStudentAddress() {
        return StudentAddress;
    }

    public void setStudentAddress(String StudentAddress) {
        this.StudentAddress = StudentAddress;
    }

    public String getStudentParentContact() {
        return StudentParentContact;
    }

    public void setStudentParentContact(String StudentParentContact) {
        this.StudentParentContact = StudentParentContact;
    }

    public String getStudentCountry() {
        return StudentCountry;
    }

    public void setStudentCountry(String StudentCountry) {
        this.StudentCountry = StudentCountry;
    }
    
    
    
    
}
