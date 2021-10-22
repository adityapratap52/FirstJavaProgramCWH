package com.company;

public class Class66_CommandLineArgument {
    public static void main(String[] args) {

        //------ first way to initialize------
        //args[0] = "asd";                // We can't initialize value in CMA directly only input in console
        //System.out.println("Your first argument is: "+args[0]);     //  After compile  in CMD write -> java Class66_CommandLineArgument Aditya(any string name)

        //--------- Second way to initialize----------
//        for (int i=0; i<args.length; i++){
//            System.out.println(args[i]);            // java Class66_CommandLineArgument Aditya Pratap Singh ......(use any no. of String)
//        }

        //--------Third way--------
        for (String in : args){
            System.out.println(in);
        }

        //-------Fourth way------
        //if(args.length > 0){
            //int firstArg = Integer.parseInt(args[0]);
            //System.out.println("Argument "+ args[0]+" must be an Integer");
            //System.exit(1);
        //}

        //-----Fifth way-------
        //int sum = 0;
        //float sum = 0;
        //for(int i=0;i<args.length;i++){
            //sum += Integer.parseInt(args[i]);
            //sum += Float.parseFloat(args[i]);
        //}
        //System.out.println("Sum is: "+sum);
    }
}
