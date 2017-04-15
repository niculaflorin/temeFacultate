package org.apache.jsp.scripts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.wst.ws.internal.explorer.platform.util.*;

public final class tables_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("  var numberOfHeaderRows = 1;\n");
      out.write("  function getTable(tableContainerId)\n");
      out.write("  {\n");
      out.write("    var container = document.getElementById(tableContainerId);\n");
      out.write("    return container.getElementsByTagName(\"table\").item(0);\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function setSelect(select,value)\n");
      out.write("  {\n");
      out.write("    for (var i=0;i<select.options.length;i++)\n");
      out.write("    {\n");
      out.write("      if (select.options[i].value == value)\n");
      out.write("      {\n");
      out.write("        select.selectedIndex = i;\n");
      out.write("        return select.options[i].text;\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function removeSelectedRows(tableContainerId)\n");
      out.write("  {\n");
      out.write("    var table = getTable(tableContainerId);\n");
      out.write("    for (var i=numberOfHeaderRows;i<table.rows.length;i++)\n");
      out.write("    {\n");
      out.write("      var rowCheckbox = table.rows[i].getElementsByTagName(\"input\").item(0);\n");
      out.write("      if (rowCheckbox.checked)\n");
      out.write("      {\n");
      out.write("        table.deleteRow(i);\n");
      out.write("        i--;\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("    var checkAllCheckboxRow = table.rows[0];\n");
      out.write("    var checkAllCheckbox = checkAllCheckboxRow.getElementsByTagName(\"input\").item(0);\n");
      out.write("    if (checkAllCheckbox.checked)\n");
      out.write("      checkAllCheckbox.checked = false;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function handleRowCheckboxClick(e)\n");
      out.write("  {\n");
      out.write("    var checkbox;\n");
      out.write("    if (isMicrosoftInternetExplorer())\n");
      out.write("      checkbox = event.srcElement;\n");
      out.write("    else\n");
      out.write("      checkbox = e.target;\n");
      out.write("    var cell = checkbox.parentNode;\n");
      out.write("    var row = cell.parentNode;\n");
      out.write("    if (checkbox.checked)\n");
      out.write("      highlightRow(row,\"rowcolor\");\n");
      out.write("    else\n");
      out.write("      highlightRow(row,\"tablecells\");\n");
      out.write("\n");
      out.write("    var tbody = row.parentNode;\n");
      out.write("    var table = tbody.parentNode;\n");
      out.write("    var checkAllCheckbox = table.rows[0].getElementsByTagName(\"input\").item(0);\n");
      out.write("    if (checkAllCheckbox.checked)\n");
      out.write("      checkAllCheckbox.checked = false;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function createRowCheckbox()\n");
      out.write("  {\n");
      out.write("    var rowCheckbox = document.createElement(\"input\");\n");
      out.write("    rowCheckbox.setAttribute(\"name\",rowCheckboxName);\n");
      out.write("    rowCheckbox.type = \"checkbox\";\n");
      out.write("    rowCheckbox.title = \"");
      out.print(HTMLUtils.JSMangle(controller.getMessage("FORM_CONTROL_TITLE_SELECT_ROW_CHECK_BOX")));
      out.write("\";\n");
      out.write("    rowCheckbox.onclick = handleRowCheckboxClick;\n");
      out.write("    return rowCheckbox;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function handleCheckAllClick(tableContainerId,checkAllCheckbox)\n");
      out.write("  {\n");
      out.write("    var table = getTable(tableContainerId);\n");
      out.write("    for (var i=numberOfHeaderRows;i<table.rows.length;i++)\n");
      out.write("    {\n");
      out.write("      var rowCheckboxCell = table.rows[i].getElementsByTagName(\"td\").item(0);\n");
      out.write("      var rowCheckbox = rowCheckboxCell.childNodes[0];\n");
      out.write("      rowCheckbox.checked = checkAllCheckbox.checked;\n");
      out.write("      if (rowCheckbox.checked)\n");
      out.write("        highlightRow(table.rows[i],\"rowcolor\");\n");
      out.write("      else\n");
      out.write("        highlightRow(table.rows[i],\"tablecells\");\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function highlightRow(row,className)\n");
      out.write("  {\n");
      out.write("    var rowColumns = row.getElementsByTagName(\"td\");\n");
      out.write("    for (var i=1;i<rowColumns.length;i++)\n");
      out.write("      rowColumns.item(i).className = className;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function highlightErrantRow(row,className)\n");
      out.write("  {\n");
      out.write("    var rowColumns = row.getElementsByTagName(\"td\");\n");
      out.write("    var column0 = rowColumns.item(0);\n");
      out.write("    var column0Control = column0.childNodes[0];\n");
      out.write("    var start;\n");
      out.write("    if (column0Control.type == \"checkbox\")\n");
      out.write("    {\n");
      out.write("      column0Control.checked = true;\n");
      out.write("      rowColumns.item(1).className = \"firstcolumnerrantrowcolor\";\n");
      out.write("      start = 2;\n");
      out.write("    }\n");
      out.write("    else\n");
      out.write("    {\n");
      out.write("      column0.className = \"firstcolumnerrantrowcolor\";\n");
      out.write("      start = 1;\n");
      out.write("    }\n");
      out.write("    rowColumns.item(rowColumns.length-1).className = \"lastcolumnerrantrowcolor\";\n");
      out.write("    for (var i=start;i<rowColumns.length-1;i++)\n");
      out.write("      rowColumns.item(i).className = \"middleerrantrowcolor\";\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function twist(tableContainerId,twistImageName)\n");
      out.write("  {\n");
      out.write("    var tableContainer = document.getElementById(tableContainerId);\n");
      out.write("    var twistImage = document.images[twistImageName];\n");
      out.write("    if (tableContainer.style.display == \"none\")\n");
      out.write("    {\n");
      out.write("      tableContainer.style.display = \"\";\n");
      out.write("      twistImage.src = \"");
      out.print(response.encodeURL(controller.getPathWithContext("images/twistopened.gif")));
      out.write("\";\n");
      out.write("      twistImage.alt = \"");
      out.print(HTMLUtils.JSMangle(controller.getMessage("ALT_TWIST_OPENED")));
      out.write("\";\n");
      out.write("    }\n");
      out.write("    else\n");
      out.write("    {\n");
      out.write("      tableContainer.style.display = \"none\";\n");
      out.write("      twistImage.src = \"");
      out.print(response.encodeURL(controller.getPathWithContext("images/twistclosed.gif")));
      out.write("\";\n");
      out.write("      twistImage.alt = \"");
      out.print(HTMLUtils.JSMangle(controller.getMessage("ALT_TWIST_CLOSED")));
      out.write("\";\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function twistOpen(tableContainerId)\n");
      out.write("  {\n");
      out.write("    if (document.getElementById(tableContainerId).style.display == \"none\")\n");
      out.write("      twist(tableContainerId,\"x\"+tableContainerId);\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function getDefaultDisplayString(inputValue)\n");
      out.write("  {\n");
      out.write("    if (inputValue == null || inputValue.length < 1)\n");
      out.write("      return \"");
      out.print(HTMLUtils.JSMangle(controller.getMessage("TABLE_BLANK_PLACEHOLDER")));
      out.write("\";\n");
      out.write("    return inputValue;\n");
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
