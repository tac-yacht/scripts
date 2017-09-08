# -*- coding: utf-8 -*- 

import sys

def fizz(num):
	if (num % 3) == 0:
		print('Fizz', end="")
		return True
	return False
def buzz(num):
	if (num % 5) == 0:
		print('Buzz', end="")
		return True
	return False

def main():
	if len(sys.argv) != 2:
		return
	
	for i in range(1,int(sys.argv[1])+1):
		if fizz(i)|buzz(i):
			print("")
		else:
			print(i)

if __name__ == '__main__':
	main()

