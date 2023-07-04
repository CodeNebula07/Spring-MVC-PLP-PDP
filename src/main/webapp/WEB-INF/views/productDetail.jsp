<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Detail</title>
    <style>
        body {
                    font-family: Arial, sans-serif;
                    background-color: #f5f5f5;
                    margin: 0;
                    padding: 0;
                }

                .container {
                    max-width: 800px;
                    margin: 0 auto;
                    padding: 20px;
                }

                h1 {
                    font-size: 28px;
                    color: #333;
                    text-align: center;
                    margin-bottom: 20px;
                }

                .product {
                    display: flex;
                    align-items: center;
                    justify-content: center;
                    background-color: #fff;
                    border-radius: 4px;
                    padding: 20px;
                    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
                }

                .product-image {
                    flex: 0 0 200px;
                    text-align: center;
                }

                .product-image img {
                    max-width: 100%;
                    height: auto;
                }

                .product-details {
                    flex: 1;
                    padding-left: 20px;
                }

                h2 {
                    font-size: 24px;
                    color: #333;
                    margin-top: 0;
                }

                p {
                    font-size: 16px;
                    color: #666;
                    margin-bottom: 10px;
                }

                .price {
                    font-weight: bold;
                    color: #008000;
                }

                .description {
                    color: #777;
                }
    </style>
</head>
<body>
    <div class="container">
        <h1>Product Detail</h1>
        <div class="product">
            <div class="product-image">
                <img src="${product.masterData.current.masterVariant.images[0].url}" alt="product image">
            </div>
            <div class="product-details">
                <h2>${product.masterData.current.name.get("en")}</h2>
                <p>Price: $${product.masterData.current.masterVariant.prices[0].value.centAmount}</p>
                <p>Description: ${product.masterData.current.metaDescription.get("en")}</p>
            </div>
        </div>
    </div>
</body>
</html>
