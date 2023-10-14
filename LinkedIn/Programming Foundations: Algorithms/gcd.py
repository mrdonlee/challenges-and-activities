#!/usr/bin/python3

n1 = 20
n2 = 8

for i in range(1, n1):

    if n1 % i == 0 and n2 % i == 0:
        gcd = i

print(gcd)
