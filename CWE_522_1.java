#(CWE-522)

//...
Properties prop = new Properties(); 
prop.load(new FileInputStream("config.properties")); 
String password = prop.getProperty("password"); 
DriverManager.getConnection(url, usr, password); 
//...


#(CWE-522)

//...
String password = regKey.GetValue(passKey).toString(); 
NetworkCredential netCred = new NetworkCredential(username,password,domain); 
//...


#(CWE-522)

int VerifyAdmin(String password) { 
if (passwd.Equals(compress(password), compressed_password)) { 
return(0); 
} 

//Diagnostic Mode
return(1); 
} 


#(CWE-522)



# Java Web App ResourceBundle properties file
//...
webapp.ldap.username=secretUsernamewebapp.ldap.password=secretPassword//...


