# Java Çalışmaları

Java öğrenirken yazdığım alıştırmalar. Her klasör ayrı, kendi başına çalışan küçük bir projedir.

**Konular:** OOP ve kalıtım, iç içe sınıflar, jenerikler, koleksiyonlar, hata yönetimi, dosya işlemleri, thread, Swing ve JDBC.

**Küçük uygulamalar:** Adam Asmaca, Hesap Makinesi, Sayı Tahmin, Sezar Şifreleme, Parantez Kontrol, Oturma Düzeni ve birkaç sayı/dizi alıştırması.

Daha kapsamlı Java projelerim ayrı repolarda: [ATM-java](https://github.com/mhmdcngz/ATM-java), [Macera-Oyunu](https://github.com/mhmdcngz/Macera-Oyunu), [Mayin-Tarlasi](https://github.com/mhmdcngz/Mayin-Tarlasi), [OBS](https://github.com/mhmdcngz/OBS).

## Çalıştırma

```bash
cd SayiTahmin
javac -d out src/*.java
java -cp out Main
```

Bazı dosyalar parametresiz `static void main()` kullandığı için JDK 25 gerekir. `DBKullanim` için MariaDB JDBC sürücüsü ve koddaki `KULLANICI` / `SIFRE` alanlarına kendi bilgileriniz gerekir.
