println "Please choose an option:"println "For ’Checking you balance’, please enter 1" 
println "For ’Purchases’, please enter 2"println "For ’Refunds’, please enter 3"println "For ’Queries about the warranty’, please enter 4" 
println "For ’Returning faulty goods’, please enter 5" 
println "For any other query, please enter 0"String str = System.console().readLine()
int choice = Integer.parseInt(str)
switch (choice) {case 1:// go and check balance
println "Checking Balance"
println "£320.00"   break; case 2:// go and purchase something
println "Purchasing new guitar, please hold"
println "£320.00 processed to your registered card. Thank you for shopping"   break; case 3:// go and process refunds
println "Purchase detected, new guitar, please hold"
println "£320.00 refund now processed to your registered card. Thank you for shopping"   break; case 4:// go and answer queries
println "Purchase Detected: Guitar, bought 03/10/2015"
println "Warranty is valid until 03/10/2020"   break; case 5:// return faulty goods
println "Purchase Detected: Guitar, bought 03/10/2015"
println "Return accepted, please send to 39 Brydon Walk, N1 0UU, LONDON"   break; default:
println "transferring to operator"// go and talk with a human operatorbreak; }