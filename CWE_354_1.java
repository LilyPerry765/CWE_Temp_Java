#(CWE-354)

while(true) { 
DatagramPacket packet = new DatagramPacket(data,data.length,IPAddress, port); 
socket.send(sendPacket); 
} 


