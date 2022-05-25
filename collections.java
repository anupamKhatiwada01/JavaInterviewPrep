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








*/