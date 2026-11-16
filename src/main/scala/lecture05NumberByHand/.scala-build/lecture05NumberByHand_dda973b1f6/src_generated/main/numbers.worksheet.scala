

final class `numbers$u002Eworksheet$_` {
def args = numbers$u002Eworksheet_sc.`args$`
def scriptPath = """numbers.worksheet.sc"""
/*<script>*/
51966.toBinaryString
51966.toHexString

Int.MaxValue + 1
0.1 + 0.2

def factorial(n: BigInt): BigInt =
  if n <= 1 then 1 else n * factorial(n - 1)

factorial(25)

(1 to 20 by 4).toList

/*</script>*/ /*<generated>*//*</generated>*/
}

object numbers$u002Eworksheet_sc {
  private var `args$opt0` = Option.empty[Array[String]]
  def `args$set`(args: Array[String]): Unit = {
    `args$opt0` = Some(args)
  }
  def `args$opt`: Option[Array[String]] = `args$opt0`
  def `args$`: Array[String] = `args$opt`.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `numbers$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    `args$set`(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export numbers$u002Eworksheet_sc.script as `numbers.worksheet`

