package org.apache.jsp.wsdl.fragment;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.perspective.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.datamodel.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.fragment.*;
import org.eclipse.wst.ws.internal.explorer.platform.perspective.*;

public final class XSDComplexRFragmentJSP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 * IBM Corporation - initial API and implementation
 * yyyymmdd bug      Email and other contact information
 * -------- -------- -----------------------------------------------------------
 * 20070516   185596 makandre@ca.ibm.com - Andrew Mak, Web Services Explorer misinterprets response message
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
      java.lang.StringBuffer nodeID = null;
      synchronized (request) {
        nodeID = (java.lang.StringBuffer) _jspx_page_context.getAttribute("nodeID", PageContext.REQUEST_SCOPE);
        if (nodeID == null){
          nodeID = new java.lang.StringBuffer();
          _jspx_page_context.setAttribute("nodeID", nodeID, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      java.lang.StringBuffer elementID = null;
      synchronized (request) {
        elementID = (java.lang.StringBuffer) _jspx_page_context.getAttribute("elementID", PageContext.REQUEST_SCOPE);
        if (elementID == null){
          elementID = new java.lang.StringBuffer();
          _jspx_page_context.setAttribute("elementID", elementID, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      java.lang.StringBuffer attribute = null;
      synchronized (request) {
        attribute = (java.lang.StringBuffer) _jspx_page_context.getAttribute("attribute", PageContext.REQUEST_SCOPE);
        if (attribute == null){
          attribute = new java.lang.StringBuffer();
          _jspx_page_context.setAttribute("attribute", attribute, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');

WSDLPerspective wsdlPerspective = controller.getWSDLPerspective();
Node operNode = wsdlPerspective.getNodeManager().getNode(Integer.parseInt(nodeID.toString()));
WSDLOperationElement operElement = (WSDLOperationElement)operNode.getTreeElement();
IXSDComplexFragment frag = (IXSDComplexFragment)operElement.getFragmentByID(fragID.toString());
XSDToFragmentConfiguration xsdConfig = frag.getXSDToFragmentConfiguration();
String tableContainerIDBase = (new StringBuffer(FragmentConstants.TABLE_ID)).append(frag.getID()).toString();
String twistImageNameBase = (new StringBuffer("x")).append(tableContainerIDBase).toString();
IXSDFragment[] childFrags = frag.getAllFragments();
for (int i = 0; i < childFrags.length; i++) {
  fragID.delete(0, fragID.length());
  fragID.append(childFrags[i].getID());

      out.write("\n");
      out.write("  <table width=\"95%\" border=0 cellpadding=3 cellspacing=0>\n");
      out.write("    <tr>\n");
      out.write("      <td height=25 valign=\"bottom\" align=\"left\" nowrap width=11>\n");
      out.write("        <a href=\"javascript:twist('");
      out.print(i + tableContainerIDBase);
      out.write("','");
      out.print(i + twistImageNameBase);
      out.write("')\"><img name=\"");
      out.print(i + twistImageNameBase);
      out.write("\" src=\"");
      out.print(response.encodeURL(controller.getPathWithContext("images/twistopened.gif")));
      out.write("\" alt=\"");
      out.print(controller.getMessage("ALT_TWIST_OPENED"));
      out.write("\" class=\"twist\"></a>\n");
      out.write("      </td>\n");
      out.write("      <td class=\"labels\" height=25 valign=\"bottom\" align=\"left\" nowrap>\n");
      out.write("        ");
      out.print(frag.getName());
      out.write("\n");
      out.write("      </td>\n");
      out.write("    </tr>\n");
      out.write("  </table>\n");
      out.write("  <span id=\"");
      out.print(i + tableContainerIDBase);
      out.write("\">\n");
      out.write("  <table cellpadding=0 cellspacing=0 class=\"");
      out.print((xsdConfig.getIsWSDLPart() ? "fixfragtable" : "innerfixfragtable"));
      out.write("\">\n");
      out.write("    <tr>\n");
      out.write("      <td width=16>\n");
      out.write("        <img width=16 src=\"");
      out.print(response.encodeURL(controller.getPathWithContext("images/space.gif")));
      out.write("\" alt=\"\">\n");
      out.write("      </td>\n");
      out.write("      <td>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, childFrags[i].getReadFragment(), out, true);
      out.write("\n");
      out.write("      </td>\n");
      out.write("    </tr>\n");
      out.write("  ");


  IXSDAttributeFragment[] attributeFragments = frag.getAllAttributeFragments();
  IXSDAttributeFragment attributeFragment;
  for(int j = 0; j < attributeFragments.length; j++){
    attributeFragment = attributeFragments[j];
    
    if (attributeFragment.getID().startsWith(childFrags[i].getID())) {
      IXSDFragment delegationFragment = attributeFragment.getXSDDelegationFragment();
      fragID.delete(0, fragID.length());
      fragID.append(delegationFragment.getID());
      attribute.delete(0, attribute.length());
      attribute.append("true");
      
      out.write("\n");
      out.write("      <tr>\n");
      out.write("        <td width=16>\n");
      out.write("          <img width=16 src=\"");
      out.print(response.encodeURL(controller.getPathWithContext("images/space.gif")));
      out.write("\" alt=\"\">\n");
      out.write("        </td>\n");
      out.write("        <td>\n");
      out.write("          <input type=\"hidden\" name=\"");
      out.print(frag.getID());
      out.write("\" value=\"");
      out.print(attributeFragment.getID());
      out.write("\">\n");
      out.write("          ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, delegationFragment.getReadFragment(), out, true);
      out.write("\n");
      out.write("        </td>\n");
      out.write("      </tr>\n");
      out.write("      ");

    }  
  }
}  
  
      out.write("\n");
      out.write("  \n");
      out.write("  </table>\n");
      out.write("  </span>\n");
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
