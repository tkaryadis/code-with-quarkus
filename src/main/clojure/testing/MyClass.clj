(ns testing.MyClass
    (:gen-class
      :init init
      :state state
      :methods [[foo [Integer] Integer]]))

(defn -init []
      [[] {:node (atom nil)}])

(defn -foo [this x]
      (println "foo from clojure class" this x)
      (inc x))