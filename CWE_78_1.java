#(CWE-78)

String script = System.getProperty("SCRIPTNAME"); 
if (script != null)System.exec(script); 



#(CWE-78)

public String coordinateTransformLatLonToUTM(String coordinates){ 

String utmCoords = null; 
try { 

String latlonCoords = coordinates; 
Runtime rt = Runtime.getRuntime(); 
Process exec = rt.exec("cmd.exe /C latlon2utm.exe -" + latlonCoords); 

// process results of coordinate transform


// //...



} 
catch(Exception e) { 
//...
} 
return utmCoords; 

} 


#(CWE-78)

//...
String btype = request.getParameter("backuptype"); 
String cmd = new String("cmd.exe /K \"c:\\util\\rmanDB.bat "+btype+"&&c:\\utl\\cleanup.bat\"")
System.Runtime.getRuntime().exec(cmd); 
//...


