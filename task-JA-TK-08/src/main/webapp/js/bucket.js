var products = null;

$.get("showbucket", function(data) {
	if (data !== '') {
		products = data;
	}
}).done(
		function() {
			var cardsContent = "";
			jQuery.each(products, function(i, value) {
				cardsContent += "<div class='col'>" + 
								"<div class='card'>" + 
								"<div class='card-body'>" + 
								"<h5 class='card-title'>" + 
								value.productName + "</h5>" + 
								"<h6 class='card-subtitle mb-2 text-muted'>" + 
								value.productPrice + "</h6>" + 
								"<p class='card-text'>" + 
								value.productDesc + 
								"</p>" 	+ 
								"<h6 class='card-subtitle mb-2 text-muted'>" + 
								value.purchaseDate + "</h6>" +
								"<a href='product?id=" + value.id + 
								"' class='card-link'>link</a>" + 
								"</div>" + 
								"</div>" + 
								"</div>" + 
								"</div>"
			});

			$('#productCards').html(cardsContent);

		});