package org.apache.jsp.wsdl.forms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.perspective.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.datamodel.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.xsd.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.fragment.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.fragment.impl.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.util.*;
import org.eclipse.wst.ws.internal.explorer.platform.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.perspective.Node;
import org.eclipse.wst.ws.internal.explorer.platform.perspective.*;
import org.eclipse.wst.ws.internal.explorer.platform.util.*;
import org.eclipse.wst.ws.internal.explorer.transport.*;
import org.w3c.dom.*;
import javax.wsdl.*;
import javax.xml.parsers.*;
import java.util.*;

public final class ReadOnlyFragmentsFormView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
 * Copyright (c) 2001, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * IBM Corporation - initial API and implementation
 * yyyymmdd bug      Email and other contact information
 * -------- -------- -----------------------------------------------------------
 * 20070305   117034 makandre@ca.ibm.com - Andrew Mak, Web Services Explorer should support SOAP Headers
 * 20070413   176493 makandre@ca.ibm.com - Andrew Mak, WSE: Make message/transport stack pluggable
 * 20070507   185600 makandre@ca.ibm.com - Andrew Mak, WSE status pane's "header" twistie should not appear for responses without headers
 *******************************************************************************/

      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.eclipse.wst.ws.internal.explorer.platform.perspective.Controller controller = null;
      synchronized (session) {
        controller = (org.eclipse.wst.ws.internal.explorer.platform.perspective.Controller) _jspx_page_context.getAttribute("controller", PageContext.SESSION_SCOPE);
        if (controller == null){
          controller = new org.eclipse.wst.ws.internal.explorer.platform.perspective.Controller();
          _jspx_page_context.setAttribute("controller", controller, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      java.lang.StringBuffer fragID = null;
      synchronized (request) {
        fragID = (java.lang.StringBuffer) _jspx_page_context.getAttribute("fragID", PageContext.REQUEST_SCOPE);
        if (fragID == null){
          fragID = new java.lang.StringBuffer();
          _jspx_page_context.setAttribute("fragID", fragID, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      java.lang.StringBuffer nodeID = null;
      synchronized (request) {
        nodeID = (java.lang.StringBuffer) _jspx_page_context.getAttribute("nodeID", PageContext.REQUEST_SCOPE);
        if (nodeID == null){
          nodeID = new java.lang.StringBuffer();
          _jspx_page_context.setAttribute("nodeID", nodeID, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');

WSDLPerspective wsdlPerspective = controller.getWSDLPerspective();
wsdlPerspective.setStatusContentType(WSDLPerspective.STATUS_CONTENT_RESULT_FORM);
Node operNode = wsdlPerspective.getOperationNode();
nodeID.delete(0, nodeID.length());
nodeID.append(operNode.getNodeId());
WSDLOperationElement operElement = (WSDLOperationElement)operNode.getTreeElement();
Operation oper = operElement.getOperation();
if (oper.getOutput() == null)
{

      out.write("\n");
      out.write("  <table width=\"95%\" border=0 cellpadding=6 cellspacing=0>\n");
      out.write("    <tr>\n");
      out.write("      <td height=20 valign=\"bottom\" align=\"left\" class=\"labels\">\n");
      out.write("        ");
      out.print(wsdlPerspective.getMessage("FORM_LABEL_NOTHING_TO_DISPLAY_IN_FORM_VIEW"));
      out.write("\n");
      out.write("      </td>\n");
      out.write("    </tr>\n");
      out.write("  </table>\n");

}
else
{
  ISOAPMessage soapMessage = (ISOAPMessage) operElement.getPropertyAsObject(WSDLModelConstants.PROP_SOAP_RESPONSE);
  Element[] headerContent = soapMessage.getHeaderContent();;
  Element[] bodyContent   = soapMessage.getBodyContent();
  
  boolean cached = ((Boolean)operElement.getPropertyAsObject(WSDLActionInputs.SOAP_RESPONSE_CACHED)).booleanValue();

  if (soapMessage.getBody(false) == null) // body is mandatory
  {
  
      out.write("\n");
      out.write("    <table width=\"95%\" border=0 cellpadding=6 cellspacing=0>\n");
      out.write("      <tr>\n");
      out.write("        <td height=20 valign=\"bottom\" align=\"left\" class=\"labels\">\n");
      out.write("          ");
      out.print(wsdlPerspective.getMessage("FORM_LABEL_SOAP_RESPONSE_FAILED_VALIDATION_IN_FORM_VIEW"));
      out.write("\n");
      out.write("        </td>\n");
      out.write("      </tr>\n");
      out.write("    </table>\n");
      out.write("  ");

  }
  else
  {
	if (headerContent != null && headerContent.length > 0) {		

		String headerDivId = "Header";
		String headerImgId = "xHeader";		
	    
      out.write("\n");
      out.write("\t    <table border=0 cellpadding=6 cellspacing=0>\n");
      out.write("\t\t  <tr>\n");
      out.write("\t\t    <td height=20 valign=\"bottom\" align=\"left\" nowrap width=11><a href=\"javascript:twist('");
      out.print(headerDivId);
      out.write("','");
      out.print(headerImgId);
      out.write("')\"><img name=\"");
      out.print(headerImgId);
      out.write("\" src=\"");
      out.print(response.encodeURL(controller.getPathWithContext("images/twistopened.gif")));
      out.write("\" alt=\"");
      out.print(controller.getMessage("ALT_TWIST_OPENED"));
      out.write("\" class=\"twist\"></a></td>\n");
      out.write("\t\t    <td height=20 valign=\"bottom\" align=\"left\" nowrap class=\"labels\"><strong>");
      out.print(wsdlPerspective.getMessage("FORM_LABEL_HEADER"));
      out.write("</strong></td>\n");
      out.write("\t\t  </tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t\n");
      out.write("\t\t<table width=\"95%\" border=0 cellpadding=0 cellspacing=0>\n");
      out.write("\t\t  <tr>\n");
      out.write("\t\t    <td valign=\"top\" height=10><img src=\"");
      out.print(response.encodeURL(controller.getPathWithContext("images/keyline.gif")));
      out.write("\" alt=\"\" height=2 width=\"100%\"></td>\n");
      out.write("\t\t  </tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t\n");
      out.write("\t\t<div id=\"");
      out.print(headerDivId);
      out.write("\" class=\"fragarea\">\n");
      out.write("\t\t");

		boolean hasSOAPHeaders = false;		
		Iterator it = operElement.getSOAPHeaders(false).iterator();
		int start = 0;
		while (it.hasNext() && start < headerContent.length) {
			org.eclipse.wst.wsdl.binding.soap.SOAPHeader soapHeader = (org.eclipse.wst.wsdl.binding.soap.SOAPHeader) it.next();									
			IXSDFragment fragment = operElement.getHeaderFragment(soapHeader, false);
			
			if (!cached) {				
				int pos = SOAPMessageUtils.findFirstMatchingElement(
					soapHeader.getEPart(),
					headerContent,
					soapMessage.getNamespaceTable(),
					fragment.getName(),
					start);
				
				if (pos == -1)
					continue;
				
				Element element = headerContent[pos];
				start = pos + 1;
				
				if (!fragment.setParameterValuesFromInstanceDocuments(new Element[] { element }))
					continue;
			}
			else if (!fragment.validateAllParameterValues())
				continue;
			
			hasSOAPHeaders = true;				
			fragID.delete(0, fragID.length());
			fragID.append(fragment.getID());
			
      out.write("\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, fragment.getReadFragment(), out, true);
      out.write("\n");
      out.write("\t\t\t");
  
		}		
		if (!hasSOAPHeaders) {
			
      out.write("\n");
      out.write("\t\t\t<table width=\"95%\" border=0 cellpadding=6 cellspacing=0>\n");
      out.write("\t\t      <tr>\n");
      out.write("\t\t        <td height=20 valign=\"bottom\" align=\"left\" class=\"labels\">\n");
      out.write("\t\t          ");
      out.print(wsdlPerspective.getMessage("FORM_LABEL_CANNOT_DISPLAY_HEADER_IN_FORM_VIEW"));
      out.write("\n");
      out.write("\t\t        </td>\n");
      out.write("\t\t      </tr>\n");
      out.write("\t\t    </table>\n");
      out.write("\t\t\t");

		}
		
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t");
   
	}
		
	String bodyDivId = "Body";
	String bodyImgId = "xBody";	  		
	
      out.write("\t\t\t\n");
      out.write("\t<table border=0 cellpadding=6 cellspacing=0>\n");
      out.write("\t  <tr>\n");
      out.write("\t    <td height=20 valign=\"bottom\" align=\"left\" nowrap width=11><a href=\"javascript:twist('");
      out.print(bodyDivId);
      out.write("','");
      out.print(bodyImgId);
      out.write("')\"><img name=\"");
      out.print(bodyImgId);
      out.write("\" src=\"");
      out.print(response.encodeURL(controller.getPathWithContext("images/twistopened.gif")));
      out.write("\" alt=\"");
      out.print(controller.getMessage("ALT_TWIST_OPENED"));
      out.write("\" class=\"twist\"></a></td>\n");
      out.write("\t    <td height=20 valign=\"bottom\" align=\"left\" nowrap class=\"labels\"><strong>");
      out.print(wsdlPerspective.getMessage("FORM_LABEL_BODY"));
      out.write("</strong></td>\n");
      out.write("\t  </tr>\n");
      out.write("\t</table> \n");
      out.write("\t\n");
      out.write("\t<table width=\"95%\" border=0 cellpadding=0 cellspacing=0>\n");
      out.write("\t  <tr>\n");
      out.write("\t    <td valign=\"top\" height=10><img src=\"");
      out.print(response.encodeURL(controller.getPathWithContext("images/keyline.gif")));
      out.write("\" alt=\"\" height=2 width=\"100%\"></td>\n");
      out.write("\t  </tr>\n");
      out.write("\t</table>\n");
      out.write("\t\n");
      out.write("\t<div id=\"");
      out.print(bodyDivId);
      out.write("\" class=\"fragarea\">\n");
      out.write("\t");
	
	boolean hasSOAPBody = false;
	if (bodyContent != null && bodyContent.length > 0) {				
		
	    Map partsMap = oper.getOutput().getMessage().getParts();
	    Iterator it = partsMap.values().iterator();
	    Hashtable uriReferences = null;
	    while (it.hasNext())
	    {
	      IXSDFragment fragment = operElement.getFragment((javax.wsdl.Part)it.next(), false);
	      if (!cached)
	      {
	        if (!operElement.isUseLiteral() && (fragment instanceof ISOAPEncodingWrapperFragment))
	        {
	          if (uriReferences == null)
	            uriReferences = SOAPEncodingWrapperFragment.parseURIReferences(soapMessage.getEnvelope(true), true);
	          ((ISOAPEncodingWrapperFragment)fragment).setURIReferences(uriReferences);
	        }
	        if (!fragment.setParameterValuesFromInstanceDocuments(bodyContent))
	        	continue;
	      }
	      else if (!fragment.validateAllParameterValues())
			continue;
			
		  hasSOAPBody = true;				
	      fragID.delete(0, fragID.length());
	      fragID.append(fragment.getID());
	      
      out.write("\n");
      out.write("\t      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, fragment.getReadFragment(), out, true);
      out.write("\n");
      out.write("\t      ");

	    }
	    operElement.setPropertyAsObject(WSDLActionInputs.SOAP_RESPONSE_CACHED, new Boolean(true));
	}
	
	if (soapMessage.getFault() == null && (bodyContent == null || bodyContent.length == 0)) {
		
      out.write("\n");
      out.write("\t\t<table width=\"95%\" border=0 cellpadding=6 cellspacing=0>\n");
      out.write("\t      <tr>\n");
      out.write("\t        <td height=20 valign=\"bottom\" align=\"left\" class=\"labels\">\n");
      out.write("\t          ");
      out.print(wsdlPerspective.getMessage("FORM_LABEL_BODY_IS_EMPTY"));
      out.write("\n");
      out.write("\t        </td>\n");
      out.write("\t      </tr>\n");
      out.write("\t    </table>\n");
      out.write("\t\t");

    }
	else if (!hasSOAPBody) {
		
      out.write("\n");
      out.write("\t\t<table width=\"95%\" border=0 cellpadding=6 cellspacing=0>\n");
      out.write("\t      <tr>\n");
      out.write("\t        <td height=20 valign=\"bottom\" align=\"left\" class=\"labels\">\n");
      out.write("\t          ");
      out.print(wsdlPerspective.getMessage("FORM_LABEL_CANNOT_DISPLAY_BODY_IN_FORM_VIEW"));
      out.write("\n");
      out.write("\t        </td>\n");
      out.write("\t      </tr>\n");
      out.write("\t    </table>\n");
      out.write("\t\t");

	} 
    
      out.write("\n");
      out.write("    </div>\n");
      out.write("    ");

  }
}

      out.write('\n');
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
