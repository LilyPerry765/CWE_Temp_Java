#(CWE-609)

if (helper == null) { 

synchronized (this) { 
if (helper == null) { 
helper = new Helper(); 
} 
} 

} 
return helper; 


