public class Runner {

public static void main(String[] args){
    Customer customer1 = new Customer("Jack", 72, 50);
    String name = customer1.getName();
    int age = customer1.getAge();
    customer1.setWallet(70);
    double wallet = customer1.getWallet();

    System.out.println(name);
    System.out.println(age);
    System.out.println(wallet);

}


}
