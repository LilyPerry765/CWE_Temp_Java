#(CWE-350)

String ip = request.getRemoteAddr(); 
InetAddress addr = InetAddress.getByName(ip); 
if (addr.getCanonicalHostName().endsWith("trustme.com")) { 
trusted = true; 
} 


#(CWE-350)

while(true) { 

DatagramPacket rp=new DatagramPacket(rData,rData.length); 
outSock.receive(rp); 
String in = new String(p.getData(),0, rp.getLength()); 
InetAddress IPAddress = rp.getAddress(); 
int port = rp.getPort(); 
if ((rp.getHostName()==//...
) & (in==//...
)) { 


out = secret.getBytes(); 
DatagramPacket sp =new DatagramPacket(out,out.length, IPAddress, port); 
outSock.send(sp); 

} 

} 


