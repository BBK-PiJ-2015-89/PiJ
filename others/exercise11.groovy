String str1 = "invalid";
String str2 = "invalid";
String r1, r2, r3, r4, r5;
String s1, s2, s3, s4, s5;
int c1, c2, c3, c4, c5;
int inter;
String suites = "";
String cons = "";

//Entry of first card's rank

while (str1 == "invalid")
{
 println "Enter rank of your first card, between 1 and 10, or J or Q or K."
 str1 = System.console().readLine()
 
  if ((str1 == "1") || (str1 == "2") || (str1 == "3") || (str1 == "4") || (str1 == "5") || (str1 == "6") ||
       (str1 == "7") || (str1 == "8") || (str1 == "9") || (str1 == "10") || (str1 == "J") || (str1 == "Q") || (str1 == "K"))
  r1 = str1;
  else
   {
    println "That is invalid"
    str1 = "invalid";
   }
 }
if (r1 == "J")
 r1 = "11";
if (r1 == "Q")
 r1 = "12";
if (r1 == "K")
 r1 = "13";

str1 = "invalid";

//Entry of first card's suite
while (str2 == "invalid")
{
 println "Enter suite of your first card, spades, hearts, diamonds or clubs. Make sure you enter all small letters."
 str2 = System.console().readLine()
 
  if ((str2 == "hearts") || (str2 == "spades") || (str2 == "diamonds") || (str2 == "clubs"))
   s1 = str2;
  else
   {
    println "That is invalid"
    str2 = "invalid";
   }
 }
str2 = "invalid";


//Entry of 2nd card's rank
while (str1 == "invalid")
{
 println "Enter rank of your 2nd card, between 1 and 10, or J or Q or K."
 str1 = System.console().readLine()

  if ((str1 == "1") || (str1 == "2") || (str1 == "3") || (str1 == "4") || (str1 == "5") || (str1 == "6") ||
       (str1 == "7") || (str1 == "8") || (str1 == "9") || (str1 == "10") || (str1 == "J") || (str1 == "Q") || (str1 == "K"))
   r2 = str1;
  else
   {
    println "That is invalid"
    str1 = "invalid";
   }
 }
str1 = "invalid";
if (r2 == "J")
 r2 = "11";
if (r2 == "Q")
 r2 = "12";
if (r2 == "K")
 r2 = "13";

 
//Entry of 2nd card's suite
while (str2 == "invalid")
{
 println "Enter suite of your 2nd card, spades, hearts, diamonds or clubs. Make sure you enter all small letters."
 str2 = System.console().readLine()

  if ((str2 == "hearts") || (str2 == "spades") || (str2 == "diamonds") || (str2 == "clubs"))
   s2 = str2;
  else
   {
    println "That is invalid"
    str2 = "invalid";
   }
 }
str2 = "invalid";


//Entry of 3rd card's rank
while (str1 == "invalid")
{
 println "Enter rank of your 3rd card, between 1 and 10, or J or Q or K."
 str1 = System.console().readLine()

  if ((str1 == "1") || (str1 == "2") || (str1 == "3") || (str1 == "4") || (str1 == "5") || (str1 == "6") ||
       (str1 == "7") || (str1 == "8") || (str1 == "9") || (str1 == "10") || (str1 == "J") || (str1 == "Q") || (str1 == "K"))
   r3 = str1;
  else
   {
    println "That is invalid"
    str1 = "invalid";
   }
 }
str1 = "invalid";
if (r3 == "J")
 r3 = "11";
if (r3 == "Q")
 r3 = "12";
if (r3 == "K")
 r3 = "13";
 
 
//Entry of 3rd card's suite
while (str2 == "invalid")
{
 println "Enter suite of your 3rd card, spades, hearts, diamonds or clubs. Make sure you enter all small letters."
 str2 = System.console().readLine()
 
  if ((str2 == "hearts") || (str2 == "spades") || (str2 == "diamonds") || (str2 == "clubs"))
   s3 = str2;
  else
   {
    println "That is invalid"
    str2 = "invalid";
   }
 }
str2 = "invalid";


//Entry of 4th card's rank
while (str1 == "invalid")
{
 println "Enter rank of your 4th card, between 1 and 10, or J or Q or K."
 str1 = System.console().readLine()

  if ((str1 == "1") || (str1 == "2") || (str1 == "3") || (str1 == "4") || (str1 == "5") || (str1 == "6") ||
       (str1 == "7") || (str1 == "8") || (str1 == "9") || (str1 == "10") || (str1 == "J") || (str1 == "Q") || (str1 == "K"))
   r4 = str1;
  else
   {
    println "That is invalid"
    str1 = "invalid";
   }
 }
