package com.company.MIU;

public class Dog implements Animal {
    private String test;
    private String checkBox;
    public Dog (){
    }
    public Dog (String val,String check){
        this.test=val;
        this.checkBox=check;

    }
   public void eat(){
   System.out.println("=====eating food======");
   }
   public void defecate(){}
}
