#(CWE-184)

public String removeScriptTags(String input, String mask) { 
return input.replaceAll("script", mask); 
} 


