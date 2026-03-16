// stream adalah pipeline manipulasi data
// struktur umum nya :
// data
//  → stream
//  → operasi
//  → hasil


// operasi yang sering dipakai :
//  filter()
//  map()
//  sorted()
//  limit()
//  collect()
//  reduce()

// contoh stream pipeline :
/*
    players.stream()
    .filter(p -> player.score > 200)
    .sorted((a, b) -> b.score - a. score)
    .forEach(Player::getInfo);
*/