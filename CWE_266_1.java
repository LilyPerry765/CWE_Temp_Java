#(CWE-266)

AccessController.doPrivileged(new PrivilegedAction() { 

public Object run() { 

// privileged code goes here, for example:
System.loadLibrary("awt"); 
return null; 

// nothing to return

} 




#(CWE-266)

Intent intent = new Intent(); 
intent.setAction("com.example.BackupUserData"); 
intent.setData(file_uri); 
intent.addFlags(FLAG_GRANT_READ_URI_PERMISSION); 
sendBroadcast(intent); 


