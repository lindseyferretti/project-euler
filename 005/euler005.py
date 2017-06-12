"""
Lindsey Ferretti
Project Euler: Problem 5 - Smallest multiple

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
"""


def smallest_mult():
    for i in range(2520, 999999999, 20):
        if division_check(i):
            return i


def division_check(num):
    check = [11, 13, 14, 16, 17, 18, 19, 20]
    if all(num % n == 0 for n in check):
        return True
    return False


def main():
    print("Result: " + str(smallest_mult()))


main()