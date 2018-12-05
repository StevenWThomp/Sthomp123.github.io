#!/usr/bin/env python3
# part_1.py
#Steven Thompson
#November 15th 2017

""" This program prints a triangle made out of numbers """

number = 9
for i in range(number+1):
    for j in range(i):
        number += 1
        print(number, end= " ")
    print()
