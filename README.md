# Number-Of-BSTs-Containing-Values-1toN

**~** **CS482 (Algorithm Design) Project** **~**

**P R O J E C T _ O V E R V I E W :**

Use Dynamic Programming to determine the number of different Binary Search Trees that
contain the values 1, 2, 3, ..., N.

**P R O J E C T _ D E T A I L S :**

The input will come from a file called input.txt which will be placed in the same directory as your
java file. The first and only line of the file will have a single integer value N. Your program will output
the number of different Binary Search Trees which contain the values from 1, 2, . . ., N. Given the fact that
these values grow very rapidly, you will probably want to use the java class BigInteger.

You must calculate the value using dynamic programming. Do not hardcode the solution or use
pure recursion (without using memoization or tabularization).  A dynamic
programming solution can calculate the answer for N = 1000 in less than 10 seconds on a modest computer, while a recursive solution will be extremely slow when N is about 25.

**S A M P L E _ E X E C U T I O N S :**

( 1 ) If input.txt contains:
```
0
```
The output should be:
```
1
```

( 2 ) If input.txt contains:
```
5
```
The output should be:
```
42
```

( 3 ) If input.txt contains:
```
20
```
The output should be:
```
6564120420
```

( 4 ) If input.txt contains:
```
100
```
The output should be:
```
896519947090131496687170070074100632420837521538745909320
```
