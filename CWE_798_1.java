#(CWE-798)

//...
DriverManager.getConnection(url, "scott", "tiger"); 
//...


#(CWE-798)

int VerifyAdmin(String password) { 
if (!password.equals("Mew!")) { 
return(0)} 
//Diagnostic Modereturn(1); 
} 


#(CWE-798)

public boolean VerifyAdmin(String password) { 
if (password.equals("68af404b513073584c4b6f22b6c63e6b")) { 
System.out.println("Entering Diagnostic Mode//...
"); 
return true; 
} 
System.out.println("Incorrect Password!"); 
return false; 



#(CWE-798)



# Java Web App ResourceBundle properties file
//...
webapp.ldap.username=secretUsernamewebapp.ldap.password=secretPassword//...


