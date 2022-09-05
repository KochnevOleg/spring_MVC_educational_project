<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear employee, please enter your details</h2>

<br>
<br>

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br>
    Salary <form:input path="salary"/>
    <br>
    Department <form:select path="department">
    <%--    <form:option value="Information Technologies" label="IT"/>--%>
    <%--    <form:option value="Human Resources" label="HR"/>--%>
    <%--    <form:option value="Sales" label="Sales"/>--%>

    <form:options items="${employee.departments}"/>
</form:select>
    <br>
    Which Car do you want?
    <%--    Audi <form:radiobutton path="carBrand" value="Audi"/>--%>
    <%--    BMW <form:radiobutton path="carBrand" value="BMW"/>--%>
    <%--    Mercedes <form:radiobutton path="carBrand" value="Mercedes"/>--%>

    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br>

    What's your foreign language(s)?
    <br>
<%--    EN <form:checkbox path="languages" value="English"/>--%>
<%--    DE <form:checkbox path="languages" value="Deutsch"/>--%>
<%--    FR <form:checkbox path="languages" value="French"/>--%>

    <form:checkboxes path="languages" items="${employee.languageList}"/>
    <br>

    <input type="submit" value="OK">
</form:form>

</form>

</body>

</html>