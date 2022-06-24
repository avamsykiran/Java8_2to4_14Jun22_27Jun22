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
    
        Consider a model
            Loan:
                loadAmount,interestRate,loanType,disbursedDate as proeprties

        Create a List<Loan> and accept a few loan recoreds in to the list using a Scanner.

        Divide that list into three different lists each list having houcing loans,personal loans and educational loans
        exclusivly.



    Exception Handling

        is a situation that mostly represents an illegal or unacceptable input or evetn, which
        may tend to break the application.

        to detect catch and do an alternate flow in case of an exception occuring is called
        exception handling.

        java.lang.Throwable
                |- Error
                |- Exception
                        |
                        |- any sub - clasees from Exception - Checked Exception
                        |
                        |- RuntimeException
                                    |
                                    |- any sub classes from RuntimeException - Unchecked Exception

        Checked Exception are expected to be handled without which the compilation is never success.

        UnChecked Exception are not expected to be handled.


        unchecked exception are expected to be avoided but not handled.

            class EmployeeService{
                public void incrementSalary(Employee emp,double value){
                    if(emp!=null)
                        emp.setSalary(emp.getSalary()+value);
                }
            }

        Checked Exceptions are handled using try...catch statement

            try{
                //regular code that may throw an exception
            }catch(ExceptionType expObj){
                //alternate step to be taken in case of that exepction occur
            }catch(ExceptionType1 expObj){
                //alternate step to be taken in case of that exepction occur
            }catch(ExceptionType2 expObj){
                //alternate step to be taken in case of that exepction occur
            }catch(ExceptionType3 expObj){
                //alternate step to be taken in case of that exepction occur
            }.. finally {
                //execute a pice of code irrespective of the exception occuring or not.
            }

            try{
                //regular code that may throw an exception
            }catch(ExceptionType | ExceptionType1 | ExceptionType2 expObj | ExceptionType3 expObj){
                //alternate step to be taken in case of that exepction occur
            }.. finally {
                //execute a pice of code irrespective of the exception occuring or not.
            }


            try(Connection con = DriverManager.getConnection(....)){
                    //make use of the connection
            }catch(SQLException exp){
                //.....
            }

            the connection gets closed automatically when the try statemnt is done.

        'throw' keyword is sued to raise our own exception (user defiend exception)
        'throws' keyword is used to transfer an exception from a method to its caller method.
        

    IO Streams

        java.io
            InputStream  
                FileInputStream
                ObjectInputStream   
            
            OutputStream
                FileOutputStream
                ObjectOutputStream

            Reader
                InputStreamReader
                BufferedReader
            Writer
                PrintWriter

            IOException
            File

        java.nio
            Paths
            Files

    Multi-Threading            

        java.lang.Runnable
            |
            |- java.lang.Thread

                    
    Stream API is a way of java to support functional programming.

        Prepare Fresh Lemon Juice

         preapreJuice() {
            Pick a lemon
            Squezze the lemon in to a glass
            That glass must be mixed with Soda
            That glass must be mixed with sugar
            And then add some ice
            And serve the juice
        }

        Prepare Fresh Lemon Juice via Fucntional Programming Approach
        
            picklemon() {}
                squeezeLemon() {}
                    mixSoda() {}
                        addSugar() {}
                            addIce() {}
                                serve() {}

        Functional Interfaces and lambda expressions

            a functional interface is an interface that has only one abstract function.

            @FunctionalInterface
            interface Sum {
                double doSum(double a,double b);
            }

            class SumImpl implements Sum {
                public double doSum(double a,double b){
                    return a+b;
                }
            }

            Sum s = new SumImpl();
            s.doSum(10,20);

            Sum s2 = (n1,n2) -> n1+n2;
            s2.doSum(10,20);

            () -> returnValue
            (param1,param2) -> returnValue
            (param1,param2) -> {
                //some code
                returnValue;
            }

            java.util.function
                in-built functional interfaces

                consumer            whose method do not return a value but accepts one
                supplier            whose method do not accept a valeu but returns one
                predicate           whose method returns boolean always
                functional          

            java.util.stream.Stream

                the stream class represents a flow data from a variaty of sources.

                Stream s = Stream.of("Vamsy","Komal","Srinu");
                Stream s1 = Arrays.stream(int[] {12,34,56,88,90})
                Stream s2 = listObj.stream();
                Stream s3 = setObj.stream();


                Stream::
                    forEach(consumer)           returns nothing but execute the cosnumer on each value in the stream
                    collect(Collector)          to collect the values in a stream into a list or a set
                    map(oparator)               to return a new stream containing transformed valuse of the old stream.
                    reduce(BinaryOperator)      to reduce the whole stream into a single value using the bianry operator
                    filter(predicate)           to return a new stream of filtered values of the old stream using the predicate