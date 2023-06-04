"""ASk the user for a number.
    Depending on what number they enter, tell them if the number is an even or odd number."""



num = int(input("Enter a number"))
mod = num % 2
if mod > 0:
    print("It's  an odd number.")
else:
    print("It's an even number.")