(ns word-count
  (:require [clojure.string :as string]))

(defn- list-of-words [phrase]
  (string/split phrase #" ")
)

(defn word-count [phrase]
  (frequencies (list-of-words phrase))
)
