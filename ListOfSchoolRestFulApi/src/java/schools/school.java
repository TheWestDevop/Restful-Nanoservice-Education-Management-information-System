/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schools;

import java.sql.Date;



/**
 *
 * @author user
 */
public class school {
    String SchoolID;
    String SchoolName;
    String Reg_Date;

    public String getReg_Date() {
        return Reg_Date;
    }

    public void setReg_Date(String Reg_Date) {
        this.Reg_Date = Reg_Date;
    }

    public String getExp_Date() {
        return Exp_Date;
    }

    public void setExp_Date(String Exp_Date) {
        this.Exp_Date = Exp_Date;
    }
    String Exp_Date;

    public school() {
    }

    public school(String SchoolID, String SchoolName,String Reg_Date,String Exp_Date) {
        this.SchoolID = SchoolID;
        this.SchoolName = SchoolName;
        this.Reg_Date = Reg_Date;
        this.Exp_Date = Exp_Date;
    }

    public String getSchoolID() {
        return SchoolID;
    }

    public void setSchoolID(String SchoolID) {
        this.SchoolID = SchoolID;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String SchoolName) {
        this.SchoolName = SchoolName;
    }

    
    
}
