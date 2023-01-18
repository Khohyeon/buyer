<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ include file="../layout/header.jsp" %>
        <h1>제품 세부 정보</h1>
        <hr />

        <table border="1">
            <tr>
                <th>번호</th>
                <th>이름</th>
                <th>가격</th>
                <th>재고</th>
                <th>날짜</th>
            </tr>
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>${product.qty}</td>
                <td>${product.createdAt}</td>
            </tr>
        </table>
        <form action="/product/purchase" method="get">
            <input type="number" name="qty" step="2" max="${product.qty}">
            <button type="submit">구매</button>
        </form>
        <%@ include file="../layout/footer.jsp" %>