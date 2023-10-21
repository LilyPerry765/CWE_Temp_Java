#(CWE-252)

FileInputStream fis; 
byte[] byteArray = new byte[1024]; 
for (Iterator i=users.iterator(); 
 i.hasNext(); 
) { 

String userName = (String) i.next(); 
String pFileName = PFILE_ROOT + "/" + userName; 
FileInputStream fis = new FileInputStream(pFileName); 
fis.read(byteArray); 
 // the file is always 1k bytesfis.close(); 
processPFile(userName, byteArray); 





#(CWE-252)

String itemName = request.getParameter(ITEM_NAME); 
if (itemName.compareTo(IMPORTANT_ITEM) == 0) { 
//...
} 
//...


#(CWE-252)

String itemName = request.Item(ITEM_NAME); 
if (itemName.Equals(IMPORTANT_ITEM)) { 
//...
} 
//...


#(CWE-252)

System.clearProperty("os.name"); 
//...
String os = System.getProperty("os.name"); 
if (os.equalsIgnoreCase("Windows 95")) System.out.println("Not supported"); 


