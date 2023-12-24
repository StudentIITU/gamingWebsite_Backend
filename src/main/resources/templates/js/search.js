document.addEventListener('DOMContentLoaded', function() {
    const searchInput = document.querySelector('.search-container input');
    const cards = document.querySelectorAll('.grid-link');

    searchInput.addEventListener('input', function(event) {
        const searchText = event.target.value.trim().toLowerCase();

        cards.forEach(card => {
            const cardTitle = card.querySelector('.game-details h3').textContent.toLowerCase();

            if (cardTitle.includes(searchText)) {
                card.style.display = 'block';
            } else {
                card.style.display = 'none';
            }
        });
    });
});


