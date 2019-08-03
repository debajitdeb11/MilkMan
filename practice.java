public class practice{
  public static void main(String[] args) {

    // This command will call the function getmilk();
  int change = getmilk(10, 1000);
  System.out.println("Hello Debajit, Take your change of $" +change);

  }
  // Here we are creating a funtion to fetch milk from the store
  /* public static void getmilk(){
    System.out.println("Take my money");
    System.out.println("Go to the shop");
    System.out.println("Buy Some Milk");
    System.out.println("& Come back to home");
  } */

  public static int getmilk(int nrOfCartoonsToBuy, int startingAmount){

    int priceToPay = nrOfCartoonsToBuy*10;

    System.out.println("Take my money");
    System.out.println("Go to the shop");
    System.out.println("Buy Milk" +"& No of cartoons are:" +nrOfCartoonsToBuy );
    System.out.println("& Come back to home");
    System.out.println("The total price of the milk is :" +priceToPay);


    return startingAmount - priceToPay;

  }
}
