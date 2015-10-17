int a = 0
int b = 0

while (a-b!=-3 && a-b!=3)
{
    println a + " " + b 
    print "Enter the fight result (either PR, RS, SP, PS, RP, SR, SS, RR): "
    String entry = System.console().readLine()
    if (entry == "PR"||entry =="RS"||entry =="SP")
    {
        a = a+1
    }
    else if (entry == "PS"||entry == "RP"||entry == "SR")
    {
        b = b+1
    }
}
if (a<b)
{
    println "B won, sorry A"
}
else
{
    println "A won, sorry B"
}
