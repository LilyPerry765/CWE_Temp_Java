#(CWE-290)

String sourceIP = request.getRemoteAddr(); 
if (sourceIP != null && sourceIP.equals(APPROVED_IP)) { 
authenticated = true; 
} 


#(CWE-290)

while(true) { 

DatagramPacket rp=new DatagramPacket(rData,rData.length); 
outSock.receive(rp); 
String in = new String(p.getData(),0, rp.getLength()); 
InetAddress clientIPAddress = rp.getAddress(); 
int port = rp.getPort(); 

if (isTrustedAddress(clientIPAddress) & secretKey.equals(in)) { 
out = secret.getBytes(); 
DatagramPacket sp =new DatagramPacket(out,out.length, IPAddress, port); 
 outSock.send(sp); 
} 

} 


#(CWE-290)

String ip = request.getRemoteAddr(); 
InetAddress addr = InetAddress.getByName(ip); 
if (addr.getCanonicalHostName().endsWith("trustme.com")) { 
trusted = true; 
} 


