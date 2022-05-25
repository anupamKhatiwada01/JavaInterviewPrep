 class Singleton {
          private Integer id;
          private Singleton(Integer id){
              this.id = id;
          }

          private static Singleton object = null;

          // pass in the id so that we can utilize it the first time
          public static Singleton getInstance(Integer idToPass){
            
              if(object==null) object =  new Singleton(idToPass);
              return object; 
          }

          public Integer getId(){
              try{
                  object.id = object.id + 10;
                  return object.id;
              }catch(Exception e){
                  System.out.println("Object not created yet");
                  return 0;
              }
              
          }

      }





  public abstract class Athlete {
    public abstract void walk();
  }

  public interface walkabe {
    void walk();
  }


/*

  abstract and final are illegal combinations because if a class is final it cannot be inherited from whereas abstract classes are incomplete classes tha meant to be inherited from to complete them.



What is comparator? Suppose there's a array list of employees and we need to sort this list in ascending order of their bdays. We cant sort the employee list directly so we overide the compare function of the comparator interface.


Dependency management manages dependency versions themselves without the developer having to worry about them.

  

*/














class Main {
  
   public static void main(String args[]) {
       Singleton sg = Singleton.getInstance(1);
       System.out.println(sg.getId());
   }
}

/*


  1. Unlike c++, java is compiled and interpreted. It is compiled by the javac compiler and interpreted by 
      the JRE.
  
  2. Stack and heap memory. 
      - Whenever we write a java proram and run it, the program and all its components get loaded in memory
        ie. the stack memory. This contains all the variables stored locally within functional contexts.
      - When we create an object within the program, the object and all its data is stored in the heap
        memory which can be references from the variables stored in the stack memory.
  
  3. Java does not use pointers because their use is quite difficult ofr beginners and they make the program
      relatively unsafe.

  4. Instance variables- Object scoped
      Local variables - Function/block/constructor parameter scoped

  5. Default values assigned-
      - No default values are assigned to variables in java. We need to initialize value before using it or 
        it will throw compilation exception.
      - But objects have initialize default values in constructors. reference-> null, numeric->0, boolean->false

  6. Data encapsulation- Hiding data attributes and behaviours in a single unit. Eg. Class=variables+methods

  7. JIT compiler stands for Just In Time compiler and is used for improving the performance at runtime.
      - First, the Java source code (.java) conversion to byte code (.class) occurs with the help of the javac compiler.
      - Then, the .class files are loaded at run time by JVM and with the help of an interpreter, these are converted to machine understandable code.
      - JIT compiler is a part of JVM. When the JIT compiler is enabled, the JVM analyzes the method calls in the .class files and compiles them to get more efficient and native code. It also ensures that the prioritized method calls are optimized.
      - Once the above step is done, the JVM executes the optimized code directly instead of interpreting the code again. This increases the performance and speed of the execution.

  8. equals() and ==  --> equals() method is defined in the object class. It is used for checking the equality of contents between two objects as per specified business logic. Can be overidden in child classes.
        == --> binary operator for checking eqality. Checks references ie. if both objects point to the same heap memory. can be used with primitives.

  9. Constructor overloading --> Multiple constructor for same class. Depending on the number and type of
      constructor parameters the specific constructor is chosen.

  10. Copy Constructor--> It is the constructor used when we want to initialize the value to the new object
      from the old object of the same class.

      class Demo {
        int id;
        string name;
        Demo(Demo demo){
          this.id=demo.id;
          this.name=demo.name;
        }
      }

  11. Can the main method be overloaded? --> Yes we can create as many main methods we want but the
      JVM will only call the public static void main(String args[]), main method.

  12. Method overloading - Compile time polymorphism. Because the compiler at compile time decides which function to run depending on the number and type of parameters passed in.
      Method Overiding - Runtime polymorphism. Because the exact method called depends on the value of the 
      object variable at runtime and it is decided then.

  13. Single try and multiple catch blocks can exist with each catch block cathcing a particulat type of Exception.

  14. Final keyword in variable, method and class- 
        variable- Final variable value cannot be changed once it has been assigned. For uninitialized value it can only be assigned in the constructor.
        method- If a method of a particular class has been mentioned as final then it cannot be overridded in its child classes.
        class- A final class cannot be extended but can extend other classes for its use.

  15. Final, Finally and finalize- final is mentioned above.
                                   finally is a keyword written generally after try/catch block to execute a piece of code under                                     any circumstance.
                                   finalize is called prior to garbage collection of an object.

  16. finally block will not be executed System.exit() is called before it or fatal errors such as stack overflow or memory access errors occur.

  17. When to use super keyword? --> To access private properties of parent class from child class.
                                      To call different parent class constructors and overridden methods from within the clid class.

  18. Can static methods be overloaded? Yes, and they are called according to the type and number of parameters passed.

  19. Main method is static because JVM calls it on the class name directly without creating an object for it.

  20. Can static methods be overidden? No, we can do it but runtime polymorphism will not work. Static methods are loaded and looked up statically so they do not support runtime polymorphism.

  21. Difference between static methods, static variables and static classes in java -->
        static methods, static variables are created and exist in class context and not object context.
        static classes are not possible unless they are inner classes in which case they follow the same properties as static methods.

  22. Garbage collector removes unnecessary and unreachable objects from heap memory.

  23. Class loader is a program in JRE. Its task is to load the required classes and interfaces to JVM when required.

  24. Heap is cleaned during garbage collection.

  25. Shallow copy - Just copy the reference.
      Deep copy - Create new object of same type and copy the contents of all the instance variables from the reference objects.
                  Best method used to do this is the clone() method described for the object.

  26. Why are strings immutable in java? 1. Implementation of string pool.
                                         2. As they are immutable, no issues with with synchronization and multi threading.
                                         3. As they are used as keys in maps they should not be usable.

  27. Singleton class is a class for which we can have only one instance. 

  28. String, StringBuffer and StringBuilder.
        Storage area: spring- string pool, others heap.
        Mutability: String - immutabe others mutable.
        Efficiency - Slow with string.
        Thread-safe: String is not used. String builder is safe for single thread and string buffer is safe for multiple threads.

  29. Inheritance vs abstract classes-
      - Only abstract methods permitted in interfaces.
      - Only static and final variables in interfaces.
      - Interfaces support multiple inheritance.
      - All properties are public.
      - 




*/