(ns rich4clojure.easy.problem-034
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Implement range =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs core-functions]
;; 
;; Write a function which creates a list of all integers
;; in a given range.

(def restricted [range])

(defn my-range [a b] 
  (take-while (fn [n] (< n b))
              (iterate inc a)))

(comment
 (take-while (fn [n] (< n 4))
             (iterate inc 1))
  
  )

(tests
  (my-range 1 4) := '(1 2 3)
  (my-range -2 2) := '(-2 -1 0 1)
  (my-range 5 8) := '(5 6 7))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/6ebd843c6422d507efa327bee4bf0b50