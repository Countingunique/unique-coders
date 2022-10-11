const layer = document.querySelector('.display');
layer.style.display = 'flex';
layer.style.justifyContent = 'center';
layer.style.alignItems = 'center';
layer.style.height = '100vh';

onload = () => {
    let id = document.getElementById('app');
    let loading = document.createElement('div');

    loading.textContent = "Loading";
    loading.style.fontSize = '28px';
    id.appendChild(loading);

    let animation = setInterval(() => {
        loading.textContent = loading.textContent + '.';
    }, 800);

    setTimeout(() => {
        clearInterval(animation);
        // loading.textContent = "Welcome to main page!";
        // redirect new page use =>
        window.location.href = "new-page.html";
    }, 4000)
}