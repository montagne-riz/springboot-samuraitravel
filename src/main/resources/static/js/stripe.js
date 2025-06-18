const stripe = Stripe('pk_test_51RSqOsQRsvCJwQ3k20tTValV2R3vXBzKRqScx2SOIDsG6cc4EiytPLoaPXXCaVSSED4MsDwrxb6PtmifNDFaSftD00bEHOrY97')
const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click', () => {
	stripe.redirectToCheckout({
		sessionId: sessionId
		})
	
	});
	
