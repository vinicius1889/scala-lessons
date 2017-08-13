//Partials functions

// with partials
val choose:PartialFunction[Any,String] = {
  case i:Int=>"Number"
  case s:String=>"String"
}

//using common def function
def anotherChoose(a:Any) = a match {
  case i : Int=>"Number"
  case i : String=>"String"
  case _ => "Nothing"
}

choose("hello")
choose(1)

anotherChoose("hello")
anotherChoose(1)



