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
--%>

<%@ include file="/html/taglib/ui/language/init.jsp" %>

<%
Map<String, Object> contextObjects = HashMapBuilder.<String, Object>put(
	"formAction", formAction
).put(
	"formName", formName
).put(
	"languageId", languageId
).put(
	"name", name
).put(
	"namespace", namespace
).build();
%>

<c:if test="<%= !languageEntries.isEmpty() %>">

	<%
	String renderedDDMTemplate = StringPool.BLANK;

	DDMTemplate portletDisplayDDMTemplate = PortletDisplayTemplateManagerUtil.getDDMTemplate(displayStyleGroupId, PortalUtil.getClassNameId(LanguageEntry.class), displayStyle, true);

	if (portletDisplayDDMTemplate != null) {
		renderedDDMTemplate = PortletDisplayTemplateManagerUtil.renderDDMTemplate(request, response, portletDisplayDDMTemplate.getTemplateId(), languageEntries, contextObjects);
	}
	%>

	<%= renderedDDMTemplate %>
</c:if>