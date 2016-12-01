(ns tree-print.core
  (:gen-class))

(defn get-left-pad [amount]
  (apply str (repeat amount " ")))

(defn get-line [left-pad-amount num-chars]
  (str (get-left-pad left-pad-amount) (apply str (repeat num-chars "*")) "\n"))

(defn build-tree [height]
  (loop [num-chars 1 level height tree []]
    (if (> level 0)
      (recur (+ num-chars 2) (dec level) (conj tree (get-line level num-chars)))
      tree)))

(defn print-tree [height]
  (apply println (build-tree height)))