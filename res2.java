import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class res2 {
  static int selection (String prompt, String[] list){
    Scanner scanner = new Scanner(System.in);
    System.out.println(prompt);
    for (var i = 0; i<list.length; i++){
      int index = i+1;
      System.out.println(index + ") " + list[i]);
    }
    System.out.println();
    System.out.println("Select Option by Index: ");
    int option = scanner.nextInt();
    System.out.println();
    while(option > list.length){
      System.out.println("Invalid Option, Retry.");
      option = scanner.nextInt();
    }
    return option-1;
  }
  public static void main(String[] args){
    // MONEY AMOUNT
    Random rand = new Random();
    int upperbound = 5000;
    int CardBalance = rand.nextInt(upperbound);
    // INTRODUCTION
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to Our Restaurant!");
    System.out.println("What Is Your Name?");
    String name = scanner.nextLine();
    // RESERVATION CHECK
    String[] reservationOptions = {"Yes","No"};
    int reservation = selection("Do You Have a Reservation, "+name+"?", reservationOptions);
    if(reservation == 1){System.out.println("Get Out.");System.exit(1);}
    else {System.out.println("You May Enter.");}
    // MENU VARIABLES
    String[] menu = {"Pasta","Burger","Picapollo","Fritura","Salami","French Toast","Risotto","Cachapa"};
    int[] menuPrice = {650,430,200,75,60,500,750,480};
    int[] menuAmount = {0,0,0,0,0,0,0,0};
    // MENU DISPLAY
    while (true){
      System.out.println("\033[H\033[2J");
      System.out.flush();
      int menuSelection = selection("Here Is Our Menu. Input \"0\" If Finished", menu);
      if(menuSelection == -1){break;}
      System.out.println("How Many " + menu[menuSelection] + " Do You Want? ");
      int amount = scanner.nextInt();
      menuAmount[menuSelection] = amount;
      System.out.println();
    }
    // DESSERT VARIABLES
    String[] dessertMenu = {"Ice Cream","Coffee","Tiramisu","Bread Pudding","Key Lime Pie"};
    int[] dessertPrice = {120,260,300,250,170};
    int[] dessertAmount = {0,0,0,0,0};
    // DESSERT DISPLAY
    String[] dessertOptions = {"Yes","No"};
    int dessert = selection("Do You Want Dessert?",dessertOptions);
    if(dessert == 0){
      while(true){
        System.out.println("\033[H\033[2J");
        System.out.flush();
        int dessertSelection = selection("Here Is Our Dessert Menu. Input \"0\" If Finished", dessertMenu);
        if(dessertSelection == -1){break;}
        System.out.println("How Many " + dessertMenu[dessertSelection] + " Do You Want? ");
        int amount = scanner.nextInt();
        dessertAmount[dessertSelection] = amount;
        System.out.println();
      }
    }
    // RECEIPT
    int initialPrice = 0;
    System.out.println("------Items------");
    for(var i=0;i<menu.length;i++){
      if(menuAmount[i] > 0){
        System.out.println(menuAmount[i] + "x " + menu[i] + ": $" + menuPrice[i]*menuAmount[i]);
        initialPrice += menuPrice[i]*menuAmount[i];
      }
    }
    for(var i=0;i<dessertMenu.length;i++){
      if(dessertAmount[i] > 0){
        System.out.println(dessertAmount[i] + "x " + dessertMenu[i] + ": $" + dessertPrice[i]*dessertAmount[i]);
        initialPrice += dessertPrice[i]*dessertAmount[i];
      }
    }
    DecimalFormat round = new DecimalFormat("#");
    System.out.println("-----Receipt-----");
    System.out.println("Initial Price: $" + initialPrice);
    System.out.println("Service Fee: $" + round.format(initialPrice*0.1));
    System.out.println("ITBIS: $" + round.format(initialPrice*0.28));
    System.out.println("-----------------");
    int total = Integer.parseInt(round.format(initialPrice * 1.38));
    System.out.println("Final Total: $" + (total));
    System.out.println("-----------------");
    // Payment
    String[] paymentOptions = {"Cash","Card"};
    int payment = selection("Are you paying with cash or card? "+name+"?", paymentOptions);
    // Card Option


    if (payment == 1){
        if (CardBalance >= (total)){
            CardBalance = (CardBalance - total);
            System.out.println("The Card Approved, Here's your card.");
        }
        else if (CardBalance < (total)){
            
            String[] YesNo = {"Yes","No"};
            int carddecline = selection("Your card has declined, would you like to pay with cash? "+name+"?", YesNo);
            if (carddecline == 0){
                payment = (0);
            }
            else{
                System.out.println("Get out.");
            }   
        }
    }
    // Cash Option
if (payment == 0){
  System.out.println("How much money do you have? ");
  int CashBalance = scanner.nextInt(); 
  
  
  scanner.nextLine();
  
  if (CashBalance >= (total)){
    System.out.println("Enter the amount you want to pay: ");
    int cashGive = scanner.nextInt();
    int change = cashGive - total;

    System.out.println("Here's your Change.");
    
    if (change >= 100) {
      int hundredPesos = change / 100;
      change %= 100;
      System.out.println("100 Pesos Bills: " + hundredPesos);
    }
    if (change >= 50) {
      int fiftyPesos = change / 50;
      change %= 50;
      System.out.println("50 Pesos Bills: " + fiftyPesos);
    }
    if (change >= 25) {
      int twentyFivePesos = change / 25;
      change %= 25;
      System.out.println("25 Pesos Coins: " + twentyFivePesos);
    }
    if (change >= 10) {
      int tenPesos = change / 10;
      change %= 10;
      System.out.println("10 Pesos Coins: " + tenPesos);
    }
    if (change >= 5) {
      int fivePesos = change / 5;
      change %= 5;
      System.out.println("5 Pesos Coins: " + fivePesos);
    }
    if (change >= 1) {
      System.out.println("1 Pesos Coins: " + change);
    }
  }
      
      else if(CashBalance < (total)){
        System.out.println("Your cash balance is not sufficient. ");
        String[] YesNo = {"Yes","No"};
        int broke = selection("You don't have enough money, you got a card? "+name+"?", YesNo);
      
      if (broke == 0){
        if (CardBalance >= (total)){
            CardBalance = (CardBalance - total);
            System.out.println("Here's your card.");
        }
        else{
            System.out.println("You don't have enough money, get out.");
        }
      }
      }
    }
    scanner.close();
    System.out.println("Goodbye and have a good day, " + name);
    
}

  }




