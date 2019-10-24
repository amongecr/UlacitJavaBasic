package introprogramacioni;
/**
 *
 * @author allanmonge
 */
public class account {
    
    private String customerName = "";
    private String custumerLastName = "";
    private double balance = 0.0; 
    private String userPin = "";
    private String accountNumber = "";
    
    public account(String customerName, String custumerLastName,double balance,String userPin, String accountNumber)
    {
        this.customerName = customerName;
        this.custumerLastName = custumerLastName;
        this.balance = balance;
        this.userPin = userPin;
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustumerLastName() {
        return custumerLastName;
    }

    public void setCustumerLastName(String custumerLastName) {
        this.custumerLastName = custumerLastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserPin() {
        return userPin;
    }

    public void setUserPin(String userPin) {
        this.userPin = userPin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public double addMoney(double money)
    {
        this.balance = this.balance + money;
        return this.balance;
    }
    
    public boolean extractMoney(double wanted)
    {
        boolean resultado;
        if(this.balance >= wanted){
            this.balance = this.balance - wanted;
            resultado = true;
        }
        else 
            resultado = false;
        return resultado;
    }
    
    
    
}
