class PhoneNumber(phoneNumber: String) {

  val number: String = getPhoneNumber()

  def getPhoneNumber(): String = {
    val number:String = phoneNumber.filter(_.isDigit)

    if (isValidNumber(number)) number.tail else number
  }

  def isValidNumber(number:String): Boolean = number.length == 11 && number.take(1).equals("1")

}
