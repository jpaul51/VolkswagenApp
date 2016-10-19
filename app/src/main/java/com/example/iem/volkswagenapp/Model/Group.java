package com.example.iem.volkswagenapp.Model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by iem on 19/10/2016.
 */

public  class Group {

    String name,urlLogo;
    int CA2015,employeeNumber;
    Date dateRedemption;

   ArrayList<MotorBike> motorBikes;ArrayList<Car> cars;


    public Group() {

    }

    public Group(String name, String urlLogo, int CA2015, int employeeNumber, Date dateRedemption) {
        this.name = name;
        this.urlLogo = urlLogo;
        this.CA2015 = CA2015;
        this.employeeNumber = employeeNumber;
        this.dateRedemption = dateRedemption;

    }




    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }

    public int getCA2015() {
        return CA2015;
    }

    public void setCA2015(int CA2015) {
        this.CA2015 = CA2015;
    }

    public int getemployeeNumber() {
        return employeeNumber;
    }

    public void setemployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Date getdateRedemption() {
        return dateRedemption;
    }

    public void setdateRedemption(Date dateRedemption) {
        this.dateRedemption = dateRedemption;
    }
}
