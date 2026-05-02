<html>
<head>
<title>Library Management</title>

<script>
function addBook() {
    let id = document.getElementById("id").value;
    let name = document.getElementById("name").value;

    if (id === "" || name === "") {
        alert("Enter all fields");
        return;
    }

    let list = document.getElementById("list");
    let item = document.createElement("li");
    item.textContent = id + " - " + name;

    list.appendChild(item);

    document.getElementById("id").value = "";
    document.getElementById("name").value = "";
}
</script>

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

Book ID: <input type="text" id="id"><br><br>
Book Name: <input type="text" id="name"><br><br>

<button onclick="addBook()">Add Book</button>

<h3>Books List</h3>
<ul id="list"></ul>

</div>

</body>
</html>
