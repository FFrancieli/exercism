(ns anagram
  (:require [clojure.string :as string]))

(defn- contains-exactly-same-letters? [word possible-anagram]
  (= (sort word) (sort possible-anagram)))

(defn- same-word? [word word-to-compare]
  (= word word-to-compare))

(defn- anagram? [word possible-anagram]
  (and (not (same-word? word possible-anagram))
       (contains-exactly-same-letters? word possible-anagram)))

(defn anagrams-for [word word-list]
  (filter (fn [possible-anagram]
            (anagram? (string/lower-case word)
                      (string/lower-case possible-anagram)))
          word-list))
