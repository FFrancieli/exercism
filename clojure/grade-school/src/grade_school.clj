(ns grade-school)

(defn add [database student-name grade]
	(update-in database [grade] (comp vec conj) student-name))

(defn grade [database grade]
	(database grade []))

(defn sorted [database]
	(into {} (map (fn [[grade students]] [grade (sort students)]) (sort-by key database))))