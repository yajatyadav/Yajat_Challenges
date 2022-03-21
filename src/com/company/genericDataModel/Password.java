package com.company.genericDataModel;

import java.util.Random;

public class Password extends Generics {
    public static KeyTypes key = KeyType.title;
    public static void setOrder(KeyTypes key) { Password.key = key; }
    public enum KeyType implements KeyTypes {title, password}

    private static final String lower = "abcdefghijklmnopqrstuvwxyz";
    private static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String number = "0123456789";
    private static final String special = "!@#$%&*()_+-=[]|,./?";


    private String password = "";

    public Password(int l)
    {
        this.setType("Password");
        this.password = pwGen(l);
    }


    @Override
    protected KeyTypes getKey() {

        return Password.key;
    }


    @Override
    public String toString() {

        return password;
    }

    public String pwGen(){
        return pwGen(8);
    }

    public String pwGen(int length){
        password = "";
        boolean has_lower = false;
        boolean has_upper = false;
        boolean has_number = false;
        boolean has_special = false;
        Random random = new Random();

        while(!(has_upper && has_lower && has_number && has_special)){
            password = "";
            for (int x = 0; x < length; x++){

                int y = random.ints(0,4).findFirst().getAsInt();

                if(y == 0){
                    has_lower = true;
                    int index = random.ints(0, lower.length()).findFirst().getAsInt();
                    password += lower.substring(index, index+1);
                }
                else if(y == 1){
                    has_upper = true;
                    int index = random.ints(0, upper.length()).findFirst().getAsInt();
                    password += upper.substring(index, index+1);
                }
                else if(y == 2){
                    has_number = true;
                    int index = random.ints(0, number.length()).findFirst().getAsInt();
                    password += number.substring(index, index+1);
                }
                else if(y == 3){
                    has_special = true;
                    int index = random.ints(0, special.length()).findFirst().getAsInt();
                    password += special.substring(index, index+1);
                }
            }
        }
        return password;



    }

    public static Password[] pwArray(int size){
        Password[] pwarray = new Password[size];
        for (int i = 0; i < size; i++){
            pwarray[i] = new Password(10);
        }
        return pwarray;
    }



    public static void main(String[] args){

        Password[] array = pwArray(2);


        Password.setOrder(KeyType.password);
        Generics.print(array);


//        print with title
        Password.setOrder(KeyType.title);
        Generics.print(array);



    }
}
