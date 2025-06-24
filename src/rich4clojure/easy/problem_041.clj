(ns rich4clojure.easy.problem-041
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Drop Every Nth Item =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs]
;; 
;; Write a function which drops every Nth item from a
;; sequence.

(defn drop-nth [coll n]
   (keep-indexed (fn [index item]
                  (when (not (= (dec n) (mod index n)))
                    item))
                coll)
  )

(comment
  drop
  (#(drop %2 %1) [1 2 3 4 5] 2)

  (take 3 [1 2 3 4 5 6 7 8])
  (every?)

  (keep (fn [n] (when (odd? n) (* 2 n))) [1 2 3 4 5])

  map
  map-indexed
  filter
  keep
  keep-indexed

  (keep-indexed (fn [index item]
                  (when (not (= (dec 3) (mod index 3)))
                    item))
                [1 2 3 4 5 6 7 8])
  
  (zero? (mod 10 3))
  

  )

(= [1 2 3] '(1 2 3))

(tests
  (drop-nth [1 2 3 4 5 6 7 8] 3) := [1 2 4 5 7 8]
  (drop-nth [:a :b :c :d :e :f] 2) := [:a :c :e]
  (drop-nth [1 2 3 4 5 6] 4) := [1 2 3 5 6])

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/03788b118a3d7923f7aae143e8ef1aee