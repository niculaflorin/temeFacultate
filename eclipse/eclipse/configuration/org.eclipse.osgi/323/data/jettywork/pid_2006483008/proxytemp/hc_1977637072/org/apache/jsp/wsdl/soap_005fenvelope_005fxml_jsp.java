package org.apache.jsp.wsdl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.perspective.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.datamodel.WSDLOperationElement;
import org.eclipse.wst.ws.internal.explorer.transport.*;

public final class soap_005fenvelope_005fxml_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");


	/*******************************************************************************
	 * Copyright (c) 2001, 2014 IBM Corporation and others.
	 * All rights reserved. This program and the accompanying materials
	 * are made available under the terms of the Eclipse Public License v1.0
	 * which accompanies this distribution, and is available at
	 * http://www.eclipse.org/legal/epl-v10.html
	 * 
	 * Contributors:
	 * IBM Corporation - initial API and implementation
	 * yyyymmdd bug      Email and other contact information
	 * -------- -------- -----------------------------------------------------------
	 * 20070413   176493 makandre@ca.ibm.com - Andrew Mak, WSE: Make message/transport stack pluggable
	 *******************************************************************************/

	String userAgent = request.getHeader("User-Agent");
	
	// Safari has no native support for viewing raw XML, so display as plain text
	if(userAgent != null && userAgent.contains("Safari")) {
		response.setContentType("text/plain");
	} else {
		response.setContentType("text/xml");
	}
	

      org.eclipse.wst.ws.internal.explorer.platform.perspective.Controller controller = null;
      synchronized (session) {
        controller = (org.eclipse.wst.ws.internal.explorer.platform.perspective.Controller) _jspx_page_context.getAttribute("controller", PageContext.SESSION_SCOPE);
        if (controller == null){
          controller = new org.eclipse.wst.ws.internal.explorer.platform.perspective.Controller();
          _jspx_page_context.setAttribute("controller", controller, PageContext.SESSION_SCOPE);
        }
      }


	int soapEnvelopeType = Integer.parseInt(request.getParameter(WSDLActionInputs.SOAP_ENVELOPE_TYPE));
	WSDLPerspective wsdlPerspective = controller.getWSDLPerspective();
	WSDLOperationElement operElement = (WSDLOperationElement) wsdlPerspective.getOperationNode().getTreeElement();
	ISOAPMessage soapMessage;
	switch (soapEnvelopeType) {
	case WSDLActionInputs.SOAP_ENVELOPE_TYPE_REQUEST:
		soapMessage = (ISOAPMessage) operElement.getPropertyAsObject(WSDLModelConstants.PROP_SOAP_REQUEST);
		break;
	case WSDLActionInputs.SOAP_ENVELOPE_TYPE_RESPONSE:
	default:
		soapMessage = (ISOAPMessage) operElement.getPropertyAsObject(WSDLModelConstants.PROP_SOAP_RESPONSE);
		break;
	}
	String messages = soapMessage.toXML();	

      out.print(messages);
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
