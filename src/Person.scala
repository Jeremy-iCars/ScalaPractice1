/**
  * Created by Jeremy on 12/20/16.
  */

package Person

class Person(firstName:String, lastName:String, age:Int, email:String) {

  def main(args:Array[String]): Unit = {

  }

  def speak(speech:String): String = {
    print(speech);
    speech match {
      case _ => "..."

      case default => {
        println(speech);

        speech
      }
    }

  }

  def sayAge(): String = {

    speak("My age is " + age);
  }

  def sayName(): String = {

    speak("My name is " + firstName + " " + lastName + ".");
  }

  def saySig():String = {

    speak("You can email me at " + email);
  }
}
