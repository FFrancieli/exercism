(ns bob)

(defn- is-shouting? [statment]
  (and (= (.toUpperCase statment) statment)
  (re-find #"[A-Z]+" statment))
)

(defn- is-silence?  [statment]
  (= (.trim statment) "")
)

(defn- is-question? [statment]
  (.endsWith statment "?")
)

(defn response-for [statment]
  (cond
    (is-shouting? statment) "Whoa, chill out!"
    (is-silence? statment) "Fine. Be that way!"
    (is-question? statment) "Sure."
    :else "Whatever."))
