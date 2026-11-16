case class Professor(name: String)
case class Student(name: String)


def einladung[T](personen: List[T], event: String): Unit = 
     personen.foreach {
        case Professor(name) => println(s"Sehr geehrter Herr Professor $name, Sie sind herzlich eingeladen zu $event.")
        case Student(name) => println(s"Liebe/r Student/in $name, Sie sind herzlich eingeladen zu $event.")
        case _ => println("Unbekannte Person")
     }


def main(args: Array[String]): Unit =

    val eingeladenePersonen: List[Any] = List(  //Typ any sonst müsse ich ein Obertyp von den beiden Klassen erstellen, hatte aber kein bock dazu
        Professor("Professor Aich"),
        Student("Anna"),
        Professor("Dr. Dofenschmirtz"),
        Student("Max")
    )

    val eventName: String = "Ersti Hütte"

    einladung(eingeladenePersonen, eventName)

