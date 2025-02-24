<%@page language="java" %>

<html>
    <head>
        <link href="./styles.css" rel="stylesheet"/>
    </head>
    <body>
        <h2>Simple Calculator</h2>
        <form action="add">
            <label for="num1">Enter 1st number: </label>
            <input type="text" id="num1" name="num1"/><br/>
            <label for="num2">Enter 2nd number: </label>
            <input type="text" id="num2" name="num2"/><br/>
            <input type="submit" value="Submit"/>
        </form>
    </body>
</html>