int minus
int plus
int zero
println "This system calculates the number of positive, negative and zero numbers entered"
print "Please enter your first number:"
String str = System.console().readLine()
while (str != "END")
{
int number = Integer.parseInt(str)
	if (number > 0)
		{
		plus++
			}
else if (number < 0)
		{
		minus++
		}
else
	{
	zero++
		}
print "Please enter your next number, (enter 'END' to print results):"
str = System.console().readLine()
}
println "Finished, numbers collected:"
println "Negative:  " + minus
println "Positive:  " + plus
println "Zero value:  " + zero
