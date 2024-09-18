document.getElementById('turnstileForm').addEventListener('submit', function (event) {
    event.preventDefault();
    const matricula = document.getElementById('matricula').value;

    fetch('http://localhost:8083/turnstile/access', {
        method: 'POST',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify({matricula: matricula})
    })
        .then(response => response.text())
        .then(message => alert(message))
        .catch(error => alert('Error: ' + error.message));
});
