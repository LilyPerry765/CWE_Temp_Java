#(CWE-272)

AccessController.doPrivileged(new PrivilegedAction() { 

public Object run() { 

// privileged code goes here, for example:
System.loadLibrary("awt"); 
return null; 

// nothing to return

} 




