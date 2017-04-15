package org.apache.jsp.wsdl.forms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.wst.ws.internal.explorer.platform.perspective.Node;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.perspective.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.wsdl.datamodel.WSDLOperationElement;

public final class ReadOnlyFragmentsSoapView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 * 20060509   103072 mahutch@ca.ibm.com - Mark Hutchinson
 * 20060515   140607 mahutch@ca.ibm.com - Mark Hutchinson
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
      out.write('\n');

WSDLPerspective wsdlPerspective = controller.getWSDLPerspective();
wsdlPerspective.setStatusContentType(WSDLPerspective.STATUS_CONTENT_RESULT_SOURCE);
Node operNode = wsdlPerspective.getOperationNode();
WSDLOperationElement operElement = (WSDLOperationElement)operNode.getTreeElement();
String soapRequestTableContainerId = "SOAPRequest";
StringBuffer soapRequestTwistImageName = new StringBuffer("x");
soapRequestTwistImageName.append(soapRequestTableContainerId);
String soapResponseTableContainerId = "SOAPResponse";
StringBuffer soapResponseTwistImageName = new StringBuffer("x");
soapResponseTwistImageName.append(soapResponseTableContainerId);

      out.write("\n");
      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("  var sectionIds = [\"");
      out.print(soapRequestTableContainerId);
      out.write("\",\"");
      out.print(soapResponseTableContainerId);
      out.write("\"];\n");
      out.write("  function toggleSOAPEnvelope(soapEnvelopeType,twistImageName)\n");
      out.write("  {\n");

    // If both envelopes are expanded, each should have 50% height. Otherwise, the remaining displayed envelope should be reset to 100% height.

      out.write("\n");
      out.write("    var soapSectionId = sectionIds[soapEnvelopeType];\n");
      out.write("    var soapSection = document.getElementById(soapSectionId);\n");
      out.write("    var soapSectionTable = getTable(soapSectionId);\n");
      out.write("    var otherSoapSectionId = sectionIds[1-soapEnvelopeType];\n");
      out.write("    var otherSoapSection = document.getElementById(otherSoapSectionId);\n");
      out.write("    var otherSoapSectionTable = getTable(otherSoapSectionId);\n");
      out.write("    if (soapSection.style.display == \"none\")\n");
      out.write("    {\n");
      out.write("      if (otherSoapSection.style.display == \"\")\n");
      out.write("      {\n");
      out.write("        soapSectionTable.height = \"50%\";\n");
      out.write("        otherSoapSectionTable.height = \"50%\";\n");
      out.write("      }\n");
      out.write("      else\n");
      out.write("        soapSectionTable.height = \"100%\";\n");
      out.write("    }\n");
      out.write("    else\n");
      out.write("    {\n");
      out.write("      if (otherSoapSection.style.display == \"\")\n");
      out.write("        otherSoapSectionTable.height = \"100%\";\n");
      out.write("    }\n");
      out.write("    twist(soapSectionId,twistImageName);\n");
      out.write("  }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<table width=\"95%\" border=0 cellpadding=6 cellspacing=0>\n");
      out.write("  <tr>\n");
      out.write("    <td height=20 valign=\"bottom\" align=\"left\" nowrap width=11><a href=\"javascript:toggleSOAPEnvelope(");
      out.print(WSDLActionInputs.SOAP_ENVELOPE_TYPE_REQUEST);
      out.write(',');
      out.write('\'');
      out.print(soapRequestTwistImageName.toString());
      out.write("')\"><img name=\"");
      out.print(soapRequestTwistImageName.toString());
      out.write("\" src=\"");
      out.print(response.encodeURL(controller.getPathWithContext("images/twistclosed.gif")));
      out.write("\" alt=\"");
      out.print(controller.getMessage("ALT_TWIST_CLOSED"));
      out.write("\" class=\"twist\"></a></td>\n");
      out.write("    <td height=20 valign=\"bottom\" align=\"left\" nowrap class=\"labels\">\n");
      out.write("      <strong>");
      out.print(wsdlPerspective.getMessage("FORM_LABEL_SOAP_REQUEST_ENVELOPE"));
      out.write("</strong>\n");
      out.write("    </td>\n");
      out.write("    <td nowrap width=\"90%\">&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("<div id=\"");
      out.print(soapRequestTableContainerId);
      out.write("\" style=\"display:none\">\n");
      out.write("  <table width=\"95%\" height=\"50%\" border=0 cellpadding=0 cellpadding=0>\n");
      out.write("    <tr>\n");
      out.write("      <td>\n");
      out.write("        <iframe name=\"requestEnvelopeFrame\" frameborder=0 src=\"");
      out.print(response.encodeURL(controller.getPathWithContext(wsdlPerspective.getSOAPEnvelopeXMLLink(WSDLActionInputs.SOAP_ENVELOPE_TYPE_REQUEST))));
      out.write("\" width=\"95%\" height=\"100%\"></iframe>\n");
      out.write("      </td>\n");
      out.write("    </tr>\n");
      out.write("  </table>\n");
      out.write("</div>\n");
      out.write("<script language=\"javascript\">\n");
      out.write("  twist(\"");
      out.print(soapRequestTableContainerId);
      out.write("\",\"");
      out.print(soapRequestTwistImageName.toString());
      out.write("\");\n");
      out.write("</script>\n");
      out.write("\n");

