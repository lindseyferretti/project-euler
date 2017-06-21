# Lindsey Ferretti
# Project Euler: Problem 5 - Smallest multiple
#
# 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
#
# What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

def smallestMult()
    (2520...999999999).step(20) do |i|
        if divisionCheck(i)
            return i
        end
    end
end

def divisionCheck(num)
    check = Array.new
    check.insert(0, 11, 13, 14, 16, 17, 18, 19, 20)
    result = true
    check.each do |n|
        if num % n != 0
            result = false
        end
    end
    result
end


def main()
    print("Result: " + smallestMult().to_s)
end

main()