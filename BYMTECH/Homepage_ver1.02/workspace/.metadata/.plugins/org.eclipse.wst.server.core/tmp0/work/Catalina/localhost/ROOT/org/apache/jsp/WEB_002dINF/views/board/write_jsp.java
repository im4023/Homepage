/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.53
 * Generated at: 2020-06-24 06:53:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class write_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/views/board/../include/footer.jsp", Long.valueOf(1592979816883L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-jstl-1.2.jar", Long.valueOf(1589363035793L));
    _jspx_dependants.put("/WEB-INF/views/board/../include/sidenav.jsp", Long.valueOf(1587629586554L));
    _jspx_dependants.put("/WEB-INF/views/board/../include/nav.jsp", Long.valueOf(1587715402256L));
    _jspx_dependants.put("jar:file:/C:/Users/bymtech_web/Desktop/BYMTECH/Homepage_ver1.02/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/board/WEB-INF/lib/jstl-jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/Users/bymtech_web/Desktop/BYMTECH/Homepage_ver1.02/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/board/WEB-INF/lib/jstl-jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t\t<script src='https://code.jquery.com/jquery-3.3.1.min.js'></script>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\t\t\t<meta name=\"description\" content=\"\">\r\n");
      out.write("\t\t\t<meta name=\"author\" content=\"\">\r\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"/resources/css/style.css\"/>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\tfunction formCheck() { \r\n");
      out.write("\t\t\t\tvar title = document.forms[0].title;       \r\n");
      out.write("\t\t\t\tvar writer = document.forms[0].writer;\r\n");
      out.write("\t\t\t\tvar content = document.forms[0].content; \r\n");
      out.write("\t\t\t\tvar mail = document.forms[0].mail; \r\n");
      out.write("\t\t\t\tvar phoneNum = document.forms[0].phoneNum; \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif (writer.value == null ||  writer.value  == \"\"){           \r\n");
      out.write("\t\t\t\t\talert('성함 또는 회사명을 남겨주십시오.');  \r\n");
      out.write("\t\t\t\t\tdocument.forms[0].writer.focus();                   \r\n");
      out.write("\t\t\t\t\treturn false;    \r\n");
      out.write("\t\t\t\t}else if(writer.value.indexOf(\"'\") != -1 ||\r\n");
      out.write("\t\t\t\t\t\twriter.value.indexOf(\"&\") != -1 ||\r\n");
      out.write("\t\t\t\t\t\twriter.value.indexOf(\"*\") != -1 ||\r\n");
      out.write("\t\t\t\t\t\twriter.value.indexOf(\"_\") != -1 ||\r\n");
      out.write("\t\t\t\t\t\twriter.value.indexOf(\"--\") != -1 ||\r\n");
      out.write("\t\t\t\t\t\twriter.value.indexOf(\";\") != -1\r\n");
      out.write("\t\t\t\t\t\t){\r\n");
      out.write("\t\t\t\t      alert(\"',&,*,_,--,; 와 같은 문자는 입력하실 수 없습니다.\");\r\n");
      out.write("\t\t\t\t      writer.focus();\r\n");
      out.write("\t\t\t\t      return false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (mail.value == null ||  mail.value  == \"\"){\r\n");
      out.write("\t\t\t\t\talert('연락드릴 메일을 남겨주십시오.');\r\n");
      out.write("\t\t\t\t\tdocument.forms[0].mail.focus(); \r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}else if(mail.value.match(/^(\\w+)@(\\w+)[.](\\w+)$/ig) == null){\r\n");
      out.write("\t\t\t\t\talert('메일의 형식이 잘 못되었습니다.');  \r\n");
      out.write("\t\t\t\t\tdocument.forms[0].mail.focus();                 \r\n");
      out.write("\t\t\t\t\treturn false;  \r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (phoneNum.value == null ||  phoneNum.value  == \"\"){\r\n");
      out.write("\t\t\t\t\talert('연락드릴 전화번호 또는 핸드폰 번호를 남겨주십시오.');\r\n");
      out.write("\t\t\t\t\tdocument.forms[0].phoneNum.focus(); \r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}else if(phoneNum.value.match(/(^02.{0}|^01.{1}|[0-9]{3})([0-9]+)([0-9]{4})/g)== null){\r\n");
      out.write("\t\t\t\t\talert('번호를 잘 못 입력하셨습니다. 다시 한번 확인 해주십시오.');  \r\n");
      out.write("\t\t\t\t\tdocument.forms[0].phoneNum.focus();                 \r\n");
      out.write("\t\t\t\t\treturn false;  \r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (title.value == null || title.value == \"\"){                                   \r\n");
      out.write("\t\t\t\t\talert('제목을 입력하지 않으셨습니다.');                                  \r\n");
      out.write("\t\t\t\t\tdocument.forms[0].title.focus();                          \r\n");
      out.write("\t\t\t\t\treturn false;                                                     \r\n");
      out.write("\t\t\t\t}else if(title.value.indexOf(\"'\") != -1 ||\r\n");
      out.write("\t\t\t\t\t\ttitle.value.indexOf(\"&\") != -1 ||\r\n");
      out.write("\t\t\t\t\t\ttitle.value.indexOf(\"*\") != -1 ||\r\n");
      out.write("\t\t\t\t\t\ttitle.value.indexOf(\"_\") != -1 ||\r\n");
      out.write("\t\t\t\t\t\ttitle.value.indexOf(\"--\") != -1 ||\r\n");
      out.write("\t\t\t\t\t\ttitle.value.indexOf(\";\") != -1\r\n");
      out.write("\t\t\t\t\t\t){\r\n");
      out.write("\t\t\t\t      alert(\"',&,*,_,--,; 와 같은 문자는 입력하실 수 없습니다.\");\r\n");
      out.write("\t\t\t\t      title.focus();\r\n");
      out.write("\t\t\t\t      return false;\r\n");
      out.write("\t\t\t\t }\t\r\n");
      out.write("\t\t\t\tif (content.value == null || content.value == \"\"){                                   \r\n");
      out.write("\t\t\t\t\talert('문의 하실 내용이 없습니다.');                                  \r\n");
      out.write("\t\t\t\t\tdocument.forms[0].content.focus();                          \r\n");
      out.write("\t\t\t\t\treturn false;                                                     \r\n");
      out.write("\t\t\t\t}else if(content.value.indexOf(\"'\") != -1 ||\r\n");
      out.write("\t\t\t\t\t\tcontent.value.indexOf(\"&\") != -1 ||\r\n");
      out.write("\t\t\t\t\t\tcontent.value.indexOf(\"*\") != -1 ||\r\n");
      out.write("\t\t\t\t\t\tcontent.value.indexOf(\"_\") != -1 ||\r\n");
      out.write("\t\t\t\t\t\tcontent.value.indexOf(\"--\") != -1 ||\r\n");
      out.write("\t\t\t\t\t\tcontent.value.indexOf(\";\") != -1\r\n");
      out.write("\t\t\t\t\t\t){\r\n");
      out.write("\t\t\t\t      alert(\"',&,*,_,--,; 와 같은 문자는 입력하실 수 없습니다.\");\r\n");
      out.write("\t\t\t\t      content.focus();\r\n");
      out.write("\t\t\t\t      return false;\r\n");
      out.write("\t\t\t\t }\r\n");
      out.write("\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<title>바이엠텍</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<!-- Navigation -->\r\n");
      out.write("\t\t<header class=\"navbar navbar-expand-lg fixed-top\" id=\"mainNav\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Navigation -->\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"container border-top-red border-bottom-red\" id=\"navcontainer\">\r\n");
      out.write("\t\t\t<a href=\"/\"><img class =\"logo_img\" src = \"/resources/img/index/logo.png\" alt=\"\" ></a>\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item mx-0 mx-lg-1\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=/sub/company>회사소개</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class= \"submenu navbar-nav ml-auto\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"nav-link\" href=\"/sub/company\" >인사말</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"nav-link\" href=\"/sub/history\" >연혁</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"nav-link\" href=\"/sub/location\" >찾아오시는 길</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item mx-0 mx-lg-1\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link \" href=\"/sub/business\">사업소개</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item mx-0 mx-lg-1\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link \" href=\"/sub/goods\">제품소개</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item mx-0 mx-lg-1\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link \" href=\"/announce/announcement\">고객센터</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class= \"submenu navbar-nav ml-auto\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"nav-link\" href=\"/announce/announcement\" >공지사항</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"nav-link\" href=\"/board/write\" >문의사항</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<button class=\"navbar-toggler\" type=\"button\" id=\"menubutton\">\r\n");
      out.write("\t      \t\t\t<span></span>\r\n");
      out.write("     \t\t\t\t<span></span>\r\n");
      out.write("     \t\t\t\t<span></span>\r\n");
      out.write("    \t\t\t</button>\r\n");
      out.write("\t    \t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- Main -->\r\n");
      out.write("\t\t<div class=\"container\" id=\"boardmain\">\r\n");
      out.write("\t\t\t<!-- sidebar -->\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- sidenav -->\r\n");
      out.write("\t<nav id=\"sidebar\">\r\n");
      out.write("\t\t<button class = \"close_button\" type=\"button\">\r\n");
      out.write("\t\t\t<img src=\"/resources/img/index/close.png\" alt=\"\" class = close_img >\r\n");
      out.write("\t\t</button>\r\n");
      out.write("   \t\t\t<ul class=\"sidebar-nav\">\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<a  href=\"/sub/company\" class=\"sidebar_m sidebar_link\"  >회사소개</a>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a  href=\"/sub/company\" class=\"sidebar_s sidebar_link\"  >인사말</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a  href=\"/sub/history\" class=\"sidebar_s sidebar_link\"  >연혁</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a  href=\"/sub/location\" class=\"sidebar_s sidebar_link\"  >찾아오시는 길</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li >\r\n");
      out.write("\t\t\t\t<a  href=\"/sub/business\" class=\"sidebar_m sidebar_link\"  >사업소개</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li >\r\n");
      out.write("\t\t\t\t<a  href=\"/sub/goods\" class=\"sidebar_m sidebar_link\">제품소개</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<a  href=\"/announce/announcement\" class=\"sidebar_m sidebar_link\">고객센터</a>\r\n");
      out.write("\t\t\t\t<ul >\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a  href=\"/announce/announcement\" class=\"sidebar_s sidebar_link\">공지사항</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/board/write\" class=\"sidebar_s sidebar_link\">문의사항</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</nav>");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"board_top\">\r\n");
      out.write("\t\t\t\t<div class=\"board_intro\">\r\n");
      out.write("\t\t\t\t\t<span><strong>문의사항</strong></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"board_middle text-center\">\r\n");
      out.write("\t\t\t\t<p> 문의사항을 남겨주시면 신속하게 연락드리겠습니다.\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"board_bottom text-center\">\r\n");
      out.write("\t\t\t\t<form method=\"post\" onsubmit=\"return formCheck();\">\r\n");
      out.write("\t\t\t\t\t<div class = \"board_tr\">\r\n");
      out.write("\t\t\t\t\t\t<div class = \"board_inner\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class = \"board_td\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a>작성자</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class = \"board_td2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"writer\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class = \"board_inner\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class = \"board_td\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a>메일</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class = \"board_td2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"mail\"  />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class = \"board_inner\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class = \"board_td\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a>연락처</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class = \"board_td2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"phoneNum\"  />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class = \"board_tr\">\r\n");
      out.write("\t\t\t\t\t\t<div class = \"board_td3\">\r\n");
      out.write("\t\t\t\t\t\t\t<a>제목</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class = \"board_td4\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"title\" class = \"inputbox\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class = \"board_tr\">\r\n");
      out.write("\t\t\t\t\t\t<div class = \"board_td3\">\r\n");
      out.write("\t\t\t\t\t\t\t<a>내용</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class = \"board_td4\">\r\n");
      out.write("\t\t\t\t\t\t\t<textarea cols=\"50\" rows=\"5\" name=\"content\" class = \"inputbox board_content\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn\" type=\"submit\">작성</button>\r\n");
      out.write("\t\t\t\t\t\t<input type = \"hidden\" name=\"to\" value = \"kby_car@naver.com\">\r\n");
      out.write("\t\t\t\t\t\t<input type = \"hidden\" name=\"from\" value = \"kby_car@naver.com\">\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- Footer -->\t\r\n");
      out.write("\t    <footer class=\"footer\" id=\"footer\">\r\n");
      out.write("\t\t    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Footer -->\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"address\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<p class=\" txtBase\">\r\n");
      out.write("\t\t\t\t\t대표자(성명) : 김병용&nbsp;&nbsp;사업자 등록번호 : 375-85-00293, 314-86-5779<br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t포항 \t본사 \t주소 : (37748) 경북 포항시 북구 중흥로 265 (죽도동) 성원메디컬 108호<br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t대전 연구소 주소 : (34013) 대전광역시 유성구 테크노 4로 17 (관평동) 대덕비즈센터 A동 207호, 208호 <br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t전화 : 070-4265-3411&nbsp;&nbsp;팩스 : 070-4015-0616&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<a href=\"../board/write\"><img class=mail src=\"/resources/img/index/mail.png\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t</p> \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"/resources/jquery/jstyle.js\"></script>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/board/write.jsp(108,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member != null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<div class =\"admin_menu\">\r\n");
          out.write("\t\t\t\t\t\t<button type=\"button\" id=\"listSearch_btn\">관리페이지</button>\r\n");
          out.write("\t\t\t\t\t\t<script>\t\r\n");
          out.write("\t\t\t\t\t\t$(\"#listSearch_btn\").click(function(){\r\n");
          out.write("\t\t\t\t\t\t\tself.location = \"/board/listSearch\";\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t});\r\n");
          out.write("\t\t\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t\t\t<button type=\"button\" id=\"logout_btn\"> 로그아웃</button>\r\n");
          out.write("\t\t\t\t\t\t<script>\t\r\n");
          out.write("\t\t\t\t\t\t$(\"#logout_btn\").click(function(){\r\n");
          out.write("\t\t\t\t\t\t\tself.location = \"../bymt/logout\";\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t});\r\n");
          out.write("\t\t\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
