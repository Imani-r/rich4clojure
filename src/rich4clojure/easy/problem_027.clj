(ns rich4clojure.easy.problem-027
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Palindrome Detector =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs]
;; 
;; Write a function which returns true if the given
;; sequence is a palindrome.
;; 
;; 
;; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)

(defn palindrome? [a]
  (= (seq a) (reverse a))
  )

(comment
  (def a [3 5 6 5 3]) 
  a 
  (= (seq a) (reverse a))
  )

(tests
  (palindrome? '(1 2 3 4 5)) := false
  (palindrome? "racecar") := true
  (palindrome? [:foo :bar :foo]) := true
  (palindrome? '(1 1 3 3 1 1)) := true
  (palindrome? '(:a :b :c)) := false)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/a9620760aad9da40c497f5750087a095