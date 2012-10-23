(ns recursion)

(defn product [coll]
  (if (empty? coll)
    1
    (* (first coll)
       (product (rest coll)))))

(defn singleton? [coll]
  (and (not (nil? (first coll))) (empty? (rest coll))))

(defn my-last [coll]
  (if (empty? (rest coll)) 
    (first coll)
    (my-last (rest coll))))

(defn max-element [a-seq]
  (if (empty? (rest a-seq))
    (first a-seq)
    (max (first a-seq) (max-element (rest a-seq)))))

(defn seq-max [seq-1 seq-2]
  (let [rec-max (if (empty? seq-1) 2
                  (if (empty? seq-2) 1
                    (seq-max (rest seq-1) (rest seq-2))))]
    (if (= rec-max 1) seq-1 seq-2)))

(defn longest-sequence [a-seq]
  (if (empty? a-seq)
    nil
    (seq-max (first a-seq) (longest-sequence (rest a-seq))))) 

(defn my-filter [pred? a-seq]
  (if (empty? a-seq)
    a-seq
    (if (pred? (first a-seq)) 
      (cons (first a-seq)(my-filter pred? (rest a-seq)))
      (my-filter pred? (rest a-seq)))))

(defn sequence-contains? [elem a-seq]
  (cond
   (empty? a-seq) false
   (== elem (first a-seq)) true
   :else (sequence-contains? elem (rest a-seq))))

(defn my-take-while [pred? a-seq]
  (cond
   (empty? a-seq) a-seq
   (not (pred? (first a-seq))) []
   :else (cons (first a-seq) (my-take-while pred? (rest a-seq)))))

(defn my-drop-while [pred? a-seq]
  (cond
   (empty? a-seq) a-seq
   (not (pred? (first a-seq))) a-seq
   :else (my-drop-while pred? (rest a-seq))))

(defn seq= [a-seq b-seq]
  (cond
    (and (empty? a-seq) (empty? b-seq)) true
    (or (empty? a-seq) (empty? b-seq)) false
    (not (== (first a-seq) (first b-seq))) false
    :else (seq= (rest a-seq) (rest b-seq))))

(defn my-map [f seq-1 seq-2]
 (cond
  (or (empty? seq-1) (empty? seq-2)) '()
  :else (cons (f (first seq-1) (first seq-2)) (my-map f (rest seq-1) (rest seq-2)))))

(defn power [n k]
  (if (zero? k) 
    1
    (if (== k 1)
      n
      (* n (power n (dec k))))))

(defn fib [n]
  (cond 
   (zero? n) 0
   (== n 1) 1
   :else (+ (fib (- n 1))
            (fib (- n 2)))))

(defn my-repeat [how-many-times what-to-repeat]
  (cond
   (<= how-many-times 0) '()
   :else (cons what-to-repeat (my-repeat (dec how-many-times) what-to-repeat))))

(defn my-range [up-to]
  (cond
   (<= up-to 0) '()
   :else (cons (dec up-to) (my-range (dec up-to)))))

(defn tails [a-seq]
  (cond
   (empty? a-seq) ['()]
   :else (cons (seq a-seq) (tails (rest a-seq)))))

(defn inits [a-seq]
 ; (cond
  ; (empty? a-seq) ['()]
   ;:else (cons (seq a-seq) (tails (reverse (rest (reverse a-seq)))))))
  [:-])

(defn rotations [a-seq]
  [:-])

(defn my-frequencies-helper [freqs a-seq]
  [:-])

(defn my-frequencies [a-seq]
  [:-])

(defn un-frequencies [a-map]
  [:-])

(defn my-take [n coll]
  [:-])

(defn my-drop [n coll]
  [:-])

(defn halve [a-seq]
  [:-])

(defn seq-merge [a-seq b-seq]
  [:-])

(defn merge-sort [a-seq]
  [:-])

(defn split-into-monotonics [a-seq]
  [:-])

(defn permutations [a-set]
  [:-])

(defn powerset [a-set]
  [:-])