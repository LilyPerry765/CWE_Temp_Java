#(CWE-346)

IntentFilter filter = new IntentFilter("com.example.RemoveUser"); 
MyReceiver receiver = new MyReceiver(); 
registerReceiver(receiver, filter); 

public class DeleteReceiver extends BroadcastReceiver { 
@Overridepublic void onReceive(Context context, Intent intent) { 
int userID = intent.getIntExtra("userID"); 
destroyUserData(userID); 
} 
} 


#(CWE-346)


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


