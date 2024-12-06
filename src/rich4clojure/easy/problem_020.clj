(ns rich4clojure.easy.problem-020
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Penultimate Element =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs]
;; 
;; Write a function which returns the second to last
;; element from a sequence.

(defn __ [arg]
  (nth arg (-(count arg)2)) )

(comment
  (def v [:a :b :c])
  (nth v (- (count v) 2))

  (def m [[3 4] [5 7]])
  (nth m (- (count m) 2)) 
  )

(tests
  (__ (list 1 2 3 4 5)) := 4
  (__ ["a" "b" "c"]) := "b"
  (__ [[1 2] [3 4]]) := [1 2])

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/bb564e188dc4d73aa37b714b64003dfe