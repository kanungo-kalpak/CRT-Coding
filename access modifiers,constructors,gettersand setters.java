package com.company;

class employee{  //created our own custom class
     int id;       //private access modifier
     String name;
//we can create multiple constructors with different no of arguments.using constructors we can also do overloading. which is known as construvtor overloading

    public employee(){     // constructor
        id=3;
        name="monojit";                  //default value we are gib=ving
    }
    public employee(String n,int i){
        id=i;
        name=n;         // user input we are giving
    }
    public int getId(){     //getters-which only returns the value
        return id;
    }

    public String getName(){    //getters-getters-which only returns the value
        return name;
    }



}
public class Testing {
    public static void main(String[] args) {
        employee rick=new employee("rick palit",9);
        employee sampu=new employee();
        System.out.println(rick.getId());
        System.out.println(rick.getName());

        System.out.println(sampu.getName());
        System.out.println(sampu.getId());


    }

}






