package Inheritance

/*

Scala does not allow for multiple inheritance from more
than one classes.

Concept of interface is needed to understand why we need
traits, in languages as C ++ or Python they no exists,
because they have multiple inheritance.

Traits in scala are partianlly implemented interafaces.

To define trait, you use keyword trait.
Traits may contain abstract and non-abstract method.
Trait must has at least one abstract method.

You can avoid using override keyword in subclasses
when using traits




 */


abstract class Polygon {
  def area: Double;

}

trait Shape {
  def color: String;

}


object Polygon {
  def main(args: Array[String]): Unit = {

    var rect = new Rectangle(55.2, 20.0);
    var triangle = new Triangle(20, 10)
    println(triangle.color)
    println(rect.color)
  }

  def printArea(p: Polygon): Unit = {
    println(p.area)
  }

}