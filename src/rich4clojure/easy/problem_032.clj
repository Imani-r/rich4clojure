(ns rich4clojure.easy.problem-032
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Duplicate a Sequence =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs]
;; 
;; Write a function which duplicates each element of a
;; sequence.

(defn double-elements [coll]
  (apply concat (map (fn [x] (repeat 2 x)) coll))
  )

(comment
  (def a [1 2 3]) 
  (def b [[1 2] [3 4]]) 

  (->> (map (fn [x] (repeat 2 x)) b)
       (apply concat)
       ) 

  ([:a :b :c] 1)

  )

(tests
  (double-elements [1 2 3]) := '(1 1 2 2 3 3)
  (double-elements [:a :a :b :b]) := '(:a :a :a :a :b :b :b :b)
  (double-elements [[1 2] [3 4]]) := '([1 2] [1 2] [3 4] [3 4])
  (double-elements [[1 2] [3 4]]) := '([1 2] [1 2] [3 4] [3 4]))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/9e936a6097fdb1fd7a8418a22e3e1170