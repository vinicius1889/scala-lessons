//recursive functions

def factorial(num: Int): Int = {
   if(num==1) return 1
   num*factorial(num-1)
}

//5*4*3*2*1
factorial(5)

//but factorial with hige amount will show a error

import scala.annotation.tailrec

def tailRecFactorial(num:Long) : BigInt= {

    @tailrec
    def subTailRec(subNum:BigInt, sum:BigInt) : BigInt =  {
      if(subNum==1) return sum
      subTailRec(subNum-1,sum*subNum);
    }
    subTailRec(num,1);
}

tailRecFactorial(256)


