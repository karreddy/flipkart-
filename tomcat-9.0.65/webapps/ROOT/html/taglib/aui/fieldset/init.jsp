<%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

@generated
--%>

<%@ include file="/html/taglib/taglib-init.jsp" %>

<%
boolean collapsed = GetterUtil.getBoolean(String.valueOf(request.getAttribute("aui:fieldset:collapsed")));
boolean collapsible = GetterUtil.getBoolean(String.valueOf(request.getAttribute("aui:fieldset:collapsible")));
boolean column = GetterUtil.getBoolean(String.valueOf(request.getAttribute("aui:fieldset:column")));
java.lang.String cssClass = GetterUtil.getString((java.lang.String)request.getAttribute("aui:fieldset:cssClass"));
java.lang.String helpMessage = GetterUtil.getString((java.lang.String)request.getAttribute("aui:fieldset:helpMessage"));
java.lang.String id = GetterUtil.getString((java.lang.String)request.getAttribute("aui:fieldset:id"));
java.lang.String label = GetterUtil.getString((java.lang.String)request.getAttribute("aui:fieldset:label"));
boolean localizeLabel = GetterUtil.getBoolean(String.valueOf(request.getAttribute("aui:fieldset:localizeLabel")), true);
java.lang.String markupView = GetterUtil.getString((java.lang.String)request.getAttribute("aui:fieldset:markupView"));
java.lang.String panelHeaderLinkCssClass = GetterUtil.getString((java.lang.String)request.getAttribute("aui:fieldset:panelHeaderLinkCssClass"));
Map<String, Object> dynamicAttributes = (Map<String, Object>)request.getAttribute("aui:fieldset:dynamicAttributes");
%>

<%@ include file="/html/taglib/aui/fieldset/init-ext.jspf" %>