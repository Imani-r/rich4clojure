(ns rich4clojure.easy.problem-029
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Get the Caps =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [strings]
;; 
;; Write a function which takes a string and returns a new
;; string containing only the capital letters.

(defn capital-letters [s] 
  (apply str (re-seq #"[A-Z]" s)))

(comment
  #"[A-Z]+"
  (re-find)
  (re-seq)
  
  (str '("H" "L" "O")))

(tests
 (capital-letters "HeLlO, WoRlD!") := "HLOWRD"
 (capital-letters "nothing") := ""
 (capital-letters "$#A(*&987Zf") := "AZ")

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/bdbcf005bcae10b15531ebe3a7d0be9c