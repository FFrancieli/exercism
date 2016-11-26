(ns rna-transcription)

(def dna-to-rna {
  \G \C
  \C \G
  \T \A
  \A \U
})

(defn to-rna [dna-strand]
  (apply str (map #(get dna-to-rna %) dna-strand)))
