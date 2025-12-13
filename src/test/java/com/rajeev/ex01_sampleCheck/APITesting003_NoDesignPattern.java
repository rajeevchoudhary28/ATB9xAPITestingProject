package com.rajeev.ex01_sampleCheck;

public class APITesting003_NoDesignPattern {

    public void step1(){
        System.out.println("Step 1");
    }

    public void step2(){
        System.out.println("Step 2");
    }

    public void step3(){
        System.out.println("Step 3");
    }

    public static void main (String[] Args){

        APITesting003_NoDesignPattern np = new APITesting003_NoDesignPattern();

        np.step1();
        np.step2();
        np.step3();
    }
}

