print "Please introduce a number: "
String str = System.console().readLine()
int num = Integer.parseInt(str)
boolean isPrime = true
for(i=2; i <num; i++){
if (num % i == 0){
isPrime = false
break
}
}
println "the number is prime: " + isPrime