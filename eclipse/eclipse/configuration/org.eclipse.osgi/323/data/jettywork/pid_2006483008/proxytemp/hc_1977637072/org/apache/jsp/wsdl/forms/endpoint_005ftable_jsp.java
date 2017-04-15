package org.apache.jsp.wsdl.forms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.perspective.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.datamodel.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.perspective.*;

public final class endpoint_005ftable_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("  function addEndpoint(tableContainerID, id, name, value, isRemovable)\n");
      out.write("  {\n");
      out.write("    twistOpen(tableContainerID);\n");
      out.write("    var table = getTable(tableContainerID);\n");
      out.write("    var tableBody = table.getElementsByTagName(\"tbody\").item(0);\n");
      out.write("    var newRow = document.createElement(\"tr\");\n");
      out.write("    var column0 = document.createElement(\"td\");\n");
      out.write("    var column1 = document.createElement(\"td\");\n");
      out.write("\n");
      out.write("    var rowCheckbox = createRowCheckbox();\n");
      out.write("    if (!isRemovable)\n");
      out.write("    {\n");
      out.write("      rowCheckbox.disabled = true;\n");
      out.write("    }\n");
      out.write("    column0.appendChild(rowCheckbox);\n");
      out.write("\n");
      out.write("    var endPoint;\n");
      out.write("    if (isRemovable)\n");
      out.write("    {\n");
      out.write("      endPoint = document.createElement(\"input\");\n");
      out.write("      endPoint.type = \"text\";\n");
      out.write("      endPoint.id = id;\n");
      out.write("      endPoint.name = name;\n");
      out.write("      if (value != null)\n");
      out.write("        endPoint.value = value;\n");
      out.write("      endPoint.className = \"tabletextenter\";\n");
      out.write("    }\n");
      out.write("    else\n");
      out.write("      endPoint = document.createTextNode(value);\n");
      out.write("    column1.appendChild(endPoint);\n");
      out.write("\n");
      out.write("    column0.className = \"checkboxcells\";\n");
      out.write("    column1.className = \"tablecells\";\n");
      out.write("    newRow.appendChild(column0);\n");
      out.write("    newRow.appendChild(column1);\n");
      out.write("    tableBody.appendChild(newRow);\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function handleEndpointCheckAllClick(tableContainerId,checkAllCheckbox)\n");
      out.write("  {\n");
      out.write("    var table = getTable(tableContainerId);\n");
      out.write("    for (var i=numberOfHeaderRows;i<table.rows.length;i++)\n");
      out.write("    {\n");
      out.write("      var rowCheckboxCell = table.rows[i].getElementsByTagName(\"td\").item(0);\n");
      out.write("      var rowCheckbox = rowCheckboxCell.childNodes[0];\n");
      out.write("      if (!rowCheckbox.disabled)\n");
      out.write("      {\n");
      out.write("        rowCheckbox.checked = checkAllCheckbox.checked;\n");
      out.write("        if (rowCheckbox.checked)\n");
      out.write("          highlightRow(table.rows[i],\"rowcolor\");\n");
      out.write("        else\n");
      out.write("          highlightRow(table.rows[i],\"tablecells\");\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("</script>\n");

   WSDLPerspective wsdlPerspective = controller.getWSDLPerspective();
   String tableContainerID = sectionHeaderInfo.getContainerId();
   StringBuffer twistImageName = new StringBuffer("x");
   twistImageName.append(tableContainerID);   
   WSDLBindingElement bindingElement = (WSDLBindingElement)sectionHeaderInfo.getOtherProperties();
   String[] endpoints = bindingElement.getEndPoints();
   String addressLocation = ((WSDLServiceElement)bindingElement.getParentElement()).getAddressLocation(bindingElement.getBinding());   

      out.write("\n");
      out.write("<table border=0 cellpadding=6 cellspacing=0>\n");
      out.write("  <tr>\n");
      out.write("    <td height=20 valign=\"bottom\" align=\"left\" nowrap width=11>\n");
      out.write("      <a href=\"javascript:twist('");
      out.print(tableContainerID);
      out.write("','");
      out.print(twistImageName.toString());
      out.write("')\"><img name=\"");
      out.print(twistImageName.toString());
      out.write("\" src=\"");
      out.print(response.encodeURL(controller.getPathWithContext("images/twistclosed.gif")));
      out.write("\" alt=\"");
      out.print(controller.getMessage("ALT_TWIST_CLOSED"));
      out.write("\" class=\"twist\"></a>\n");
      out.write("    </td>\n");
      out.write("    <td height=20 valign=\"bottom\" align=\"left\" nowrap class=\"labels\">\n");
      out.write("      <strong>");
      out.print(wsdlPerspective.getMessage("FORM_LABEL_END_POINTS"));
      out.write("</strong>\n");
      out.write("    </td>\n");
      out.write("    <td class=\"labels\" height=25 valign=\"bottom\" align=\"left\" nowrap>\n");
      out.write("      <a href=\"javascript:addEndpoint('");
      out.print(tableContainerID);
      out.write("', '");
      out.print(WSDLActionInputs.END_POINT);
      out.write("', '");
      out.print(WSDLActionInputs.END_POINT);
      out.write("', '");
      out.print(addressLocation);
      out.write("', true)\">");
      out.print(wsdlPerspective.getMessage("FORM_LINK_ADD"));
      out.write("</a>\n");
      out.write("    </td>\n");
      out.write("    <td class=\"labels\" height=25 valign=\"bottom\" align=\"left\" nowrap>\n");
      out.write("      <a href=\"javascript:removeSelectedRows('");
      out.print(tableContainerID);
      out.write("')\">");
      out.print(wsdlPerspective.getMessage("FORM_LINK_REMOVE"));
      out.write("</a>\n");
      out.write("    </td>\n");
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
      out.print(tableContainerID);
      out.write("\" style=\"display:none;\">\n");
      out.write("  <table width=\"95%\" cellpadding=3 cellspacing=0 class=\"tableborder\">\n");
      out.write("    <tr>\n");
      out.write("      <th class=\"checkboxcells\" width=10><input type=\"checkbox\" onClick=\"handleEndpointCheckAllClick('");
      out.print(tableContainerID);
      out.write("',this)\" title=\"");
      out.print(controller.getMessage("FORM_CONTROL_TITLE_SELECT_ALL_CHECK_BOX"));
      out.write("\"></th>\n");
      out.write("      <th class=\"headercolor\">");
      out.print(wsdlPerspective.getMessage("FORM_LABEL_END_POINTS"));
      out.write("</th>\n");
      out.write("    </tr>\n");
      out.write("  </table>\n");
      out.write("</div>\n");
      out.write("<script language=\"javascript\">\n");

  boolean isDefaultAdded = false;
  for (int i = 0; i < endpoints.length; i++)
  {
    if (endpoints[i].equals(addressLocation) && !isDefaultAdded)
    {

      out.write("\n");
      out.write("    addEndpoint('");
      out.print(tableContainerID);
      out.write("', '");
      out.print(WSDLActionInputs.END_POINT);
      out.write("', \"\", '");
      out.print(endpoints[i]);
      out.write("', false);\n");
      out.write("    \n");

      isDefaultAdded = true;
    }
    else
    {

      out.write("\n");
      out.write("    addEndpoint('");
      out.print(tableContainerID);
      out.write("', '");
      out.print(WSDLActionInputs.END_POINT);
      out.write("', '");
      out.print(WSDLActionInputs.END_POINT);
      out.write("', '");
      out.print(endpoints[i]);
      out.write("', true);\n");

    }
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
