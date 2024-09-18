function loadPage(page) {
    const contentDiv = document.getElementById('content');

    fetch(`html/${page}.html`)
        .then(response => response.text())
        .then(html => {
            contentDiv.innerHTML = html;
        })
        .catch(error => {
            contentDiv.innerHTML = '<p>Erro ao carregar a página.</p>';
            console.error('Error loading page:', error);
        });
}
