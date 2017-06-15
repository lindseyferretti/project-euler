# Lindsey Ferretti
# Project Euler: Problem 3 - Largest prime factor
#
# The prime factors of 13195 are 5, 7, 13 and 29.
# What is the largest prime factor of the number 600851475143?

def largestPrime(num)
    factor = 2
    largest = 0
    until num == 1
        if num % factor == 0
            num /= factor
            largest = factor
        end
        factor+= 1
    end
    largest
end

def main()
    print("Result " + largestPrime(600851475143).to_s)
end

main()