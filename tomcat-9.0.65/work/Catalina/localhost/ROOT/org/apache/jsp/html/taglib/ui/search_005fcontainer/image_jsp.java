/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat9
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.html.taglib.ui.search_005fcontainer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.asset.kernel.model.AssetTag;
import com.liferay.asset.kernel.service.AssetTagServiceUtil;
import com.liferay.exportimport.kernel.staging.LayoutStagingUtil;
import com.liferay.exportimport.kernel.staging.StagingUtil;
import com.liferay.layout.seo.kernel.LayoutSEOLink;
import com.liferay.layout.seo.kernel.LayoutSEOLinkManager;
import com.liferay.layout.seo.kernel.LayoutSEOLinkManagerUtil;
import com.liferay.petra.string.CharPool;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.bean.BeanParamUtil;
import com.liferay.portal.kernel.bean.BeanPropertiesUtil;
import com.liferay.portal.kernel.cal.Recurrence;
import com.liferay.portal.kernel.configuration.Filter;
import com.liferay.portal.kernel.cookies.CookiesManagerUtil;
import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.dao.search.ResultRowSplitter;
import com.liferay.portal.kernel.dao.search.RowChecker;
import com.liferay.portal.kernel.dao.search.RowMover;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.LocalizedException;
import com.liferay.portal.kernel.exception.NoSuchLayoutException;
import com.liferay.portal.kernel.frontend.icons.FrontendIconsUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.language.LanguageWrapper;
import com.liferay.portal.kernel.language.UnicodeLanguageUtil;
import com.liferay.portal.kernel.layoutconfiguration.util.RuntimePageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.log.LogUtil;
import com.liferay.portal.kernel.model.*;
import com.liferay.portal.kernel.model.impl.*;
import com.liferay.portal.kernel.model.impl.VirtualLayout;
import com.liferay.portal.kernel.portlet.InvokerPortlet;
import com.liferay.portal.kernel.portlet.LiferayHeaderRequest;
import com.liferay.portal.kernel.portlet.LiferayHeaderResponse;
import com.liferay.portal.kernel.portlet.LiferayPortletMode;
import com.liferay.portal.kernel.portlet.LiferayPortletURL;
import com.liferay.portal.kernel.portlet.LiferayRenderRequest;
import com.liferay.portal.kernel.portlet.LiferayRenderResponse;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.PortletConfigFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletInstanceFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletPreferencesFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletProvider;
import com.liferay.portal.kernel.portlet.PortletProviderUtil;
import com.liferay.portal.kernel.portlet.PortletSetupUtil;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletURLUtil;
import com.liferay.portal.kernel.portletdisplaytemplate.PortletDisplayTemplateManagerUtil;
import com.liferay.portal.kernel.security.auth.AuthTokenUtil;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.ResourceActionsUtil;
import com.liferay.portal.kernel.service.*;
import com.liferay.portal.kernel.service.permission.GroupPermissionUtil;
import com.liferay.portal.kernel.service.permission.LayoutPermissionUtil;
import com.liferay.portal.kernel.service.permission.PortletPermissionUtil;
import com.liferay.portal.kernel.service.permission.RolePermissionUtil;
import com.liferay.portal.kernel.servlet.BrowserSnifferUtil;
import com.liferay.portal.kernel.servlet.BufferCacheServletResponse;
import com.liferay.portal.kernel.servlet.MultiSessionMessages;
import com.liferay.portal.kernel.servlet.PortalMessages;
import com.liferay.portal.kernel.servlet.PortalWebResourceConstants;
import com.liferay.portal.kernel.servlet.PortalWebResourcesUtil;
import com.liferay.portal.kernel.servlet.ServletContextPool;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.servlet.taglib.ui.MenuItem;
import com.liferay.portal.kernel.template.StringTemplateResource;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.FastDateFormatConstants;
import com.liferay.portal.kernel.util.FastDateFormatFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlParserUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.kernel.util.HttpComponentsUtil;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.KeyValuePair;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.PortletKeys;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.ReleaseInfo;
import com.liferay.portal.kernel.util.ServerDetector;
import com.liferay.portal.kernel.util.SessionClicks;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.TextFormatter;
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.kernel.util.TimeZoneUtil;
import com.liferay.portal.kernel.util.URLCodec;
import com.liferay.portal.kernel.util.UnicodeFormatter;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.impl.*;
import com.liferay.portal.plugin.PluginUtil;
import com.liferay.portal.security.sso.SSOUtil;
import com.liferay.portal.service.*;
import com.liferay.portal.struts.Definition;
import com.liferay.portal.struts.StrutsUtil;
import com.liferay.portal.struts.TilesUtil;
import com.liferay.portal.util.PrefsPropsUtil;
import com.liferay.portal.util.PropsUtil;
import com.liferay.portal.util.PropsValues;
import com.liferay.portal.util.ShutdownUtil;
import com.liferay.portlet.HeaderRequestFactory;
import com.liferay.portlet.HeaderResponseFactory;
import com.liferay.portlet.LiferayPortletUtil;
import com.liferay.portlet.RenderParametersPool;
import com.liferay.portlet.RenderRequestFactory;
import com.liferay.portlet.RenderResponseFactory;
import com.liferay.portlet.configuration.kernel.util.PortletConfigurationUtil;
import com.liferay.sites.kernel.util.Sites;
import com.liferay.taglib.search.ResultRow;
import com.liferay.taglib.search.SearchEntry;
import com.liferay.taglib.search.TextSearchEntry;
import com.liferay.taglib.util.OutputTag;
import com.liferay.users.admin.kernel.util.UsersAdmin;
import com.liferay.users.admin.kernel.util.UsersAdminUtil;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeSet;
import javax.portlet.MimeResponse;
import javax.portlet.MutableRenderParameters;
import javax.portlet.PortletConfig;
import javax.portlet.PortletContext;
import javax.portlet.PortletException;
import javax.portlet.PortletMode;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PortletURL;
import javax.portlet.ResourceURL;
import javax.portlet.UnavailableException;
import javax.portlet.WindowState;
import com.liferay.portal.kernel.servlet.MultiSessionErrors;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.taglib.aui.AUIUtil;
import com.liferay.taglib.util.InlineUtil;
import com.liferay.taglib.util.TagResourceBundleUtil;

