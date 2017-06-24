"""
Lindsey Ferretti
Project Euler: Problem 7 - 10001st prime

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
"""


def find_prime(n):
    i = 1
    count = 0
    while count < n:
        if is_prime(i):
            count += 1
            if count == n:
                return i
        i += 1
    return -1


def is_prime(num):
    n = 3
    if num % 2 == 0:
        return False
    while n < (num**0.5 + 1):
        if num % n == 0:
            return False
        n += 2
    return True


def main():
    print("Result: " + str(find_prime(10001)))


main()