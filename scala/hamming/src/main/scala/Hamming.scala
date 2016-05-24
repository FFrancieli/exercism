object Hamming {

  def compute(dnaStrand: String, equivalentDnaStrand:String): Int = {
    if(differentLenght(dnaStrand, equivalentDnaStrand)) throw new IllegalArgumentException

    dnaStrand.zip(equivalentDnaStrand).count {
      case (charDna, charDnaEquivalent) => charDna != charDnaEquivalent
    }
  }

  def differentLenght(string: String, anotherString: String):Boolean = {
    string.length != anotherString.length
  }
}
