#!/usr/bin/env python3
# main_program.py
# Steven Thompson
# November 2nd 2017

""" This is a quiz """

#These are the possible answer choices for my first multiple choice question
a = "323.1 million"
b = "256.4 million"
c = "423.2 million"


#These are the messages that tell the user if they got a question right or wrong
congratulations = "Correct, Great Job!"
failure = "Incorrect, Better luck next time"

#This is an accumulator
average = 0

print("This is my awesome quiz")


#This is the first question
print("A:",a+"\n"+"B:",b+"\n"+"C:",c+"\n")
question1 = input("What is the total population of the United States? ")
if question1 == "A" or question1 == "a":
    print(congratulations)
    average += 1
else:
    print(failure)


#This is my second question
question2 = int(input("How many movies are in the Harry Potter series? "))
if question2 == 8:
    print(congratulations)
    average += 1
else:
    print(failure)

#This is my third question
question3 = int(input("How many champions are in league of legends? "))
if question3 == 134:
    print(congratulations)
    average += 1
else:
    print(failure)

#This is my fourth question
question4 = input("What is the name of the green train in 'Thomas the Tank Engine'? ")
if question4 == "percy" or question4 == "Percy":
    print(congratulations)
    average += 1
else:
    print(failure)

#This is my final question
question5 = input("What is the name of Wukong's ultimate ability in the game 'League of legends'? ")
if question5 == "Cyclone" or question5 == "cyclone":
    print(congratulations)
    average += 1
else:
    print(failure)

print("Your average is",str(average/5*100)+"%")


                
