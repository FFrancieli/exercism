class PhoneNumber(phoneNumber: String) {

  val number: String = getPhoneNumber()

  def getPhoneNumber(): String = {
    val number:String = phoneNumber.filter(_.isDigit)
    number
  }

}
