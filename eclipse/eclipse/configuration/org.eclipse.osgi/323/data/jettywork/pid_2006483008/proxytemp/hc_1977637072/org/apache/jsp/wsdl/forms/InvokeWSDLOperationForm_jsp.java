package org.apache.jsp.wsdl.forms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.perspective.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.datamodel.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.fragment.*;
import org.eclipse.wst.ws.internal.explorer.platform.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.perspective.*;
import javax.wsdl.*;
import java.util.*;

public final class InvokeWSDLOperationForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 * Copyright (c) 2001, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * IBM Corporation - initial API and implementation
 * yyyymmdd bug      Email and other contact information
 * -------- -------- -----------------------------------------------------------
 * 20060512   121210 mahutch@ca.ibm.com - Mark Hutchinson
 * 20070305   117034 makandre@ca.ibm.com - Andrew Mak, Web Services Explorer should support SOAP Headers 
 * 20080825   158366 mahutch@ca.ibm.com - Mark Hutchinson
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
      java.lang.StringBuffer fragID = null;
      synchronized (request) {
        fragID = (java.lang.StringBuffer) _jspx_page_context.getAttribute("fragID", PageContext.REQUEST_SCOPE);
        if (fragID == null){
          fragID = new java.lang.StringBuffer();
          _jspx_page_context.setAttribute("fragID", fragID, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');

  WSDLPerspective wsdlPerspective = controller.getWSDLPerspective();
  Node selectedNode = wsdlPerspective.getNodeManager().getSelectedNode();
  InvokeWSDLOperationTool invokeWSDLOperationTool = (InvokeWSDLOperationTool)(selectedNode.getCurrentToolManager().getSelectedTool());
  WSDLOperationElement operElement = (WSDLOperationElement)selectedNode.getTreeElement();
  String fragmentViewID = invokeWSDLOperationTool.getFragmentViewID();
  int operationType = operElement.getOperationType();
  String invokeWSDLOperationURL = response.encodeURL(controller.getPathWithContext(invokeWSDLOperationTool.getFormActionLink(operationType,fragmentViewID)));

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">\n");
      out.write("<html lang=\"");
      out.print(response.getLocale().getLanguage());
      out.write("\">\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <title>");
      out.print(wsdlPerspective.getMessage("FORM_TITLE_INVOKE_WSDL_OPERATION"));
      out.write("</title>\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(response.encodeURL(controller.getPathWithContext("css/windows.css")));
      out.write("\">\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/scripts/formsubmit.jsp", out, true);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/wsdl/scripts/fragmenttables.jsp", out, true);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/wsdl/scripts/wsdlpanes.jsp", out, true);
      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("  function doAction(action)\n");
      out.write("  {\n");
      out.write("    var form = document.forms[0];\n");
      out.write("    if (handleSubmit(form))\n");
      out.write("    {\n");
      out.write("      form.");
      out.print(WSDLActionInputs.SUBMISSION_ACTION);
      out.write(".value = action;\n");
      out.write("      form.submit();\n");
      out.write("      form.");
      out.print(WSDLActionInputs.SUBMISSION_ACTION);
      out.write(".value = \"");
      out.print(invokeWSDLOperationURL);
      out.write("\";\n");
      out.write("      resetSubmission();\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  function closeChildWindows()\n");
      out.write("  {\n");
      out.write("    closeXSDInfoDialog();\n");
      out.write("    closeCalendarBrowser();\n");
      out.write("  }\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body dir=\"");
      out.print(org.eclipse.wst.ws.internal.explorer.platform.util.DirUtils.getDir());
      out.write("\" class=\"contentbodymargin\" onUnload=\"closeChildWindows()\">\n");
      out.write("<div id=\"contentborder\">\n");
      out.write("  <form action=\"");
      out.print(invokeWSDLOperationURL);
      out.write("\" method=\"post\" target=\"");
      out.print(FrameNames.PERSPECTIVE_WORKAREA);
      out.write("\" enctype=\"multipart/form-data\">\n");
      out.write("    <input type=\"hidden\" name=\"");
      out.print(WSDLActionInputs.SUBMISSION_ACTION);
      out.write("\" value=\"");
      out.print(WSDLActionInputs.SUBMISSION_ACTION_FORM);
      out.write("\">\n");
      out.write("    ");

    String titleImagePath = "wsdl/images/invoke_wsdl_operation_highlighted.gif";
    String title = wsdlPerspective.getMessage("ALT_INVOKE_WSDL_OPERATION");
    if (operationType == WSDLOperationElement.OPERATION_TYPE_SOAP)
    {
    
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
      out.write("    <td width=\"*\">&nbsp;</td>\n");
      out.write("    <td align=\"right\" class=\"labels\">\n");

   if (fragmentViewID.equals(FragmentConstants.FRAGMENT_VIEW_SWITCH_FORM_TO_SOURCE))
   {

      out.write("\n");
      out.write("      <a href=\"javascript:synchronizeFragmentViews('");
      out.print(FragmentConstants.FRAGMENT_VIEW_SWITCH_SOURCE_TO_FORM);
      out.write("')\" title=\"");
      out.print(wsdlPerspective.getMessage("ALT_SWITCH_TO_FORM_VIEW"));
      out.write('"');
      out.write('>');
      out.print(wsdlPerspective.getMessage("FORM_LINK_FORM"));
      out.write("</a>\n");

   }
   else
   {

      out.write("\n");
      out.write("      <a href=\"javascript:synchronizeFragmentViews('");
      out.print(FragmentConstants.FRAGMENT_VIEW_SWITCH_FORM_TO_SOURCE);
      out.write("')\" title=\"");
      out.print(wsdlPerspective.getMessage("ALT_SWITCH_TO_SOURCE_VIEW"));
      out.write('"');
      out.write('>');
      out.print(wsdlPerspective.getMessage("FORM_LINK_SOURCE"));
      out.write("</a>\n");

   }

      out.write("\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=20 colspan=3><img height=2 width=\"100%\" align=\"top\" src=\"");
      out.print(response.encodeURL(controller.getPathWithContext("images/keyline.gif")));
      out.write("\" alt=\"\"></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("    ");

    }
    else
    {
    
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
      out.write("    ");

    }
    
      out.write("\n");
      out.write("    <table>\n");
      out.write("      <tr>\n");
      out.write("        <td class=\"labels\">\n");
      out.write("\n");
      out.write("        ");
           
		//here we determine if there are any input parameters for this operation
		boolean hasInput = true;
		selectedNode = wsdlPerspective.getNodeManager().getSelectedNode();  
		Iterator iter = operElement.getOrderedBodyParts().iterator();        
		String operationName = operElement.getName();

		while (iter.hasNext())
		{
			javax.wsdl.Part part = (javax.wsdl.Part)iter.next(); 
			IXSDFragment frag = operElement.getFragment(part);  
			org.eclipse.xsd.XSDTypeDefinition def = frag.getXSDTypeDefinition();
			//we check the type of the operation's input message
			if (def == null)
			{
				//this is the pattern <element name="foo"></element>
				hasInput = false;
			}
			else
			{
				org.w3c.dom.Element element = def.getElement();				
				if (element.getLocalName().equals("complexType") && !element.hasChildNodes())
				{	//this is the pattern  <element name="foo"><complexType/></element>
					//there could be other patterns with no input but they are uncommon
					hasInput = false;
				}
			} 
      	}
		if (hasInput || !operElement.getSOAPHeaders().isEmpty())
		{
			out.print(wsdlPerspective.getMessage("FORM_LABEL_INVOKE_WSDL_OPERATION_DESC", operationName));
		}
		else
		{
			out.print(wsdlPerspective.getMessage("FORM_LABEL_INVOKE_WSDL_OPERATION_DESC_NO_INPUT", operationName ));
		}
        
      out.write("\n");
      out.write("         \n");
      out.write("        </td>\n");
      out.write("      </tr>\n");
      out.write("    </table>\n");
      out.write("    <table width=\"95%\" border=0 cellpadding=3 cellspacing=0>\n");
      out.write("      <tr>\n");
      out.write("        <td>\n");
      out.write("          <fieldset class=\"keylinefieldset\">\n");
      out.write("            <legend class=\"labels\">\n");
      out.write("              <label for=\"");
      out.print(WSDLActionInputs.END_POINT);
      out.write('"');
      out.write('>');
      out.print(wsdlPerspective.getMessage("FORM_LABEL_END_POINTS"));
      out.write("</label>\n");
      out.write("            </legend>\n");
      out.write("            <table border=0 cellpadding=10 cellspacing=0>\n");
      out.write("              <tr>\n");
      out.write("                <td>\n");
      out.write("                  <select id=\"");
      out.print(WSDLActionInputs.END_POINT);
      out.write("\" name=\"");
      out.print(WSDLActionInputs.END_POINT);
      out.write("\" class=\"selectlist\">\n");
      out.write("                    ");

                    WSDLBindingElement bindingElement = (WSDLBindingElement)operElement.getParentElement();
                    String[] endPoints = bindingElement.getEndPoints();
                    String currEndPoint = invokeWSDLOperationTool.getEndPoint();
                    for (int i = 0; i < endPoints.length; i++)
                    {
                    
      out.write("\n");
      out.write("                      <option value=\"");
      out.print(endPoints[i]);
      out.write('"');
      out.write(' ');
if (endPoints[i].equals(currEndPoint)) {
      out.write("selected");
}
      out.write('>');
      out.print(endPoints[i]);
      out.write("\n");
      out.write("                    ");

                    }
                    
      out.write("\n");
      out.write("                  </select>\n");
      out.write("                </td>\n");
      out.write("              </tr>\n");
      out.write("            </table>\n");
      out.write("          </fieldset>\n");
      out.write("        </td>\n");
      out.write("      </tr>\n");
      out.write("    </table>\n");
      out.write("    ");

    if (fragmentViewID.equals(FragmentConstants.FRAGMENT_VIEW_SWITCH_FORM_TO_SOURCE))
    {
    
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/wsdl/forms/FragmentsSoapView.jsp", out, true);
      out.write("\n");
      out.write("    ");

    }
    else
    {
    
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/wsdl/forms/FragmentsFormView.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("hasInput", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(hasInput), request.getCharacterEncoding()), out, true);
      out.write("\n");
      out.write("    ");

    }
    
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/forms/simpleCommon_table.jsp", out, true);
      out.write("\n");
      out.write("  </form>\n");
      out.write("</div>\n");
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
