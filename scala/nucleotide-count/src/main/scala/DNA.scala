case class DNA(nucleotide:String) {

  val nucleotides:List[Char] = List('A', 'C', 'G', 'T')

  validateDNA

  def nucleotideCounts:Map[Char, Int] = {
    nucleotides map (n => n -> nucleotide.split("").count(_ == n.toString)) toMap
  }

  def isDna:Boolean = nucleotide.forall(nucleotides.contains(_))

  def validateDNA = if (! isDna) throw new RuntimeException
}
