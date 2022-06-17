Java 8
----------------------------------------------------------------------

    Genereal Purpose High Level Object Oriented Programming Language.

    Simple
    Robust
    MultiThreaded
    Distributed
    Self Documented
    Platform Independent
    Archetecture Neutral

    Java 1.1 .................... Java 1.13

    JDK Java Development Kit        = java class library + java tools + jre
    JRE Java Runtime Environment    = class loader + garbage collector + JVM + JIT

    Java Tools
        javac
        java
        javadoc
        javap
        jar

    Lab Setup
        JDK 8
        Eclipse for JavaSE (the latest) 
        MySQL

    Datatypes
        primitive

            byte
            short
            int
            long
            double
            float
            boolean
            char
            void

        user defiend types

            classes
            interfaces
            enums
            annotations

    Operators
        Binary
            Arithmetic          +   -   *   /   %
            Assignemnt      =   +=  -=  *=  /=  %=
            Relational      ==  <   >   <=  >=  !=
            Logical         &&  ||  !
        Unary               -   ++  --  
        Ternary             boolean-expr ? true_value : false_value
        Bitwise             & | ! ^ ~   <<  >>
        Misslinous          ;   (   )   [   ]   {   }   <   >   .   ::  instanceof

    Control Structures
        branching
            simple if
            if else
            if ladder
            nested if
            switch
        iterative
            for
            while
            do..while
            enhanced for / for each

                for(int i=0;i<names.length;i++){
                    System.out.println(names[i]);
                }

                for(String name : names){
                    System.out.println(name);
                }

        non-conditional
            break
            continue
            return

    Arrays

        dynamic fixed length collection of homoginous elements.

        datatype arrName[];
        datatype[] arrName;

        arrName = new datatype[length];

    OOP
        class and objects

            class is a user defiend data type, that encapuslates
            fields and methods, whee fields represent proeprties or state and method
            represents behaviour.

            object is a variable of class type.

        encapsulation

            is also known as data hiding, which means providing an indirecte protected
            means of access to the core state .

            encapsualtion is implmented uwing access-specifiers and getter , setter methods.

            class ClassName {
                access-specifier datatype fieldName;

                ClassName(){
                    //default-constructor
                }

                ClassName(..parameter...){
                    //paramtrized constructor
                }

                ClassName(ClassName obj){
                    //copy constructor
                }
                .....
            }

            Access Specifiers
                default
                private
                protected
                public

            ClassName obj;          //declaration
            obj = new ClassName();  //allocation

            ClassName obj = new ClassName(); //initialization

            ClassName obj2 = obj;

            this keyword
            static keyword

        inheretence

            defining a new data type from an existing data type.

            the exiting type is called super - type
            the new one inhereting is called sub -type

            super class <------------ sub class         simple inheretence
            Rectangle <-------------- Cuboid

            super1 <---- Sub1 <---- Sub2 <---- Sub3     multi-level inheretence
            Employee <--- Manager <----- Director <--- ManagingDirector

                        | <----- Sub1
            super <-----|                               heirarchial inheretence
                        | <----- Sub2

                            | <--- Manager
            Employee <----  |
                            | <-- ContractEmployee

                                                        hybrid inheretence
                            | <--- Manager <----- Director <--- ManagingDirector
            Employee <----  |
                            | <-- ContractEmployee


            extends keyword
            super keyword

        polymorphisim
        
            overloading

             two or more methods belonging to the same class or classes in inheretence
             and having same name but different params.

            overriding
             
             two or more methods belonging to classes in inheretence
             and having same signature (returntype methodName(parameters) )

        abstraction

            is a machanisim where we make declarations and implementation
            are expected later.

            abstract classes

                    an abstract class can not have an object allocated.

            abstract methods

                    an abstract method is oen that is declared but not implemented.
                    an abstract method can be housed inside either an abstract class or
                    an interface.

            interface

                    an interface is an abstract user defined data type that
                    can not house non-static fields.

                an abstract class can not allow multiple inheretence for that matter
                no class allows multiple inheretence where as

                a class can implement multiple interfaces.

    Package

        is a unit of source code comprising of classes and other user defined data types and
        sub-packages.

        is to provide isolation or modularization of the source code.

        JSE class libraries
            java.lang       Object,String,StringBuffer,StringBuilder,System,Math
                            Integer,Double,Short,Byte,Character,Boolean
                            Throwable,Exception,RuntimeException
                            Runnable,Thread

            java.util       Generics and Collections and Streams and Functional Interfaces
            java.time       Date and Tiem Api
            java.io         Input and Output Streams
            java.sql        JDBC
            javax.sql       

    java.lang.Object

        is the defualt super class for all Java classes.

        int hashcode();
        boolean equals(Object);
        String toString();

    java.lang.System

        in      java.io.InputStream     Standard Input  Stream  (keyboard)
        err     java.io.PrintStrean     Standard Error  Stream  (VDU - monitor/projector)
        out     java.io.PrintStrean     Standard Output Stream  (VDU - monitor/projector)

    Working With Strings

        java.lang.String                immutable
        java.lang.StringBuffer          synchronized
        java.lang.StringBuilder         non-synchronised

        package com.cts.jsed.ui

        public class PallendromeCheckApp{
            public static void main(String a[]){

                Scanner s = new Scanner(System.in);

                str=s.next();
                
                StringBuffer sb= new StringBuffer(str);
                sb.reverse();
                
                if(str.equals(sb.toString()){
                    Systme.out.println("Pallendrome");
                }
                else{
                    Systme.out.println("Not a Pallendrome");
                }
            }
        }

    java.util

        Scanner

        Generics

            is a Abstract Data Type used to program data type independent alogirhtms

            swapping a and b
                t = b;
                b = a;
                a = t;

                this algorithm is same when a and b are ints,strings,employees ...etc.,

            public class Swapper<T> {
                public void doSwap(T a,T b){
                    T t;
                    t = b;
                    b = a;
                    a = t;
                }
            }

            Swapper<Employee> empSwapper = new Swapper<>();
            Swapper<String> strSwapper = new Swapper<>();
            Swapper<Integer> intSwapper = new Swapper<>();
            Swapper<Double> dblSwapper = new Swapper<>();

        
        Collections

            java.util.Collection    (i) all reuried methods for a collection add,remove,size,isEmpty
                | - java.util.List  (i) Linear Data Stuctures
                | - java.util.Set   (i) Non-Linear Data Structures (Trees)
                        |- java.util.SortedSet  (i) Binary Search Trees

            java.util.Map           (i) Dictionary a collection of (key:value) pairs
                |- java.util.SortedMap (i) Sorted Dictionary


            java.util.List  (i) Linear Data Stuctures

                        the elements are indexed 
                        it allows duplicate values and null values as well

                        java.util.Vector        growable array and is thread safe
                        java.util.ArrayList     growable array and is not thread safe
                        java.util.LinkedList    doublly linked list data structure

            java.util.Set   (i) Non-Linear Data Structures (Trees)

                        the elements have no index.
                        it does not allow duplicate valeus and allows only one null.

                        java.util.HashSet           does not have any order of retrival
                        java.util.LinkedHAshSet     retrives the elements in the order of insertion
                        java.util.TreeSet           retrives the elements in the order of magnitude (sorted)

            java.util.Comparator
            java.lang.Comparable

            java.util.Collections (c)

    java.time

        LocalDate
        LocalDateTime
        ZonedDateTime
        Period
        Duration
        DateTimeFormate

    Assignement
    ----------------------------------------------------------

        Consider a model
            Loan:
                loadAmount,interestRate,loanType,disbursedDate as proeprties

        Create a List<Loan> and accept a few loan recoreds in to the list using a Scanner.

        Divide that list into three different lists each list having houcing loans,personal loans and educational loans
        exclusivly.





    