str1 = "invalid";
if (r4 == "J")
 r4 = "11";
if (r4 == "Q")
 r4 = "12";
if (r4 == "K")
 r4 = "13";
 
 
//Entry of 4th card's suite
while (str2 == "invalid")
{
 println "Enter suite of your 4th card, spades, hearts, diamonds or clubs. Make sure you enter all small letters."
 str2 = System.console().readLine()

  if ((str2 == "hearts") || (str2 == "spades") || (str2 == "diamonds") || (str2 == "clubs"))
   s4 = str2;
  else
   {
    println "That is invalid"
    str2 = "invalid";
   }
 }
str2 = "invalid";


//Entry of 5th card's rank
while (str1 == "invalid")
{
 println "Enter rank of your 5th card, between 1 and 10, or J or Q or K."
 str1 = System.console().readLine()
 
  if ((str1 == "1") || (str1 == "2") || (str1 == "3") || (str1 == "4") || (str1 == "5") || (str1 == "6") ||
       (str1 == "7") || (str1 == "8") || (str1 == "9") || (str1 == "10") || (str1 == "J") || (str1 == "Q") || (str1 == "K"))
   r5 = str1;
  else
   {
    println "That is invalid"
    str1 = "invalid";
   }
 }
str1 = "invalid";
if (r5 == "J")
 r5 = "11";
if (r5 == "Q")
 r5 = "12";
if (r5 == "K")
 r5 = "13";

 
//Entry of 5th card's suite
while (str2 == "invalid")
{
 println "Enter suite of your 5th card, spades, hearts, diamonds or clubs. Make sure you enter all small letters."
 str2 = System.console().readLine()
 
  if ((str2 == "hearts") || (str2 == "spades") || (str2 == "diamonds") || (str2 == "clubs"))
   s5 = str2;
  else
   {
    println "That is invalid"
    str2 = "invalid";
   }
}
str2 = "invalid";

//Straight flush
 
if (( s1 == s2) && (s2 == s3) && (s3 == s4) && (s4 == s5))
 suites = "same";
//convert ranks entries to integers to compare to check if consecutive

c1 = Integer.parseInt(r1)
c2 = Integer.parseInt(r2)
c3 = Integer.parseInt(r3)
c4 = Integer.parseInt(r4)
c5 = Integer.parseInt(r5)


if (c1 >= c2){
 inter = c1;
 c1 = c2;
 c2 = inter;
}
if (c1 >= c3){
 inter = c1;
 c1 = c3;
 c3 = inter;
}
if (c1 >= c4){
 inter = c1;
 c1 = c4;
 c4 = inter;
}
if (c1 >= c5){
 inter = c1;
 c1 = c5;
 c5 = inter;
}

if (c2 >= c3)
{
 inter = c2;
 c2 = c3;
 c3 = inter;
}
if (c2 >= c4)
{
 inter = c2;
 c2 = c4;
 c4 = inter;
}
if  (c2 >= c5)
{
 inter = c2;
 c2 = c5;
 c5 = inter;
}

if (c3 >= c4)
{
 inter = c3;
 c3 = c4;
 c4 = inter;
}
if (c3 >= c5)
{
 inter = c3;
 c3 = c5;
 c5 = inter;
}

if (c4 >= c5)
{
 inter = c4;
 c4 = c5;
 c5 = inter;
}


if ((c2 == (c1 + 1)) && (c3 == (c2 + 1)) && (c4 == (c3 +1)) && (c5 == (c4 + 1)))
 cons = "true";

if ((suites == "same") && (cons == "true"))
println "Stright flush"
else

//Poker
if (((r1 == r2) && (r2 == r3) && (r3 == r4) && (r1 != r5)) || ((r1 == r2) && (r2 == r3) && (r3 == r5) && (r1 != r4)) || ((r1 == r2) && (r2 == r4) && (r4 == r5) && (r1 != r3)) 
      || ((r1 == r3) && (r3 == r4) && (r4 == r5) && (r1 != r2)) || ((r2 == r3) && (r3 == r4) && (r4 == r5) && (r1 != r2)))
 println "Poker"
else

//Straight
if (suites == "same")
 println "Straight"

else

//Full house
if (((s1 == s2) && (s2 == s3) && (s4 == s5) && (s1 != s4)) || ((s1 == s2) && (s2 == s4) && (s3 == s5) && (s1 != s3)) 
     || ((s1 == s2) && (s2 == s5) && (s3 == s4) && (s1 != s3)) || ((s1 == s3) && (s3 == s4) && (s2 == s5) && (s1 != s2)) 
     || ((s1 == s3) && (s3 == s5) && (s2 == s4) && (s1 != s2)) || ((s1 == s4) && (s4 == s5) && (s2 == s3) && (s1 != s2)) 
     || ((s2 == s3) && (s3 == s4) && (s1 == s5) && (s2 != s1)) || ((s2 == s3) && (s3 == s5) && (s1 == s4) && (s2 != s1)) 
     || ((s2 == s4) && (s4 == s5) && (s1 == s3) && (s2 != s1)) || ((s3 == s4) && (s4 == s5) && (s1 == s2) && (s1 != s3)))
