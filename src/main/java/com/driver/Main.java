package com.driver;

public class Main {

   static  class A{
        String meth()
        {
            return "Invoking method from class A";
        }
    }

    static class B extends A{

       String meth()
       {
           return "Method is overridden in Extendend class B";
       }

    }
    public static void main(String[] args) {

        B b = new B();
       b.meth();
       B b1 = new B();
       b1.meth();

    }

  
}