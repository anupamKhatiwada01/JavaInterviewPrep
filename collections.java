/*

Collection framework is a framework in java used to create a collection of objects. It has capabilities for doing data operations
such as searching, sorting, insertion, manipulation and deletion.

The two root interfaces of Java collection classes are the collection interface java.util.Collection and Map ie java.util.Map

Many interfaces such as Set, List, Queue, Deque and calsses are available in the Java collection framework.
These are ArrayList, linkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet

Need for collection framework? Standardized interfaces for collections.

1.  Difference between arrays and collections.
    Arrays have fixed size whereas Collections have variable size.
    Arrays have better performance than collections.
    Only homogenous data types can be stored in array whereas heterogenous data types can be stored in collections.
    Objects and primitive s can both be stored in arrays whereas primitives cannot be staored in collections.
    When it comes to memory arrays are not preferred to collections.

2.  Difference between collection and collections in the context of java.
    Collection: In java.util.package, there is an interface called collection. It is used to represent 
    a collection of seperate objects as a single entity. The collection framework's root interface is 
    referred to as the collection.
    It has a number of classes and interfaces for representing a collection of indivisual elements as 
    a single unit. The key sub-interfaces are List, Set and Queue. Although the map interface is part
    of the java collection framework, it does not inherit the interface's collection.

    Most significant functions are add(), remove(), clear(), size() and contains().

    Collections: The java.util.package has a utility class called Collections. It defines various 
    utility methods for working with collections, such as sorting and searching.All the methods are static
    These techniques give developers much-needed convenience, allowing them to interact with Collection 
    Framework more successfully. It provides methods like sort() to sort the collection elements in 
    the normal sorting order, and min() and max() to get the minimum and maximum value in the 
    collection elements, respectively.
    
    It is a utility class inside the java.util.package which only has static methods to work 
    with the collections framework.

Hierarchy of collections framework:
// Write a function to parse the below syntax
[Iterable][Collection][List{ArrayList,LinkedList,Vector{Stack}}, Queue[Deque{ArrayDeque}]{PriorityQueue}, Set[SortedSet{TreeSet}]{HashSet,LinkedHashSet}]


What are the advantages of the Collections framework?
ConsistantAPI--> Provides nice out of box features
Cuts Programmer effort--> Concentrate on priority task and not on implementation of collections.
Improves program speed and quality--> State of the art efficiency and actively maintained and improvedby the community.


Explain the various interfaces used in the collection framework
[Iterable][Collection][List{ArrayList,LinkedList,Vector{Stack}},Set[SortedSet{TreeSet}]{HashSet,LinkedHashSet},Queue[deque{ArrayDeque}]{PriorityQueue}]

Difference between array list and linked list in java:
ArrayList and LinkedList store continous data of different types now with support for generics.
ArrayList implements List so it works as list. Both List and Deque are implemented by this class
so it serves as both a list and a deque.
Manipulation takes time in Array List not that it takes less time in Linked Lists.
ArrayList class is moreuseful for data storage and access. LinkedList for data manipulation.

Differentiate between ArrayList and Vector in java: ArrayList-->Not synchronized, Vector--> Synchronized
                                                                Faster                      Slower
                                                                Thread unsafe               Thread Safe
                                                                Growth=size*1.5             Growth=size*2
                                                    
List and Set:
List->Ordered sequence, Duplicate elements allowed, Sequential access, mutiple null values can be stored
Set-> Unordered sequence, Duplicate Elements not allowed, No sequential access, only one null value allowed

Difference between Iterator and List Iterator:
In java collection fromaework iterators are used toobtain elements one by one. It can be used on any tyoe of collection object.
It can be used whenever we want to iterate over elements implementing  Collection. 
List iterator is only available to classes that implement the List interface. It allows reverse iteration feature on the
collection it operates on.

Iterator:   Iterates in only one direction, Cannot be used to obtain indexes, Aids in traversal of Maps, lists and Sets.
            It throws Concurrent modification exception since it cannot addd elements.
            next(), remove() and hasNext() are its functions.

List Iterator:  Iterates in both directions. Can be used to obtain indexes. Aids only in traversal of lists, allows
                addition of elements to lists, next() previous() hasNext() hasPrevious() and add() are some of the 
                list iterator's properties.
                
                
Hashset vs Treeset:

Hashset stores objects withour maintaining order whereas tree set stores objects in order.
The time required for adding, searching and removing items in a Hashset is O(1) where as it is O(log n) for tree sets.
Operations such as floor(), ceiling() ets are also supported by TreeSet. USes the concepts of Red Black tree for its
implementation.

Hashset allows one null value in its keys and multiple null values for values whereas treeset does not allow null values.

Hashset compares two objects ina set with the equals() method where as treeset employs the compareTo() method.
If equals() and compareTo() are not consistant ie. if equals() returns true for two objects but compareTo() returns 0
then the contract of Set interface will be broken allowing duplicates in Set implmentations such as tree set.

Instead of unique elements sorted unique elements are required in tree set. Stores elements in sorted ascending order.

The locality of TreeSet is higher than that of a hash set.

Treeset used the red black tree and is a fantastic data structure for a lot of reads and writes.


Null elemets can be added to hash set but not tree set.


Bets practices using Collection.
Select the appropriate collection.
Specifying the initial capacity of a collection.
Using isEmpty() instead of size() for better readability.
Using iterators insted of loops because Iterators throw concurrent modification exception.
Eliminating unchecked warnings.
prefering generics.



Set vs Map:
Set: Unique keys, Using the keyset() and entryset() methods we can quickly iterate across the set 
Maps: Unique values, Cannot iterate across values. To iterate across values we must convert to set and iterate across.
Both dont keep track of insertion order but some implemetations such as LinkedHashSet, TreeMap and Linked HashMap do
keep track of insertion order.

HashSet vs HashMap:
Implements set inteface whereas the implements Map interface.
Does not allow duplicate values in set where as keys have to unique in map and values can be duplicated.
While adding element it only requires the element as parameter where as map takes both key and values as parameters.
Slower than HashMap.
Set uses the add() method for adding elements whereas Map uses put() method for adding elements.


How to make an ArrayList read only in java?
With the help of Collections.unmodifiableList() method we can make ArrayLists immutable in java.

import java.util.*;
 
public class InterviewBit {
   public static void main(String[] args)
       throws Exception
   {
       try {
 
           // creating object of ArrayList<String>
           List<String> sample_list = new ArrayList<String>();
 
           sample_list.add(“practice”);
           sample_list.add(“solve”);
           sample_list.add(“interview”);
 
           // displaying the initial list
           System.out.println("The initial list is : "
                              + sample_list);
 
           // using unmodifiableList() method
           List<String>
               read_only_list = Collections
                                   .unmodifiableList(sample_list);
 
           // displaying the read-only list
           System.out.println("The ReadOnly ArrayList is : "
                              + read_only_list);
 
           // Trying to add an element to the read-only list
           System.out.println("Trying to modify the ReadOnly ArrayList.");                       
           read_only_list.add(“job”);
       }
 
       catch (UnsupportedOperationException e) {
           System.out.println("The exception thrown is : " + e);
       }
   }
}

There is a utility method in the Collections class called Collections.unmodifiableList() ehich allows us to make Arraylists 
unmodifiable. It should be used inside try and catch block because it throws UnsupportedOperationException.



Hashmap vs TreeMap in java:
Hashmap:    based on hashtables, Map clonable and Serializable interfaces implemented, heterogenous values as keys,
            Quicker than tree map because works in O(1) time, single null key and numerous null values allowed,
            Does not keep track of sorting order
TreeMap:    Based on tree structure, Navigable map, clonable and serializable interfaces implemented, homogenous values as keys
            Works on O(logn), null key not allowed, Elements are arranged in sequence


Why does Map not extend the collection interface?
Map takes key values as parameters where as collections normally just take values.
There are something called collection view procedures on maos that allow us to view them as lists and iterate over them.
We can represent them as lists but a delete opeartion would have to change the index of the keys. This is difficult that is why
Maps don't extend the collections framework.

Why have synchronized ArrayLists when we have vectors?
Vectrs are very slow

RandomAccessInterface is a marker interface to show which collections support random access. A method has fast random access
if its get() method is faster than next() method.

Fail fast vs fail safe:


Comparable vs comparator
Single sorting sequence vs multiple sorting sequences.
Comparable provides compareTo() method whereas comparator provides compare() method
present in java.lang package as opposed to java.util package
Collections.sort(list) ca be used to sort comparable type list members as opposed to Collections.sort(list,comparator)











*/