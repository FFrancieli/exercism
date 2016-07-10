class DNA(nucleotide:String) {

  val nucleotides:List[Char] = List('A', 'C', 'G', 'T')

  def nucleotideCounts:Map[Char, Int] = nucleotides map (n => n -> nucleotide.split("").count(_ == n.toString)) toMap

}
