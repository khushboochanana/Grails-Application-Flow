<%@ page import="grailsapplicationflow.Demo" %>



<div class="fieldcontain ${hasErrors(bean: demoInstance, field: 'name', 'error')} required">
    <label for="name">
        <g:message code="demo.name.label" default="Name"/>
        <span class="required-indicator">*</span>
    </label>
    <g:textField name="name" required="" value="${demoInstance?.name}"/>

</div>

