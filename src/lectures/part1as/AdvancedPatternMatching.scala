package lectures.part1as

object AdvancedPatternMatching extends App {

  val numbers = List(1)
  val description = numbers match {
  case head :: Nil => println(s"La lista esta constituida por el valor $head")
  case _ =>
  }

  class Person(val nombre: String, val edad: Int)

  object Person{
    def unapply(person: Person): Option[(String,Int)]  =
      if(person.edad<21) None
      else Some((person.nombre, person.edad))

    def unapply(age: Int): Option[String] =
      Some(if(age <21) "menor" else "adulto")

  }

  val bob = new Person("Bob", 25)
  val greeting = bob match {
  case Person(n,e) => s"Hola, mi nombre es $n y tengo $e años."
  }
  println(greeting)

  val leggalStatus = bob.edad match {
    case Person(status) => s"Mi estado legal es $status"
  }
  println(leggalStatus)
}
