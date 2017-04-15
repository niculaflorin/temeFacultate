package org.apache.jsp.scripts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.wst.ws.internal.explorer.platform.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.actions.*;

public final class wsdlbrowser_jsp extends org.apache.jasper.runtime.HttpJspBase
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

   String sessionId = session.getId();

      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("  var wsdlWindow;\n");
      out.write("  var wsdlWindowClosed = true;\n");
      out.write("  var targetWSDLURLElement;\n");
      out.write("  function openWSDLBrowser(formContainerId,type)\n");
      out.write("  {\n");
      out.write("    var form = document.getElementById(formContainerId).getElementsByTagName(\"form\").item(0);\n");
      out.write("    targetWSDLURLElement = form.");
      out.print(ActionInputs.QUERY_INPUT_WSDL_URL);
      out.write(";\n");
      out.write("    var link;\n");
      out.write("    switch (type)\n");
      out.write("    {\n");
      out.write("      case ");
      out.print(ActionInputs.WSDL_TYPE_SERVICE);
      out.write(":\n");
      out.write("        link = \"");
      out.print(response.encodeURL(controller.getPathWithContext(OpenWSDLBrowserAction.getActionLinkForService(sessionId))));
      out.write("\";\n");
      out.write("        break;\n");
      out.write("      case ");
      out.print(ActionInputs.WSDL_TYPE_SERVICE_INTERFACE);
      out.write(":\n");
      out.write("      default:\n");
      out.write("        link = \"");
      out.print(response.encodeURL(controller.getPathWithContext(OpenWSDLBrowserAction.getActionLinkForServiceInterface(sessionId))));
      out.write("\";\n");
      out.write("    }\n");
      out.write("    wsdlWindow = window.open(link,\"wsdlWindow\",\"height=300,width=450,status=yes,scrollbars=yes,resizable=yes\");\n");
      out.write("    if (wsdlWindow.focus)\n");
      out.write("      wsdlWindow.focus();\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function closeWSDLBrowser()\n");
      out.write("  {\n");
      out.write("    if (!wsdlWindowClosed)\n");
      out.write("      wsdlWindow.close();\n");
      out.write("  }\n");
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
