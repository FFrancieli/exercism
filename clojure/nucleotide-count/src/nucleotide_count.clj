(ns nucleotide-count)

(def nucleotides (list \A \C \G \T))

(defn count [necleotide dna-sequence] 
	(get (frequencies dna-sequence) necleotide 0))


(defn nucleotide-counts [dna-sequence]
	(merge (zipmap nucleotides (repeat 0)) (frequencies dna-sequence) ))
	