#(CWE-178)

public String preventXSS(String input, String mask) { 
return input.replaceAll("script", mask); 
} 


