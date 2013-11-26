#!/usr/local/bin/python -OO

def findUpTriangles(n):
	return n * (n + 1) * (n + 2) / 6

def findDownTriangles(n):
	if (n % 2 == 1):
		k = (n - 1) / 2;
		return k * (k + 1) * (4*k + 5)/6;
	else:
		return findUpTriangles(n - 1) - findDownTriangles(n - 1);

 
def countingTriangles(n):
	return findUpTriangles(n) + findDownTriangles(n);

testCases = int(raw_input());
for i in xrange(0, testCases):
	print countingTriangles(int(raw_input()));

