package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.Constants;
import org.apache.axis2.description.AxisOperation;
import org.apache.axis2.description.AxisService;
import java.util.Hashtable;
import java.util.Iterator;

public final class listFaultyService_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/include/httpbase.jsp", out, false);
      out.write("\n");
      out.write("    <title>List Single service</title>\n");
      out.write("    <link href=\"axis2-web/css/axis-style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/include/header.inc", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/include/link-footer.jsp", out, false);
      out.write('\n');
      out.write(' ');
      out.write(' ');

        String prifix = request.getAttribute("frontendHostUrl") + (String)request.getAttribute(Constants.SERVICE_PATH) +"services/";
    
      out.write("\n");
      out.write("        ");

            String isFault = (String)request.getAttribute(Constants.IS_FAULTY);
            String servicName = request.getParameter("serviceName");
            if(Constants.IS_FAULTY.equals(isFault)){
                Hashtable errornessservices =(Hashtable)request.getAttribute(Constants.ERROR_SERVICE_MAP);
                
      out.write("\n");
      out.write("                    <h3>This Web axisService has deployment faults</h3>");

                     
      out.write("<p style=\"color:red\">");
      out.print((String)errornessservices.get(servicName) );
      out.write("</p>\n");
      out.write("                ");


                    }else {

                    AxisService axisService =
                            (AxisService) request.getAttribute(Constants.SINGLE_SERVICE);
                    if(axisService!=null){
           Iterator opItr = axisService.getOperations();
            //operationsList = operations.values();
          String  serviceName = axisService.getName();
            
      out.write("<h2><a style=\"color:blue\" href=\"");
      out.print(prifix + axisService.getName());
      out.write("?wsdl\">");
      out.print(serviceName);
      out.write("</a></h2>\n");
      out.write("            <p>\n");
      out.write("            <span style=\"color:blue\">Service EPR :</span>\n");
      out.write("            <span style=\"color:black\">");
      out.print(prifix + axisService.getName());
      out.write("</span>\n");
      out.write("            </p>\n");
      out.write("           \n");
      out.write("           <h4>Service Description : <span style=\"color:blue\">");
      out.print(axisService.getDocumentation());
      out.write("</span></h4>\n");
      out.write("           <p>\n");
      out.write("           <span style=\"color:blue; font-style:italic\">Service Status : ");
      out.print(axisService.isActive()?"Active":"InActive");
      out.write("</span>\n");
      out.write("           </p>\n");
      out.write("           ");

            if (opItr.hasNext()) {
                
      out.write("<span style=\"font-style:italic\">Available operations</span>");

            } else {
                
      out.write("<span style=\"font-style:italic\"> There are no Operations specified</span>");

            }
               opItr = axisService.getOperations();
           
      out.write("<ul>");

            while (opItr.hasNext()) {
                AxisOperation axisOperation = (AxisOperation) opItr.next();
                
      out.write("<li>");
      out.print(axisOperation.getName().getLocalPart());
      out.write("</li>\n");
      out.write("                ");

            }
           
      out.write("</ul>\n");
      out.write("           ");

                    } else{
                           
      out.write("\n");
      out.write("                <h3 style=\"color:red\">No services found in this location.</h3>\n");
      out.write(" ");

                    }

            }
        
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/include/footer.inc", out, false);
      out.write("\n");
      out.write("        </body>\n");
      out.write("</html>\n");
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
