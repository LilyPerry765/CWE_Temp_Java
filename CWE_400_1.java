#(CWE-400)

class Worker implements Executor { 

//...
public void execute(Runnable r) { 


try { 
//...
} 
catch (InterruptedException ie) { 



// postpone response
Thread.currentThread().interrupt(); 

} 

} 

public Worker(Channel ch, int nworkers) { 
//...
} 

protected void activate() { 


Runnable loop = new Runnable() { 


public void run() { 


try { 
for (; 
; 
) { 
Runnable r = //...
; 
r.run(); 
} 
} 
catch (InterruptedException ie) { 
//...
} 

} 

} 
; 
new Thread(loop).start(); 

} 

} 


#(CWE-400)

public void acceptConnections() { 


try { 
ServerSocket serverSocket = new ServerSocket(SERVER_PORT); 
int counter = 0; 
boolean hasConnections = true; 
while (hasConnections) { 
Socket client = serverSocket.accept(); 
Thread t = new Thread(new ClientSocketThread(client)); 
t.setName(client.getInetAddress().getHostName() + ":" + counter++); 
t.start(); 
} 
serverSocket.close(); 


} 
 catch (IOException ex) { 
//...
} 

} 