println "Full house"

else

//Three of a kind
if (((r1 == r2) && (r2 == r3) && (r4 != r5) && (r1 != r4) && (r1 != r5)) || ((r1 == r2) && (r2 == r4) && (r3 != r5) && (r1 != 3) && (r1 != r5)) 
     || ((r1 == r2) && (r2 == r5) && (r3 != r4) && (r1 != r3) && (r1 != r4)) || ((r1 == r3) && (r3 == r4) && (r2 != r5) && (r1 != r2) && (r1 != r5)) 
     || ((r1 == r3) && (r3 == r5) && (r2 != r4) && (r1 != r2) && (r1 != r4)) || ((r1 == r4) && (r4 == r5) && (r2 != r3) && (r1 != r2) && (r1 != r3)) 
     || ((r2 == r3) && (r3 == r4) && (r1 != r5) && (r2 != r1) && (r2 != r5)) || ((r2 == r3) && (r3 == r5) && (r1 != r4) && (r2 != r1) && (r2 != r4)) 
     || ((r2 == r4) && (r4 == r5) && (r1 != r3) && (r2 != r1) && (r2 != r3)) || ((r3 == r4) && (r4 == r5) && (r1 != r2) && (r1 != r3) && (r3 !=r2)))
println "Three of a kind"

else

// Two pairs
if (((r1 == r2) && (r3 == r4) && (r5 != r1) && (r5 != r3)) || ((r1 == r2) && (r3 == r5) && (r4 != r1) && (r4 != r3)) || 
    ((r1 == r2) && (r4 == r5) && (r3 != r1) && (r3 != r4)) || ((r1 == r3) && (r2 == r4) && (r5 != r1) && (r5 != r2)) ||
    ((r1 == r3) && (r2 == r5) && (r4 != r1) && (r4 != r2)) || ((r1 == r3) && (r4 == r5) && (r2 != r1) && (r2 != r4)) ||
    ((r1 == r4) && (r2 == r5) && (r3 != r1) && (r3 != r2)) || ((r1 == r4) && (r3 == r5) && (r2 != r1) && (r2 != r3)) ||
    ((r1 == r4) && (r2 == r3) && (r5 != r1) && (r5 != r2)) || ((r1 == r5) && (r2 == r3) && (r4 != r1) && (r4 != r2)) ||
    ((r1 == r5) && (r2 == r4) && (r3 != r1) && (r3 != r2)) || ((r1 == r5) && (r3 == r4) && (r5 != r1) && (r5 != r3)))
println "Two pairs"

else

//Pair
if(((r1 == r2) && (r1 != r3) && (r1 != r4) && (r1 != r5) && (r3 != r4) && (r3 != r5) && (r4 != r5)) || 
   ((r1 == r3) && (r2 != r3) && (r1 != r4) && (r1 != r5) && (r2 != r4) && (r2 != r5) && (r4 != r5)) || 
   ((r1 == r4) && (r1 != r2) && (r1 != r3) && (r1 != r5) && (r2 != r3) && (r2 != r5) && (r3 != r5)) || 
   ((r1 == r5) && (r1 != r2) && (r1 != r3) && (r1 != r4) && (r2 != r3) && (r2 != r4) && (r3 != r4)) || 
   ((r2 == r3) && (r2 != r1) && (r2 != r4) && (r2 != r5) && (r1 != r4) && (r1 != r5) && (r4 != r5)) || 
   ((r2 == r4) && (r2 != r1) && (r2 != r3) && (r2 != r5) && (r1 != r3) && (r1 != r5) && (r3 != r5)) || 
   ((r2 == r5) && (r2 != r1) && (r2 != r3) && (r2 != r4) && (r1 != r3) && (r1 != r4) && (r3 != r4)) || 
   ((r3 == r4) && (r3 != r1) && (r3 != r2) && (r3 != r5) && (r1 != r2) && (r1 != r5) && (r2 != r5)) || 
   ((r3 == r5) && (r3 != r1) && (r3 != r2) && (r3 != r4) && (r1 != r2) && (r1 != r4) && (r2 != r4)) || 
   ((r4 == r5) && (r4 != r1) && (r4 != r2) && (r4 != r3) && (r1 != r2) && (r1 != r3) && (r2 != r3)))
println "Pair"
else
 print "Nothing"