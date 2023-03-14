_Using this pattern we can convert an interface of an object into a different form_
## Problem
***********************

* Here we have only one filter
* Let say we have a 3rd party library which have many cool filters.
* But interface of that filter class does not match our Filter interface <br> which is 
    expected in our applyFilter() method
* This is where adapter pattern comes in.



## Solution
******************

* We create one adapter class which converts the 3rd party <br>
    library in a suitable form
