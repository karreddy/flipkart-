package org.apache.jsp.asset_005fcategories_005fselector;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.Validator;
import java.util.List;
import java.util.Map;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/asset_categories_selector/init.jsp");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-clay.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-frontend.tld");
    _jspx_dependants.add("/META-INF/resources/react.tld");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  liferay-frontend:defineObjects
      com.liferay.frontend.taglib.servlet.taglib.DefineObjectsTag _jspx_th_liferay$1frontend_defineObjects_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.DefineObjectsTag.class) : new com.liferay.frontend.taglib.servlet.taglib.DefineObjectsTag();
      _jspx_th_liferay$1frontend_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1frontend_defineObjects_0.setParent(null);
      int _jspx_eval_liferay$1frontend_defineObjects_0 = _jspx_th_liferay$1frontend_defineObjects_0.doStartTag();
      if (_jspx_th_liferay$1frontend_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_defineObjects_0);
        _jspx_th_liferay$1frontend_defineObjects_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_defineObjects_0);
      _jspx_th_liferay$1frontend_defineObjects_0.release();
      java.lang.String currentURL = null;
      javax.portlet.PortletURL currentURLObj = null;
      java.lang.String npmResolvedPackageName = null;
      java.util.ResourceBundle resourceBundle = null;
      javax.portlet.WindowState windowState = null;
      currentURL = (java.lang.String) _jspx_page_context.findAttribute("currentURL");
      currentURLObj = (javax.portlet.PortletURL) _jspx_page_context.findAttribute("currentURLObj");
      npmResolvedPackageName = (java.lang.String) _jspx_page_context.findAttribute("npmResolvedPackageName");
      resourceBundle = (java.util.ResourceBundle) _jspx_page_context.findAttribute("resourceBundle");
      windowState = (javax.portlet.WindowState) _jspx_page_context.findAttribute("windowState");
      out.write('\n');
      out.write('\n');
      //  liferay-theme:defineObjects
      com.liferay.taglib.theme.DefineObjectsTag _jspx_th_liferay$1theme_defineObjects_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.theme.DefineObjectsTag.class) : new com.liferay.taglib.theme.DefineObjectsTag();
      _jspx_th_liferay$1theme_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1theme_defineObjects_0.setParent(null);
      int _jspx_eval_liferay$1theme_defineObjects_0 = _jspx_th_liferay$1theme_defineObjects_0.doStartTag();
      if (_jspx_th_liferay$1theme_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1theme_defineObjects_0);
        _jspx_th_liferay$1theme_defineObjects_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1theme_defineObjects_0);
      _jspx_th_liferay$1theme_defineObjects_0.release();
      com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay = null;
      com.liferay.portal.kernel.model.Company company = null;
      com.liferay.portal.kernel.model.User user = null;
      com.liferay.portal.kernel.model.User realUser = null;
      com.liferay.portal.kernel.model.Contact contact = null;
      com.liferay.portal.kernel.model.Layout layout = null;
      java.util.List layouts = null;
      java.lang.Long plid = null;
      com.liferay.portal.kernel.model.LayoutTypePortlet layoutTypePortlet = null;
      java.lang.Long scopeGroupId = null;
      com.liferay.portal.kernel.security.permission.PermissionChecker permissionChecker = null;
      java.util.Locale locale = null;
      java.util.TimeZone timeZone = null;
      com.liferay.portal.kernel.model.Theme theme = null;
      com.liferay.portal.kernel.model.ColorScheme colorScheme = null;
      com.liferay.portal.kernel.theme.PortletDisplay portletDisplay = null;
      java.lang.Long portletGroupId = null;
      themeDisplay = (com.liferay.portal.kernel.theme.ThemeDisplay) _jspx_page_context.findAttribute("themeDisplay");
      company = (com.liferay.portal.kernel.model.Company) _jspx_page_context.findAttribute("company");
      user = (com.liferay.portal.kernel.model.User) _jspx_page_context.findAttribute("user");
      realUser = (com.liferay.portal.kernel.model.User) _jspx_page_context.findAttribute("realUser");
      contact = (com.liferay.portal.kernel.model.Contact) _jspx_page_context.findAttribute("contact");
      layout = (com.liferay.portal.kernel.model.Layout) _jspx_page_context.findAttribute("layout");
      layouts = (java.util.List) _jspx_page_context.findAttribute("layouts");
      plid = (java.lang.Long) _jspx_page_context.findAttribute("plid");
      layoutTypePortlet = (com.liferay.portal.kernel.model.LayoutTypePortlet) _jspx_page_context.findAttribute("layoutTypePortlet");
      scopeGroupId = (java.lang.Long) _jspx_page_context.findAttribute("scopeGroupId");
      permissionChecker = (com.liferay.portal.kernel.security.permission.PermissionChecker) _jspx_page_context.findAttribute("permissionChecker");
      locale = (java.util.Locale) _jspx_page_context.findAttribute("locale");
      timeZone = (java.util.TimeZone) _jspx_page_context.findAttribute("timeZone");
      theme = (com.liferay.portal.kernel.model.Theme) _jspx_page_context.findAttribute("theme");
      colorScheme = (com.liferay.portal.kernel.model.ColorScheme) _jspx_page_context.findAttribute("colorScheme");
      portletDisplay = (com.liferay.portal.kernel.theme.PortletDisplay) _jspx_page_context.findAttribute("portletDisplay");
      portletGroupId = (java.lang.Long) _jspx_page_context.findAttribute("portletGroupId");
      out.write('\n');
      out.write('\n');