public final class image_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/html/taglib/init.jsp", Long.valueOf(1669208104000L));
    _jspx_dependants.put("/html/taglib/ui/search_container/init.jsp", Long.valueOf(1669208104000L));
    _jspx_dependants.put("/html/common/init.jsp", Long.valueOf(1669208104000L));
    _jspx_dependants.put("/html/taglib/init-ext.jsp", Long.valueOf(1669208104000L));
    _jspx_dependants.put("/html/common/init-ext.jsp", Long.valueOf(1669208104000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("com.liferay.portal.kernel.model.impl");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("com.liferay.portal.kernel.model");
    _jspx_imports_packages.add("com.liferay.portal.model.impl");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("com.liferay.portal.kernel.service");
    _jspx_imports_packages.add("com.liferay.portal.service");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.ContentTypes");
    _jspx_imports_classes.add("com.liferay.portlet.RenderRequestFactory");
    _jspx_imports_classes.add("java.util.Arrays");
    _jspx_imports_classes.add("java.text.Format");
    _jspx_imports_classes.add("com.liferay.portal.kernel.dao.search.RowMover");
    _jspx_imports_classes.add("com.liferay.portal.kernel.servlet.PortalMessages");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.WebKeys");
    _jspx_imports_classes.add("com.liferay.portal.kernel.theme.ThemeDisplay");
    _jspx_imports_classes.add("com.liferay.portal.kernel.workflow.WorkflowConstants");
    _jspx_imports_classes.add("com.liferay.portal.kernel.service.permission.RolePermissionUtil");
    _jspx_imports_classes.add("com.liferay.portal.util.PropsUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.security.auth.PrincipalException");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("com.liferay.taglib.util.OutputTag");
    _jspx_imports_classes.add("com.liferay.portal.kernel.servlet.MultiSessionErrors");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.PropsKeys");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.GetterUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.LiferayWindowState");
    _jspx_imports_classes.add("com.liferay.users.admin.kernel.util.UsersAdminUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.CalendarUtil");
    _jspx_imports_classes.add("javax.portlet.PortletContext");
    _jspx_imports_classes.add("com.liferay.portal.kernel.log.LogFactoryUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.servlet.ServletContextPool");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.InvokerPortlet");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.SessionClicks");
    _jspx_imports_classes.add("java.util.Set");
    _jspx_imports_classes.add("com.liferay.taglib.util.TagResourceBundleUtil");
    _jspx_imports_classes.add("com.liferay.portal.util.PropsValues");
    _jspx_imports_classes.add("javax.portlet.PortletConfig");
    _jspx_imports_classes.add("java.io.Serializable");
    _jspx_imports_classes.add("com.liferay.portal.kernel.language.LanguageUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.LiferayRenderResponse");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.JavaConstants");
    _jspx_imports_classes.add("com.liferay.taglib.search.TextSearchEntry");
    _jspx_imports_classes.add("com.liferay.portlet.HeaderResponseFactory");
    _jspx_imports_classes.add("com.liferay.portlet.LiferayPortletUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.PortletProviderUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.HashMapBuilder");
    _jspx_imports_classes.add("com.liferay.petra.string.StringPool");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.PortletURLUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.LiferayPortletURL");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.URLCodec");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.DateFormatFactoryUtil");
    _jspx_imports_classes.add("com.liferay.portal.plugin.PluginUtil");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("javax.portlet.MimeResponse");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.PortletPreferencesFactoryUtil");
    _jspx_imports_classes.add("java.text.NumberFormat");
    _jspx_imports_classes.add("java.util.TreeSet");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.FastDateFormatConstants");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("java.util.Calendar");
    _jspx_imports_classes.add("com.liferay.portal.kernel.servlet.SessionMessages");
    _jspx_imports_classes.add("java.util.ResourceBundle");
    _jspx_imports_classes.add("com.liferay.portal.kernel.service.permission.PortletPermissionUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.security.permission.ActionKeys");
    _jspx_imports_classes.add("com.liferay.portal.kernel.dao.search.SearchContainer");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.TimeZoneUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.LiferayHeaderRequest");
    _jspx_imports_classes.add("com.liferay.portal.kernel.servlet.PortalWebResourcesUtil");
    _jspx_imports_classes.add("java.util.LinkedHashSet");
    _jspx_imports_classes.add("com.liferay.portal.kernel.bean.BeanPropertiesUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.PortletConfigFactoryUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.servlet.SessionErrors");
    _jspx_imports_classes.add("com.liferay.portlet.RenderParametersPool");
    _jspx_imports_classes.add("javax.portlet.MutableRenderParameters");
    _jspx_imports_classes.add("com.liferay.portal.kernel.cookies.CookiesManagerUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portletdisplaytemplate.PortletDisplayTemplateManagerUtil");
    _jspx_imports_classes.add("javax.portlet.PortletPreferences");
    _jspx_imports_classes.add("com.liferay.layout.seo.kernel.LayoutSEOLinkManager");
    _jspx_imports_classes.add("com.liferay.taglib.search.SearchEntry");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.Portal");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.HttpComponentsUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.json.JSONObject");
    _jspx_imports_classes.add("com.liferay.users.admin.kernel.util.UsersAdmin");
    _jspx_imports_classes.add("com.liferay.taglib.aui.AUIUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.dao.search.ResultRowSplitter");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.ArrayUtil");
    _jspx_imports_classes.add("com.liferay.layout.seo.kernel.LayoutSEOLinkManagerUtil");
    _jspx_imports_classes.add("com.liferay.exportimport.kernel.staging.StagingUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.cal.Recurrence");
    _jspx_imports_classes.add("com.liferay.petra.string.CharPool");
    _jspx_imports_classes.add("com.liferay.portal.kernel.security.permission.ResourceActionsUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.json.JSONArray");
    _jspx_imports_classes.add("com.liferay.portal.kernel.service.permission.LayoutPermissionUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.configuration.Filter");
    _jspx_imports_classes.add("com.liferay.portal.security.sso.SSOUtil");
    _jspx_imports_classes.add("com.liferay.petra.string.StringBundler");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.HtmlUtil");
    _jspx_imports_classes.add("javax.portlet.PortletURL");
    _jspx_imports_classes.add("com.liferay.asset.kernel.service.AssetTagServiceUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.TextFormatter");
    _jspx_imports_classes.add("com.liferay.portal.kernel.servlet.taglib.ui.MenuItem");
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("com.liferay.portal.kernel.exception.LocalizedException");
    _jspx_imports_classes.add("com.liferay.portal.kernel.bean.BeanParamUtil");
    _jspx_imports_classes.add("com.liferay.portal.util.ShutdownUtil");
    _jspx_imports_classes.add("com.liferay.portal.util.PrefsPropsUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.log.LogUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.exception.NoSuchLayoutException");
    _jspx_imports_classes.add("com.liferay.portal.kernel.servlet.MultiSessionMessages");
    _jspx_imports_classes.add("java.util.Locale");
    _jspx_imports_classes.add("com.liferay.portlet.HeaderRequestFactory");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.Constants");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.ReleaseInfo");
    _jspx_imports_classes.add("com.liferay.portal.struts.StrutsUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.dao.search.DisplayTerms");
    _jspx_imports_classes.add("java.text.DateFormat");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.LocaleUtil");
    _jspx_imports_classes.add("javax.portlet.UnavailableException");
    _jspx_imports_classes.add("com.liferay.portal.kernel.servlet.PortalWebResourceConstants");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.Time");
    _jspx_imports_classes.add("java.util.TimeZone");
    _jspx_imports_classes.add("com.liferay.portal.kernel.template.StringTemplateResource");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.PortalUtil");
    _jspx_imports_classes.add("javax.portlet.PortletResponse");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.Validator");
    _jspx_imports_classes.add("com.liferay.portal.kernel.language.UnicodeLanguageUtil");
    _jspx_imports_classes.add("com.liferay.exportimport.kernel.staging.LayoutStagingUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.StringUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.UnicodeProperties");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.PortletKeys");
    _jspx_imports_classes.add("com.liferay.taglib.search.ResultRow");
    _jspx_imports_classes.add("java.util.Objects");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.ServerDetector");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.LocalizationUtil");
    _jspx_imports_classes.add("javax.portlet.WindowState");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.ListUtil");
    _jspx_imports_classes.add("com.liferay.portlet.RenderResponseFactory");
    _jspx_imports_classes.add("com.liferay.layout.seo.kernel.LayoutSEOLink");
    _jspx_imports_classes.add("com.liferay.portal.kernel.language.LanguageWrapper");
    _jspx_imports_classes.add("com.liferay.portal.kernel.security.auth.AuthTokenUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.HtmlParserUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.UnicodeFormatter");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.LiferayRenderRequest");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.SetUtil");
    _jspx_imports_classes.add("com.liferay.portal.struts.Definition");
    _jspx_imports_classes.add("com.liferay.portal.kernel.model.impl.VirtualLayout");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("com.liferay.portal.kernel.layoutconfiguration.util.RuntimePageUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.IntegerWrapper");
    _jspx_imports_classes.add("com.liferay.portal.kernel.frontend.icons.FrontendIconsUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.log.Log");
    _jspx_imports_classes.add("javax.portlet.PortletMode");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.KeyValuePair");
    _jspx_imports_classes.add("java.util.HashSet");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.PortletProvider");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.FastDateFormatFactoryUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.CalendarFactoryUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.dao.search.RowChecker");
    _jspx_imports_classes.add("javax.portlet.PortletRequest");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.ParamUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.PortletInstanceFactoryUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.PortletSetupUtil");
    _jspx_imports_classes.add("com.liferay.portal.struts.TilesUtil");
    _jspx_imports_classes.add("javax.portlet.ResourceURL");
    _jspx_imports_classes.add("com.liferay.sites.kernel.util.Sites");
    _jspx_imports_classes.add("com.liferay.asset.kernel.model.AssetTag");
    _jspx_imports_classes.add("com.liferay.portal.kernel.json.JSONFactoryUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.service.permission.GroupPermissionUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.Http");
    _jspx_imports_classes.add("com.liferay.portlet.configuration.kernel.util.PortletConfigurationUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.LiferayPortletMode");
    _jspx_imports_classes.add("com.liferay.portal.kernel.servlet.BufferCacheServletResponse");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.DateUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.servlet.BrowserSnifferUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.LiferayHeaderResponse");
    _jspx_imports_classes.add("java.util.Collections");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.PortletURLFactoryUtil");
    _jspx_imports_classes.add("javax.portlet.PortletException");
    _jspx_imports_classes.add("com.liferay.taglib.util.InlineUtil");
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      //  liferay-theme:defineObjects
      com.liferay.taglib.theme.DefineObjectsTag _jspx_th_liferay_002dtheme_005fdefineObjects_005f0 = new com.liferay.taglib.theme.DefineObjectsTag();
      _jsp_getInstanceManager().newInstance(_jspx_th_liferay_002dtheme_005fdefineObjects_005f0);
      try {
        _jspx_th_liferay_002dtheme_005fdefineObjects_005f0.setPageContext(_jspx_page_context);
        _jspx_th_liferay_002dtheme_005fdefineObjects_005f0.setParent(null);
        int _jspx_eval_liferay_002dtheme_005fdefineObjects_005f0 = _jspx_th_liferay_002dtheme_005fdefineObjects_005f0.doStartTag();
        if (_jspx_th_liferay_002dtheme_005fdefineObjects_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_liferay_002dtheme_005fdefineObjects_005f0, _jsp_getInstanceManager(), false);
      }
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
      out.write("\n\n\n\n");
      //  portlet:defineObjects
      com.liferay.taglib.portlet.DefineObjectsTag _jspx_th_portlet_005fdefineObjects_005f0 = new com.liferay.taglib.portlet.DefineObjectsTag();
      _jsp_getInstanceManager().newInstance(_jspx_th_portlet_005fdefineObjects_005f0);
      try {
        _jspx_th_portlet_005fdefineObjects_005f0.setPageContext(_jspx_page_context);
        _jspx_th_portlet_005fdefineObjects_005f0.setParent(null);
        int _jspx_eval_portlet_005fdefineObjects_005f0 = _jspx_th_portlet_005fdefineObjects_005f0.doStartTag();
        if (_jspx_th_portlet_005fdefineObjects_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_portlet_005fdefineObjects_005f0, _jsp_getInstanceManager(), false);
      }
      javax.portlet.ActionRequest actionRequest = null;
      javax.portlet.ActionResponse actionResponse = null;
      javax.portlet.EventRequest eventRequest = null;
      javax.portlet.EventResponse eventResponse = null;
      com.liferay.portal.kernel.portlet.LiferayPortletRequest liferayPortletRequest = null;
      com.liferay.portal.kernel.portlet.LiferayPortletResponse liferayPortletResponse = null;
      javax.portlet.PortletConfig portletConfig = null;
      java.lang.String portletName = null;
      javax.portlet.PortletPreferences portletPreferences = null;
      java.util.Map portletPreferencesValues = null;
      javax.portlet.PortletSession portletSession = null;
      java.util.Map portletSessionScope = null;
      javax.portlet.RenderRequest renderRequest = null;
      javax.portlet.RenderResponse renderResponse = null;
      javax.portlet.ResourceRequest resourceRequest = null;
      javax.portlet.ResourceResponse resourceResponse = null;
      actionRequest = (javax.portlet.ActionRequest) _jspx_page_context.findAttribute("actionRequest");
      actionResponse = (javax.portlet.ActionResponse) _jspx_page_context.findAttribute("actionResponse");
      eventRequest = (javax.portlet.EventRequest) _jspx_page_context.findAttribute("eventRequest");
      eventResponse = (javax.portlet.EventResponse) _jspx_page_context.findAttribute("eventResponse");
      liferayPortletRequest = (com.liferay.portal.kernel.portlet.LiferayPortletRequest) _jspx_page_context.findAttribute("liferayPortletRequest");
      liferayPortletResponse = (com.liferay.portal.kernel.portlet.LiferayPortletResponse) _jspx_page_context.findAttribute("liferayPortletResponse");
      portletConfig = (javax.portlet.PortletConfig) _jspx_page_context.findAttribute("portletConfig");
      portletName = (java.lang.String) _jspx_page_context.findAttribute("portletName");
      portletPreferences = (javax.portlet.PortletPreferences) _jspx_page_context.findAttribute("portletPreferences");
      portletPreferencesValues = (java.util.Map) _jspx_page_context.findAttribute("portletPreferencesValues");
      portletSession = (javax.portlet.PortletSession) _jspx_page_context.findAttribute("portletSession");
      portletSessionScope = (java.util.Map) _jspx_page_context.findAttribute("portletSessionScope");
      renderRequest = (javax.portlet.RenderRequest) _jspx_page_context.findAttribute("renderRequest");
      renderResponse = (javax.portlet.RenderResponse) _jspx_page_context.findAttribute("renderResponse");
      resourceRequest = (javax.portlet.ResourceRequest) _jspx_page_context.findAttribute("resourceRequest");
      resourceResponse = (javax.portlet.ResourceResponse) _jspx_page_context.findAttribute("resourceResponse");
      out.write('\n');
      out.write('\n');

