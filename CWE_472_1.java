#(CWE-472)

String accountID = request.getParameter("accountID"); 
User user = getUserFromID(Long.parseLong(accountID)); 


