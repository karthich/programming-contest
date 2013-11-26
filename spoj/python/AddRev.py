#!/usr/local/bin/python -OO
import re as RegExp;

# x and y are going to be string valued representatins of the number
def AddReverseNumbers(x, y):
	revX = int(x[::-1])
	revY = int(y[::-1])
	sum = revY + revX
	sumStr = str(sum)[::-1]
	sumInt = int(sumStr)
	return sumInt

testCases = int(raw_input())

for i in range(0, testCases):
	inputStr = raw_input();
	inputArr = RegExp.split(" ", inputStr);
	print AddReverseNumbers(inputArr[0], inputArr[1]);
