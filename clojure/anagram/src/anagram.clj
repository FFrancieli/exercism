(ns anagram
  (:require [clojure.string :as string]))

(defn- is-anagram? [word possible-anagram]
  (cond
    (= word possible-anagram) false
    (= (sort word) (sort possible-anagram)) true))

(defn anagrams-for [word word-list]
  (filter (fn [possible-anagram]
            (is-anagram? word possible-anagram)) word-list))
