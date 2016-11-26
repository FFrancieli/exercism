(ns rna-transcription)

(def dna-to-rna {
  \G \C
  \C \G
  \T \A
  \A \U
})

(defn- is-valid? [nucleotide]
  (contains? dna-to-rna nucleotide))

(defn to-rna [dna-strand]
  (apply str (map
    (fn [nucleotide]
      (assert (is-valid? nucleotide))
      (get dna-to-rna nucleotide)
    )
  dna-strand)
))
