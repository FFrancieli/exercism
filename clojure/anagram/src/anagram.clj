(ns anagram
  (:require [clojure.string :as string]))

(defn- contains-exactly-same-letters? [word possible-anagram]
  (= (sort word) (sort possible-anagram)))

(defn- same-word? [word word-to-compare]
  (= word word-to-compare))

(defn- anagram? [word possible-anagram]
  (let [lower-case-possible-anagram (string/lower-case possible-anagram)
        lower-case-word (string/lower-case word)]

    (and (not (same-word? lower-case-word lower-case-possible-anagram))
         (contains-exactly-same-letters? lower-case-word lower-case-possible-anagram))))

(defn anagrams-for [word word-list]
  (filter (partial anagram? word) word-list))
