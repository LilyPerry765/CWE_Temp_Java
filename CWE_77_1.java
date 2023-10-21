#(CWE-77)

//...
String btype = request.getParameter("backuptype"); 
String cmd = new String("cmd.exe /K \"c:\\util\\rmanDB.bat "+btype+"&&c:\\utl\\cleanup.bat\"")
System.Runtime.getRuntime().exec(cmd); 
//...


#(CWE-77)

//...
String home = System.getProperty("APPHOME"); 
String cmd = home + INITCMD; 
java.lang.Runtime.getRuntime().exec(cmd); 
//...


