class Bob {
  def hey(statement:String) : String = {
    if (containsOnlyUpperCaseLetters(statement)){
      return "Whoa, chill out!"
    }
    "Whatever."
  }

  def containsOnlyUpperCaseLetters(statement:String): Boolean ={
    statement.toUpperCase == statement
  }
}