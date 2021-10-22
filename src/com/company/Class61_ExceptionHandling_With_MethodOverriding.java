package com.company;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;

class Parent11{
    void msg() throws Exception{                        // You can use only Parent Exception or same Exception
        System.out.println("Parent");
    }
}
class Child9 extends Parent11{
    void msg() {                                          // can't throws Checked Exception except runtime Exception while Parents Class not declare Parent Exception or same Exception
        System.out.println("Child");
    }
}
class Child90 extends Parent11{
    void msg() throws ArrayIndexOutOfBoundsException {    // can't throws Checked Exception except runtime Exception while Parents Class not Parent Exception or same Exception
        System.out.println("Child");
    }
}
public class Class61_ExceptionHandling_With_MethodOverriding {
    public static void main(String[] args) {
        Parent11 ppp = new Child9();
        try {
            ppp.msg();
        }catch (Exception e){

        }
    }
}
