package org.apache.jsp.wsdl.forms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.perspective.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.datamodel.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.xsd.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.fragment.*;
import org.eclipse.wst.ws.internal.explorer.platform.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.perspective.*;
import javax.wsdl.*;
import java.util.*;

public final class FragmentsFormView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\n');

WSDLPerspective wsdlPerspective = controller.getWSDLPerspective();
Node selectedNode = wsdlPerspective.getNodeManager().getSelectedNode();
nodeID.delete(0, nodeID.length());
nodeID.append(selectedNode.getNodeId());
InvokeWSDLOperationTool invokeWSDLOperationTool = (InvokeWSDLOperationTool)(selectedNode.getCurrentToolManager().getSelectedTool());
WSDLOperationElement operElement = (WSDLOperationElement)selectedNode.getTreeElement();

Iterator it = operElement.getSOAPHeaders().iterator();

if (it.hasNext()) {
	String headerDivId = "Header";
	String headerImgId = "xHeader";
    
      out.write("\n");
      out.write("\t<table border=0 cellpadding=6 cellspacing=0>\n");
      out.write("\t  <tr>\n");
      out.write("\t    <td height=20 valign=\"bottom\" align=\"left\" nowrap width=11><a href=\"javascript:twist('");
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
      out.write("\t    <td height=20 valign=\"bottom\" align=\"left\" nowrap class=\"labels\"><strong>");
      out.print(wsdlPerspective.getMessage("FORM_LABEL_HEADER"));
      out.write("</strong></td>\n");
      out.write("\t  </tr>\n");
      out.write("\t</table>\n");
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
      out.print(headerDivId);
      out.write("\">\n");
      out.write("\t");

	while (it.hasNext()) {
	  org.eclipse.wst.wsdl.binding.soap.SOAPHeader soapHeader = (org.eclipse.wst.wsdl.binding.soap.SOAPHeader) it.next();
	  IXSDFragment frag = operElement.getHeaderFragment(soapHeader);	   
	  fragID.delete(0, fragID.length());
	  fragID.append(frag.getID());
	  
      out.write("\n");
      out.write("\t  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, frag.getWriteFragment(), out, true);
      out.write("\n");
      out.write("\t  ");
  
	}
	
      out.write("\n");
      out.write("\t</div>\n");
      out.write("    ");
    
}

boolean hasInput = Boolean.parseBoolean(request.getParameter("hasInput"));
String bodyDivId = "Body";

if (hasInput) {
	String bodyImgId = "xBody";
    
      out.write("\n");
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
      out.write("    ");

}

      out.write("\n");
      out.write("\n");
      out.write("<div id=\"");
      out.print(bodyDivId);
      out.write("\" class=\"fragarea\">\n");

it = operElement.getOrderedBodyParts().iterator();
while (it.hasNext()) {
  javax.wsdl.Part part = (javax.wsdl.Part)it.next();
  IXSDFragment frag = operElement.getFragment(part);
  fragID.delete(0, fragID.length());
  fragID.append(frag.getID());
  
      out.write("\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, frag.getWriteFragment(), out, true);
      out.write("\n");
      out.write("  ");

}

      out.write("\n");
      out.write("</div>");
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
