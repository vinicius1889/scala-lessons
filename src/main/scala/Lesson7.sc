case class Car(model:String,brand:String)

val car1 = Car("model1","brand1")
val car2 = Car("model2","brand2")
val cars = List(car1,car2)

//ok
car1==car2
// equal using == operator
car1==Car("model1","brand1")

val car3 = car1.copy(model="model 1 changed")
//wont compile, case classes cannot be changed
//car1.brand="anther brand"

car3==car1
//length of properties
car3.productArity
//get an item in specific position
car3.productElement(0)









