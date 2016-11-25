(ns bob)

(defn- is-shouting? [statment]
  (and (= (.toUpperCase statment) statment)
  (re-find #"[A-Z]+" statment))
)

(defn response-for [statment]
  (cond
    (is-shouting? statment) "Whoa, chill out!"
    :else "Whatever."))
