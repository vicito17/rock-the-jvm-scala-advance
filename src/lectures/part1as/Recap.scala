package lectures.part1as

import scala.annotation.tailrec

object Recap extends App {

  val aCondition: Boolean=false
  val aConditionedVal = if(aCondition) 42 else 65
  // instructions vs expressions

  val aCodeBlock = {
    if(aCondition) 54
    56
  }

  // Unit
  val theUnit = println("Hello, Scala")

  @tailrec def factorial(n:Int, accum: Int): Int={
    if (n-1<=0) accum
    else factorial(n-1,accum*n)
  }

  class Animal
  class Dog extends Animal
  val aDog: Animal = new Dog

  trait Carnivore {
    def eat(a: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore {
    override def eat(a: Animal): Unit = println("crunch!")
  }

  val aCroc = new Crocodile
  aCroc.eat(aDog)
  aCroc eat aDog
}
