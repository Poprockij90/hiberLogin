<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  Привет Контроллер!!!
  <form action="/controller/hello" method="post" name="blabla">
    <input type="text" name="nick">
    <input type="submit">
  </form>


  Привет Сервлет!!!
  <form action="/servlet/hello" method="post" name="blabla">
    <input type="text" name="nick">
    <input type="submit">
  </form>

  </body>
</html>
