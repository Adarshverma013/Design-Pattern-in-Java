# Structural Design Pattern

---

### Composite

1. When we need to represent heirarchy of objects
2. Group
   1. Group1
      1. Square1
      2. Square2
   2. Group2
      1. Circle1
      2. Circle2
3. Just like we have file system, a folder can contain files and folders <br> if we delete the folder all files and folders in it will be deleted

* A Component Interface having a render() method Implemented by <br>
    Leaf class and Composite class which has  (has a) relationship with Component

### Adapter

_Using this pattern we can convert an interface of an object into a different form_

The adapter implements the interface that is expected as input and then it calls the
other class method.

This pattern is used to support our client to talk to a legacy code.

### Bridge



### Decorator



### Facade



### Flyweight

### Proxy