boolean prime = true
int div = 2
boolean exitloop1 = false
boolean exitloop2 = false
print "Enter a number: "
String s = System.console().readLine()
int number = Integer.parseInt(s)
int primecountnegative = number
int primecountpositive = number
while (!exitloop1)
{
primecountpositive = primecountpositive+1
    while (prime && div < primecountpositive)
        {
            if (primecountpositive%div==0)
            {
                prime = false
                
            }
            div = div + 1
        }
        if (prime)
        {
            exitloop1 = true
            div = 2
        }
        else
        {
            div = 2
            prime = true
        }
        
}
while (!exitloop2)
{
primecountnegative = primecountnegative-1
    while (prime && div < primecountnegative)
        {
            if (primecountnegative%div==0)
            {
                prime = false
                
            }
            div = div + 1
        }
        if (prime)
        {
            exitloop2 = true
        }
        else
        {
            prime = true
        }
}

if ((number-primecountnegative)>(primecountpositive-number))
{
    println "The closest prime number is " + primecountnegative
}
else if ((number-primecountnegative)<(primecountpositive-number))
{
    println "The closest prime number is " + primecountpositive
}
else
{
   println "The closest prime number is " + primecountpositive +  " & " + primecountnegative
}