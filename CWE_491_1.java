#(CWE-491)

public class BankAccount implements Cloneable{ 

public Object clone(String accountnumber) throwsCloneNotSupportedException{ 

Object returnMe = new BankAccount(account number); 
//...


} 

} 


#(CWE-491)

protected Object clone() throws CloneNotSupportedException { 
//...
} 


