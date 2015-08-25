package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class club_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstruts_002dbean_005fmessage_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstruts_002dhtml_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstruts_002dhtml_005ferrors_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstruts_002dhtml_005ftext_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstruts_002dhtml_005fsubmit_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fstruts_002dbean_005fmessage_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstruts_002dhtml_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstruts_002dhtml_005ferrors_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstruts_002dhtml_005ftext_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstruts_002dhtml_005fsubmit_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fstruts_002dbean_005fmessage_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fstruts_002dhtml_005fform_005faction.release();
    _005fjspx_005ftagPool_005fstruts_002dhtml_005ferrors_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fstruts_002dhtml_005ftext_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fstruts_002dhtml_005fsubmit_005fvalue_005fnobody.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>");
      if (_jspx_meth_struts_002dbean_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\n");
      out.write("<h1>");
      if (_jspx_meth_struts_002dbean_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("</h1>\r\n");
      out.write("\n");
      if (_jspx_meth_struts_002dhtml_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_struts_002dbean_005fmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  struts-bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_struts_002dbean_005fmessage_005f0 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fstruts_002dbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_struts_002dbean_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_struts_002dbean_005fmessage_005f0.setParent(null);
    // /club.jsp(9,7) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_struts_002dbean_005fmessage_005f0.setKey("helloClub");
    int _jspx_eval_struts_002dbean_005fmessage_005f0 = _jspx_th_struts_002dbean_005fmessage_005f0.doStartTag();
    if (_jspx_th_struts_002dbean_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstruts_002dbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_struts_002dbean_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fstruts_002dbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_struts_002dbean_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_struts_002dbean_005fmessage_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  struts-bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_struts_002dbean_005fmessage_005f1 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fstruts_002dbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_struts_002dbean_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_struts_002dbean_005fmessage_005f1.setParent(null);
    // /club.jsp(12,4) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_struts_002dbean_005fmessage_005f1.setKey("bienvenido");
    int _jspx_eval_struts_002dbean_005fmessage_005f1 = _jspx_th_struts_002dbean_005fmessage_005f1.doStartTag();
    if (_jspx_th_struts_002dbean_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstruts_002dbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_struts_002dbean_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fstruts_002dbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_struts_002dbean_005fmessage_005f1);
    return false;
  }

  private boolean _jspx_meth_struts_002dhtml_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  struts-html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_struts_002dhtml_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fstruts_002dhtml_005fform_005faction.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_struts_002dhtml_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_struts_002dhtml_005fform_005f0.setParent(null);
    // /club.jsp(14,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_struts_002dhtml_005fform_005f0.setAction("/helloClub");
    int _jspx_eval_struts_002dhtml_005fform_005f0 = _jspx_th_struts_002dhtml_005fform_005f0.doStartTag();
    if (_jspx_eval_struts_002dhtml_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("<font style=\"color:red\">\n");
        if (_jspx_meth_struts_002dhtml_005ferrors_005f0(_jspx_th_struts_002dhtml_005fform_005f0, _jspx_page_context))
          return true;
        out.write(' ');
        out.write('\n');
        if (_jspx_meth_struts_002dhtml_005ferrors_005f1(_jspx_th_struts_002dhtml_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("</font>\n");
        out.write("\r\n");
        out.write("\t");
        if (_jspx_meth_struts_002dhtml_005ftext_005f0(_jspx_th_struts_002dhtml_005fform_005f0, _jspx_page_context))
          return true;
        out.write("<br/>\r\n");
        out.write("\t");
        if (_jspx_meth_struts_002dhtml_005ftext_005f1(_jspx_th_struts_002dhtml_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_struts_002dhtml_005fsubmit_005f0(_jspx_th_struts_002dhtml_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_struts_002dhtml_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_struts_002dhtml_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstruts_002dhtml_005fform_005faction.reuse(_jspx_th_struts_002dhtml_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fstruts_002dhtml_005fform_005faction.reuse(_jspx_th_struts_002dhtml_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_struts_002dhtml_005ferrors_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_struts_002dhtml_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  struts-html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_struts_002dhtml_005ferrors_005f0 = (org.apache.struts.taglib.html.ErrorsTag) _005fjspx_005ftagPool_005fstruts_002dhtml_005ferrors_005fproperty_005fnobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_struts_002dhtml_005ferrors_005f0.setPageContext(_jspx_page_context);
    _jspx_th_struts_002dhtml_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_struts_002dhtml_005fform_005f0);
    // /club.jsp(16,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_struts_002dhtml_005ferrors_005f0.setProperty("nick");
    int _jspx_eval_struts_002dhtml_005ferrors_005f0 = _jspx_th_struts_002dhtml_005ferrors_005f0.doStartTag();
    if (_jspx_th_struts_002dhtml_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstruts_002dhtml_005ferrors_005fproperty_005fnobody.reuse(_jspx_th_struts_002dhtml_005ferrors_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fstruts_002dhtml_005ferrors_005fproperty_005fnobody.reuse(_jspx_th_struts_002dhtml_005ferrors_005f0);
    return false;
  }

  private boolean _jspx_meth_struts_002dhtml_005ferrors_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_struts_002dhtml_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  struts-html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_struts_002dhtml_005ferrors_005f1 = (org.apache.struts.taglib.html.ErrorsTag) _005fjspx_005ftagPool_005fstruts_002dhtml_005ferrors_005fproperty_005fnobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_struts_002dhtml_005ferrors_005f1.setPageContext(_jspx_page_context);
    _jspx_th_struts_002dhtml_005ferrors_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_struts_002dhtml_005fform_005f0);
    // /club.jsp(17,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_struts_002dhtml_005ferrors_005f1.setProperty("edad");
    int _jspx_eval_struts_002dhtml_005ferrors_005f1 = _jspx_th_struts_002dhtml_005ferrors_005f1.doStartTag();
    if (_jspx_th_struts_002dhtml_005ferrors_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstruts_002dhtml_005ferrors_005fproperty_005fnobody.reuse(_jspx_th_struts_002dhtml_005ferrors_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fstruts_002dhtml_005ferrors_005fproperty_005fnobody.reuse(_jspx_th_struts_002dhtml_005ferrors_005f1);
    return false;
  }

  private boolean _jspx_meth_struts_002dhtml_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_struts_002dhtml_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  struts-html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_struts_002dhtml_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fstruts_002dhtml_005ftext_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_struts_002dhtml_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_struts_002dhtml_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_struts_002dhtml_005fform_005f0);
    // /club.jsp(20,1) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_struts_002dhtml_005ftext_005f0.setProperty("nick");
    int _jspx_eval_struts_002dhtml_005ftext_005f0 = _jspx_th_struts_002dhtml_005ftext_005f0.doStartTag();
    if (_jspx_th_struts_002dhtml_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstruts_002dhtml_005ftext_005fproperty_005fnobody.reuse(_jspx_th_struts_002dhtml_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fstruts_002dhtml_005ftext_005fproperty_005fnobody.reuse(_jspx_th_struts_002dhtml_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_struts_002dhtml_005ftext_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_struts_002dhtml_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  struts-html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_struts_002dhtml_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fstruts_002dhtml_005ftext_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_struts_002dhtml_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_struts_002dhtml_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_struts_002dhtml_005fform_005f0);
    // /club.jsp(21,1) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_struts_002dhtml_005ftext_005f1.setProperty("edad");
    int _jspx_eval_struts_002dhtml_005ftext_005f1 = _jspx_th_struts_002dhtml_005ftext_005f1.doStartTag();
    if (_jspx_th_struts_002dhtml_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstruts_002dhtml_005ftext_005fproperty_005fnobody.reuse(_jspx_th_struts_002dhtml_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fstruts_002dhtml_005ftext_005fproperty_005fnobody.reuse(_jspx_th_struts_002dhtml_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_struts_002dhtml_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_struts_002dhtml_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  struts-html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_struts_002dhtml_005fsubmit_005f0 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fstruts_002dhtml_005fsubmit_005fvalue_005fnobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_struts_002dhtml_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_struts_002dhtml_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_struts_002dhtml_005fform_005f0);
    // /club.jsp(22,1) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_struts_002dhtml_005fsubmit_005f0.setValue("Entrar");
    int _jspx_eval_struts_002dhtml_005fsubmit_005f0 = _jspx_th_struts_002dhtml_005fsubmit_005f0.doStartTag();
    if (_jspx_th_struts_002dhtml_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstruts_002dhtml_005fsubmit_005fvalue_005fnobody.reuse(_jspx_th_struts_002dhtml_005fsubmit_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fstruts_002dhtml_005fsubmit_005fvalue_005fnobody.reuse(_jspx_th_struts_002dhtml_005fsubmit_005f0);
    return false;
  }
}
