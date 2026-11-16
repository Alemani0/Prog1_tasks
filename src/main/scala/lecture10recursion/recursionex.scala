def digitSum(n : Int): int = {
    if (n < 10) {
        return n
    } else {
        return n % 10 + digitSum(n / 10)
    }
     
}

def max(xs: List[Int]): Int = {
    xs match {
        case head :: Nil => head
        case x :: y :: tail => max((if (x >= y) x else y) :: tail)
        case Nil => throw new IllegalArgumentException("leere liste")
    }
}

def power(x: Double, k:Int): Double = {
    k match
        case 0               => 1
        case b if b > 0      => x * power(x,b-1)
        case _               => (1 / x) * power(x,n+1)
}

def sumTo(n: Int): Int = {
    n match {
        case 0 => 0
        case n if n > 0 => n + sumTo(n - 1)
        case _ => throw new IllegalArgumentException("negative zahl")
    }
}

def sumToTail(n: Int, acc: Int) : Int = { if n == 0 then acc else sumToTail(n-1,acc+n) }

def lengthTail(xs : List[Any], acc: Int) : Int = {
    xs match
        case _ :: next => lengthTail(next,acc+1) 
        case Nil => acc
    
} 


def isPalindrom(s: String): Boolean = {
    
}