PortletRequest portletRequest = (PortletRequest)request.getAttribute(JavaConstants.JAVAX_PORTLET_REQUEST);

PortletResponse portletResponse = (PortletResponse)request.getAttribute(JavaConstants.JAVAX_PORTLET_RESPONSE);

String namespace = AUIUtil.getNamespace(portletRequest, portletResponse);

if (Validator.isNull(namespace)) {
	namespace = AUIUtil.getNamespace(request);
}

String currentURL = null;

if ((portletRequest != null) && (portletResponse != null)) {
	PortletURL currentURLObj = PortletURLUtil.getCurrent(PortalUtil.getLiferayPortletRequest(portletRequest), PortalUtil.getLiferayPortletResponse(portletResponse));

	currentURL = currentURLObj.toString();
}
else {
	currentURL = PortalUtil.getCurrentURL(request);
}

ResourceBundle resourceBundle = TagResourceBundleUtil.getResourceBundle(request, locale);

pageContext.setAttribute("resourceBundle", resourceBundle);

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

String src = HtmlUtil.escapeAttribute((String)request.getAttribute("liferay-ui:search-container-column-icon:src"));
boolean toggleRowChecker = GetterUtil.getBoolean(request.getAttribute("liferay-ui:search-container-column-icon:toggleRowChecker"));

      out.write('\n');
      out.write('\n');
      //  c:if
      com.liferay.taglib.core.IfTag _jspx_th_c_005fif_005f0 = new com.liferay.taglib.core.IfTag();
      _jsp_getInstanceManager().newInstance(_jspx_th_c_005fif_005f0);
      try {
        _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fif_005f0.setParent(null);
        // /html/taglib/ui/search_container/image.jsp(24,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fif_005f0.setTest( Validator.isNotNull(src) );
        int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
        if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n	<div class=\"aspect-ratio-bg-cover ");
          out.print( toggleRowChecker ? "click-selector" : StringPool.BLANK );
          out.write(" sticker sticker-static\" style=\"background-image: url('");
          out.print( src );
          out.write("');\">\n		<img alt=\"thumbnail\" class=\"sr-only\" src=\"");
          out.print( src );
          out.write("\" />\n	</div>\n");
        }
        if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), false);
      }
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
}
