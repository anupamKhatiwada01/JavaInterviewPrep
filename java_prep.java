//  class Singleton {
//           private Integer id;
//           private Singleton(Integer id){
//               this.id = id;
//           }

//           private static Singleton object = null;

//           // pass in the id so that we can utilize it the first time
//           public static Singleton getInstance(Integer idToPass){
            
//               if(object==null) object =  new Singleton(idToPass);
//               return object; 
//           }

//           public Integer getId(){
//               try{
//                   object.id = object.id + 10;
//                   return object.id;
//               }catch(Exception e){
//                   System.out.println("Object not created yet");
//                   return 0;
//               }
              
//           }

//       }





//   public abstract class Athlete {
//     public abstract void walk();
//   }

//   public interface walkabe {
//     void walk();
//   }


/*

  abstract and final are illegal combinations because if a class is final it cannot be inherited 
  from whereas abstract classes are incomplete classes tha meant to be inherited from to complete them.



What is comparator? Suppose there's a array list of employees and we need to sort this list in ascending order
of their bdays. We cant sort the employee list directly so we overide the compare function of the 
comparator interface.


Dependency management manages dependency versions themselves without the developer having to worry about them.

  

*/






// Extending the thread class
// class java_prep implements Runnable{
//     public void run(){
//         System.out.println("Thread runs...");
//     }
//     public static void main(String[] args){
//         Thread threadOne = new Thread(new java_prep());
//         threadOne.start();
//     }
// }

// class java_prep extends Thread{
    // public void run(){
        // System.out.println("Thread runs...");
    // }
    // public static void main(String[] args){
        // java_prep threadOne = new java_prep();
        // threadOne.start();
    // }
// }

// Implementing the runnable interface
// class NewClass implements runnable{
//     public void run(){
//         System.out.println("Thread runs...");
//     }
//     public static void main(String[] args){
//         NewThread threadOne = new NewThread();
//         NewThread.start();
//     }
// }







// class Main {
  
//    public static void main(String args[]) {
//        Singleton sg = Singleton.getInstance(1);
//        System.out.println(sg.getId());
//    }
// }

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

  30. Character array over string for storing sensetive information--> String literals in the string pool
      are immutabe ie they cannot be changed so passwords and sensitive information even after changing will 
      stay in the string pool and hackers can access it to via a memory dump.
      Character arrays acan just be set to a null value after sensitive information is processed so we dont need
      to worry about it staying around for malicious elements to find.

  31. What do we get in the jdk file? JDK, JRE and JVM.
      JDK - JRE, compiler, debugger and build tools.
      JRE - Runtime environment provides libraries and classes for JVM to run thr program.
      JVM - Interpreter which runs the java bytecode and converts it to machine readable instructions.

  32. Differences between HashMap and HashTable in Java?
        - Hashmap is not synchronized so it should not be used in threaded environments.
        - Hashmap allows only one null key but any number of null values whereas Hashtable does not allow null keys
        or values.
        - Hashmap supports order of insertion by making use of its subclass linked hashmap whereas in hashtable
        the order of insertion is not guaranteed.

   33. What is reflection? Get back to this.
   
   34. What are the different ways of thread usage?

      Extending the thread class
      class NewThread extends Thread{
          public void run(){
              System.out.println("Thread runs...");
          }
          public static void main(String[] args){
              NewThread threadOne = new NewThread();
              threadOne.start();
          }
      }

      Implementing the runnable interface
      class NewClass implements runnable{
          public void run(){
              System.out.println("Thread runs...");
          }
          public static void main(String[] args){
              NewThread threadOne = new NewThread();
              NewThread.start();
          }
      }

      Whatever is insode the run method will run in a new thread.

    35. Different types of thread priorities in java? MIN_PRIORITY:Integer value 1
                                                      MAX_PRIORITY:Integer value 10
                                                      NORM_PRIORITY:Integer value 5
                                                      
                                                      
    36. Difference between throw and throws.
    
    class Main {
   public static int testExceptionDivide(int a, int b) throws ArithmeticException{ // Throws is used to inform the calling method to handle the expression.
       if(a == 0 || b == 0)
           throw new ArithmeticException(); // throw is used to throw a particular exception
       return a/b;
   }
   public static void main(String args[]) {
       try{
           testExceptionDivide(10, 0);
       }
       catch(ArithmeticException e){
           //Handle the exception
       }
   }
}












