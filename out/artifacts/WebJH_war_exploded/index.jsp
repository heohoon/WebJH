<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2020-07-19
  Time: 오후 2:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <style>
      a {
        text-decoration: none;
        text-align: right;
      }
      header {
        background-color : palegoldenrod;
        font-family : "Sans Serif";
        font-size: 25px;
      }
      #Contents {
        background-color: goldenrod;
        font-family : "Sans Serif";
        font-size: 25px;
      }
      footer {
        background-color : coral;
        font-family : "Sans Serif";
        font-size: 25px;
      }

    </style>
    <title>$Title$</title>
  </head>
  <body>
    <header id="header" class="header">
      <a href="/hello.jh">Header Area</a>
     <!-- <img src="/image/logo.svg"></img>-->
    </header>
    <div id="Contents">
      <a href="/data.json">Content Area</a>
    </div>
    <footer>
      <a href="/image/goodbye.jh">Footer Area</a>
    </footer>
  </body>
</html>
