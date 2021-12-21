public class CreditCard {
    // data fields
    private Money balance, creditLimit;
    private Person owner;

    // constructor implementation
    /**
     * constructor creates a CreditCard using two parameters
     * 
     * @param newCardHolder to initialize the owner
     * @param limit         to initialize the creditLimit
     */
    public CreditCard(Person newCardHolder, Money limit) {
        balance = new Money(0);
        owner = newCardHolder;
        creditLimit = new Money(limit);
    }

    // accessor methods implementation
    /**
     * getBalance method gets the value of balance
     * 
     * @return a new Money object has the same value with balance object
     */
    public Money getBalance() {
        return new Money(balance);
    }

    /**
     * getCreditLimit method gets the value of credit limit
     * 
     * @return a new Money object has the same value with creditLimit object
     */
    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    /**
     * getPersonals method gets the information about the owner
     * 
     * @return the information about the owner
     */
    public String getPersonals() {
        return owner.toString();
    }

    /**
     * charge method will charge to the credit card by adding the amount of Money in
     * the parameter to the balance if it will not exceed the credit limit. If the
     * credit limit will be exceeded, the amount should not be added, and an error
     * message can be printed to the console.
     * 
     * @param amount the amount of money to charge to balance
     */
    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) == 1) {
            System.out.println("Exceeds credit limit");
        } else {
            System.out.println("Charge: " + amount);
            balance = balance.add(amount);
        }
    }

    /**
     * payment method will make a payment on the credit card by subtracting the
     * amount of Money in the parameter from the balance.
     * 
     * @param amount the amount of money to subtract from balance
     */
    public void payment(Money amount) {
        System.out.println("Payment: " + amount);
        balance = balance.subtract(amount);
    }
}
