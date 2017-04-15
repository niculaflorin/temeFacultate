package org.apache.jsp.wsdl.scripts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.wst.ws.internal.explorer.platform.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.constants.*;

public final class wsdlpanes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/scripts/panes.jsp", out, true);
      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("  var wsdlNavigatorContainer = perspectiveContent.frames[\"");
      out.print(WSDLFrameNames.WSDL_NAVIGATOR_CONTAINER);
      out.write("\"];\n");
      out.write("  var wsdlNavigatorToolbar = wsdlNavigatorContainer.frames[\"");
      out.print(WSDLFrameNames.WSDL_NAVIGATOR_TOOLBAR);
      out.write("\"];\n");
      out.write("  var wsdlNavigatorContent = wsdlNavigatorContainer.frames[\"");
      out.print(WSDLFrameNames.WSDL_NAVIGATOR_CONTENT);
      out.write("\"];\n");
      out.write("  var wsdlActionsContainer = perspectiveContent.frames[\"");
      out.print(WSDLFrameNames.WSDL_ACTIONS_CONTAINER);
      out.write("\"];\n");
      out.write("  var wsdlPropertiesContainer = wsdlActionsContainer.frames[\"");
      out.print(WSDLFrameNames.WSDL_PROPERTIES_CONTAINER);
      out.write("\"];\n");
      out.write("  var wsdlPropertiesToolbar = wsdlPropertiesContainer.frames[\"");
      out.print(WSDLFrameNames.WSDL_PROPERTIES_TOOLBAR);
      out.write("\"];\n");
      out.write("  var wsdlPropertiesContent = wsdlPropertiesContainer.frames[\"");
      out.print(WSDLFrameNames.WSDL_PROPERTIES_CONTENT);
      out.write("\"];\n");
      out.write("  var wsdlStatusContainer = wsdlActionsContainer.frames[\"");
      out.print(WSDLFrameNames.WSDL_STATUS_CONTAINER);
      out.write("\"];\n");
      out.write("  var wsdlStatusToolbar = wsdlStatusContainer.frames[\"");
      out.print(WSDLFrameNames.WSDL_STATUS_TOOLBAR);
      out.write("\"];\n");
      out.write("  var wsdlStatusContent = wsdlStatusContainer.frames[\"");
      out.print(WSDLFrameNames.WSDL_STATUS_CONTENT);
      out.write("\"];\n");
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
