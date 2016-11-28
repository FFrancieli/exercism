(ns word-count
  (:require [clojure.string :as string]))

(defn- list-of-words [phrase]
  (filter #(not (empty? %)) (string/split phrase #"\W"))
)

(defn word-count [phrase]
  (frequencies (list-of-words (string/lower-case phrase)))
)
