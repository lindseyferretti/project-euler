# Lindsey Ferretti
# Project Euler: Problem 7 - 10001st prime
# 
# By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
#
# What is the 10 001st prime number?

def findPrime(n)
    i = 1
    count = 0
    while count < n
        if isPrime(i)
            count += 1
            if count == n
                return i
            end
        end
        i += 1
    end
    return -1
end

def isPrime(num)
    n = 3
    result = false
    if num % 2 == 0
        return result
    end
    while n < (num**0.5 + 1)
        if num % n == 0
            return result
        end
        n += 2
    end
    result = true
    result
end

def main()
    print("Result: " + findPrime(10001).to_s)
end

main()