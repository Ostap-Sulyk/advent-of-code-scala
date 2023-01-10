package year_2015.day1

import scala.io.Source
import scala.util.control.Breaks
import scala.util.control.Breaks._

class Task2 {

  private val fileName = "src/main/scala/year_2015/day1/input.txt"
  private val source = Source.fromFile(fileName)

  private var floor = 0
  private var answer = 0

  private val instructions: List[Int] = source.toList.map {
    case ')' => -1
    case '(' => 1
  }

  private val iterable = new Breaks
  iterable.breakable {
    for (i <- instructions.indices) {
      floor += instructions(i)
      if (floor == -1) {
        answer = i + 1
        iterable.break
      }
    }
  }
  override def toString: String = s"$answer"

}
