"""Adding List Numbers

Activity 13

Write a function sum() such that it can accept a list of elements and print the sum of all elements"""

# Custom function to calculate sum
def calcSum(num):
    sum = 0
    for number in num:
        sum += number
    return sum

# Define the list of numbers
numList = [2,5,3,4]

# Call the sum() function with numList as argument
result = calcSum(numList)

# Print result with message
print("The sum of all the elements is: " + str(result))