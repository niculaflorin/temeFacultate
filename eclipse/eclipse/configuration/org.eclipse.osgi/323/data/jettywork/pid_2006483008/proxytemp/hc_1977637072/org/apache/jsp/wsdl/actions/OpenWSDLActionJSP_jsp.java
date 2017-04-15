package org.apache.jsp.wsdl.actions;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.constants.WSDLFrameNames;
import org.eclipse.wst.ws.internal.explorer.platform.constants.FrameNames;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.actions.OpenWSDLAction;

public final class OpenWSDLActionJSP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/wsdl/scripts/wsdlpanes.jsp", out, true);
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">\n");
      out.write("<html lang=\"");
      out.print(response.getLocale().getLanguage());
      out.write("\">\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <script language=\"javascript\" src=\"");
      out.print(response.encodeURL(controller.getPathWithContext("scripts/browserdetect.js")));
      out.write("\">\n");
      out.write("  </script>\n");
      out.write("</head>\n");
      out.write("<body dir=\"");
      out.print(org.eclipse.wst.ws.internal.explorer.platform.util.DirUtils.getDir());
      out.write("\">\n");

  // Prepare the action.
  OpenWSDLAction action = new OpenWSDLAction(controller);

  // Load the parameters for the action from the servlet request.
  boolean inputsValid = action.populatePropertyTable(request);
  if (!inputsValid) {

      out.write("\n");
      out.write("  <script language=\"javascript\">\n");
      out.write("    wsdlPropertiesContent.location = \"");
      out.print(response.encodeURL(controller.getPathWithContext("wsdl/wsdl_properties_content.jsp")));
      out.write("\";\n");
      out.write("    wsdlStatusContent.location = \"");
      out.print(response.encodeURL(controller.getPathWithContext("wsdl/wsdl_status_content.jsp")));
      out.write("\";\n");
      out.write("  </script>\n");

  }
  else {
    // Run the action and obtain the return code (fail/success).
    boolean actionResult = action.execute();

      out.write("\n");
      out.write("    <script language=\"javascript\">\n");
      out.write("    if (isMicrosoftInternetExplorer()) {\n");
      out.write("      wsdlNavigatorContent.location=\"");
      out.print(response.encodeURL(controller.getPathWithContext("wsdl/wsdl_navigator_content.jsp")));
      out.write("\";\n");
      out.write("      wsdlPropertiesContainer.location = \"");
      out.print(response.encodeURL(controller.getPathWithContext("wsdl/wsdl_properties_container.jsp")));
      out.write("\";\n");
      out.write("      wsdlStatusContent.location = \"");
      out.print(response.encodeURL(controller.getPathWithContext("wsdl/wsdl_status_content.jsp")));
      out.write("\";\n");
      out.write("    }\n");
      out.write("    else {\n");
      out.write("      perspectiveContent.location = \"");
      out.print(response.encodeURL(controller.getPathWithContext("wsdl/wsdl_perspective_content.jsp")));
      out.write("\";\n");
      out.write("    }\n");
      out.write("    </script>\n");

  }

      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
