

final class `checkanswer$u002Eworksheet$_` {
def args = checkanswer$u002Eworksheet_sc.`args$`
def scriptPath = """checkanswer.worksheet.sc"""
/*<script>*/
77.toBinaryString
200.toBinaryString
-77.toBinaryString.takeRight(8)
Int.MaxValue + 1
0.1 + 0.2
200.toByte
(1 to 20 by 4).toList
/*</script>*/ /*<generated>*//*</generated>*/
}

object checkanswer$u002Eworksheet_sc {
  private var `args$opt0` = Option.empty[Array[String]]
  def `args$set`(args: Array[String]): Unit = {
    `args$opt0` = Some(args)
  }
  def `args$opt`: Option[Array[String]] = `args$opt0`
  def `args$`: Array[String] = `args$opt`.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `checkanswer$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    `args$set`(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export checkanswer$u002Eworksheet_sc.script as `checkanswer.worksheet`

