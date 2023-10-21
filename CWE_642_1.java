#(CWE-642)

Cookie[] cookies = request.getCookies(); 
for (int i =0; 
 i< cookies.length; 
 i++) { 
Cookie c = cookies[i]; 
if (c.getName().equals("authenticated") && Boolean.TRUE.equals(c.getValue())) { 
authenticated = true; 
} 
} 


#(CWE-642)

String rName = request.getParameter("reportName"); 
File rFile = new File("/usr/local/apfr/reports/" + rName); 
//...
rFile.delete(); 


#(CWE-642)

fis = new FileInputStream(cfg.getProperty("sub")+".txt"); 
amt = fis.read(arr); 
out.println(arr); 


