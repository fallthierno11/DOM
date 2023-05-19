// Fonction pour ajuster la quantité d'un article
    function adjustQuantity(item, increment) {
      var quantityElement = item.querySelector('.quantity');
      var quantity = parseInt(quantityElement.textContent);
      quantity += increment;
      if (quantity < 0) {
        quantity = 0;
      }
      quantityElement.textContent = quantity;
      calculateTotal();
    }

    // Fonction pour supprimer un article du panier
    function removeItem(item) {
      item.parentNode.removeChild(item);
      calculateTotal();
    }

    // Fonction pour changer la couleur du cœur
    function toggleHeartColor(heart) {
      heart.classList.toggle('clicked');
    }

    // Fonction pour calculer le prix total
    function calculateTotal() {
      var items = document.querySelectorAll('.item');
      var total = 0;
      for (var i = 0; i < items.length; i++) {
        var quantity = parseInt(items[i].querySelector('.quantity').textContent);
        var price = parseFloat(items[i].querySelector('.price').textContent);
        total += quantity * price;
      }
      document.getElementById('total').textContent = total.toFixed(2);
    }
  