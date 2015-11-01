print "Please introduce a number: "
String str = System.console().readLine()
int num1 = Integer.parseInt(str)
print "Please introduce another number: "
str = System.console().readLine()
int num2 = Integer.parseInt(str)
print "Please introduce another number: "
str = System.console().readLine()
int num3 = Integer.parseInt(str)

if (num1 > num2){
	if (num3 > num1){
println num2 + " " + num1 + " " + num3
}
else if (num3 > num2) {
println num2 + " " + num3 + " " + num1
}
else
{
println num3 + " " + num2 + " " + num1
}
}
else {
//* num2 is bigger than num1 therefore: *//
if (num3 > num2){
println num1 + " " + num2 + " " + num3
}
else if (num3 > num1)
{
println num1 + " " + num3 + " " + num2
}
else
{
println num3 + " " + num1 + " " + num2
}
}