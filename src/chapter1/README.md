# Chapter 1 Problems:

**Question 3**
3.(Display a pattern) Write a program that displays the following pattern: J A V A
*   The simple way to do this is to create a String[] pattern that contains contains lines that make up the word J A V A. 
*   Enhanced version could be to make a for loop iterating through each line printing a letter at a time for more complex patterns.


**Question 4**
Straight forward solution.
Create a loop with conditions for each "row" to display proper variables and arithmetic solutions, including spacing.

**Question 5**
Stright forward solution.
Create individual variables and perform arithmetic.

*   Float was used for variables and the final solution was stored in double.
*   Difference between float and double:
    *   float: 4 bytes, 7 decimal precision.
    *   double: 8 bytes, 15 decimal precision.

**Question 7**
Approximation of pi formula: 4 * (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + ...)

**Question 8**
Area and perimeter of a circle.
    * Used a final variable for pi: final double pi = Math.PI.

**Question 10**
(Average speed in miles) Assume that a runner runs 14 kilometers in 45 minutes
and 30 seconds. Write a program that displays the average speed in miles per
hour. (Note 1 mile is equal to 1.6 kilometers.)

*   When using _float_ or _double_, ensure to explicity indicate decimal, '.0'. Otherwise an int is returned. Ex float minHour = 40/60 returns 0.0, while float minHour = 40.0/60 returns .75.
*   Convert kilometers to miles (1 mile = 1.6 kilometers).
*   Convert min to hours (45.0/60.0).
*   Convert seconds to hours (30.0/3600.0).
*   Avg = miles / totalTimeHours.
