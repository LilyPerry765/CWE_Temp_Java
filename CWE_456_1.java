#(CWE-456)

private User user; 
public void someMethod() { 



// Do something interesting.
//...


// Throws NPE if user hasn't been properly initialized.
String username = user.getName(); 

} 


#(CWE-456)

public class BankManager { 




// user allowed to perform bank manager tasks
private User user = null; 
private boolean isUserAuthentic = false; 


// constructor for BankManager class
public BankManager() { 
//...
} 


// retrieve user from database of users
public User getUserFromUserDatabase(String username){ 
//...
} 


// set user variable using username
public void setUser(String username) { 
this.user = getUserFromUserDatabase(username); 
} 


// authenticate user
public boolean authenticateUser(String username, String password) { 
if (username.equals(user.getUsername()) && password.equals(user.getPassword())) { 
isUserAuthentic = true; 
} 
return isUserAuthentic; 
} 


// methods for performing bank manager tasks
//...

} 


