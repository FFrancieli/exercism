(ns nucleotide-count)

(defn count [necleotide dna-sequence] 
	(get (frequencies dna-sequence) necleotide 0))


(defn nucleotide-counts [dna-sequence])