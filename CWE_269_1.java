#(CWE-269)

AccessController.doPrivileged(new PrivilegedAction() { 

public Object run() { 

// privileged code goes here, for example:
System.loadLibrary("awt"); 
return null; 

// nothing to return

} 




#(CWE-269)

public enum Roles { 
ADMIN,USER,GUEST} 

public void printDebugInfo(User requestingUser){ 

if(isAuthenticated(requestingUser)){ 

switch(requestingUser.role){ 

case GUEST:System.out.println("You are not authorized to perform this command"); 
break; 

default:System.out.println(currentDebugState()); 
break; 


} 

} 
else{ 
System.out.println("You must be logged in to perform this command"); 
} 

} 


#(CWE-269)

public enum Roles { 
ADMIN,OPERATOR,USER,GUEST} 

public void resetPassword(User requestingUser, User user, String password ){ 

if(isAuthenticated(requestingUser)){ 

switch(requestingUser.role){ 

case GUEST:System.out.println("You are not authorized to perform this command"); 
break; 

case USER:System.out.println("You are not authorized to perform this command"); 
break; 

default:setPassword(user,password); 
break; 
} 

} 


else{ 
System.out.println("You must be logged in to perform this command"); 
} 

} 


