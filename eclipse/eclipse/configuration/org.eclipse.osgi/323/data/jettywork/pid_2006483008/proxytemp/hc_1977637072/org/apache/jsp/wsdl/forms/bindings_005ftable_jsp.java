package org.apache.jsp.wsdl.forms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.perspective.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.datamodel.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.actions.*;
import org.eclipse.wst.ws.internal.explorer.platform.perspective.*;
import javax.wsdl.*;
import java.util.*;

public final class bindings_005ftable_jsp extends org.apache.jasper.runtime.HttpJspBase
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

   WSDLPerspective wsdlPerspective = controller.getWSDLPerspective();
   String tableContainerId = sectionHeaderInfo.getContainerId();
   StringBuffer twistImageName = new StringBuffer("x");
   twistImageName.append(tableContainerId);

      out.write("\n");
      out.write("<table border=0 cellpadding=6 cellspacing=0>\n");
      out.write("  <tr>\n");
      out.write("    <td height=20 valign=\"bottom\" align=\"left\" nowrap width=11><a href=\"javascript:twist('");
      out.print(tableContainerId);
      out.write("','");
      out.print(twistImageName.toString());
      out.write("')\"><img name=\"");
      out.print(twistImageName.toString());
      out.write("\" src=\"");
      out.print(response.encodeURL(controller.getPathWithContext("images/twistclosed.gif")));
      out.write("\" alt=\"");
      out.print(controller.getMessage("ALT_TWIST_CLOSED"));
      out.write("\" class=\"twist\"></a></td>\n");
      out.write("    <td height=20 valign=\"bottom\" align=\"left\" nowrap class=\"labels\"><strong>");
      out.print(wsdlPerspective.getMessage("FORM_LABEL_BINDINGS"));
      out.write("</strong></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table width=\"95%\" border=0 cellpadding=0 cellspacing=0>\n");
      out.write("  <tr>\n");
      out.write("    <td valign=\"top\" height=10><img src=\"");
      out.print(response.encodeURL(controller.getPathWithContext("images/keyline.gif")));
      out.write("\" alt=\"\" height=2 width=\"100%\"></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<div id=\"");
      out.print(tableContainerId);
      out.write("\" style=\"display:none;\">\n");
      out.write("  <table width=\"95%\" cellpadding=3 cellspacing=0 class=\"tableborder\">\n");
      out.write("    <tr>\n");
      out.write("      <th class=\"headercolor\" width=\"20%\">");
      out.print(wsdlPerspective.getMessage("FORM_LABEL_NAME"));
      out.write("</th>\n");
      out.write("      <th class=\"headercolor\" width=\"20%\">");
      out.print(wsdlPerspective.getMessage("FORM_LABEL_BINDING_TYPE"));
      out.write("</th>\n");
      out.write("      <th class=\"headercolor\">");
      out.print(wsdlPerspective.getMessage("FORM_LABEL_DOCUMENTATION"));
      out.write("</th>\n");
      out.write("    </tr>\n");

   Vector bindingNodes = (Vector)sectionHeaderInfo.getOtherProperties();
   for (int i=0;i<bindingNodes.size();i++)
   {
     Node bindingNode = (Node)bindingNodes.elementAt(i);
     WSDLBindingElement wsdlBindingElement = (WSDLBindingElement)bindingNode.getTreeElement();
     Binding binding = wsdlBindingElement.getBinding();

      out.write("\n");
      out.write("    <tr>\n");
      out.write("      <td class=\"tablecells\"><a href=\"");
      out.print(response.encodeURL(controller.getPathWithContext(SelectWSDLNavigatorNodeAction.getActionLink(bindingNode.getNodeId(),false))));
      out.write('"');
      out.write('>');
      out.print(binding.getQName().getLocalPart());
      out.write("</td>\n");
      out.write("      <td class=\"tablecells\">");
      out.print(wsdlPerspective.getBindingTypeString(wsdlBindingElement.getBindingType()));
      out.write("</td>\n");

     WSDLServiceElement wsdlServiceElement = (WSDLServiceElement)wsdlBindingElement.getParentElement();
     String documentation = wsdlServiceElement.getPropertyAsString(WSDLModelConstants.PROP_DOCUMENTATION);
     if (documentation.length() < 1)
       documentation = controller.getMessage("TABLE_BLANK_PLACEHOLDER");     

      out.write("\n");
      out.write("      <td class=\"tablecells\">");
      out.print(documentation);
      out.write("</td>\n");
      out.write("    </tr>\n");

   }

      out.write("\n");
      out.write("  </table>\n");
      out.write("</div>\n");
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
