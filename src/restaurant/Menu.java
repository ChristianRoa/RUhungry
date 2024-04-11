package restaurant;
/**
 * Use this class to test your Menu method. 
 * This class takes in two arguments:
 * - args[0] is the menu input file
 * - args[1] is the output file
 * 
 * This class:
 * - Reads the input and output file names from args
 * - Instantiates a new RUHungry object
 * - Calls the menu() method 
 * - Sets standard output to the output and prints the restaurant
 *   to that file
 * 
 * To run: java -cp bin restaurant.Menu menu.in menu.out
 * 
 */
public class Menu {
    public static void main(String[] args) {

	// 1. Read input files
	// Files are hardcoded so no need to provide arguments 
        String inputFile = "menu.in";
        String stockInputFile = "stock.in"; //Use to test method 3
        String orderInputFile = "order1.in"; //Use to method 8
        //  String donationInputFile = "donate1.in"; //Use to method 10
        //String restockInputFile = "restock1.in"; //Use to test method 11
        //String transactionInputFile = "transaction1.in"; //Use as a final test
        String outputFile = "stock.out"; 
	
        // 2. Instantiate an RUHungry object
        RUHungry rh = new RUHungry();

	// 3. Call the menu() method to read the menu

        rh.menu(inputFile); //works

        rh.createStockHashTable(stockInputFile); //Finish method 3; works
        rh.updateStock("Blue Raspberry Syrup", -1, 5); //works
        rh.updateStock(null, 142, 45); //works
        rh.updatePriceAndProfit(); //Finish method 6 //works
        readOrders(orderInputFile, rh); //Finish method 8 (uncomment readOrders)
        //  readDonations(donationInputFile, rh); //Finish method 10 (uncomment readDonations)
        //readRestock(restockInputFile, rh); //Finish method 11 (uncomment readRestock)
        //transactions(outputFile, rh); Final testing (uncomment readOrders2, readDonations2, readRestock2)
        
	// 4. Set output file
	// Delete this line if you want to print to the console
        StdOut.setFile(outputFile);

	// 5. Print restaurant, don't edit
        rh.printRestaurant();
    }

    
    //Uncomment this to test method 8
    public static void readOrders (String fileName, RUHungry rh)
    {
        StdIn.setFile(fileName);
        int numOfOrders = Integer.parseInt(StdIn.readLine()); 
        for (int  i = 0; i<numOfOrders; i++)
        {
                int amount = StdIn.readInt();
                StdIn.readChar();
                String item = StdIn.readLine();
                rh.order(item, amount);
        }
    }

    //uncomment this to test method 10
//     public static void readDonations (String fileName, RUHungry rh)
//     {
//         StdIn.setFile(fileName);
//         int numOfDonations = Integer.parseInt(StdIn.readLine()); 
//         for (int  i = 0; i<numOfDonations; i++)
//         {
//                 int amount = StdIn.readInt();
//                 StdIn.readChar();
//                 String item = StdIn.readLine();
//                 rh.donation(item, amount);
//         }
//     }

    //uncomment to test method 11
//     public static void readRestock (String fileName, RUHungry rh)
//     {
//         StdIn.setFile(fileName);
//         int numOfRestock = Integer.parseInt(StdIn.readLine()); 
//         for (int  i = 0; i<numOfRestock; i++)
//         {
//                 int amount = StdIn.readInt();
//                 StdIn.readChar();
//                 String item = StdIn.readLine();
//                 rh.restock(item, amount);
//         }
//     }

//      //Uncomment if you try to run transaction
//      public static void readOrders2 (String dishName, int dishQuantity, RUHungry rh)
//     {
//         rh.order(dishName, dishQuantity);
//     }


//      //Uncomment if you try to run transaction
//       public static void readDonations2 (String dishName, int dishQuantity, RUHungry rh)
//     {
        
//         rh.donation(dishName, dishQuantity);
        
//     } 

//      //Uncomment if you try to run transaction
//      public static void readRestock2 (String dishName, int dishQuantity, RUHungry rh)
//     {
           
//         rh.restock(dishName, dishQuantity);
//     } 

//     //Uncomment to test the transaction files (this is not mandatory, but reccomended)
//     public static void transactions (String fileName, RUHungry rh)
//     {
//         StdIn.setFile(fileName);
//         int numOfTransactions = StdIn.readInt(); 
//         StdIn.readLine();
//         for (int i = 0; i<numOfTransactions; i++)
//         {
//                 String type = StdIn.readString();
//                 StdIn.readChar();
//                 int amount = StdIn.readInt();
//                 StdIn.readChar();
//                 String item = StdIn.readLine();

//                 if(type.equals("order"))
//                 {
//                         readOrders2(item, amount, rh);
//                 }
//                 else if (type.equals("donation"))
//                 {
//                         readDonations2(item, amount, rh);
//                 }
//                 else if (type.equals("restock"))
//                 {
//                         readRestock2(item, amount, rh);
//                 }
//            }
//         } 



    
}
