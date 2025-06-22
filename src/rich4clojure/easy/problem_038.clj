(ns rich4clojure.easy.problem-038
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Maximum value =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [core-functions]
;; 
;; Write a function which takes a variable number of
;; parameters and returns the maximum value.

(def restricted [max max-key])

(defn max-val [& args]
  (first (sort > args)))

(defn max-val2 [& args]
  (reduce (fn [acc n]
            (if (> n acc)
              n
              acc))
          (first args)
          (rest args)))

(comment

  (defn foo [& args]
    (prn args))

  (first (sort > '(1 8 3 4)))

  (reduce (fn [acc n]
            (if (> n acc)
              n
              acc))
          (first '(1 8 3 4))
          (rest '(1 8 3 4)))



  )

(tests
  (max-val 1 8 3 4) := 8
  (max-val 30 20) := 30
  (max-val 45 67 11) := 67)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/3d8cce63160543ce69b40bc041174b28