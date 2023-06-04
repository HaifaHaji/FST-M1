"""Using pytest:

Create a new test file and write test to validate the following cases:

Sum of two numbers
Difference of two numbers
Product of two numbers
Quotient of two numbers
cd to the directory then  pytest  .\test_filename.py"""

import pytest


# Additon test
def test_addition():

    num1 = 10
    num2 = 15
    sum = num1 + num2
    assert sum == 25


# Subtraction test
def test_subtraction():

    num1 = 50
    num2 = 35
    diff = num1 - num2
    assert diff == 15


# Multiplication test
def test_multiplication():

    num1 = 5
    num2 = 20
    mul = num1 * num2
    assert mul == 100


# Division test
def test_division():

    num1 = 100
    num2 = 5
    div = num1 / num2
    assert div == 20
