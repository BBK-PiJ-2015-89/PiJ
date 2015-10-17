int rank1, rank2, rank3, rank4, rank5, hearts, spades, diamonds, clubs, num
int count = 1
boolean proceed = false
while (count <=5 && !proceed)
//user will be stuck in while, whilst card count is 5 or less. Users will only enter while if proceed = false
{
    print "please enter card number " + count + "'s ranks (number, or lower case 'jack', 'king', 'queen', 'ace'): "
    String s = System.console().readLine()
    if (s == "2" ||s == "3" ||s == "4" || s =="5" || s =="6" || s =="7" ||s == "8" ||s == "9" ||s == "10" || s =="king" || s =="jack" ||s == "queen" ||s == "ace")
    {
       if (s == "king")
        {
            num = 13
        }
            else if (s == "queen")
            {
                num = 12
            }
                else if (s == "jack")
                {
                    num = 11
                }
                    else if (s == "ace")
                    {
                        num = 1
                    }
                        else
                        {
                            num = Integer.parseInt(s)
                        }
                    if (num > 0 || num < 14)
                    {
                        //if the number was entered correctly we move forward, proceed is set to true to allow the kind to be entered once the rank is processed into place below.
                        proceed = true
                        if (num >= rank5)
                        {
                            rank1 = rank2
                            rank2 = rank3
                            rank3 = rank4
                            rank4 = rank5
                            rank5 = num
                        }
                            else if (num >= rank4)
                            {
                                rank1 = rank2
                                rank2 = rank3
                                rank3 = rank4
                                rank4 = num
                            }
                                else if (num >= rank3)
                                {
                                    rank1 = rank2
                                    rank2 = rank3
                                    rank3 = num
                                }
                                    else if (num >= rank2)
                                    {
                                        rank1 = rank2
                                        rank2 = num
                                    }
                                        else
                                        {
                                            rank1 = num			
                                        }
                    }
        }
        else
        {
             println "Incorrect card number entered, please try again"
             //proceed still = false therefore at this point, we do not move into next while but to end and back again, we meet the conditions again and therefore the user is asked to re-enter the number they typed incorrectly.
        }
                                    while (proceed)
                                    // as we entered a correct number proceed was set true, therefore we enter this while, and we're stuck here until we enter a correct kind of card.
                                    {
                                        print "Please enter card number " + count + "'s kind (i.e hearts, clubs, spades or diamonds): "
                                        s = System.console().readLine()
                                        if (s == "hearts" || s == "diamonds" ||s ==  "spades" || s == "clubs")
                                        {
                                             proceed = false
                                             //if correct kind is entered, proceed is set to false to stop us coming back here and allowing us to re-enter the original while at the top of the programme.
                                            count = count + 1        
                                            if (s == "hearts")
                                            {
                                                hearts = hearts + 1
                                            }
                                                else if (s == "diamonds")
                                                {
                                                    diamonds = diamonds + 1
                                                }
                                                    else if (s == "spades")
                                                    {
                                                        spades = spades + 1
                                                    }
                                                        else if (s == "clubs")
                                                        {
                                                            clubs = clubs + 1
                                                        } 
                                        }
                                        else
                                        {
                                           println "Sorry that kind is not recognised, use either 'diamonds' 'clubs' 'spades' 'hearts'"
                                           //if the kind is not recognised, proceed remains as true and therefore we remain in this while and the user is asked to try again.
                                        }        
                                    }
                                    }
//if we get to here we have entered 5 card details correct, making the count of the cards 6 meaning we cannot enter the overall while.
String result
if (clubs == 5 || diamonds == 5 || spades == 5 || hearts == 5)
{
    //as we have ordered consecutively - minusing the ranks should give a result of 1 or -1 if they are straight.
    if ((rank5 - rank4) == 1 && (rank4 - rank3) == 1 && (rank3 - rank2) == 1 && (rank2 - rank1) == 1)
    {
       println "Your hand is a straight flush"
    }
        else
        {
             println "Your hand is a flush"
        }
}
    else if ((rank5 - rank4) == 1 && (rank4 - rank3) == 1 && (rank3 - rank2) == 1 && (rank2 - rank1) == 1)
    {
        println "You have a straight hand"
    }
        else if ((rank1 == rank2 && rank2 == rank3 && rank3 == rank4) || (rank2 == rank3 && rank3 == rank4 && rank4 == rank5))
             {
                println "You have a POKER hand"
             }
             else if ((rank1 - rank3 == 0 && rank4 == rank5) || (rank1 == rank2 && rank3 - rank5 == 0))
                      {
                        println "You have a full house"
                      }
                      //as we have ordered the cards, taking away the last card in the series from the will produce zero if they are identical, and if they are identical, that means all inbetween are too.
                      else if (rank1 - rank3 == 0 || rank2 - rank4 == 0 || rank3 - rank5 == 0)
                      {
                        println "You have three of a kind"
                      }
                      else if (rank1 == rank2 && rank3 == rank4 || rank1 == rank2 && rank4 == rank5 || rank2 == rank3 && rank4 == rank5)
                      {
                        println "You have two pairs"
                      }
                      else if (rank1 == rank2 || rank2 == rank3 || rank3 == rank4 || rank4 == rank5)
                      {
                        println "You have 1 pair"
                      }
                      else
                      {
                        println "You have nothing"
                      }