if (operElement.getOperation().getOutput() != null)
{

      out.write("\n");
      out.write("<table width=\"95%\" border=0 cellpadding=6 cellspacing=0>\n");
      out.write("  <tr>\n");
      out.write("    <td height=20 valign=\"bottom\" align=\"left\" nowrap width=11><a href=\"javascript:toggleSOAPEnvelope(");
      out.print(WSDLActionInputs.SOAP_ENVELOPE_TYPE_RESPONSE);
      out.write(',');
      out.write('\'');
      out.print(soapResponseTwistImageName.toString());
      out.write("')\"><img name=\"");
      out.print(soapResponseTwistImageName.toString());
      out.write("\" src=\"");
      out.print(response.encodeURL(controller.getPathWithContext("images/twistclosed.gif")));
      out.write("\" alt=\"");
      out.print(controller.getMessage("ALT_TWIST_CLOSED"));
      out.write("\" class=\"twist\"></a></td>\n");
      out.write("    <td height=20 valign=\"bottom\" align=\"left\" nowrap class=\"labels\">\n");
      out.write("      <strong>");
      out.print(wsdlPerspective.getMessage("FORM_LABEL_SOAP_RESPONSE_ENVELOPE"));
      out.write("</strong>\n");
      out.write("    </td>\n");
      out.write("    <td nowrap width=\"90%\">&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("<div id=\"");
      out.print(soapResponseTableContainerId);
      out.write("\" style=\"display:none\">\n");
      out.write("  <table width=\"95%\" height=\"50%\" border=0 cellpadding=0 cellpadding=0>\n");
      out.write("    <tr>\n");
      out.write("      <td>\n");
      out.write("      \t<!-- the onload call is to fix bug 140607 in bugzilla -->\n");
      out.write("        <iframe onload=\"javascript:requestEnvelopeFrame.document.location.reload()\" frameborder=0 src=\"");
      out.print(response.encodeURL(controller.getPathWithContext(wsdlPerspective.getSOAPEnvelopeXMLLink(WSDLActionInputs.SOAP_ENVELOPE_TYPE_RESPONSE))));
      out.write("\" width=\"95%\" height=\"100%\"></iframe>\n");
      out.write("      </td>\n");
      out.write("    </tr>\n");
      out.write("  </table>\n");
      out.write("</div>\n");
      out.write("<script language=\"javascript\">\n");
      out.write("  twist(\"");
      out.print(soapResponseTableContainerId);
      out.write("\",\"");
      out.print(soapResponseTwistImageName.toString());
      out.write("\");\n");
      out.write("</script>\n");

}

      out.write('\n');
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
