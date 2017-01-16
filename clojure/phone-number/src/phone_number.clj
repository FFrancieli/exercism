(ns phone-number
	(:require [clojure.string :as string]))

(def invalid-phone-number "0000000000")

(defn- remove-first-digit [phone-number]
	(subs phone-number 1))

(defn- ten-digits-number? [phone-number]
	(= 10 (count phone-number)))

(defn- eleven-digits-number? [phone-number]
	(= 11 (count phone-number)))

(defn- starts-with-one? [phone-number]
	(= '\1 (first phone-number)))

(defn- valid-eleven-digits? [phone-number]
	(and (eleven-digits-number? phone-number) (starts-with-one? phone-number)))

(defn- clear [phone-number] 
	 (string/replace phone-number #"\D" ""))

(defn number [phone-number] 
	(let [clean-phone-number (clear phone-number)]

		(cond
			(ten-digits-number? clean-phone-number) clean-phone-number
			(valid-eleven-digits? clean-phone-number) (remove-first-digit clean-phone-number)
			:else invalid-phone-number)))

(defn area-code[phone-number]
	(subs (number phone-number) 0 3))

(defn pretty-print [phone-number]
	(let [phone-number (number phone-number)]
		(format "(%s) %s-%s" (area-code phone-number) (subs phone-number 3 6) (subs phone-number 6))))