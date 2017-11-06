$(function () {
	//sloving the active menu prolem
	switch(menu){
	case 'About Us':
		$('#abouts').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
		default:
			$('#home').addClass('active');
		break;
		
	}
})