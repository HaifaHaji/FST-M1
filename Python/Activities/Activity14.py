"""Fibonacci Numbers

Activity 14

Using Recursion:

Write a program that asks the user how many Fibonnaci numbers to generate and then generates them.


Hint: The Fibonnaci seqence is a sequence of numbers where the next number in the sequence is the sum
of the previous two numbers in the sequence. The sequence looks like this: 1, 1, 2, 3, 5, 8, 13, …
"""


def fibonacci(num):
    if num <= 1:
        return num
    else:
        return(fibonacci(num - 1) + fibonacci(num - 2))

no_of_terms = int(input("Enter a number: "))

if no_of_terms <= 0:
    print("Please enter a positive number")
else:
    print("Fibonacci Sequence: ")
    for i in range(no_of_terms):
        print(fibonacci(i))