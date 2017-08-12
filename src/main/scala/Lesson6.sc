//utils in collections
val arr = Array.fill[Double](10)(Math.random())
//printing all items
arr.foreach(println)

val arr2 = Array(1,2,3)
arr2.map(println)

//*2 all items
arr2.map(_*2)
//same thing
arr2.map( (a) => a*2)
//get last item
arr2.last
//get the sum
arr2.sum



val items1 = Array(1,3)
val items2 = Array(2,4)
//match all items
items1.zip(items2)
//match all items and define a default in else case
items1.zipAll(items2 , "missing" ,5)

//join all items
val items3 = items1++:items2

//filter all items in case condition
items3.filter(_<2)
//using map again
items3.map(_*3)
//showing flat map that return all items in "flat mode"
items3.flatMap((a)=>List(a*3))
























