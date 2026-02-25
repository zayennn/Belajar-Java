import java.util.Locale;
import java.text.NumberFormat;

public class Main {
    static class AccountBank{
        private String namaPemilik;
        private int saldo;

        private static final Locale indonesia = new Locale("id", "ID");
        private static final NumberFormat formatRupiah;

        static {
            formatRupiah = NumberFormat.getCurrencyInstance(indonesia);
            formatRupiah.setMaximumFractionDigits(0);
            formatRupiah.setMinimumFractionDigits(0);
        }

        AccountBank(String namaPemilik, int saldo) {
            this.namaPemilik = namaPemilik;
            if (saldo < 0) {
//                System.out.println("saldo tidak boleh kurang dari 0");
                throw new IllegalArgumentException("saldo tidak boleh negatif");
            } else {
                this.saldo = saldo;
            }
        }

        int setorUang(int setor) {
            saldo += setor;
            return saldo;
        }

        int tarikUang(int tarik) {
            if (saldo <= 0) {
                throw new IllegalArgumentException("tidak bisa tarik uang karena anda miskin!");
            } else {
                saldo -= tarik;
                return saldo;
            }
        }

        void info() {
            System.out.printf("""
nama pemilik bank : %s
jumlah saldo      : %s
                    """, namaPemilik, formatRupiah.format(saldo));
        }
    }

    public static void main(String[] args) {
        AccountBank capypoter = new AccountBank("capypoter", 0);
//        capypoter.setorUang(50000);
        capypoter.tarikUang(10000);
        capypoter.info();
    }
}