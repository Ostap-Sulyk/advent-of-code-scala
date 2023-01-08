package year_2015.day1

import scala.io.Source

class Task1() {

  private val fileName = "src/main/scala/year_2015/day1/input.txt"
  private val source = Source.fromFile(fileName)
  private val answer = source.toList.map {
    case ')' => -1
    case _ => 1
  }.sum

  override def toString: String = s"$answer"

}
