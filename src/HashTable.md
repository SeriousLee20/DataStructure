### Hash Table

* key => value lookup
* EG: 
    * name(String) => person(object)
    
---
* store objects in an array
    * hashcode: take String, convert to int, remap int to index in array

* some diff things can hv same hashcode
=> so may hv same index
    * collision
    * got many solutions
        * EG: store in linked list

---

````

class HashTable{
    
    //an array of linked list of person objects
    LinkedList[] data
    
    boolean put(String key, Person value){
    
        int hashcode = getHashCode(key)
        int index = convertToIndex(hashCode)
        LinkedList list = data[index];
        list.insert(key, value)
       
     } 
}
````