double pi = 0
int countterms = 0
int loopinc1 = 1
int loopinc2 = 3

print "Please enter number of terms to calculate for Pi :"
s = System.console().readLine()
int terms = Integer.parseInt(s)

while (countterms<terms)
{
    pi = pi + 4/loopinc1
    loopinc1 = loopinc1 + 4
    countterms = countterms + 1
    println pi
    if (countterms<terms)
    {
        pi = pi - 4/loopinc2
        loopinc2 = loopinc2 + 4
        countterms = countterms + 1
        println pi
    }
}
println pi