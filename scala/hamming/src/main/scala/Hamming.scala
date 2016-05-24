object Hamming {

  def compute(dnaStrand: String, equivalentDnaStrand:String): Int = {
    if(!sameLenght(dnaStrand, equivalentDnaStrand)) throw new IllegalArgumentException
    dnaStrand.zip(equivalentDnaStrand).count {
      case (charDna, charDnaEquivalent) => charDna != charDnaEquivalent
    }
  }

  def sameLenght(string: String, anotherString: String):Boolean = {
    string.length.equals(anotherString.length)
  }
}
