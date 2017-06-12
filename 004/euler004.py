"""
Lindsey Ferretti
Project Euler: Problem 4 - Largest palindrome product

A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
"""


def largest_palindrome():
    pal = 0
    lar_pal = 0
    for i in range(100, 1000):
        for j in range(100, 1000):
            pal = i * j
            if is_palindrome(pal):
                if pal > lar_pal:
                    lar_pal = pal
    return lar_pal


def is_palindrome(num):
    num = str(num)
    rev = num[::-1]
    if num == rev:
            return True
    return False


def main():
    print("Result: " + str(largest_palindrome()))


main()