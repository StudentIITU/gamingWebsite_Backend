addEventListener('DOMContentLoaded', function() {
    var languageFilter = document.getElementById('languageFilter');

    // Обработчик изменения выбранного элемента в списке
    languageFilter.addEventListener('change', function() {
        // Ваш код для обработки изменений, если необходимо
        console.log('Выбранные языки:', Array.from(languageFilter.selectedOptions).map(option => option.value));
    });

    // Обработчик клика на ярлык (label)
    document.querySelector('.filter-group label[for="languageFilter"]').addEventListener('click', function() {
        // Переключаем видимость фильтра при клике
        var languageFilterDiv = document.querySelector('.language-filter');
        languageFilterDiv.style.display = (languageFilterDiv.style.display === 'none') ? 'block' : 'none';
    });
});




///////////////////////////////////////////////////// копирование в буфер обмена //////////////////////////////////////////////////////////////

document.addEventListener('click', function (event) {
    // Проверяем, был ли клик по элементу с классом 'copyable-copy'
    if (event.target.classList.contains('copyable-copy')) {
        // Находим ближайший родительский элемент с классом 'detail'
        var detailElement = event.target.closest('.detail');

        // Находим элемент с классом 'copyable' внутри родительского элемента
        var copyableElement = detailElement.querySelector('.copyable');

        // Получаем текст для копирования
        var textToCopy = copyableElement.dataset.text;

        // Копируем текст в буфер обмена
        copyToClipboard(textToCopy);

        // Дополнительные действия (например, изменение визуального состояния кнопки Copy)
        var copyButton = detailElement.querySelector('.copyable-copy');
        copyButton.innerText = 'Copied!';
        setTimeout(function () {
            copyButton.innerText = 'Copy';
        }, 2000); // Возвращаем исходный текст через 2 секунды (можно настроить по желанию)
    }
});

function copyToClipboard(text) {
    // Создаем временный элемент textarea для копирования текста
    var textarea = document.createElement('textarea');
    textarea.value = text;
    document.body.appendChild(textarea);

    // Выделяем текст в textarea и копируем его в буфер обмена
    textarea.select();
    document.execCommand('copy');

    // Удаляем временный элемент textarea
    document.body.removeChild(textarea);
}