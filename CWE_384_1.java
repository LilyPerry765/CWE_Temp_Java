#(CWE-384)

private void auth(LoginContext lc, HttpSession session) throws LoginException { 
//...
lc.login(); 
//...
} 