37. Final variable instantiations are possible inside the constructor and in this case 
    their scope will be the whole class where as declaring a final variable inside
    the scope of a method makes sure that the variable is available only inside the
    scope of that method.






    class Main {
    public static void main(String args[]) {
        Scaler s = new Scaler(5);
    }
}
class InterviewBit{
    InterviewBit(){
        System.out.println(" Welcome to InterviewBit ");
    }
}
class Scaler extends InterviewBit{
    Scaler(){
        System.out.println(" Welcome to Scaler Academy ");
    }
    Scaler(int x){
        this();
        super();
        System.out.println(" Welcome to Scaler Academy 2");
    }
}

The above program throws a compilation error as super() has to be the first function called within the block.
If we interchange this() and super() again it'll throw a compilation error because the condition with this()
is also that it should be the first function call of the block. Thus these two functions cannot be called within the 
same block.


38. Java works by pass by value or pass by reference?
Pass by value.


39. String or StringBuffer for lot of updates on the same data?
    String buffer as it is mutable and string will just cause unnecessary additions to the string pool.

40. "transient" keyword does not allow the serialization of attributes of a class in java.

public class InterviewBitExample{
    private transient String someInfo;
    private String name;
    private Integer id;
}
In the above example attributes except someInfo can be serialized.

41. If static modifier is not added to main method? There will not be compilation error but JVM will not recognize
    it as the main method to start execution from and throws "NoSuchMethodError" at runtime.

42. Can we make main main() thread a daemon thread?
    In java multithreading, the main() threads are always non-daemon threads. And there is no way we can change the
    nature of a non-daemon thread to a daemon thread.

43. What hapens if there are multiple main methods inside one class in java?
    The program won't compile as it will state that the method has already been defined inside the class.

44. Object cloning and how its achieved in java? Cloning is creating an exact copy of an object.
    To support this the class has to implement the clonable interface from java.lang.package and override the clone()
    method.

    protected Object clone() throws CloneNotSupportedException{
        return (Object)super.clone();
    }

    In case the Clonable Interface is not implemented and only the method is overridded then this results in 
    the CloneNotSupportedException.


45. How does exception propagate? Look for the first satisfying catch block, if not found propagate below to the
    next function in the call stack to find a satifying catch block and keep propagating down until the program
    is terminated in the main method.

46. Not mandatory to have a catch block after try block. A try block should be followed by either a catch or a finally.
    If the probabilty of throwing exception is high then the function should be declared using the throws clause.
    This will make sure that it has to be called inside a try catch block.

47. Code inside finally block will be called irrespective of any number of catch blocks even if something has been
    returned. The only way finally block does not run is if System.exit() was called somewhere.

48. Can a constructor be called inside another constructor?
    Yes.

    public class Sample{

        private Integer id;

        Sample(){
            System.out.println("This is the default constructor");
        }

        Sample(Integer id){
            this();
            this.id = id;
            System.out.println("This is the modified constructor which calls the default constructor.");
        }
    }


49. Contigous memory locations are used to store the actual values in an array but not in ArrayList. Why?
    ArrayList cannot be used to store primitives such as int, float etc. only thing stored are the references
    to objects. So the contents ie. the objects are stored in the heap at different locations and just their
    references are stored contigously in an arraylist.
    As arrays store primitives such as float, int etc which are stored by value so their actual value is stored
    at contigous memory locations by an array.

50. Why are indexes stored from index=0?
    This indexes are stored form start=0 because to find the address of a particular index in memory
    the formula used base index+(index*size_of_variable_data_type). If index started from 1 we would have to do extra 
    arithmetic to find actual address. So to remove this complexity indexes start from 0.


51. How many overloaded add and addAll method are available in the list interface? Describe needs and uses.
    
    addAll(Element e) // Adds elemet at the end of the list.
    addAll(int index, Element e) // Inserts element e at index
    addAll(Collection<extends?Element>c) // Add all elements of a collection to the end of a list
    addAll(int index, Collection<extends?Element>c) // Inserts all elements of a collection at the index


52. How does array list size grow dynamically?
    It grows with the formula new_size = current_size+(current_size//2);







*/