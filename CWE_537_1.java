#(CWE-537)

public class InputFileRead { 


private File readFile = null; 
private FileReader reader = null; 
private String inputFilePath = null; 
private final String DEFAULT_FILE_PATH = "c:\\somedirectory\\"; 

public InputFileRead() { 
inputFilePath = DEFAULT_FILE_PATH; 
} 

public void setInputFile(String inputFile) { 



/* Assume appropriate validation / encoding is used and privileges / permissions are preserved */


} 

public void readInputFile() { 

try { 
reader = new FileReader(readFile); 
//...
} 
 catch (RuntimeException rex) { 
System.err.println("Error: Cannot open input file in the directory " + inputFilePath); 
System.err.println("Input file has not been set, call setInputFile method before calling readInputFile"); 


} 
 catch (FileNotFoundException ex) { 
//...
} 


} 

} 


#(CWE-537)

public class BankManagerLoginServlet extends HttpServlet { 

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 

try { 



// Get username and password from login page request
String username = request.getParameter("username"); 
String password = request.getParameter("password"); 

// Authenticate user
BankManager bankMgr = new BankManager(); 
boolean isAuthentic = bankMgr.authenticateUser(username, password); 

// If user is authenticated then go to successful login page
if (isAuthentic) { 
request.setAttribute("login", new String("Login Successful.")); 
getServletContext().getRequestDispatcher("/BankManagerServiceLoggedIn.jsp"). forward(request, response); 
} 
else { 



// Otherwise, raise failed login exception and output unsuccessful login message to error page
throw new FailedLoginException("Failed Login for user " + username + " with password " + password); 

} 

} 
 catch (FailedLoginException ex) { 



// output failed login message to error page
request.setAttribute("error", new String("Login Error")); 
request.setAttribute("message", ex.getMessage()); 
getServletContext().getRequestDispatcher("/ErrorPage.jsp").forward(request, response); 

} 

} 




