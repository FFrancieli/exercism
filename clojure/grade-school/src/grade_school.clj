(ns grade-school)

(defn add [database student-name grade]
	(assoc database grade ( vector student-name))
	)

(defn grade [database grade])

(defn sorted [database])