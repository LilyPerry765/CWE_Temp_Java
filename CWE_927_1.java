#(CWE-927)

Intent intent = new Intent(); 
intent.setAction("com.example.CreateUser"); 
intent.putExtra("Username", uname_string); 
intent.putExtra("Password", pw_string); 
sendBroadcast(intent); 


#(CWE-927)

Intent intent = new Intent(); 
intent.setAction("com.example.service.UserExists"); 
intent.putExtra("Username", uname_string); 
sendStickyBroadcast(intent); 


#(CWE-927)

Intent intent = new Intent(); 
intent.setAction("com.example.OpenURL"); 
intent.putExtra("URL_TO_OPEN", url_string); 
sendOrderedBroadcastAsUser(intent); 


#(CWE-927)

Intent intent = new Intent(); 
intent.setAction("com.example.BackupUserData"); 
intent.setData(file_uri); 
intent.addFlags(FLAG_GRANT_READ_URI_PERMISSION); 
sendBroadcast(intent); 


