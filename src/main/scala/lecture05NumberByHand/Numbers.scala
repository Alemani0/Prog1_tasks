def factorial(n: BigInt): BigInt =
  if n <= 1 then 1 else n * factorial(n - 1)

def main(args: Array[String]): Unit =
  
  println(s"51966.toBinaryString = ${51966.toBinaryString}")
  println(s"51966.toHexString = ${51966.toHexString}\n")

  println(s"Int.MaxValue = ${Int.MaxValue}")
  println(s"Int.MaxValue + 1 = ${Int.MaxValue + 1}\n")

  println(s"0.1 + 0.2 = ${0.1 + 0.2}")
  println(s"0.1 + 0.2 == 0.3 ? ${0.1 + 0.2 == 0.3}\n")

  println("4. Factorial von 25:")
  println(s"factorial(25) = ${factorial(25)}\n")

  println("5. Range zu List:")
  println(s"(1 to 20 by 4).toList = ${(1 to 20 by 4).toList}")

