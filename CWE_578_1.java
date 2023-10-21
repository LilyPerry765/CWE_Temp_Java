#(CWE-578)

@Statelesspublic class InterestRateBean implements InterestRateRemote { 


private Document interestRateXMLDocument = null; 

public InterestRateBean() { 

try { 



// get XML document from the local filesystem as an input stream


// using the ClassLoader for this class
ClassLoader loader = this.getClass().getClassLoader(); 
InputStream in = loader.getResourceAsStream(Constants.INTEREST_RATE_FILE); 





DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); 
DocumentBuilder db = dbf.newDocumentBuilder(); 
interestRateXMLDocument = db.parse(interestRateFile); 
} 
 catch (IOException ex) { 
//...
} 

} 


public BigDecimal getInterestRate(Integer points) { 
return getInterestRateFromXML(points); 
} 


/* member function to retrieve interest rate from XML document on the local file system */

private BigDecimal getInterestRateFromXML(Integer points) { 
//...
} 

} 


#(CWE-578)

@Statelesspublic class LoaderSessionBean implements LoaderSessionRemote { 


public LoaderSessionBean() { 
try { 
ClassLoader loader = new CustomClassLoader(); 
Class c = loader.loadClass("someClass"); 
Object obj = c.newInstance(); 
/* perform some task that uses the new class instance member variables or functions *///...
} 
 catch (Exception ex) { 
//...
} 
} 

public class CustomClassLoader extends ClassLoader { 

} 

} 


