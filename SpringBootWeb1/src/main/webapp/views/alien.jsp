<%@page language="java" %>

<html>
    <head>
        <link href="./styles.css" rel="stylesheet"/>
    </head>
    <body>
        <h2>Alien Database</h2>
        <form action="addAlien">
            <label for="aid">Enter alien id: </label>
            <input type="text" id="aid" name="aid"/><br/>
            <label for="aname">Enter alien name: </label>
            <input type="text" id="aname" name="aname"/><br/>
            <input type="submit" value="Add"/>
        </form>
    </body>
</html>