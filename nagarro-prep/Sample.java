import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;
import java.io.Serializable;
import java.io.*;
import java.util.concurrent.*;
import java.util.Collections;

class Sample{
  
  public static void main(String[] args){

      // Create a map with streams from an array or arraylist
      // Both keys and values should be the same
      List<Integer> list =  Arrays.asList(0,3,0,0,24,5,0,43,5,0,78,65,0);
      Map<Integer,Integer> map = list.stream().distinct().collect(Collectors.toMap(Integer::intValue,Integer::intValue));
      // System.out.println(map.toString());

      // Move zeros to end of the array
      // We need to move zeroes to the end of the array and we need to do it in place ie. we cannot create a new array
      // How to we think about this problem
      // What we will do is move every non zero value ahead
     // Integer[] arr = {0,3,0,0,24,5,0,43,5,0,78,65,0};
    // arr = moveZeroes(arr);
    // Arrays.asList(moveZeroes(arr)).stream().forEach(a->System.out.println(a));
    // System.out.println(moveZeroes(arr).toString());


      interface a{
        void printSomething(Integer a);
      }

      class A implements a{
        @Override
        public void printSomething(Integer x){
          System.out.println(x);
        }
      }

      class B extends A implements Serializable{
        
      }
      // By default this class will be Serializable
      // To change this we have to override the writeObject method
      class C extends B {
        // @Override
        private void writeObject(java.io.ObjectOutputStream stream) throws Exception{
          throw new Exception("This class is not Serializable");
        }
        
      }



      ConcurrentHashMap<Integer,String> chmap = new ConcurrentHashMap<Integer,String>();
      chmap.put(10,"Geeks1");
      chmap.put(20,"Geeks2");
      chmap.put(30,"Geeks3");
      chmap.put(40,"Geeks4");
      chmap.put(50,"Geeks5");

      // We have creted an iterator over our concurrent hash map
      Iterator<ConcurrentHashMap.Entry<Integer, String>> itr = chmap.entrySet().iterator();

      while(itr.hasNext()){
        ConcurrentHashMap.Entry<Integer,String> entry = itr.next();
        System.out.println("Key = "+ entry.getKey()+" value= "+entry.getValue());
      }

    // Load factor is 0.75f ehich means when average number of elements per map exceeds 75  at that time map size will be increased and the 
    // elements whithin the priginal map will be rehashed to put in a larger size map

    // How do we calculate segment array size
    // 2**x>= concurrency level which in our case is ten


    // Lets now look at one example of synchronized hashmap
    HashMap<Integer, String> hmap = new HashMap<Integer,String>();
    hmap.put(10,"Geeks1");
    hmap.put(20,"Geeks2");
    hmap.put(30,"Geeks3");
    hmap.put(40,"Geeks4");
    hmap.put(50,"Geeks5");



    Map map1 = Collections.synchronizedMap(hmap);
    Set set = map1.entrySet();

    // Synchromnize on hashmap not on the set
    synchronized(map1){
      Iterator i = set.iterator();
      while(i.hasNext()){
        Map.Entry me  = (Map.Entry)i.next();
        System.out.print(me.getKey() +" : ");
        System.out.println(me.getValue());
      }
    }
      
      
    

      // B b = new B();
      // Arrays.asList(new A().getClass().getInterfaces()).stream().forEach(a->System.out.print(a));
      // If parent class is serializable and we dont want the child class to be serializable then we override the 
      // writeObject method and just make it throw Exception 



    // How to make a class immutable?
    // To make a class immutable we need to:
    // 1. Declare class as final so cannot be inherited.
    // 2. Do not implement any setters.
    // 3. Declare data menbers private and final.
    // 4. Add getter method:
    //   1. If it returns object instances then return deep copy of the Instances.
    //   2. If it returns primitive data types then return the value directly.


    // How to use class objects as keys in hashmap?
    // Let's say we can use objects directly as keys in hashmap
    // What problems would that cause?
    // The only problems in hashmaps are collisions. So we need to think how objects might cause
    // collisions and handle those collisions accordingly.
    // How would objects cause collisions?
    // When two objects will be compared their hash codes will firstly be calculated.
    // If something exists at that hashcode already we will see if it is the same object.
    // How do we check if it is the same object? We will override the equals method to make sure we make a correct 
    // comparision. 


    // Lets look at concurrent hashmap




    // Let us go through some of the spring related topics then we'll dive deeper into the second round video which is available
    
    







    
    
  }


  static Integer[] moveZeroes(Integer[] array){
    Integer replaceIndex = 0;
    for(Integer i=0;i<array.length;i++){
      // if(array.get(i)!=0){
      if(array[i]!=0){
      
        array[replaceIndex++] = array[i];
        // replaceIndex++;
      }
    }
    for(Integer i = replaceIndex;i<array.length;i++){
      // array.set(i);
      // array.set(i,0);
      array[i]=0;
    }
    
    return array;
  }

  
  
  
}