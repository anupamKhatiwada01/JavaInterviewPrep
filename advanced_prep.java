/*

    Volatile vs transient:
    Volatile:   Indicates that the content of the variable is stored in the main memory. All read operations shoild be performed on
                on the main memory and all write operations should be performed on the main memory along with on cpu registers

                Ensures JVM does not reorder the variables and ensures synchronization issues are avoided
                Do not have default values
                Can be static and final
    
    
    
                Transient:  variable cannot be serialized
                Provides flexibility and control over the attributes of objects being serialized
                Have default values corresponding to the data type at the time of deserialization.
                Should not be static
                Should not be final as they are instantiated during initialization



    Vector vs ArrayList: Syncronized, slower and thread safe vectors.
    
    How is Collection different from Collections in java?
    Collection: Interface in the java.util.package extend the iterable interface. Is extended by List, Set and Queue interfaces.
    Collections: A utility class present in the java.util.package that has a bunch of static methods to use with different 
    Collection objects.

    public interface Collection<E> extends Iterable<E>{

    }


    public void someMethod(String... info){
        // Info acts as an array and can be used as such
        // Takes variables in the form seperate strings and array of strings.
    }


    What is the importance of hashcode() and equals() contract?
    If hashcode() and equals() are not implemented properly then there are chances that two keys will produce the same output.
    Thus their proper implementation is very important.

    This can be done is the contract is respected.
    If two objects are equal the hashcode() method should produce the same hashcode for both.
    If we override the equals method, we have to overide the hashcode method also.


    How is the class path variable different from path variables? Specific to java executables and used for lcoating class files.
    Path variables are present in operating system and used for locating system executables.

    public class TestClass {
public static void main(String[] args) {
     someMethod(null);
}
public static void someMethod(Object o) {
 System.out.println("Object method Invoked");
}
public static void someMethod(String s) {
 System.out.println("String method Invoked");// This will get printed because null although is a replacement for an Object it does not extend the object class
//  Plus the second method is more specific as it acts on more specific objects such as strings vs generic Object.
}
}

Trouble with serilization:
Check implementation of java.io.serializable interface
Check that only non static variables are being serialized
Check that some non static variable hasnt been declared as trainsient by accident

What is the best possible way of calling the wait() function inside an if or a loop construct?
synchronized(resource){
    while(waitCondition){
        resource.wait();
    }
    // Continue till wait condition becomes false
}


Can we use HashMaps in multithreaded environments?
We can but it is not advised. It is advised to use HashTable or ConcurrentHashMap

public class InterviewbitProblem{
public static void main(String[] arr){
   System.out.println(0.1*3 == 0.3); // Will print false
   System.out.println(0.1*2 == 0.2); // Will print true
}
}

This is due to error in rounding floating point numbers. Only floating point numbers that are powers of two will be accuately
represented. Others will face a rounding error as shown above.


public class InterviewbitProblem{
   public static void main(String[] args) {
       System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
   }
}

in Java, Double.MIN_VALUE and Double.MAX_VALUE are positive numbers. Thus the program will print 0.0.

What will happen if you run 1.0/0.0?
The Double class provides certain rules like Double.INFINITY, NAN, -0.0 etc. In this case it will return
Double.INFINITY without giving Artithmetic operations.

Is it necessary to declare all immutabel objects as final?
This is not necessary. We can keep it as private and not have any setters to it. Its value can be initialized in the constructor.

public class Sample{
    private Integer id; // Now this value is immutable without decalaring it as final
    Sample(Integer id){
        this.id=id;
    }
}



public class InterviewbitTest {
   private static int counter = 0;
   void InterviewbitTest() {  // This is not a constructor as its return type is void and constructors dont have any return type
       counter = 20;
   }
   InterviewbitTest(int x){
       counter = x;
   }
   public static void main(String[] args) {
       InterviewbitTest interviewbitTest = new InterviewbitTest(); // this line will throw an error as there is no default constructor as is being called here
       System.out.println(counter);
   }
}


class X {
   static int i = 1111;

   static{
       i = i-- - --i;    //L1
   }

   {
       i = i++ + ++i;    //L2
   }
}

class Y extends X{
   static{
       i = --i - i--;    //L3
   }
   {
       i = ++i + i++;    //L4
   }
}

public class DriverClass{
   public static void main(String[] args){
       Y y = new Y();
       System.out.println(y.i);    //L5
   }
}


String literals get added to String pool. Other string objects do not get added to string pool.



public class InterviewbitProblem{
   public static void main(String[] args) {
       Integer num1 = 1000, num2 = 1000;  
       System.out.println(num1 == num2);//1 This will be false as we are comparing Integer objects not primitives so their address
                                        //  Which is the property checked by the == will be false
       Integer num3 = 20, num4 = 20;  
       System.out.println(num3 == num4);//2


   }
}






*/