window.addEventListener('DOMContentLoaded', (event) => {
    fetch('/data.json')
        .then(response => response.json())
        .then(data => {
            document.getElementById('jsonData').innerText = JSON.stringify(data, null, 2);
        });
});