#(CWE-73)

String rName = request.getParameter("reportName"); 
File rFile = new File("/usr/local/apfr/reports/" + rName); 
//...
rFile.delete(); 


#(CWE-73)

fis = new FileInputStream(cfg.getProperty("sub")+".txt"); 
amt = fis.read(arr); 
out.println(arr); 


