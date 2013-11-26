#!/usr/local/bin/python -OO

def tripleFatLadies(number):
	return 192 + (number - 1) * 250


numberOfTestCases = int(raw_input())
counter = 0
while counter < numberOfTestCases:
	testCase = int(raw_input())
	print tripleFatLadies(testCase)
	counter += 1