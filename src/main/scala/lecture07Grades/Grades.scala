
def main(args: Array[String]): Unit =
  
  val arrtest: Array[Double] = Array(2.3, 1.7, 3.0, 1.0, 2.7, 5.0, 1.3) // Radnom Noten in array init.

  // mutable variablen 
  var sumA: Double = 0.0
  var bestA: Double = arrtest(0)
  var worstA: Double = arrtest(0)
  var failedA: Int = 0

  // linear search, um mithilfe von den globalen variablen die noten zu analysieren
  for (i <- 0 until arrtest.length)
    sumA = sumA + arrtest(i)  //summe
    if arrtest(i) < bestA then bestA = arrtest(i) //wird stellenweise die beste note gefunden
    if arrtest(i) > worstA then worstA = arrtest(i) //wird stellenweise die schlechteste note gefunden

  // Generator erhält noch eine Bedingung, um die nicht bestandenen Noten zu zählen
  for (i <- 0 until arrtest.length if arrtest(i) > 4.0)
    failedA = failedA + 1

  val averageA: Double = sumA / arrtest.length

  println("Array Teil:")
  println(s"Anzahl Noten: ${arrtest.length}")
  println(f"Notendurchschnitt: $averageA%.2f")
  println(s"Beste Note: $bestA")
  println(s"Schlechteste: $worstA")
  println(s"Nicht bestanden: $failedA\n")


  //erstellen einer Liste mit rndm Noten
  val listtest: List[Double] = List(3.3, 2.0, 4.0, 1.7, 2.3, 3.7)

  var sumL: Double = 0.0
  var bestL: Double = listtest.head
  var worstL: Double = listtest.head

  for (grade <- listtest)
    sumL = sumL + grade
    if grade < bestL then bestL = grade
    if grade > worstL then worstL = grade

    
  val averageL: Double = sumL / listtest.length


  println("List Teil:")
  println(s"Anzahl Noten: ${listtest.length}")
  println(f"Notendurchschnitt: $averageL%.2f")
  println(s"Beste Note: $bestL")
  println(s"Schlechteste: $worstL")
