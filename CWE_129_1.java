#(CWE-129)

public String getValue(int index) { 
return array[index]; 
} 


#(CWE-129)

private void buildList ( int untrustedListSize ){ 
if ( 0 > untrustedListSize ){ 
die("Negative value supplied for list size, die evil hacker!"); 
} 
Widget[] list = new Widget [ untrustedListSize ]; 
list[0] = new Widget(); 
} 


#(CWE-129)



// Method called from servlet to obtain product information
public String displayProductSummary(int index) { 


String productSummary = new String(""); 

try { 
String productSummary = getProductSummary(index); 


} 
 catch (Exception ex) { 
//...
} 

return productSummary; 

} 

public String getProductSummary(int index) { 
return products[index]; 
} 


