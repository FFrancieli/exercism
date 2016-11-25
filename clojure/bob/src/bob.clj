(ns bob
  (:require [clojure.string :as string]))

(defn- is-shouting? [statment]
  (and (= (string/upper-case statment) statment)
  (re-find #"[A-Z]+" statment)))

(defn- is-silence?  [statment]
  (= (string/trim statment) ""))

(defn- is-question? [statment]
  (string/ends-with? statment "?"))

(defn response-for [statment]
  (cond
    (is-shouting? statment) "Whoa, chill out!"
    (is-silence? statment) "Fine. Be that way!"
    (is-question? statment) "Sure."
    :else "Whatever."))
