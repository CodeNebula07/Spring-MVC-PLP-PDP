<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Product List</title>
    <style>
          body {
                    font-family: Arial, sans-serif;
                    background-color: #f5f5f5;
                    margin: 0;
                    padding: 0;
                }

                .container {
                    max-width: 900px;
                    margin: 0 auto;
                    padding: 20px;
                }

                h1 {
                    text-align: center;
                    color: #333;
                    padding: 20px 0;
                    margin: 0;
                    font-size: 28px;
                    font-weight: 700;
                    text-transform: uppercase;
                }

                table {
                    width: 100%;
                    border-collapse: collapse;
                    border: 1px solid #ccc;
                    background-color: #fff;
                    margin-bottom: 20px;
                }

                th, td {
                    padding: 10px;
                    text-align: left;
                    border-bottom: 1px solid #ccc;
                }

                th {
                    background-color: #f8f8f8;
                    font-weight: bold;
                    text-transform: uppercase;
                    font-size: 14px;
                }

                td {
                    font-size: 14px;
                    color: #555;
                    vertical-align: middle;
                }

                tbody tr:hover {
                    background-color: #f9f9f9;
                }

                td a {
                    color: #337ab7;
                    text-decoration: none;
                    font-weight: bold;
                }

                td a:hover {
                    text-decoration: underline;
                }

                img {
                    display: block;
                    margin: 0 auto;
                    max-width: 100%;
                    max-height: 150px;
                    border-radius: 4px;
                    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
                }

    </style>
</head>
<body>
    <h1>Product List</h1>

    <table>
        <thead>
            <tr>
                <th>Product Name</th>
                <th>Price</th>
                <th>Image</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${products}" var="product">
                <tr>
                    <td><a href="http://localhost:8081/product/query/${product.id}">${product.masterData.current.name.get("en")}</a></td>
                    <td>${product.masterData.current.masterVariant.prices.get(0).value.centAmount}</td>
                    <td>
                        <img src="${product.masterData.current.masterVariant.images.get(0).url}" alt="product image">
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
