document.getElementById('biometricsForm').addEventListener('submit', function (event) {
    event.preventDefault();
    const matricula = document.getElementById('matricula').value;
    const digital = document.getElementById('digital').value;

    fetch('http://localhost:8082/biometrics/validate', {
        method: 'POST',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify({matricula: matricula, digital: digital})
    })
        .then(response => response.text())
        .then(message => alert(message))
        .catch(error => alert('Error: ' + error.message));
});
