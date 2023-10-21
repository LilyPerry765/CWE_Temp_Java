#(CWE-112)



// Read DOM
try { 
//...
DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); 
factory.setValidating( false ); 
//...
.c_dom = factory.newDocumentBuilder().parse( xmlFile ); 
} 
 catch(Exception ex) { 
//...
} 


#(CWE-112)

DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance(); 
builderFactory.setNamespaceAware(true); 
DocumentBuilder builder = builderFactory.newDocumentBuilder(); 


