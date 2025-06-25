(ns rich4clojure.easy.problem-042
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Factorial Fun =
;; By 4Clojure user: amalloy
;; Difficulty: Easy
;; Tags: [math]
;; 
;; Write a function which calculates factorials.

(defn factorial [n]
  (apply * (range 1 (inc n))))

(comment
  ; 1 
  ; 2 x 1
  ; 3 x 2 x 1
  ; 4 x 3 x 2 x 1
  ; 5 x 4 x 3 x 2 x 1
  
  (apply * (range 1 (inc 8)))

  (loop [n     5
         total 1]
    
    (if (= n 1)
      total
      
      (recur (dec n) (* total n))))
  
  (let [a 1
        b :foo]
    [a a b b])

  )

(tests
  (factorial 1) := 1
  (factorial 3) := 6
  (factorial 5) := 120
  (factorial 8) := 40320)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/850039024c0d503cce2b2e98ca1803c5