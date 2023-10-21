#(CWE-493)

public final class WidgetData extends Applet { 
public float price; 
//...
public WidgetData(//...
) { 
this.price = LookupPrice("MyWidgetType"); 
} 
} 


#(CWE-493)

public String configPath = new String("/etc/application/config.dat"); 


