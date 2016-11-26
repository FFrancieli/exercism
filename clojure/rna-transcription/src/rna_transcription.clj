(ns rna-transcription)

(def dna-to-rna {
  \G \C
  \C \G
  \T \A
  \A \U
})

(defn- is-valid? [nucleotide]
  (contains? dna-to-rna nucleotide))

(defn- convert-dna-to-rna [dna-strand]
  (map
    (fn [nucleotide]
      (assert (is-valid? nucleotide))
      (get dna-to-rna nucleotide)
    ) dna-strand)
)

(defn to-rna [dna-strand]
  (apply str (convert-dna-to-rna dna-strand)))
