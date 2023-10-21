#(CWE-584)

try { 
//...
throw IllegalArgumentException(); 
} 
finally { 
return r; 
} 


