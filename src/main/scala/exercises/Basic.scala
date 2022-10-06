package exercises

object Basic {

  def sum_two_numbers(): Double = {
    /*
    Write a Scala program to compute the sum of the two given
    integer values. If the two values are the same, then
    return triples their sum.
     */
    val num1: Int = scala.io.StdIn.readLine("Give me first number: ").toInt
    val num2: Int = scala.io.StdIn.readLine("Give me second number: ").toInt
    if (num1 == num2) {

      num1 * num1 * num1
  } else {
      num1 + num2
    }
  }

  def calculate_abs_difference() : Double = {
    /*
    Write a Scala program to get the absolute difference
    between n and 51. If n is greater than 51 return triple
    the absolute difference.
     */
    val num1: Int = scala.io.StdIn.readLine("Give me a number: ").toInt
    val set_number: Int = 51
    val result = (num1 - set_number).abs

    if (num1 > set_number) {
      val triple_difference = 3 * result

      triple_difference

    } else {
      result
    }
  }

  def look_for_30(): Boolean = {
    /*
    Write a Scala program to check two given integers,
    and return true if one of them is 30 or if their sum is 30.
     */
    val num1: Int = scala.io.StdIn.readLine("Give me first number: ").toInt
    val num2: Int = scala.io.StdIn.readLine("Give me second number: ").toInt

    if (num1 + num2 == 30 || num1 == 30 || num2 == 30) {
       true

    } else {
       false

    }

  }

  def if_function(): String = {
    /*
    Write a Scala program to create a new string where 'if'
    is added to the front of a given string. If the string
    already begins with 'if', return the string unchanged.
     */
    val word: String = scala.io.StdIn.readLine("Give me word: ").toString

    if (word.startsWith("if")) {
      word
    } else {
      "if" + word
    }



  }


  def remove_char_from_str(): String = {
    /*
     Write a Scala program to remove the character in a
     given position of a given string. The given position will
      be in the range 0...string length -1 inclusive.
     */

    val string1 = scala.io.StdIn.readLine("Give me one word: ").toString
    val index = scala.io.StdIn.readLine("Give me index to remove: ").toInt

    val char_to_remove = string1(index).toString
    string1.replace(char_to_remove, "")
  }


  def replace_first_last() : String = {
    /*
     Write a Scala program to exchange the first and last
     characters in a given string and return the new string
     */
    val given_string = scala.io.StdIn.readLine("Give me one word: ").toString
    val middle_string = given_string.slice(1, given_string.length-1)
    val result = (given_string(given_string.length -1).toString + middle_string + given_string(0).toString)
    result


  }

  def foour_copies_or_normal(): String = {
    /*
    Write a Scala program to create a new string
    which is 4 copies of the 2 front characters of a
    given string.If the given string length is less than
    2 return the original string.
     */
    val given_string = scala.io.StdIn.readLine("Give me one word: ").toString
    if (given_string.length > 2) {
      given_string.slice(0,2) * 4
    } else {
      given_string
    }

  }

  def return_new_string_with_last_char(): String = {
    /*
    Write a Scala program to create a new string with the
    last char added at the front and back of a given
    string of length 1 or more.
     */

    val input = scala.io.StdIn.readLine("Enter string or char: ").toString
    val last_char = input.takeRight(1).toString
    last_char + input + last_char

  }


  def main(args: Array[String]): Unit = {
//    println("Hello, world") First Task
//    println(sum_two_numbers()) Second Task
//    println(calculate_abs_difference()) Third Task
//    println(look_for_30()) Fourth Task
//    println(if_function()) Fifth Task
//    println(remove_char_from_str()) Sixth Task
//    println(replace_first_last()) Seventh Task
//    println(foour_copies_or_normal()) Eight Task
//    println(return_new_string_with_last_char()) // Ninth Task


  }

}
