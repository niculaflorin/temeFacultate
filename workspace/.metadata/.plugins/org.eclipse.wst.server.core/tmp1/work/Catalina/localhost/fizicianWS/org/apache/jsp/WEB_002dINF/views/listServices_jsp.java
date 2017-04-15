package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.Constants;
import org.apache.axis2.description.AxisOperation;
import org.apache.axis2.description.AxisService;
import org.apache.axis2.description.Parameter;
import org.apache.axis2.engine.AxisConfiguration;
import org.apache.axis2.util.Utils;
import org.apache.axis2.util.JavaUtils;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public final class listServices_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/include/httpbase.jsp", out, false);
      out.write("\r\n");
      out.write("<title>List Services</title>\r\n");
      out.write("    <link href=\"axis2-web/css/axis-style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/include/header.inc", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/include/link-footer.jsp", out, false);
      out.write("\r\n");
      out.write("<h1>Available services</h1>\r\n");
 String prefix = request.getAttribute("frontendHostUrl") + (String)request.getAttribute(Constants.SERVICE_PATH) + "/";

      out.write('\r');
      out.write('\n');

    HashMap serviceMap = (HashMap) request.getAttribute(Constants.SERVICE_MAP);
    Hashtable errornessservice = (Hashtable) request.getAttribute(Constants.ERROR_SERVICE_MAP);
    boolean status = false;
    if (serviceMap != null && !serviceMap.isEmpty()) {
        Iterator opItr;
        //HashMap operations;
        String serviceName;
        Collection servicecol = serviceMap.values();
        // Collection operationsList;
        for (Iterator iterator = servicecol.iterator(); iterator.hasNext();) {
            AxisService axisService = (AxisService) iterator.next();
            if (!Utils.isHiddenService(axisService)) {
            opItr = axisService.getOperations();
            //operationsList = operations.values();
            serviceName = axisService.getName();

      out.write("<h2><a style=\"color:blue\" href=\"");
      out.print(prefix + axisService.getName());
      out.write("?wsdl\">");
      out.print(serviceName);
      out.write("</a></h2>\r\n");

    boolean disableREST = false;
    AxisConfiguration axisConfiguration = axisService.getAxisConfiguration();

    Parameter parameter ;

    // do we need to completely disable REST support
    parameter = axisConfiguration.getParameter(Constants.Configuration.DISABLE_REST);
    if (parameter != null) {
        disableREST = !JavaUtils.isFalseExplicitly(parameter.getValue());
    }

    if (!disableREST ) {


      out.write('\r');
      out.write('\n');

    }


    String serviceDescription = axisService.getDocumentation();
    if (serviceDescription == null || "".equals(serviceDescription)) {
        serviceDescription = "No description available for this service";
    }

      out.write("\r\n");
      out.write("<h5>Service Description : <span style=\"color:black;\">");
      out.print(serviceDescription);
      out.write("</span></h5>\r\n");
      out.write("<h5>Service EPR : ");
      out.print(prefix + axisService.getName());
      out.write("</h5>\r\n");
      out.write("<h5>Service Status : ");
      out.print(axisService.isActive() ? "Active" : "InActive");
      out.write("</h5><br>\r\n");

    if (opItr.hasNext()) {

      out.write("<i>Available Operations</i>");

} else {

      out.write("<i> There are no Operations specified</i>");

    }
    opItr = axisService.getOperations();

      out.write("<ul>");

    while (opItr.hasNext()) {
        AxisOperation axisOperation = (AxisOperation) opItr.next();

      out.write("<li>");
      out.print(axisOperation.getName().getLocalPart());
      out.write("</li>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");

        }
    
      out.write("</ul>\r\n");

            status = true;
            }
        }
    }
    if (errornessservice != null) {
        if (errornessservice.size() > 0) {
            request.setAttribute(Constants.IS_FAULTY, Constants.IS_FAULTY);

      out.write("\r\n");
      out.write("<hr>\r\n");
      out.write("\r\n");
      out.write("<h3 style=\"color:blue\">Faulty Services</h3>\r\n");

    Enumeration faultyservices = errornessservice.keys();
    while (faultyservices.hasMoreElements()) {
        String faultyserviceName = (String) faultyservices.nextElement();

      out.write("\r\n");
      out.write("<h3><a style=\"color:blue\" href=\"services/ListFaultyServices?serviceName=");
      out.print(faultyserviceName);
      out.write("\">\r\n");
      out.write("    ");
      out.print(faultyserviceName);
      out.write("</a></h3>\r\n");

            }
        }
        status = true;
    }
    if (!status) {

      out.write(" No services listed! Try hitting refresh. ");

    }

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/include/footer.inc", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
