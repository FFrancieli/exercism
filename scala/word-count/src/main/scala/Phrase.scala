class Phrase(phrase: String){
	
	def wordCount: scala.collection.immutable.Map[String,Int] = {

		listOfWordsInPhrase().groupBy(identity).mapValues(value => value.length)
	}

	def listOfWordsInPhrase(): Array[String] ={
		phrase.toLowerCase().split("[^\\w']").filterNot(_.isEmpty)
	}
}