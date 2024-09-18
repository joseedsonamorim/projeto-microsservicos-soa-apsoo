document.getElementById('registerForm').addEventListener('submit', function (event) {
    event.preventDefault();
    const name = document.getElementById('name').value;
    const matricula = document.getElementById('matricula').value;
    const password = document.getElementById('password').value;

    fetch('http://localhost:8081/auth/register', {
        method: 'POST',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify({nome: name, matricula: matricula, senha: password})
    })
        .then(response => response.json())
        .then(data => alert('Registration successful'))
        .catch(error => alert('Error: ' + error.message));
});

document.getElementById('loginForm').addEventListener('submit', function (event) {
    event.preventDefault();
    const matricula = document.getElementById('loginMatricula').value;
    const password = document.getElementById('loginPassword').value;

    fetch('http://localhost:8081/auth/login', {
        method: 'POST',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify({matricula: matricula, senha: password})
    })
        .then(response => response.text())
        .then(message => alert(message))
        .catch(error => alert('Error: ' + error.message));
});
