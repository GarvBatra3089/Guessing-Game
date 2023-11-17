import random
num = random.randint(0, 100)
guesses=1
guess= input("Guess the number. ")
while guess!=num:
    if guess.isdigit()==True:
        guess=int(guess)
    else:
        print("You had to guess a number. Rerun to play again. ")
        quit()
    if guess>num:
        guesses+=1
        guess = input("Too High! Guess again. ")
    elif guess<num:
        guesses+=1
        guess = input("Too Low! Guess again. ")

print("Correct! The answer was {}. You got it in {} guesses.".format(num, guesses))
    