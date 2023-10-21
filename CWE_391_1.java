#(CWE-391)

try { 
doExchange(); 
} 
catch (RareException e) { 



// this can never happen


} 


