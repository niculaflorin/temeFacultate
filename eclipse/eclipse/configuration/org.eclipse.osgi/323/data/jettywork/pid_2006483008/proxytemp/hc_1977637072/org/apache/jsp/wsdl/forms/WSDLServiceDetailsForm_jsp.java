package org.apache.jsp.wsdl.forms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.perspective.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.datamodel.*;
import org.eclipse.wst.ws.internal.explorer.platform.perspective.*;
import java.util.*;

public final class WSDLServiceDetailsForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/forms/formheader.inc");
  }

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
  Node serviceNode = wsdlPerspective.getNodeManager().getSelectedNode();

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">\n");
      out.write("<html lang=\"");
      out.print(response.getLocale().getLanguage());
      out.write("\">\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <title>");
      out.print(wsdlPerspective.getMessage("FORM_TITLE_WSDL_SERVICE_DETAILS"));
      out.write("</title>\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(response.encodeURL(controller.getPathWithContext("css/windows.css")));
      out.write("\">\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/scripts/tables.jsp", out, true);
      out.write("\n");
      out.write("</head>\n");
      out.write("<body dir=\"");
      out.print(org.eclipse.wst.ws.internal.explorer.platform.util.DirUtils.getDir());
      out.write("\" class=\"contentbodymargin\">\n");
      out.write("<div id=\"contentborder\">\n");

   String titleImagePath = "wsdl/images/open_wsdl_highlighted.gif";
   String title = wsdlPerspective.getMessage("ALT_WSDL_SERVICE_DETAILS");

      out.write('\n');

/*******************************************************************************
 * Copyright (c) 2000, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

      out.write("\n");
      out.write("<table width=\"95%\" border=0 cellpadding=3 cellspacing=0>\n");
      out.write("  <tr>\n");
      out.write("    <td>\n");
      out.write("      <img src=\"");
      out.print(response.encodeURL(controller.getPathWithContext(titleImagePath)));
      out.write("\" alt=\"\">\n");
      out.write("      <strong>");
      out.print(title);
      out.write("</strong>\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=20> <img height=2 width=\"100%\" align=\"top\" src=\"");
      out.print(response.encodeURL(controller.getPathWithContext("images/keyline.gif")));
      out.write("\" alt=\"\"> </td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("  <tr>\n");
      out.write("    <td class=\"labels\">");
      out.print(wsdlPerspective.getMessage("FORM_LABEL_SERVICE_DETAILS_DESC"));
      out.write("</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");

   WSDLServiceElement wsdlServiceElement = (WSDLServiceElement)serviceNode.getTreeElement();
   String documentation = wsdlServiceElement.getPropertyAsString(WSDLModelConstants.PROP_DOCUMENTATION);
   if (documentation.length() > 0)
   {

      out.write("\n");
      out.write("<table>\n");
      out.write("  <tr>\n");
      out.write("    <td height=20 valign=\"bottom\" class=\"labels\">");
      out.print(documentation);
      out.write("</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=10>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");

   }
   Vector bindingNodes = serviceNode.getChildNodes();
   sectionHeaderInfo.clear();
   sectionHeaderInfo.setContainerId("Bindings");
   sectionHeaderInfo.setOtherProperties(bindingNodes);

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/wsdl/forms/bindings_table.jsp", out, true);
      out.write("\n");
      out.write("</div>\n");

   if (bindingNodes.size() > 0)
   {

      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("  twist(\"Bindings\",\"xBindings\");\n");
      out.write("</script>\n");

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
