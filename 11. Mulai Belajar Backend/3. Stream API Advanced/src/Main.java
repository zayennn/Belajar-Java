/*
    Stream adalah pipeline manipulasi data
    Struktur umumnya:
    data
     → stream
     → operasi
     → hasil

     Operasi yang sering dipakai:
     filter()
     map()
     sorted()
     limit()
     collect()
     reduce()

     Contoh Stream Pipeline :
     players.stream()
       .filter(p -> p.score > 300)
       .sorted((a,b) -> b.score - a.score)
       .forEach(Player::tampil);

     Pipeline ini melakukan:
     ambil semua player
     filter score > 300
     sort descending
     tampilkan
*/