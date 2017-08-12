// If

val nome = "vinicius"

if(nome=="vinicius")
    println("Hello Vinicius")
else
    println("I never know why")

if(nome.equalsIgnoreCase("vInIciUs")){
  println("Hello with ignore case")
}

// Match
val a  = 12;


//default
a match {
    case 0 => "Your number is 0"
    case 1 => "Your number is 1"
    case _ => "Your number do not fit in our match"
}
//We have to put _ for general proporse


// two conditions
(a,0) match {
    case (0,0) => "Now we have two conditions (0,0)"
    case _ => "Default condition"
}


// with value (I know... should avoid that, but just for didatic subject )
val condition = 1989
var input = 2017
input match {
  case `condition` => "Condition was correct filled"
  case _ => "Default condition"
}
// We must use (`) in variable condition

