(ns rich4clojure.easy.problem-023
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Reverse a Sequence =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs core-functions]
;; 
;; Write a function which reverses a sequence.

(def restricted [reverse rseq])

(defn __ [l]
  ;; bind i to the index of last element, 2nd to last,
  ;; all the way to first element
  (for [i (range (dec (count l)) -1 -1)]
    ;; for each i, return element at ith position
    (nth (seq l) i)))

(comment 
  (let [l [:a :b :c :d]]
   (for [i (range (dec (count l)) -1 -1)]
     (nth l i)))
  
  )


(tests
  (__ [1 2 3 4 5]) := [5 4 3 2 1]
  (__ (sorted-set 5 7 2 7)) := '(7 5 2)
  (__ [[1 2][3 4][5 6]]) := [[5 6][3 4][1 2]])

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/904085bff870b46beca9c51605e1b3fc