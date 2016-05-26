class Phrase(phrase: String){


	def wordCount: scala.collection.immutable.Map[String,Int] = {

		listDistinctWords() map (word => word -> count(word)) toMap
	}

	def count(string: String): Int = {
		listOfWordsInPhrase().count(_ == string)
	}

	def listOfWordsInPhrase(): Array[String] ={
		phraseWithoutPunctuation.toLowerCase.split(" ")
	}

	def phraseWithoutPunctuation: String = {
		phrase.replaceAll("[^a-zA-Z ]", "").replace("  ", " ")
	}

	def listDistinctWords(): Array[String] = {
		listOfWordsInPhrase().distinct
	}
}