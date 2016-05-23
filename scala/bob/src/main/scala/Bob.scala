class Bob {
  def hey(statement:String) : String = {
    if (containsOnlyUpperCaseLetters(statement)){
      return "Whoa, chill out!"
    } else if(isQuestion(statement)){
      return "Sure."
    }
    "Whatever."
  }

  def containsOnlyUpperCaseLetters(statement:String): Boolean ={
    statement.toUpperCase == statement
  }

  def isQuestion(statement:String): Boolean ={
    statement.endsWith("?")
  }
}