"""
Lindsey Ferretti
Project Euler: Problem 3 - Largest prime factor

The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143?
"""


def largest_prime(num):
    factor = 2
    largest = 0
    while num != 1:
        if num % factor == 0:
            num /= factor
            largest = factor
        factor += 1
    return largest


def main():
    print("Result " + str(largest_prime(600851475143)))


main()