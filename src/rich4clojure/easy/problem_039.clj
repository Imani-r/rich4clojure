(ns rich4clojure.easy.problem-039
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Interleave Two Seqs =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs core-functions]
;; 
;; Write a function which takes two sequences and returns
;; the first item from each, then the second item from
;; each, then the third, etc.

(def restricted [interleave])

(defn my-interleave [coll1 coll2]
   (mapcat (fn [a b] (vector a b)) coll1 coll2))

(comment
  (lazy-seq)
  (apply concat (map (fn [a b] (vector a b)) [1 2 3] [:a :b :c]))
  
  (mapcat (fn [a b] (vector a b)) [1 2 3] [:a :b :c])
  )


(tests
 (my-interleave [1 2 3] [:a :b :c]) := '(1 :a 2 :b 3 :c)
 (my-interleave [1 2] [3 4 5 6]) := '(1 3 2 4)
 (my-interleave [1 2 3 4] [5]) := [1 5]
 (my-interleave [30 20] [25 15]) := [30 25 20 15])

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/65d3ee0ffa567e78927bbebbb9d9cc89