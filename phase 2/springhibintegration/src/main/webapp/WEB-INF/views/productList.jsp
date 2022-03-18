<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>Spring With Hibernate</title>
    </head>
    <body>
    <h3>Product List </h3>
    <c:if  test="${!empty productList}">
    <table class="data">
    <tr>
        <th>Name</th>
        <th>Price</th>
        <th>quantity</th>
    </tr>
    <c:forEach items="${productList}" var="product">
        <tr>
            <td>${product.name} </td>
            <td>${product.price}</td>
            <td>${product.quantity}</td>
        </tr>
    </c:forEach>
    </table>
    </c:if>
    </body>
</html>