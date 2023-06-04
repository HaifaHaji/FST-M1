"""Fruit Shop

Activity 11

Create a Python dictionary that contains a bunch of fruits and their prices.

Write a program that checks if a certain fruit is available or not."""

fruit_shop = {
    "Mango": 40,
    "Kiwi": 67,
    "Litchi": 2,
    "Apple": 14
}

to_find = input("What are you looking for? ").lower()

if(to_find in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")