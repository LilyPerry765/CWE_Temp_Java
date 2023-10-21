#(CWE-908)

private boolean initialized = true; 
public void someMethod() { 

if (!initialized) { 



// perform initialization tasks
//...

initialized = true; 

} 




