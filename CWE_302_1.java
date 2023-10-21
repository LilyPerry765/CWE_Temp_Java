#(CWE-302)

boolean authenticated = new Boolean(getCookieValue("authenticated")).booleanValue(); 
if (authenticated) { 
//...
} 


