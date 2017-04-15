package org.apache.jsp.scripts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.wst.ws.internal.explorer.platform.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.actions.*;

public final class calendarbrowser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  var calendarBrowser;\n");
      out.write("  var calendarBrowserClosed = true;\n");
      out.write("  var calendarTargetRow = -1;\n");
      out.write("  var calendarTarget;\n");
      out.write("\n");
      out.write("  function openCalendarBrowser(type,formContainerId,elementName,index)\n");
      out.write("  {\n");
      out.write("    var form = document.getElementById(formContainerId).getElementsByTagName(\"form\").item(0);\n");
      out.write("    var elements = form.elements[elementName];\n");
      out.write("    if (index == 0 && elements.length == undefined)\n");

   // Only one element.

      out.write("\n");
      out.write("      calendarTarget = elements;\n");
      out.write("    else\n");
      out.write("    {\n");
      out.write("      calendarTargetRow = index;\n");
      out.write("      calendarTarget = elements.item(index);\n");
      out.write("    }\n");
      out.write("    var link;\n");
      out.write("    switch (type)\n");
      out.write("    {\n");
      out.write("      case ");
      out.print(ActionInputs.CALENDAR_TYPE_DATE);
      out.write(":\n");
      out.write("        link = \"");
      out.print(response.encodeURL(controller.getPathWithContext(OpenCalendarBrowserAction.getActionLinkForDate(sessionId))));
      out.write("\";\n");
      out.write("        break;\n");
      out.write("      case ");
      out.print(ActionInputs.CALENDAR_TYPE_DATETIME);
      out.write(":\n");
      out.write("        link = \"");
      out.print(response.encodeURL(controller.getPathWithContext(OpenCalendarBrowserAction.getActionLinkForDateTime(sessionId))));
      out.write("\";\n");
      out.write("        break;\n");
      out.write("      case ");
      out.print(ActionInputs.CALENDAR_TYPE_GYEARMONTH);
      out.write(":\n");
      out.write("        link = \"");
      out.print(response.encodeURL(controller.getPathWithContext(OpenCalendarBrowserAction.getActionLinkForGYearMonth(sessionId))));
      out.write("\";\n");
      out.write("        break;\n");
      out.write("      case ");
      out.print(ActionInputs.CALENDAR_TYPE_GDAY);
      out.write(":\n");
      out.write("        link = \"");
      out.print(response.encodeURL(controller.getPathWithContext(OpenCalendarBrowserAction.getActionLinkForGDay(sessionId))));
      out.write("\";\n");
      out.write("        break;\n");
      out.write("      case ");
      out.print(ActionInputs.CALENDAR_TYPE_GMONTHDAY);
      out.write(":\n");
      out.write("        link = \"");
      out.print(response.encodeURL(controller.getPathWithContext(OpenCalendarBrowserAction.getActionLinkForGMonthDay(sessionId))));
      out.write("\";\n");
      out.write("        break;\n");
      out.write("    }\n");
      out.write("    calendarBrowser = window.open(link,\"calendarBrowser\",\"height=350,width=264,status=yes,scrollbars=yes,resizable=yes\");\n");
      out.write("    if (calendarBrowser.focus)\n");
      out.write("      calendarBrowser.focus();\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function closeCalendarBrowser()\n");
      out.write("  {\n");
      out.write("    if (!calendarBrowserClosed)\n");
      out.write("      calendarBrowser.close();\n");
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
