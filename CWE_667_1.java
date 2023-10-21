#(CWE-667)

private long someLongValue; 
public long getLongValue() { 
return someLongValue; 
} 

public void setLongValue(long l) { 
someLongValue = l; 
} 


#(CWE-667)

if (helper == null) { 

synchronized (this) { 
if (helper == null) { 
helper = new Helper(); 
} 
} 

} 
return helper; 


