package com.example.myapp;

public class Applicant {
    private String name;
    private int yearsOfExperience;
    private  Applicationstatus status;
    // instead of using setter we are doing it using constructor  only
    Applicant(String name,int yearsOfExperience,Applicationstatus status){
        this.name=name;
        this.yearsOfExperience=yearsOfExperience;
        this.status=status;
    }
    //getter
   public  String getName(){return name;}
    public  int  getyearsOfExperience(){return yearsOfExperience; };
    public  Applicationstatus getStatus(){return status; };
    @Override
    public String toString(){
        return name+"("+yearsOfExperience+"years"+")-"+status;
    }

}
