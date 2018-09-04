SOAP Webservice configuration steps: 
Refer this WSDL URL for an example: http://wsgeoip.lavasoft.com/ipservice.asmx?WSDL 
Go to Local machine workspace
Create directory => sei 
Open cmd => cd /sei => wsimport <WSDL URL>
Create directory => src
To keep the source java files => wsimport -keep -s src <WSDL URL>
Go to src directory => copy *.java files and paste it under project location src directory  
