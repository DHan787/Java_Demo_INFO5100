/*
 * @Author: Jinag Han
 * @Date: 2023-10-10 17:04:09
 * @Description: 
 * @LastEditTime: 2023-12-05 15:53:04
 * 
 */
package edu.neu.mgen;

public class InClassPrac {


    public static void main(String[] args) {

        System.out.println("Main start");

        TestClass testClass = new TestClass();

        testClass.protectedMethod();

        testClass.privateMethod(); // Why does this line cause error?

        System.out.println("Main end");

    }

}

 

class TestClass{

    public void privateMethod(){

        System.out.println("private method run successfully!");

    }

 

    protected void protectedMethod(){

        System.out.println("protected method run successully!");

    }

}
