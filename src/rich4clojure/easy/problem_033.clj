(ns rich4clojure.easy.problem-033
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Replicate a Sequence =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs]
;; 
;; Write a function which replicates each element of a
;; sequence a variable number of times.

(defn n-reps [coll n]
  (apply concat (map (fn [x] (repeat n x)) coll))
  )

(comment
  (def coll [1 2 3])
  (def n 2)

  (map repeat n coll)

  (defn n-reps1 [coll n]
    (apply concat (map (fn [x] (repeat n x)) coll)))
  
  ; equiv
  (defn n-reps2 [coll n]
    (map #(repeat n %) coll)) 
  
  (map (fn [x] (+ x 3)) [1 2 3 4 5])
  (map #(+ % 3) [1 2 3 4 5])

  (->> coll
       (map (fn [x] (repeat n x)))
       (apply concat)) 
  
  )

(tests
  (n-reps [1 2 3] 2) := '(1 1 2 2 3 3)
  (n-reps [:a :b] 4) := '(:a :a :a :a :b :b :b :b)
  (n-reps [4 5 6] 1) := '(4 5 6)
  (n-reps [[1 2] [3 4]] 2) := '([1 2] [1 2] [3 4] [3 4])
  (n-reps [44 33] 2) := [44 44 33 33])

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/3e4dc6bf1479a57ffcd2ef05bdc5bb52