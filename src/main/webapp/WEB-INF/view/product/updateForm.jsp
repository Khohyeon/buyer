<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ include file="../layout/header.jsp" %>
        
            <h1>제품 세부 정보</h1>
            <hr />
            <form action="/product/${id}/update" method="post">
                <table border="1">
                    <tr>
                        <th>번호</th>
                        <th>이름</th>
                        <th>가격</th>
                        <th>재고</th>
                        <th>날짜</th>
                    </tr>
                    <tr>
                        <td><input type="text" value="${product.id}" ></td>
                        <td><input type="text" value="${product.name}"></td>
                        <td><input type="text" value="${product.price}"></td>
                        <td><input type="text" name="qty" value="${product.qty}"></td>
                        <td><input type="text" value="${product.createdAt}" ></td>
                    </tr>
                    <button type="submit">수정완료</button>
                </table>
            </form>
        <%@ include file="../layout/footer.jsp" %>
