#(CWE-561)

public class DoubleDead { 
private void doTweedledee() { 
doTweedledumb(); 
} 
private void doTweedledumb() { 
doTweedledee(); 
} 
public static void main(String[] args) { 
System.out.println("running DoubleDead"); 
} 
} 


#(CWE-561)

public class Dead { 

String glue; 

public String getGlue() { 
return "glue"; 
} 

} 


