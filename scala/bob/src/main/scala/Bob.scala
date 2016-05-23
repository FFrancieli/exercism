import java.beans.Statement

class Bob {
  def hey(statement:String) : String = {
    if (itIsOnlyUpperCase(statement) && containsLetter(statement)){
      return "Whoa, chill out!"
    } else if(isQuestion(statement)){
      return "Sure."
    } else if(statement.trim.isEmpty){
      return "Fine. Be that way!"
    }
    "Whatever."
  }

  def itIsOnlyUpperCase(statement:String): Boolean = {
    statement.toUpperCase == statement
  }

  def containsLetter(statement: String): Boolean = {
    statement.matches(".*[A-Z].*")
  }

  def isQuestion(statement:String): Boolean = {
    statement.endsWith("?")
  }
}