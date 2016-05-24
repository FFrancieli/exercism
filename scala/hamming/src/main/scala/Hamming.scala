object Hamming {
  def compute(dnaStrand: String, equivalentDnaStrand:String): Int ={
    dnaStrand.zip(equivalentDnaStrand).count{
      case (charDna, charDnaEquivalent) => charDna != charDnaEquivalent
    }
  }

}
