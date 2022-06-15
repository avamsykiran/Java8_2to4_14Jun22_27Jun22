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

                    an interface is an abstract user defiend data type that
                    can not house non-static fields.

                an abstract class can not allow multiple inheretence for that matter
                no class allows multiple inheretence where as

                a class can implement multiple interfaces.

                

    

