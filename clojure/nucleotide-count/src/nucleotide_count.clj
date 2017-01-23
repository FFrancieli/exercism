(ns nucleotide-count)

(def ^:private nucleotides (list \A \C \G \T))

(def ^:private empty-nucleotide-counter (zipmap nucleotides (repeat 0)))

(defn nucleotide-counts [dna-sequence]
	(merge empty-nucleotide-counter (frequencies dna-sequence)))

(defn- valid-nucleotide? [nucleotide] ( = nucleotide (some #{nucleotide} nucleotides)))

(defn count [necleotide dna-sequence]
	(cond
		(valid-nucleotide? necleotide) (get (nucleotide-counts dna-sequence) necleotide)
		:else (throw (Exception. "Invalid nucleotide")))
	) 