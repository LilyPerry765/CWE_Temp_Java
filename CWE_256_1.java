#(CWE-256)

//...
Properties prop = new Properties(); 
prop.load(new FileInputStream("config.properties")); 
String password = prop.getProperty("password"); 
DriverManager.getConnection(url, usr, password); 
//...


#(CWE-256)

//...
String password = regKey.GetValue(passKey).toString(); 
NetworkCredential netCred = new NetworkCredential(username,password,domain); 
//...


#(CWE-256)



# Java Web App ResourceBundle properties file
//...
webapp.ldap.username=secretUsernamewebapp.ldap.password=secretPassword//...


