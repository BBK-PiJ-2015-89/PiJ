int attempt
int numberent
int numberToGuess = Math.abs(1000 * Math.random())
println "Guess my number"
print "Tell me a number: "
while (numberent!=numberToGuess)
{
    String s = System.console().readLine()
    numberent = Integer.parseInt(s)
    if ( numberent > numberToGuess)
    {
        println "No! My number is lower."
        print "Tell me a number: "
    }
    else if (numberent < numberToGuess)
    {
        println "No! My number is higher."
        print "Tell me a number: "
    }
    attempt = attempt + 1
}
println "Correct!"
println "You needed " + attempt + " guesses"