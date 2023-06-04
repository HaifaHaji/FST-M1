"""Make a two-player Rock-Paper-Scissors game.
Remember the rules:
Rock beats scissors
Scissors beats paper
Paper beats rock"""


user1 = input("P1 name")
user2 = input("P2 name ")


user1_res = input(user1 + " -- Choose rock, paper or scissors ")
user2_res = input(user2 + " -- Choose rock, paper or scissors ")


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