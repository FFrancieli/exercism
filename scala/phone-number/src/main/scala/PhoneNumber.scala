class PhoneNumber(phoneNumber: String) {

  val number:String = formatPhoneNumber
  val areaCode:String = number take 3

  def formatPhoneNumber = phoneNumber.filter(_.isDigit) match {
    case num if num.length == 10 => num
    case num if isValidNumber(num) => num tail
    case _ => "0000000000"
  }

  def isValidNumber(number:String): Boolean = number.length == 11 && number.take(1).equals("1")

  override def toString = s"($areaCode) ${number.substring(3, 6)}-${number.takeRight(4)}"

}
