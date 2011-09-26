;Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
;1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
;By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

(defn fibeven [topNum]
		(loop [n1 1 n2 2 total 0]
		(if (< n1 topNum)
			(if (even? n1)
				(recur n2 (+ n1 n2) (+ total n1))
				(recur n2 (+ n1 n2) total)
				) total)
			)
	)

(println (time(fibeven 4000000)))