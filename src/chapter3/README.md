# Chapter 3 Problems

**Highlights**
*   Comparing floating numbers may cause errors.
`final double EPSILON = 1E−14;`
`double x = 1.0 − 0.1 − 0.1 − 0.1 − 0.1 − 0.1;`
`if (Math.abs(x − 0.5) < EPSILON)`
` System.out.println(x + " is approximately 0.5");`

Output will be:  `0.5000000000000001 is approximately 0.5.`

* Generating random numbers:
  * Math.random() : random double value between 0 and 1.0 (excluding 1.0).
  * (int) (Math.random() * 10): random int value between 0 - 9 (since 10 is excluded).
* System.exit(value); : If value = 0, program terminated normally. If value = nonzero program terminated abnormally.
* DeMorgan's Law for simplifying Boolean expressions.
* Conditional Operators:
  `if (x > 0)`
 `y = 1;`
`else`
 `y = −1;`
  *   this code can be converted to y = (x > 0)**?** 1 **:** −1;
  *   The _'?'_ and _':'_ together create the conditional operator to achieve the same result as in the code above.
  *   Ex: _System.out.println((num % 2 == 0)? "num is even": "num is odd");_
  *   Ex: _status = n1 > n2? 1: (n1 == n2? 0: −1);_

