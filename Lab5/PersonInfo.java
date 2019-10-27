import java.io.Serializable;
import java.util.*;

class PersonInfo implements Serializable
{
    
    String name ;
    String accNo;
    transient String pcode;
    float amount = 1000;

    PersonInfo (String name , String accNo , String pcode)
    {
        this.name = name;
        this.accNo = accNo;
        this.pcode = pcode;
    }



    // GETTER AND SETTER

    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }

    /**
     * @return the accNo
     */
    public String getAccNo() {
        return accNo;
    }

    /**
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    void withdraw(float amount)
    {
        if(this.amount >= amount)
        this.amount = this.amount - amount;
        else
        System.out.println("You amount in bank is too low to WITHDRAW");
    }
    
    void deposit(float amount)
    {
          this.amount = this.amount + amount;
        
    }

    void printPerson()
    {
        System.out.println("Name : - " + name + "AccountNo : - " + accNo + "Amount : - " + amount );
    }
    



}