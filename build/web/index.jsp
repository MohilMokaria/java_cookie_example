<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Simple Form</title>
</head>
<body>

    <h2>Simple Form</h2>

    <form action="AddCookie" method="post">
        <label>Name:</label>
        <input type="text" id="Name" name="Name" required><br>

        <label>Age:</label>
        <input type="text" id="Age" name="Age" required><br>

        <input type="submit" value="Submit">
    </form>

</body>
</html>
