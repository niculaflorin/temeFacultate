package org.apache.jsp.wsdl.forms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.perspective.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.datamodel.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.perspective.Node;
import org.eclipse.wst.ws.internal.explorer.platform.perspective.*;
import java.util.*;

public final class WSDLDetailsFormView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 * Copyright (c) 2001, 2004 IBM Corporation and others.
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
      org.eclipse.wst.ws.internal.explorer.platform.perspective.SectionHeaderInfo sectionHeaderInfo = null;
      synchronized (request) {
        sectionHeaderInfo = (org.eclipse.wst.ws.internal.explorer.platform.perspective.SectionHeaderInfo) _jspx_page_context.getAttribute("sectionHeaderInfo", PageContext.REQUEST_SCOPE);
        if (sectionHeaderInfo == null){
          sectionHeaderInfo = new org.eclipse.wst.ws.internal.explorer.platform.perspective.SectionHeaderInfo();
          _jspx_page_context.setAttribute("sectionHeaderInfo", sectionHeaderInfo, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');

WSDLPerspective wsdlPerspective = controller.getWSDLPerspective();

      out.write("\n");
      out.write("<table>\n");
      out.write("  <tr>\n");
      out.write("    <td class=\"labels\">");
      out.print(wsdlPerspective.getMessage("FORM_LABEL_WSDL_DETAILS_DESC"));
      out.write("</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=20>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");

Node wsdlNode = wsdlPerspective.getNodeManager().getSelectedNode();
WSDLElement wsdlElement = (WSDLElement)wsdlNode.getTreeElement();
String documentation = wsdlElement.getPropertyAsString(WSDLModelConstants.PROP_DOCUMENTATION);
if (documentation != null && documentation.length() > 0)
{

      out.write("\n");
      out.write("<table>\n");
      out.write("  <tr>\n");
      out.write("    <td height=20 valign=\"bottom\" class=\"labels\">");
      out.print(documentation);
      out.write("</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");

}

      out.write("\n");
      out.write("<table width=\"95%\" cellpadding=3 cellspacing=0 class=\"tableborder\">\n");
      out.write("  <tr>\n");
      out.write("    <th class=\"singleheadercolor\">");
      out.print(controller.getMessage("FORM_LABEL_WSDL_URL"));
      out.write("</th>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td class=\"tablecells\">");
      out.print(wsdlElement.getWsdlUrl());
      out.write("</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("<table>\n");
      out.write("  <tr>\n");
      out.write("    <td height=10>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
   
sectionHeaderInfo.clear();
sectionHeaderInfo.setContainerId("Services");
Vector serviceNodes = wsdlNode.getChildNodes();
sectionHeaderInfo.setOtherProperties(serviceNodes);

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/wsdl/forms/services_table.jsp", out, true);
      out.write("\n");
      out.write("<table>\n");
      out.write("  <tr>\n");
      out.write("    <td height=10>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
   
Vector bindingNodes = new Vector();
for (int i=0;i<serviceNodes.size();i++)
{
  Node serviceNode = (Node)serviceNodes.elementAt(i);
  Vector serviceBindingNodes = serviceNode.getChildNodes();
  for (int j=0;j<serviceBindingNodes.size();j++)
  {
    Node serviceBindingNode = (Node)serviceBindingNodes.elementAt(j);
    bindingNodes.addElement(serviceBindingNode);
  }
}
sectionHeaderInfo.clear();
sectionHeaderInfo.setContainerId("Bindings");
sectionHeaderInfo.setOtherProperties(bindingNodes);

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/wsdl/forms/bindings_table.jsp", out, true);
      out.write("\n");
      out.write("<script language=\"javascript\">\n");

if (serviceNodes.size() > 0)
{

      out.write("\n");
      out.write("  twist(\"Services\",\"xServices\");\n");

}
if (bindingNodes.size() > 0)
{

      out.write("\n");
      out.write("  twist(\"Bindings\",\"xBindings\");\n");

}

      out.write("\n");
      out.write("</script>\n");
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
