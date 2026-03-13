// terkadang lambda itu masih terlalu panjang , contoh :
// players.forEach(p -> p.getInfo());
// java punya cara lain :
// players.forEach(Player::getInfo()); → ini disebut method reference
// bentuk umumnya :
// Class::method