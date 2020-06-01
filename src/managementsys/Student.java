package managementsys;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {
    static Scanner input = new Scanner(System.in);
    private int rollNo;
    private String name,fName,address,className;
    void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    void setName(String name){
        this.name = name;
    }
    void setFName(String fName){
        this.fName = fName;
    }
    void setAddress(String address){
        this.address = address;
    }
    void setClassName(String className){
        this.className = className;
    }
    int getRollNo(){
        return rollNo;
    }
    String getName(){
        return name;
    }
    String getFName(){
        return fName;
    }
    String getAddress(){
        return address;
    }
    String getClassName(){
        return className;
    }
    
    Boolean checkRollNo(int rollNo){
        if(this.rollNo == rollNo){
            return true;
        }else {
            return false;
        }
    }
}