(ns nucleotide-count)

(def ^:private nucleotides (list \A \C \G \T))

(defn nucleotide-counts [dna-sequence]
	(merge (zipmap nucleotides (repeat 0)) (frequencies dna-sequence)))

(defn count [necleotide dna-sequence] 
	(get (nucleotide-counts dna-sequence) necleotide))