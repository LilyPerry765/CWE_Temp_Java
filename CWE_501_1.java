#(CWE-501)

usrname = request.getParameter("usrname"); 
if (session.getAttribute(ATTR_USR) == null) { 
session.setAttribute(ATTR_USR, usrname); 
} 


