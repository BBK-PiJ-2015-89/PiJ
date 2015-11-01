int div = 2
int num = 2
int count = 0
boolean prime = true

while (count<=1000)
{
    while (prime && div < num)
    {
        if (num%div==0)
        {
            prime = false
            
        }
        div = div + 1
    }
    if (prime)
    {
        println num
        count = count+1
        
    }
    num = num+1
    prime = true
    div = 2
}