Map<String, Object> data = (Map<String, Object>)request.getAttribute("liferay-asset:asset-categories-selector:data");

List<Map<String, Object>> vocabularies = (List<Map<String, Object>>)data.get("vocabularies");

      out.write("\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("\t<div id=\"");
      out.print( (String)data.get("id") );
      out.write("\">\n");
      out.write("\n");
      out.write("\t\t");

		for (Map<String, Object> vocabulary : vocabularies) {
			String vocabularyId = GetterUtil.getString(vocabulary.get("id"));
		
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"field-content\">\n");
      out.write("\t\t\t\t<div class=\"form-group\" id=\"namespace_assetCategoriesSelector_");
      out.print( vocabularyId );
      out.write("\">\n");
      out.write("\t\t\t\t\t");
if (
 Validator.isNotNull(vocabulary.get("title")) ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t<label for=\"namespace_assetCategoriesSelector_");
      out.print( vocabularyId );
      out.write("_MultiSelect\">\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( HtmlUtil.escape(GetterUtil.getString(vocabulary.get("title"))) );
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");
if (
 GetterUtil.getBoolean(vocabulary.get("required")) ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"reference-mark\">\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_clay_icon_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"hide-accessible sr-only\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_message_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group-item\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-control form-control-tag-group input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group-item\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									List<Map<String, Object>> selectedItems = (List<Map<String, Object>>)vocabulary.get("selectedItems");
									
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t");
if (
 selectedItems != null ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

										for (Map<String, Object> selectedItem : selectedItems) {
										
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      //  clay:label
      com.liferay.frontend.taglib.clay.servlet.taglib.LabelTag _jspx_th_clay_label_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.LabelTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.LabelTag();
      _jspx_th_clay_label_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_label_0.setParent(null);
      _jspx_th_clay_label_0.setDynamicAttribute(null, "dismissible",  true );
      _jspx_th_clay_label_0.setLabel( HtmlUtil.escape(GetterUtil.getString(selectedItem.get("label"))) );
      int _jspx_eval_clay_label_0 = _jspx_th_clay_label_0.doStartTag();
      if (_jspx_th_clay_label_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_label_0);
        _jspx_th_clay_label_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_label_0);
      _jspx_th_clay_label_0.release();
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input name=\"");
      out.print( (String)data.get("inputName") );
      out.write("\" type=\"hidden\" value=\"");
      out.print( GetterUtil.getString(selectedItem.get("value")) );
      out.write("\" />\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

										}
										
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"form-control-inset\" id=\"namespace_assetCategoriesSelector_");
      out.print( vocabularyId );
      out.write("_MultiSelect\" type=\"text\" value=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group-item input-group-item-shrink\">\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn btn-secondary\" type=\"button\">\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_message_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t");

		}
		
      out.write("\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t");
      //  react:component
      com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag _jspx_th_react_component_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag.class) : new com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag();
      _jspx_th_react_component_0.setPageContext(_jspx_page_context);
      _jspx_th_react_component_0.setParent(null);
      _jspx_th_react_component_0.setModule("asset_categories_selector/AssetCategoriesSelectorTag.es");
      _jspx_th_react_component_0.setProps( data );
      int _jspx_eval_react_component_0 = _jspx_th_react_component_0.doStartTag();
      if (_jspx_th_react_component_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_0);
        _jspx_th_react_component_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_0);
      _jspx_th_react_component_0.release();
      out.write("\n");
      out.write("</div>");
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

  private boolean _jspx_meth_clay_icon_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:icon
    com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
    _jspx_th_clay_icon_0.setPageContext(_jspx_page_context);
    _jspx_th_clay_icon_0.setParent(null);
    _jspx_th_clay_icon_0.setSymbol("asterisk");
    int _jspx_eval_clay_icon_0 = _jspx_th_clay_icon_0.doStartTag();
    if (_jspx_th_clay_icon_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_0);
      _jspx_th_clay_icon_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_0);
    _jspx_th_clay_icon_0.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent(null);
    _jspx_th_liferay$1ui_message_0.setKey("required");
    int _jspx_eval_liferay$1ui_message_0 = _jspx_th_liferay$1ui_message_0.doStartTag();
    if (_jspx_th_liferay$1ui_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
      _jspx_th_liferay$1ui_message_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
    _jspx_th_liferay$1ui_message_0.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent(null);
    _jspx_th_liferay$1ui_message_1.setKey("select");
    int _jspx_eval_liferay$1ui_message_1 = _jspx_th_liferay$1ui_message_1.doStartTag();
    if (_jspx_th_liferay$1ui_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
      _jspx_th_liferay$1ui_message_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
    _jspx_th_liferay$1ui_message_1.release();
    return false;
  }
}
