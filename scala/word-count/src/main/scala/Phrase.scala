class Phrase(phrase: String){

	def wordCount: scala.collection.immutable.Map[String,Int] = {
		listDistinctWords() map (word => word -> count(word)) toMap
	}

	def count(word: String): Int = {
		listOfWordsInPhrase().count(_ == word)
	}

	def listOfWordsInPhrase(): Array[String] ={
		phrase.split(" ")
	}

	def listDistinctWords(): Array[String] = {
		listOfWordsInPhrase().distinct
	}
}