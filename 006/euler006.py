"""
Lindsey Ferretti
Project Euler: Problem 6 - Sum square difference

The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)^2 = 55^2 = 3025
Hence the difference between the sum of the squares of the first ten
natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one
hundred natural numbers and the square of the sum.
"""


def find_difference():
    result = find_terms()
    return result[0] - result[1]


def find_terms():
    sum = 0
    sumSquares = 0
    for i in range(1, 101):
        sum += i
        sumSquares += i * i
    result = (sum * sum, sumSquares)
    return result


def main():
    print("Result: " + str(find_difference()))


main()