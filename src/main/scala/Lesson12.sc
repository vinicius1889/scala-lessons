
def someBody(name: =>String)(body: =>Unit) : Unit = {
  println(name)
  body
}

someBody("vinicius"){
   println("Inside a body")
}

def anotherWhile(isval: => Boolean)(body: =>Unit) : Unit = {
  if(isval){
    body
    anotherWhile(isval)(body)
  }
}
var i = 0
anotherWhile(i<10){
    println("printing "+i)
    i+=1
}

