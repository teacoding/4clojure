; Topics:	seqs

; Given two sequences x and y, calculate the Levenshtein distance of x and y, i. e. the minimum number of edits needed to transform x into y. The allowed edits are:

; - insert a single item
; - delete a single item
; - replace a single item with another item

; WARNING: Some of the test cases may timeout if you write an inefficient solution!

(= (__ "kitten" "sitting") 3)

(= (__ "closure" "clojure") (__ "clojure" "closure") 1)

(= (__ "xyx" "xyyyx") 2)

(= (__ "" "123456") 6)

(= (__ "Clojure" "Clojure") (__ "" "") (__ [] []) 0)

(= (__ [1 2 3 4] [0 2 3 4 5]) 2)

(= (__ '(:a :b :c :d) '(:a :d)) 2)

(= (__ "ttttattttctg" "tcaaccctaccat") 10)

(= (__ "gaattctaatctc" "caaacaaaaaattt") 9)

; my solution
