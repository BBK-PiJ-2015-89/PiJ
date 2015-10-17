println "This programme is designed to display the highest number entered"
print "You are required to enter a positive number to start: "
String str = System.console().readLine()
int num = Integer.parseInt(str)
int finalnum = 0


	while (num != -1)
		{
		if (finalnum < num)
		{
		finalnum = num
		}
	print "now please enter another number, to end type '-1': "
	str = System.console().readLine()
	num = Integer.parseInt(str)
}
println "The highest number in the sequence was: " + finalnum
