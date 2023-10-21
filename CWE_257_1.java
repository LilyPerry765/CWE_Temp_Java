#(CWE-257)

int VerifyAdmin(String password) { 
if (passwd.Equals(compress(password), compressed_password)) { 
return(0); 
} 

//Diagnostic Mode
return(1); 
} 


#(CWE-257)



# Java Web App ResourceBundle properties file
//...
webapp.ldap.username=secretUsernamewebapp.ldap.password=secretPassword//...


