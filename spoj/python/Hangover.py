#!/usr/local/bin/python

def calculateMaximumCardNumber(cardLength):
	eps = 0.00
	i = 1
	sum = 0

	while (cardLength - sum > eps):
		i = i + 1
		sum = sum + float(1.0/i);
	return i-1

while 1:
	cardLength = float(raw_input())
	if (cardLength == 0.00):
		break;
	print str(calculateMaximumCardNumber(cardLength)) + " card(s)"