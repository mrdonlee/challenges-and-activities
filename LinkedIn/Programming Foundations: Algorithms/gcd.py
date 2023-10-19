#!/usr/bin/python3

def gcd(num1, num2):

    while (num2 != 0):
        ans  = num1
        num1 = num2
        num2 = num1 % num2

    return ans


print(gcd(8, 20))
