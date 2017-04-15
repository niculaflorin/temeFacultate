package org.apache.jsp.wsdl.scripts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.perspective.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.util.*;

public final class fragmenttables_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 * Copyright (c) 2002, 2004 IBM Corporation and others.
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/scripts/tables.jsp", out, true);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/scripts/formutils.jsp", out, true);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/scripts/calendarbrowser.jsp", out, true);
      out.write("\n");
      out.write("<script language=\"javascript\" src=\"");
      out.print(response.encodeURL(controller.getPathWithContext("scripts/browserdetect.js")));
      out.write("\">\n");
      out.write("</script>\n");
      out.write("\n");

   WSDLPerspective wsdlPerspective = controller.getWSDLPerspective();

      out.write("\n");
      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("  var xsdInfoDialog;\n");
      out.write("  var xsdInfoDialogClosed = true;\n");
      out.write("  var rowCheckboxName = \"rowCheckboxName\";\n");
      out.write("  var unbounded = ");
      out.print(FragmentConstants.UNBOUNDED);
      out.write(";\n");
      out.write("\n");
      out.write("  function checkMaxOccursReached(tableContainerID, maxOccurs) {\n");
      out.write("    var table = getTable(tableContainerID);\n");
      out.write("    if (maxOccurs != unbounded && (table.rows.length - numberOfHeaderRows) >= maxOccurs) {\n");
      out.write("      alert(\"");
      out.print(HTMLUtils.JSMangle(wsdlPerspective.getMessage("MSG_ERROR_MAX_OCCURS_VIOLATION")));
      out.write("\");\n");
      out.write("      return true;\n");
      out.write("    }\n");
      out.write("    else\n");
      out.write("      return false;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function checkMinOccursAndRemoveSelectedRows(tableContainerID, minOccurs) {\n");
      out.write("    var table = getTable(tableContainerID);\n");
      out.write("    var rowsLength = table.rows.length - numberOfHeaderRows;\n");
      out.write("    var checkedRows = 0;\n");
      out.write("    for (var i = numberOfHeaderRows; i < table.rows.length; i++) {\n");
      out.write("      var tableRow = table.rows[i];\n");
      out.write("      var rowCheckbox = tableRow.getElementsByTagName(\"input\").item(0);\n");
      out.write("      if (rowCheckbox.checked)\n");
      out.write("        checkedRows++;\n");
      out.write("    }\n");
      out.write("    if (checkedRows == 0)\n");
      out.write("      alert(\"");
      out.print(HTMLUtils.JSMangle(wsdlPerspective.getMessage("MSG_ERROR_NOTHING_SELECTED")));
      out.write("\");\n");
      out.write("    else if ((rowsLength - checkedRows) < minOccurs)\n");
      out.write("      alert(\"");
      out.print(HTMLUtils.JSMangle(wsdlPerspective.getMessage("MSG_ERROR_MIN_OCCURS_VIOLATION")));
      out.write("\");\n");
      out.write("    else\n");
      out.write("      removeSelectedRows(tableContainerID);\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  function checkMinOccursAndRemoveSelectedRowsAttribute(tableContainerID, minOccurs) {\n");
      out.write("    var table = getTable(tableContainerID);\n");
      out.write("    var rowsLength = table.rows.length - numberOfHeaderRows;\n");
      out.write("    var checkedRows = 0;\n");
      out.write("    for (var i = numberOfHeaderRows; i < table.rows.length; i++) {\n");
      out.write("      var tableRow = table.rows[i];\n");
      out.write("      var rowCheckbox = tableRow.getElementsByTagName(\"input\").item(0);\n");
      out.write("      if (rowCheckbox.checked)\n");
      out.write("        checkedRows++;\n");
      out.write("    }\n");
      out.write("    if (checkedRows == 0)\n");
      out.write("      alert(\"");
      out.print(HTMLUtils.JSMangle(wsdlPerspective.getMessage("MSG_ERROR_NOTHING_SELECTED")));
      out.write("\");\n");
      out.write("    else if ((rowsLength - checkedRows) < minOccurs)\n");
      out.write("      alert(\"");
      out.print(HTMLUtils.JSMangle(wsdlPerspective.getMessage("MSG_ERROR_MIN_OCCURS_VIOLATION")));
      out.write("\");\n");
      out.write("    else\n");
      out.write("      removeSelectedRowsAttribute(tableContainerID);\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  function checkMinOccursAndRemoveSelectedDateTimeRows(calendarType,tableContainerID,minOccurs)\n");
      out.write("  {\n");
      out.write("    var table = getTable(tableContainerID);\n");
      out.write("    var newCalendarTargetRow = calendarTargetRow;\n");
      out.write("    for (var i=numberOfHeaderRows;i<table.rows.length;i++)\n");
      out.write("    {\n");
      out.write("      var columns = table.rows[i].getElementsByTagName(\"td\");\n");
      out.write("      var rowCheckbox = columns.item(0).getElementsByTagName(\"input\").item(0);\n");
      out.write("      if (rowCheckbox.checked)\n");
      out.write("      {\n");
      out.write("        if (i-numberOfHeaderRows == calendarTargetRow)\n");
      out.write("          newCalendarTargetRow = -1;\n");
      out.write("        else\n");
      out.write("          newCalendarTargetRow--;\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("    if (newCalendarTargetRow == -1)\n");
      out.write("      closeCalendarBrowser();\n");
      out.write("    calendarTargetRow = newCalendarTargetRow;\n");
      out.write("      \n");
      out.write("    checkMinOccursAndRemoveSelectedRows(tableContainerID,minOccurs);\n");

   // Fix the browse... links.

      out.write("\n");
      out.write("    var table = getTable(tableContainerID);\n");
      out.write("    for (var i=numberOfHeaderRows;i<table.rows.length;i++)\n");
      out.write("    {\n");
      out.write("      var columns = table.rows[i].getElementsByTagName(\"td\");\n");
      out.write("      var dateTimeTextField = columns.item(1).getElementsByTagName(\"input\").item(0);\n");
      out.write("      setDateTimeBrowseLinkHref(columns.item(2).getElementsByTagName(\"a\").item(0),calendarType,dateTimeTextField.name,i-numberOfHeaderRows);\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function createInstance(tableContainerID, maxOccurs, fragmentID, nameAnchorID) {\n");
      out.write("    if (checkMaxOccursReached(tableContainerID, maxOccurs))\n");
      out.write("      return;\n");
      out.write("    twistOpen(tableContainerID);\n");
      out.write("    var table = getTable(tableContainerID);\n");
      out.write("    var tableBody = table.getElementsByTagName(\"tbody\").item(0);\n");
      out.write("    var newRow = document.createElement(\"tr\");\n");
      out.write("    var newColumn = document.createElement(\"td\");\n");
      out.write("    newColumn.appendChild(createHiddenElement(\"");
      out.print(FragmentConstants.FRAGMENT_ID);
      out.write("\", fragmentID));\n");
      out.write("    newColumn.appendChild(createHiddenElement(\"");
      out.print(FragmentConstants.NAME_ANCHOR_ID);
      out.write("\", nameAnchorID));\n");
      out.write("    newRow.appendChild(newColumn);\n");
      out.write("    tableBody.appendChild(newRow);\n");
      out.write("    var form = document.getElementsByTagName(\"form\");\n");
      out.write("    form[0].action = \"");
      out.print(response.encodeURL(controller.getPathWithContext("wsdl/actions/CreateInstanceActionJSP.jsp")));
      out.write("\";\n");
      out.write("    form[0].submit();\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function openXSDInfoDialog(link) {\n");
      out.write("    xsdInfoDialog = window.open(link, \"XSDInformationDialog\", \"height=500,width=500,scrollbars=no,resizable=yes\");\n");
      out.write("    if (xsdInfoDialog.focus)\n");
      out.write("      xsdInfoDialog.focus();\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function closeXSDInfoDialog()\n");
      out.write("  {\n");
      out.write("    if (!xsdInfoDialogClosed)\n");
      out.write("      xsdInfoDialog.close();\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function synchronizeFragmentViews(viewID) {\n");
      out.write("    var form = document.getElementsByTagName(\"form\");\n");
      out.write("    if (viewID == \"");
      out.print(FragmentConstants.FRAGMENT_VIEW_SWITCH_FORM_TO_SOURCE);
      out.write("\")\n");
      out.write("      form[0].appendChild(createHiddenElement(\"");
      out.print(FragmentConstants.FRAGMENT_VIEW_ID);
      out.write("\",\"");
      out.print(FragmentConstants.FRAGMENT_VIEW_SWITCH_FORM_TO_SOURCE);
      out.write("\"));\n");
      out.write("    else\n");
      out.write("      form[0].appendChild(createHiddenElement(\"");
      out.print(FragmentConstants.FRAGMENT_VIEW_ID);
      out.write("\",\"");
      out.print(FragmentConstants.FRAGMENT_VIEW_SWITCH_SOURCE_TO_FORM);
      out.write("\"));\n");
      out.write("    form[0].action = \"");
      out.print(response.encodeURL(controller.getPathWithContext("wsdl/actions/SynchronizeFragmentViewsActionJSP.jsp")));
      out.write("\";\n");
      out.write("    form[0].submit();\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  function addSimpleAtomicDateTimeRows(calendarType,tableContainerID,id,name,value,maxOccurs) {\n");
      out.write("    if (checkMaxOccursReached(tableContainerID, maxOccurs))\n");
      out.write("      return;\n");
      out.write("    twistOpen(tableContainerID);\n");
      out.write("    var table = getTable(tableContainerID);\n");
      out.write("    var tableBody = table.getElementsByTagName(\"tbody\").item(0);\n");
      out.write("    var newRow = document.createElement(\"tr\");\n");
      out.write("    var column0 = document.createElement(\"td\");\n");
      out.write("    var column1 = document.createElement(\"td\");\n");
      out.write("    var column2 = document.createElement(\"td\");\n");
      out.write("\n");
      out.write("    var rowCheckbox = createRowCheckbox();\n");
      out.write("    column0.appendChild(rowCheckbox);\n");
      out.write("\n");
      out.write("    var input = document.createElement(\"input\");\n");
      out.write("    input.type = \"text\";\n");
      out.write("    input.id = id;\n");
      out.write("    input.name = name;\n");
      out.write("    if (value != null && value.length > 0)\n");
      out.write("      input.value = value;\n");
      out.write("    input.className = \"tabletextenter\";\n");
      out.write("    column1.appendChild(input);\n");
      out.write("    \n");
      out.write("    column2.appendChild(createDateTimeBrowseLink(calendarType,name,table.rows.length-1));\n");
      out.write("    column2.width = \"90%\";\n");
      out.write("\n");
      out.write("    column0.className = \"checkboxcells\";\n");
      out.write("    column1.className = \"tablecells\";\n");
      out.write("    column2.className = \"tablecells\";\n");
      out.write("    newRow.appendChild(column0);\n");
      out.write("    newRow.appendChild(column1);\n");
      out.write("    newRow.appendChild(column2);\n");
      out.write("    tableBody.appendChild(newRow);\n");
      out.write("  }  \n");
      out.write("  \n");
      out.write("  function createDateTimeBrowseLink(calendarType,name,position)\n");
      out.write("  {\n");
      out.write("    var link = document.createElement(\"a\");\n");
      out.write("    setDateTimeBrowseLinkHref(link,calendarType,name,position);\n");
      out.write("    link.appendChild(document.createTextNode(\"");
      out.print(HTMLUtils.JSMangle(controller.getMessage("FORM_LINK_BROWSE")));
      out.write("\"));\n");
      out.write("    return link;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  function setDateTimeBrowseLinkHref(link,calendarType,name,position)\n");
      out.write("  {\n");
      out.write("    link.href = \"javascript:openCalendarBrowser(\"+calendarType+\",'contentborder','\"+name+\"',\"+position+\")\";\n");
      out.write("    return link;\n");
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
