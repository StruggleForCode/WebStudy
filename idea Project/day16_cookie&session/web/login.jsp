<%--
  Created by IntelliJ IDEA.
  User: 27289
  Date: 2020/2/18
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <script>
        window.onload = function () {
            document.getElementById("img").onclick = function () {
                this.src = "/day16/checkCodeServlet?time=" + new Date().getTime();
            }
        }
    </script>
    <style>
        div{
            color: red;
        }
    </style>
</head>
<body>

    <form action="/day16/loginServlet" method="post">
        <table>
            <tr>
                <td>用户名</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td>验证码</td>
                <td><input type="text" name="checkCode"></td>
            </tr>
            <tr>
               <td colspan="2"><img src="/day16/checkCodeServlet" id="img"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="登陆"></td>
            </tr>

        </table>
    </form>

    <div>
        ${requestScope.cc_error}
    </div>
    <div>
        ${requestScope.cc_login}
    </div>

</body>
</html>
