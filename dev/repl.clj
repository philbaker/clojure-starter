(ns repl
  (:require [nextjournal.clerk :as clerk]))

(comment
  (clerk/serve! {:watch ["notebooks"]})
  (clerk/show! "notebooks/rule_30.clj")
)
