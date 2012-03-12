<%@ page import="com.algos.droidactivator.backend.Activation" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'activation.label', default: 'Activation')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>
<a href="#list-activation" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>

<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
        <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]"/></g:link></li>
    </ul>
</div>

<div id="list-activation" class="content scaffold-list" role="main">
    <h1><g:message code="default.list.label" args="[entityName]"/></h1>
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>
    <table>
        <thead>
        <tr>

            <g:sortableColumn property="applicationName" title="${message(code: 'activation.applicationName.label', default: 'Application Name')}"/>

            <g:sortableColumn property="paid" title="${message(code: 'activation.paid.label', default: 'Paid')}"/>

            <g:sortableColumn property="amount" title="${message(code: 'activation.amount.label', default: 'Amount')}"/>

            <g:sortableColumn property="active" title="${message(code: 'activation.active.label', default: 'Active')}"/>

            <g:sortableColumn property="level" title="${message(code: 'activation.level.label', default: 'Level')}"/>

            <g:sortableColumn property="userGoogleMail" title="${message(code: 'activation.userGoogleMail.label', default: 'User Google Mail')}"/>

        </tr>
        </thead>
        <tbody>
        <g:each in="${activationInstanceList}" status="i" var="activationInstance">
            <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                <td><g:link action="show" id="${activationInstance.id}">${fieldValue(bean: activationInstance, field: "applicationName")}</g:link></td>

                <td><g:formatBoolean boolean="${activationInstance.paid}"/></td>

                <td>${fieldValue(bean: activationInstance, field: "amount")}</td>

                <td><g:formatBoolean boolean="${activationInstance.active}"/></td>

                <td>${fieldValue(bean: activationInstance, field: "level")}</td>

                <td>${fieldValue(bean: activationInstance, field: "userGoogleMail")}</td>

            </tr>
        </g:each>
        </tbody>
    </table>

    <div class="pagination">
        <g:paginate total="${activationInstanceTotal}"/>
    </div>
</div>
</body>
</html>