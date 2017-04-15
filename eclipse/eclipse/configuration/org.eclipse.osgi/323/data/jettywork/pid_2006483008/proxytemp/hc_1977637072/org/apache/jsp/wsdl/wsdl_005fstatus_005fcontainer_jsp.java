package org.apache.jsp.wsdl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.perspective.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.constants.*;

public final class wsdl_005fstatus_005fcontainer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

   WSDLPerspective wsdlPerspective = controller.getWSDLPerspective();
   String statusContentSrc = "wsdl_status_content.jsp";
   switch (wsdlPerspective.getStatusContentType())
   {
     case WSDLPerspective.STATUS_CONTENT_RESULT_FORM:
       statusContentSrc = "wsdl_result_content.jsp";
       break;
     case WSDLPerspective.STATUS_CONTENT_RESULT_SOURCE:
     	statusContentSrc = "wsdl_result_content.jsp";
     	break;
   }

      out.write("   \n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">\n");
      out.write("<html lang=\"");
      out.print(response.getLocale().getLanguage());
      out.write("\">\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <title>");
      out.print(wsdlPerspective.getMessage("FRAME_TITLE_STATUS_CONTAINER"));
      out.write("</title>\n");
      out.write("</head>\n");
      out.write("<frameset rows=\"33,*\" border=0 bgcolor=\"#ECE9D8\">\n");
      out.write("  <frame name=\"");
      out.print(WSDLFrameNames.WSDL_STATUS_TOOLBAR);
      out.write("\" title=\"");
      out.print(wsdlPerspective.getMessage("FRAME_TITLE_STATUS_TOOLBAR"));
      out.write("\" src=\"");
      out.print(response.encodeURL("wsdl_status_toolbar.jsp"));
      out.write("\" noresize scrolling=\"no\" frameborder=0 marginwidth=0 marginheight=0>\n");
      out.write("  <frame name=\"");
      out.print(WSDLFrameNames.WSDL_STATUS_CONTENT);
      out.write("\" title=\"");
      out.print(wsdlPerspective.getMessage("FRAME_TITLE_STATUS_CONTENT"));
      out.write("\" src=\"");
      out.print(response.encodeURL(statusContentSrc));
      out.write("\" noresize scrolling=\"no\" frameborder=0 marginwidth=0 marginheight=0>\n");
      out.write("</frameset>\n");
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
