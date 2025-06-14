(ns rich4clojure.easy.problem-030
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Compress a Sequence =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs]
;; 
;; Write a function which removes consecutive duplicates
;; from a sequence.

(defn this-dedupe [a]
 (map first (partition-by identity a)))

(comment
  (def a [1 1 2 3 3 3 2 2 3])
  (->> a
       (partition-by identity ,,,)
       (map first ,,,)
       ) 

  )

(tests
  (apply str (this-dedupe "Leeeeeerrroyyy")) := "Leroy"
  (this-dedupe [1 1 2 3 3 2 2 3]) := '(1 2 3 2 3)
  (this-dedupe [[1 2] [1 2] [3 4] [1 2]]) := '([1 2] [3 4] [1 2]))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/92a4bd13aaa6bffb80d7724de2c8e64d