/**
  * Created by Jeremy on 12/20/16.
  */

import scala.io.StdIn.{readLine, readInt}

import Person.Person


object ScalaTutorial {

  def main(args: Array[String]): Unit = {

    var person = new Person(ask("What is your first name?"), ask("What is your last name?"), askInt("What is your age?"), ask("What is your email address?"));

    person.sayName();
  }

  def ask(question:String):String = {

    println(question);

    val answer = readLine();

    answer;
  }

  def askInt(question:String):Int = {

    println(question);
    try {
      val answer = readLine().toInt;
      answer;
    } catch {
      case e:Exception => {
        println("Age must be a number.");
        askInt(question);
      }

    }



  }

}