#(CWE-250)

locationClient = new LocationClient(this, this, this); 
locationClient.connect(); 
Location userCurrLocation; 
userCurrLocation = locationClient.getLastLocation(); 
setTimeZone(userCurrLocation); 


#(CWE-250)

locationClient = new LocationClient(this, this, this); 
locationClient.connect(); 
Location userCurrLocation; 
userCurrLocation = locationClient.getLastLocation(); 
deriveStateFromCoords(userCurrLocation); 


