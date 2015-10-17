println "This programme calculates whether you have entered consecutive numbers"
print "Please introduce a number: "
String str = System.console().readLine()
int num1 = Integer.parseInt(str)
String decision = "Yes"
int num = 0
boolean exit = false
boolean plus = true

while (!exit)
		{
		print "Please introduce a consecutive number (type '-1' to end programme): "
		str = System.console().readLine()
		num = Integer.parseInt(str)
		if (num == -1)
			{
			exit = true
			}
				else if(num == num1 - 1)
				{
				plus = false
				while (!plus && !exit)
				{
				print "Please introduce a consecutive number (type '-1' to end programme): "
				str = System.console().readLine()
				num = Integer.parseInt(str)
					if (num == -1)
						{
							exit = true
						}	
								else if (num == num1 - 1)
								{
								num1 = num
								}
									else
									{
									decision = "No"
									}
				}
				}
						else if (num == num1 + 1)
							{	
							while (plus && !exit)
							{
								print "Please introduce a consecutive number (type '-1' to end programme): "
								str = System.console().readLine()
								num = Integer.parseInt(str)
								if (num == -1)
									{
									exit = true
									}		
									else if (num == num1 + 1)
									{
									num1 = num
									}
										else
										{
										decision = "No"
										}
							}
							else
							{
							decision = "No"
							}
															
							}
}
println decision
