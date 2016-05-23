import scala.util.matching.Regex

class Bob {

  val shouting:Regex = "([^a-z]*[A-Z]\\d*\\w*[!\\?]?)".r
  val question:Regex = "(.*\\?)".r
  val silence:Regex = "(\\s*)".r

  def hey(statement:String) : String = statement match {
      case shouting(_) => "Whoa, chill out!"
      case question(_) => "Sure."
      case silence(_) =>  "Fine. Be that way!"
      case default => "Whatever."
    }
}