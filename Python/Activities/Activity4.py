"""Enhance the previously written Rock-Paper-Scissors code so that it asks the user if they want to play another round.
If they say 'Yes', the game should begin again.
If they say 'No', the game should exit"""

# Get the names of the users
user1 = input("What is Player 1's name? ")
user2 = input("What is Player 2's name? ")


while True:

    user1_res = input(user1 + "-- Choose rock, paper or scissors ")
    user2_res = input(user2 + "-- Choose rock, paper or scissors ")


    if user1_res == user2_res:
        print("It's a tie!")
    elif user1_res == 'rock':
        if user2_res == 'scissors':
            print("Rock wins!")
        else:
            print("Paper wins!")
    elif user1_res == 'scissors':
        if user2_res == 'paper':
            print("Scissors win!")
        else:
            print("Rock wins!")
    elif user1_res == 'paper':
        if user2_res == 'rock':
            print("Paper wins!")
        else:
            print("Scissors win!")
    else:
        print("Try again.")


    repeat = input("Do you want to play another round? Yes/No: ")


    if(repeat == "yes"):
        pass

    elif(repeat == "no"):
        raise SystemExit

    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit