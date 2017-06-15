# Lindsey Ferretti
# Project Euler: Problem 4 - Largest palindrome product
# 
# A palindromic number reads the same both ways.
# The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
# 
# Find the largest palindrome made from the product of two 3-digit numbers.

def largestPalindrome()
    larPal = 0
    100.upto(999) do |i| 
        100.upto(999) do |j|
            pal = i * j
            if isPalindrome(pal) and pal > larPal
                larPal = pal
            end
        end
    end
    larPal
end

def isPalindrome(num)
    num = num.to_s
    num == num.reverse()
end


def main()
    print("Result: " + largestPalindrome().to_s)
end

main()