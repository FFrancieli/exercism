class Phrase(phrase: String){

	def wordCount: scala.collection.immutable.Map[String,Int] = {
		phrase.split(" ") map (word => word -> 1) toMap 
	}
}