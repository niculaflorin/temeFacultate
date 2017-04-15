package mds.servicii.clientsample;

import mds.servicii.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        TermoDinamica service1 = new TermoDinamica();
	        System.out.println("Create Web Service...");
	        TermoDinamicaPortType port1 = service1.getTermoDinamicaHttpEndpoint();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.moli(Double.parseDouble(args[0]),Double.parseDouble(args[1])));
	        System.out.println("Server said: " + port1.presiune(Double.parseDouble(args[2]),Double.parseDouble(args[3]),Double.parseDouble(args[4])));
	        System.out.println("Server said: " + port1.gazIdeal(Double.parseDouble(args[5]),Double.parseDouble(args[6]),Double.parseDouble(args[7])));
	        System.out.println("Create Web Service...");
	        TermoDinamicaPortType port2 = service1.getTermoDinamicaHttpEndpoint();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port2.moli(Double.parseDouble(args[8]),Double.parseDouble(args[9])));
	        System.out.println("Server said: " + port2.presiune(Double.parseDouble(args[10]),Double.parseDouble(args[11]),Double.parseDouble(args[12])));
	        System.out.println("Server said: " + port2.gazIdeal(Double.parseDouble(args[13]),Double.parseDouble(args[14]),Double.parseDouble(args[15])));
	        System.out.println("Create Web Service...");
	        TermoDinamicaPortType port3 = service1.getTermoDinamicaHttpSoap12Endpoint();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port3.moli(Double.parseDouble(args[16]),Double.parseDouble(args[17])));
	        System.out.println("Server said: " + port3.presiune(Double.parseDouble(args[18]),Double.parseDouble(args[19]),Double.parseDouble(args[20])));
	        System.out.println("Server said: " + port3.gazIdeal(Double.parseDouble(args[21]),Double.parseDouble(args[22]),Double.parseDouble(args[23])));
	        System.out.println("Create Web Service...");
	        TermoDinamicaPortType port4 = service1.getTermoDinamicaHttpSoap12Endpoint();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port4.moli(Double.parseDouble(args[24]),Double.parseDouble(args[25])));
	        System.out.println("Server said: " + port4.presiune(Double.parseDouble(args[26]),Double.parseDouble(args[27]),Double.parseDouble(args[28])));
	        System.out.println("Server said: " + port4.gazIdeal(Double.parseDouble(args[29]),Double.parseDouble(args[30]),Double.parseDouble(args[31])));
	        System.out.println("Create Web Service...");
	        TermoDinamicaPortType port5 = service1.getTermoDinamicaHttpSoap11Endpoint();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port5.moli(Double.parseDouble(args[32]),Double.parseDouble(args[33])));
	        System.out.println("Server said: " + port5.presiune(Double.parseDouble(args[34]),Double.parseDouble(args[35]),Double.parseDouble(args[36])));
	        System.out.println("Server said: " + port5.gazIdeal(Double.parseDouble(args[37]),Double.parseDouble(args[38]),Double.parseDouble(args[39])));
	        System.out.println("Create Web Service...");
	        TermoDinamicaPortType port6 = service1.getTermoDinamicaHttpSoap11Endpoint();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port6.moli(Double.parseDouble(args[40]),Double.parseDouble(args[41])));
	        System.out.println("Server said: " + port6.presiune(Double.parseDouble(args[42]),Double.parseDouble(args[43]),Double.parseDouble(args[44])));
	        System.out.println("Server said: " + port6.gazIdeal(Double.parseDouble(args[45]),Double.parseDouble(args[46]),Double.parseDouble(args[47])));
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
