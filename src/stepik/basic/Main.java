package stepik.basic;

public class Main {

    String simpleVar = "simple field";
    static String staticVar = "static field";

    StaticInnerClass staticInnerClass = new StaticInnerClass();
    InnerClass innerClass = new InnerClass();

    static class StaticInnerClass{
        void print() {
//            System.out.println(val1); -- you can't to do it, it will be error
            System.out.println(staticVar); // OK
        }
    }

    class InnerClass{
        void print() {
            System.out.println(simpleVar); // OK
            System.out.println(staticVar); // OK
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

//        Main.InnerClass innerClass = new Main.InnerClass();  error it can't be referenced from static context
        Main.StaticInnerClass staticInnerClass = new Main.StaticInnerClass(); // OK

        main.staticInnerClass.print();
        main.innerClass.print();
        
/*      output: 
                static field
                simple field
                static field
﻿*/


    }

} 