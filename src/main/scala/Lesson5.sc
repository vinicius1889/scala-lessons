//arrays and lists

//Array

val arr = Array(1,2,3)
//get item... in scala we use ever () not [] like java
arr(0)
arr(0) = arr(0)*42
arr(0)

val myArr =  new Array[Int](100)
myArr

val arr2 = Array.fill(100)(null)







//List

val myList =  List("name1","name2","name3")
myList(0)
//we cannot change this value in a immutable list
//myList(0) = "name 1 changed"
"name4"::myList
//my list still with same objects
myList
//but not now
val myListPrepended = "my name now" :: myList
myListPrepended(0)


