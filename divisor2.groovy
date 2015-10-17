print "Please introduce a number: "
String str = System.console().readLine()
int divisor = Integer.parseInt(str)
print "enter a dividend: "
str = System.console().readLine()
int dividend = Integer.parseInt(str)
int sum = 0
int counter = 0

if (dividend == 0) {
println "error, can't divide by 0"
} else {
	while (sum + dividend <= divisor)
{
	sum = sum + dividend
	counter = counter+1
}

	int excess = divisor - sum

	println divisor + " divided by " + dividend + " goes " + counter + " times leaving " + excess + " in excess"
}
	
	