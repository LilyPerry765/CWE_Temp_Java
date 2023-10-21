#(CWE-749)

public void removeDatabase(String databaseName) { 

try { 

Statement stmt = conn.createStatement(); 
stmt.execute("DROP DATABASE " + databaseName); 


} 
 catch (SQLException ex) { 
//...
} 

} 


#(CWE-749)


// Android
@Overridepublic boolean shouldOverrideUrlLoading(WebView view, String url){ 

if (url.substring(0,14).equalsIgnoreCase("examplescheme:")){ 
if(url.substring(14,25).equalsIgnoreCase("getUserInfo")){ 
writeDataToView(view, UserData); 
return false; 
} 
else{ 
return true; 
} 
} 

} 


#(CWE-749)

public class WebViewGUI extends Activity { 

WebView mainWebView; 

public void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
mainWebView = new WebView(this); 
mainWebView.getSettings().setJavaScriptEnabled(true); 
mainWebView.addJavascriptInterface(new JavaScriptInterface(), "userInfoObject"); 
mainWebView.loadUrl("file:///android_asset/www/index.html"); 
setContentView(mainWebView); 
} 

final class JavaScriptInterface { 

JavaScriptInterface () { 
} 

public String getUserInfo() { 
return currentUser.Info(); 
} 

} 

} 


#(CWE-749)

final class JavaScriptInterface { 

JavaScriptInterface () { 
 } 

@JavascriptInterfacepublic String getUserInfo() { 
return currentUser.Info(); 
} 

} 


