### Solution

* Right now we have two classes shape and Group
* Shape has one method render()
* Group has List of Objects and one render method and one add method

**To solve the problem we will take the common things between these two classes
and put it in one class**

* Both have a common method render()
* We create one common Interface called Component having a render() method
* Both classes will implement this interface
* Group class will have List of Components

**Now since Shape is a Component and Group also is a Component we no longer need to 
check the instance type and typecast it.**

_We use this pattern whenever we want to represent a heirarchy and we want to treat
the objects of this heirarchy in the same way._