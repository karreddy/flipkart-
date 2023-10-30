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

<%@ include file="/html/common/themes/init.jsp" %>

<%
String alternativeLayoutFriendlyURL = (String)SessionMessages.get(request, "alternativeLayoutFriendlyURL");
%>

<c:if test="<%= Validator.isNotNull(alternativeLayoutFriendlyURL) %>">
	<button aria-label="<%= LanguageUtil.get(request, "close") %>" class="close" type="button">&times;</button>

	<liferay-util:buffer
		var="redirectedLink"
	>
		<aui:a href="<%= PortalUtil.getCurrentCompleteURL(request) %>">
			<%= HtmlUtil.escape(PortalUtil.getCurrentCompleteURL(request)) %>
		</aui:a>
	</liferay-util:buffer>

	<p class="redirected-to-message">
		<liferay-ui:message arguments="<%= redirectedLink %>" key="you-were-redirected-to-x" translateArguments="<%= false %>" />
	</p>

	<liferay-util:buffer
		var="originalLink"
	>
		<aui:a href="<%= alternativeLayoutFriendlyURL %>">
			<liferay-ui:message key="link" />
		</aui:a>
	</liferay-util:buffer>

	<p class="original-url">
		<liferay-ui:message arguments="<%= originalLink %>" key="click-the-following-link-if-you-want-to-dismiss-this-redirect-and-access-the-original-url-x" translateArguments="<%= false %>" />
	</p>
</c:if>