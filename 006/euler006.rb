# Lindsey Ferretti
# Project Euler: Problem 6 - Sum square difference
#
# The sum of the squares of the first ten natural numbers is,
#
# 1^2 + 2^2 + ... + 10^2 = 385
# The square of the sum of the first ten natural numbers is,
#
# (1 + 2 + ... + 10)^2 = 55^2 = 3025
# Hence the difference between the sum of the squares of the first ten
# natural numbers and the square of the sum is 3025 − 385 = 2640.
#
# Find the difference between the sum of the squares of the first one
# hundred natural numbers and the square of the sum.

def findDifference()
    result = findTerms()
    result[0] - result[1]
end

def findTerms()
    sum = 0
    sumSquares = 0
    result = Array.new
    (1...101).step(1) do |i|
        sum += i
        sumSquares += i * i
    end
    result.insert(0, sum * sum, sumSquares)
    result
end

def main()
    print("Result: " + findDifference().to_s)
end

main()