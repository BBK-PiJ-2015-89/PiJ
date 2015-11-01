double num1 = 0.0;
double num2 = 0.0;
int choice;
double result = 0.0;
println ("This programme calculates two numbers as desired");
print ("Enter your first number: ");
num1 = readDouble();
print ("Enter your second number: ");
num2 = readDouble();
println ("For division enter 1");
println ("For addition enter 2");
println ("For subtraction enter 3");
println ("For multiplication enter 4");
choice = readInt();
switch (choice) {
	case 1:
		result = num1 / num2;
	break;
	case 2:
	result = num1 + num2;
	break;
	case 3: 
	result = num1 - num2;
	break;
	case 4:
	result = num1 * num2;
	break;
};
println ("The result is: " + result);





