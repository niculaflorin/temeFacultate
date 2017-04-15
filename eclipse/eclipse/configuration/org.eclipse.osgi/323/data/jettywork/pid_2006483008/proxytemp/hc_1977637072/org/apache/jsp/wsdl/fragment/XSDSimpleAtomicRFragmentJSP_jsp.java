package org.apache.jsp.wsdl.fragment;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.perspective.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.datamodel.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.fragment.util.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.fragment.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.actions.*;
import org.eclipse.wst.ws.internal.explorer.platform.perspective.*;
import org.eclipse.wst.ws.internal.explorer.platform.util.*;
import org.eclipse.xsd.*;

public final class XSDSimpleAtomicRFragmentJSP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 * Copyright (c) 2002, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
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
Node operNode = wsdlPerspective.getNodeManager().getNode(Integer.parseInt(nodeID.toString()));
WSDLOperationElement operElement = (WSDLOperationElement)operNode.getTreeElement();
IXSDFragment frag = operElement.getFragmentByID(fragID.toString());
XSDToFragmentConfiguration xsdConfig = frag.getXSDToFragmentConfiguration();
XSDSimpleTypeDefinition simpleType = (XSDSimpleTypeDefinition)frag.getXSDTypeDefinition();
XSDTypeDefinition xsdBuiltInType = XSDTypeDefinitionUtil.resolveToXSDBuiltInTypeDefinition(simpleType);
String[] labelArgs = {frag.getName(), (xsdBuiltInType != null ? xsdBuiltInType.getName() : simpleType.getName())};
String[] params = frag.getParameterValues(frag.getID());

      out.write("\n");
      out.write("<table cellpadding=3 cellspacing=0 class=\"");
      out.print((xsdConfig.getIsWSDLPart() ? "fixfragtable" : "innerfixfragtable"));
      out.write("\">\n");
      out.write("  <tr>\n");
      out.write("    <th id=\"");
      out.print(frag.getID());
      out.write("\" class=\"labels\" height=25 valign=\"bottom\" align=\"left\" nowrap>\n");
      out.write("      ");
      out.print(wsdlPerspective.getMessage("FORM_LABEL_ATOMIC_NAME_TYPE", labelArgs));
      out.write("\n");
      out.write("    </th>\n");
      out.write("    <td headers=\"");
      out.print(frag.getID());
      out.write("\" class=\"labels\" height=25 width=\"100%\" valign=\"bottom\" align=\"left\" nowrap>\n");
      out.write("      ");
      out.print(((params != null && params.length > 0) ? HTMLUtils.charactersToHTMLEntities(params[0]) : wsdlPerspective.getMessage("FORM_LABEL_NULL")));
      out.write("\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  ");

  if (params != null) {
    for (int i = 1; i < params.length; i++) {
    
      out.write("\n");
      out.write("      <tr>\n");
      out.write("        <td class=\"labels\" height=25 valign=\"bottom\" align=\"left\" nowrap></td>\n");
      out.write("        <td headers=\"");
      out.print(frag.getID());
      out.write("\" class=\"labels\" height=25 width=\"100%\" valign=\"bottom\" align=\"left\" nowrap>\n");
      out.write("          ");
      out.print(HTMLUtils.charactersToHTMLEntities(params[i]));
      out.write("\n");
      out.write("        </td>\n");
      out.write("      </tr>\n");
      out.write("    ");

    }
  }
  
      out.write("\n");
      out.write("</table>\n");
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
