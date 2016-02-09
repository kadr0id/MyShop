<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table border="2" width="2" cellspacing="2" cellpadding="2" >
<thead>
<tr>
    <th>№</th>
    <th>Имя</th>
    <th>Модель</th>
    <th>Цена</th>
    <th>Наличие</th>
    <th>В корзину</th>
</tr>
</thead>
<tbody>
<c:forEach items="${Watch}" var="Watch">
    <tr>

        <td><c:out value="${Watch.getId()}"/></td>
        <td><c:out value="${Watch.getNameWatch()}"/></td>
        <td><c:out value="${Watch.getPrice()}"/></td>
        <td><c:out value="${Watch.viewAmount()}"/></td>
        <td>
            <form action="addToCartServlet" method="post" >
                <input type="submit" name="" value="В корзину" />
                <input type="hidden" name="nameItem"  value="${Watch.getNameWatch()}">
                <input type="hidden" name="priceItem"  value="${Watch.getPrice()}">
                <input type="hidden" name="target"  value="/notebook">
            </form>
        </td>
    </tr>
</c:forEach>