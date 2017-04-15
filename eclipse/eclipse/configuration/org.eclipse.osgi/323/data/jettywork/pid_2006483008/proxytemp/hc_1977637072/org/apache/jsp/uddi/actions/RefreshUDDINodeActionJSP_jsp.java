package org.apache.jsp.uddi.actions;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.wst.ws.internal.explorer.platform.uddi.actions.*;
import org.eclipse.wst.ws.internal.explorer.platform.uddi.perspective.*;
import org.eclipse.wst.ws.internal.explorer.platform.perspective.*;
import org.eclipse.wst.ws.internal.explorer.platform.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.util.*;
import java.util.*;

public final class RefreshUDDINodeActionJSP_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/uddi/actions/NewNodeAction.inc");
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
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">\n");
      out.write("<html lang=\"");
      out.print(response.getLocale().getLanguage());
      out.write("\">\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<script language=\"javascript\" src=\"");
      out.print(response.encodeURL(controller.getPathWithContext("scripts/browserdetect.js")));
      out.write("\">\n");
      out.write("</script>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/uddi/scripts/uddipanes.jsp", out, true);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/scripts/formutils.jsp", out, true);
      out.write('\n');

   // Prepare the action.
   RefreshUDDINodeAction action = new RefreshUDDINodeAction(controller);

   // The action may be executed via program link.
   action.populatePropertyTable(request);
   boolean isNodeDataValid = action.verifyNodeData();

   boolean inputsValid = true;
   String onLoadAction;
   UDDIPerspective uddiPerspective = controller.getUDDIPerspective();

      out.write("   \n");
      out.write("<script language=\"javascript\">\n");
      out.write("  function processClearNodesForm()\n");
      out.write("  {\n");
      out.write("    var clearNodesForm = document.forms[0];\n");
      out.write("    var submitClearNodesForm = false;\n");

     Vector staleNodes = action.getStaleNodes();
     for (int i=0;i<staleNodes.size();i++)
     {
       Node staleNode = (Node)staleNodes.elementAt(i);

      out.write("\n");
      out.write("    if (confirm(\"");
      out.print(HTMLUtils.JSMangle(uddiPerspective.getMessage("MSG_QUESTION_REMOVE_NODE",staleNode.getNodeName())));
      out.write("\"))\n");
      out.write("    {\n");
      out.write("      clearNodesForm.appendChild(createHiddenElement(\"");
      out.print(ActionInputs.NODEID);
      out.write('"');
      out.write(',');
      out.print(staleNode.getNodeId());
      out.write("));\n");
      out.write("      submitClearNodesForm = true;\n");
      out.write("    }\n");

     }

      out.write("\n");
      out.write("    if (submitClearNodesForm)\n");
      out.write("      clearNodesForm.submit();\n");
      out.write("  }\n");
      out.write("</script>    \n");
      out.write("</head>\n");
      out.write("<body dir=\"");
      out.print(org.eclipse.wst.ws.internal.explorer.platform.util.DirUtils.getDir());
      out.write("\">\n");
      out.write("<form action=\"");
      out.print(response.encodeURL(controller.getPathWithContext("uddi/actions/ClearNavigatorNodesActionJSP.jsp")));
      out.write("\" target=\"");
      out.print(FrameNames.PERSPECTIVE_WORKAREA);
      out.write("\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("</form>\n");

   if (!isNodeDataValid)
   {
     int nodeId = Integer.parseInt((String)(action.getPropertyTable().get(ActionInputs.NODEID)));
     String nodeName = uddiPerspective.getNavigatorManager().getNode(nodeId).getNodeName();

      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("  if (confirm(\"");
      out.print(HTMLUtils.JSMangle(uddiPerspective.getMessage("MSG_QUESTION_REMOVE_NODE",nodeName)));
      out.write("\"))\n");
      out.write("    perspectiveWorkArea.location = \"");
      out.print(response.encodeURL(controller.getPathWithContext(ClearNavigatorNodeAction.getActionLink(nodeId))));
      out.write("\";\n");
      out.write("</script>    \n");

   }
   else
   {

      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("  processClearNodesForm();\n");
      out.write("</script>\n");

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

      out.write('\n');

   if (!inputsValid)
   {

      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("  propertiesContent.location = \"");
      out.print(response.encodeURL(controller.getPathWithContext("uddi/properties_content.jsp")));
      out.write("\";\n");
      out.write("  statusContent.location = \"");
      out.print(response.encodeURL(controller.getPathWithContext("uddi/status_content.jsp")));
      out.write("\";\n");
      out.write("</script>\n");

   }
   else
   {
     // Run the action and obtain the return code (fail/success).
     boolean actionResult = action.execute();

     if (actionResult)
     {
       // Ensure that the selected node is visible.
       controller.getUDDIPerspective().getNavigatorManager().makeSelectedNodeVisible();

      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("  if (isMicrosoftInternetExplorer())\n");
      out.write("  {\n");
      out.write("    navigatorContent.location = \"");
      out.print(response.encodeURL(controller.getPathWithContext("uddi/navigator_content.jsp")));
      out.write("\";\n");
      out.write("    propertiesContainer.location = \"");
      out.print(response.encodeURL(controller.getPathWithContext("uddi/properties_container.jsp")));
      out.write("\";\n");
      out.write("    statusContent.location = \"");
      out.print(response.encodeURL(controller.getPathWithContext("uddi/status_content.jsp")));
      out.write("\";\n");
      out.write("  }\n");
      out.write("  else\n");
      out.write("    perspectiveContent.location = \"");
      out.print(response.encodeURL(controller.getPathWithContext("uddi/uddi_perspective_content.jsp")));
      out.write("\";\n");
      out.write("</script>\n");

     }
     else
     {

      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("  propertiesContent.location = \"");
      out.print(response.encodeURL(controller.getPathWithContext("uddi/properties_content.jsp")));
      out.write("\";\n");
      out.write("  statusContent.location = \"");
      out.print(response.encodeURL(controller.getPathWithContext("uddi/status_content.jsp")));
      out.write("\";\n");
      out.write("</script>\n");

     }
   }

      out.write('\n');
      out.write('\n');

   }

      out.write("   \n");
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
