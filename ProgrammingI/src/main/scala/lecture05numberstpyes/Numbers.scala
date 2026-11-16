// Number Examples - Vergleich der Ergebnisse

def factorial(n: BigInt): BigInt =
  if n <= 1 then 1 else n * factorial(n - 1)

def main(args: Array[String]): Unit =
  println("=== Number Examples ===\n")

  // 1. Binary und Hex String
  println("1. Binary und Hex String:")
  println(s"51966.toBinaryString = ${51966.toBinaryString}")
  println(s"51966.toHexString = ${51966.toHexString}\n")

  // 2. Int Overflow
  println("2. Int Overflow:")
  println(s"Int.MaxValue = ${Int.MaxValue}")
  println(s"Int.MaxValue + 1 = ${Int.MaxValue + 1}\n")

  // 3. Floating Point Problem
  println("3. Floating Point Precision:")
  println(s"0.1 + 0.2 = ${0.1 + 0.2}")
  println(s"0.1 + 0.2 == 0.3 ? ${0.1 + 0.2 == 0.3}\n")

  // 4. Factorial von 25 als BigInt
  println("4. Factorial von 25:")
  println(s"factorial(25) = ${factorial(25)}\n")

  // 5. Range zu List
  println("5. Range zu List:")
  println(s"(1 to 20 by 4).toList = ${(1 to 20 by 4).toList}")
