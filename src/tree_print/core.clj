(ns tree-print.core
  (:gen-class))

(defn get-left-pad [amount]
  (apply str (repeat amount " ")))

(defn print-tree [height]
  (loop [num-chars 1 level height]
    (if (> level 0)
      (do
        (println (str (get-left-pad level) (apply str (repeat num-chars "*"))))
        (recur (+ num-chars 2) (dec level))))))

