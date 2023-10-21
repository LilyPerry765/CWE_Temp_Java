#(CWE-772)

private void processFile(string fName){ 
BufferReader fil = new BufferReader(new FileReader(fName)); 
String line; 
while ((line = fil.ReadLine()) != null){ 
processLine(line); 
} 
} 


#(CWE-772)

try { 
Connection con = DriverManager.getConnection(some_connection_string); 
} 
catch ( Exception e ) { 
log( e ); 
} 


