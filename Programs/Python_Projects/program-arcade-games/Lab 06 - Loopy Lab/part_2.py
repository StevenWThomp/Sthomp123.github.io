#!/usr/bin/env python3
# part_2.py
# Steven Thompson
# November 15th 2017

""" This program makes a boxes of 'o's based on user input """


n = int(input("Enter a number: "))

#This loop makes the top line of o's
for i in range(n*2):
    print("o", end= "")
print()
#This loop makes the spaces and vertical o's
for k in range(1,n-1):
    print("o", (n-2)*"  ", "o")

#This loop makes the final line of o's        
for j in range(n*2):
        print("o", end= "")

print()
    
