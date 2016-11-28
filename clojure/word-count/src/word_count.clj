(ns word-count
  (:require [clojure.string :as string]))

(defn- remove-blank-items-in[words-list]
  (filter #(not (empty? %)) words-list))

(defn- generate-list-of-words [phrase]
  (remove-blank-items-in (string/split phrase #"\W")))

(defn word-count [phrase]
  (frequencies (generate-list-of-words (string/lower-case phrase))))
