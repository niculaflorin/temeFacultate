package org.apache.jsp.wsdl.forms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.wst.ws.internal.explorer.platform.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.perspective.FormTool;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.perspective.WSDLPerspective;
import org.eclipse.wst.ws.internal.explorer.platform.util.HTMLUtils;

public final class OpenWSDLForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 * Copyright (c) 2001, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * IBM Corporation - initial API and implementation
 * yyyymmdd bug      Email and other contact information
 * -------- -------- -----------------------------------------------------------
 * 20060427   127443 jesper@selskabet.org - Jesper S Moller
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
  FormTool formTool = (FormTool)wsdlPerspective.getNodeManager().getSelectedNode().getToolManager().getSelectedTool();

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">\n");
      out.write("<html lang=\"");
      out.print(response.getLocale().getLanguage());
      out.write("\">\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <title>");
      out.print(wsdlPerspective.getMessage("FORM_TITLE_OPEN_WSDL"));
      out.write("</title>\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(response.encodeURL(controller.getPathWithContext("css/windows.css")));
      out.write("\">\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/wsdl/scripts/wsdlpanes.jsp", out, true);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/scripts/formsubmit.jsp", out, true);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/scripts/formutils.jsp", out, true);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/scripts/wsdlbrowser.jsp", out, true);
      out.write("\n");
      out.write("</head>\n");
      out.write("<body dir=\"");
      out.print(org.eclipse.wst.ws.internal.explorer.platform.util.DirUtils.getDir());
      out.write("\" class=\"contentbodymargin\" onUnload=\"closeWSDLBrowser()\">\n");
      out.write("<div id=\"contentborder\">\n");
      out.write("  <form action=\"");
      out.print(response.encodeURL(controller.getPathWithContext("wsdl/actions/OpenWSDLActionJSP.jsp")));
      out.write("\" method=\"post\" target=\"");
      out.print(FrameNames.PERSPECTIVE_WORKAREA);
      out.write("\" enctype=\"multipart/form-data\" onSubmit=\"return handleSubmit(this)\">\n");
      out.write("    ");

    String titleImagePath = "wsdl/images/open_wsdl_highlighted.gif";
    String title = wsdlPerspective.getMessage("ALT_OPEN_WSDL");
    
      out.write("\n");
      out.write("    ");

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
      out.write("      <table>\n");
      out.write("        <tr>\n");
      out.write("          <td class=\"labels\">\n");
      out.write("            ");
      out.print(wsdlPerspective.getMessage("FORM_LABEL_OPEN_WSDL_DESC"));
      out.write("\n");
      out.write("          </td>\n");
      out.write("        </tr>\n");
      out.write("      </table>        \n");
      out.write("        <table width=\"95%\" border=0 cellpadding=3 cellspacing=0>\n");
      out.write("          <tr>\n");
      out.write("            <td class=\"labels\" height=25 valign=\"bottom\" nowrap>\n");
      out.write("              <label for=\"input_wsdl_url\">");
      out.print(controller.getMessage("FORM_LABEL_WSDL_URL"));
      out.write("</label>\n");
      out.write("              ");

              if (!formTool.isInputValid(ActionInputs.QUERY_INPUT_WSDL_URL)) {
              
      out.write("\n");
      out.write("              ");
      out.print(HTMLUtils.redAsterisk());
      out.write("\n");
      out.write("              ");

              }
              String wsdlUrl = (String)formTool.getProperty(ActionInputs.QUERY_INPUT_WSDL_URL);
              if (wsdlUrl == null)
                wsdlUrl = "";
              
      out.write("\n");
      out.write("            </td>\n");
      out.write("            <td height=25 valign=\"bottom\" nowrap>\n");
      out.write("              <a href=\"javascript:openWSDLBrowser('contentborder',");
      out.print(ActionInputs.WSDL_TYPE_SERVICE);
      out.write(")\">");
      out.print(controller.getMessage("FORM_LINK_BROWSE"));
      out.write("</a>\n");
      out.write("            </td>\n");
      out.write("            <td width=\"90%\">&nbsp;</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td colspan=3>\n");
      out.write("              <input type=\"text\" id=\"input_wsdl_url\" name=\"");
      out.print(ActionInputs.QUERY_INPUT_WSDL_URL);
      out.write("\" value=\"");
      out.print(HTMLUtils.charactersToHTMLEntitiesStrict(wsdlUrl));
      out.write("\" size=\"50\" class=\"textenter\">\n");
      out.write("            </td>\n");
      out.write("          </tr>\n");
      out.write("        </table>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/forms/simpleCommon_table.jsp", out, true);
      out.write("\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("<script language=\"javascript\">\n");
      out.write("  closeWSDLBrowser();\n");
      out.write("</script>  \n");
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
