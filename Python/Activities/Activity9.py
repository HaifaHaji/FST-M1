"""Given a two list of numbers create a new list such that new list should contain
only odd numbers from the first list and even numbers from the second list."""


list1 = [1, 2, 3, 4, 5]
list2 = [4, 4, 5, 6, 7]

print(" List 1 is ", list1)
print(" List 2 is", list2)

result = []

for odd in list1:
    if (odd % 2 != 0):
        result.append(odd)

for even in list2:
    if (even % 2 == 0):
        result.append(even)


print("final result  is:" )
print(result)

