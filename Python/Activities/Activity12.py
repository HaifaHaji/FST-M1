"""Write a recursive function to calculate the sum of numbers from 0 to 10"""

# Define function to calculate sum
def calcSum(num):
    if num:
        # Recursive function call
        return num + calcSum(num - 1)
    else:
        return 0

# Call calculateSum() function
res = calcSum(10)

# Print result
print(res)