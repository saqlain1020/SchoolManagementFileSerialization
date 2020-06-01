package managementsys;

import java.io.Serializable;
import java.util.Scanner;

public class Staff implements Serializable {
    static Scanner input = new Scanner(System.in);
    private int ernNo;
    private String name,fName,address,phNo;
    void setErnNo(int ernNo){
        this.ernNo = ernNo;
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
    void setPhNo(String phNo){
        this.phNo = phNo;
    }
    int getErnNo(){
        return ernNo;
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
    String getPhNo(){
        return phNo;
    }
    
    Boolean checkErnNo(int ernNo){
        if(this.ernNo == ernNo){
            return true;
        }else {
            return false;
        }
    }
}