#(CWE-7)
Public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {try {...} catch (ApplicationSpecificException ase) {logger.error("Caught: " + ase.toString());}}
try {...} catch (ApplicationSpecificException ase) {logger.error("Caught: " + ase.toString());}
...
logger.error("Caught: " + ase.toString());
#(CWE-7)

Public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
try { 
//...
} 
 catch (ApplicationSpecificException ase) { 
logger.error("Caught: " + ase.toString()); 
} 
} 


