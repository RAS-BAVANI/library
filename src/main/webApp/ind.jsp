<html>
<head>
<style>
body { font-family: Arial; text-align: center; }
.container {
  width: 300px;
  margin: 50px auto;
  padding: 20px;
  box-shadow: 0 0 10px gray;
}
button {
  width: 120px;
  height: 40px;
  margin: 5px;
}
</style>
</head>

<body>
<div class="container">
<h2>Library Management</h2>

<form action="library" method="get">
  <button name="action" value="add">Add Book</button>
  <button name="action" value="view">View Books</button><br>
  <button name="action" value="issue">Issue Book</button>
  <button name="action" value="return">Return Book</button>
</form>

</div>
</body>
</html>
