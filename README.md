# Java Çalışmaları

Java öğrenirken yazdığım alıştırmalar ve küçük uygulamalar. Her klasör tek başına çalışan ayrı bir projedir.

Daha kapsamlı Java projelerim ayrı repolarda: [ATM-java](https://github.com/mhmdcngz/ATM-java), [Macera-Oyunu](https://github.com/mhmdcngz/Macera-Oyunu), [Mayin-Tarlasi](https://github.com/mhmdcngz/Mayin-Tarlasi), [OBS](https://github.com/mhmdcngz/OBS).

## Konu çalışmaları

| Klasör | Konu |
|---|---|
| [OOP](OOP) | Kalıtım, soyut sınıflar, `protected` erişim (çalışan / akademisyen / memur hiyerarşisi) |
| [Siniflar](Siniflar) | İç içe sınıflar: static, non-static, yerel ve anonim sınıflar |
| [Jenerik](Jenerik) | Jenerik sınıflar ve jenerik metotlar |
| [Koleksiyonlar](Koleksiyonlar) | `ArrayList`, `LinkedList`, `Vector`, `HashSet`, `TreeSet`, `HashMap`, `TreeMap`, `PriorityQueue` |
| [HataAyiklama](HataAyiklama) | `try` / `catch` / `finally`, `throw` ve özel exception sınıfı |
| [File](File) | `FileWriter` / `BufferedReader` ile dosyaya yazma ve okuma |
| [Threadlar](Threadlar) | `Runnable` ile çoklu thread |
| [GUI](GUI) | Swing ile temel pencere ve buton |
| [DBKullanim](DBKullanim) | JDBC ile MariaDB bağlantısı, `Statement` ve `PreparedStatement` |

## Küçük uygulamalar

| Klasör | Açıklama |
|---|---|
| [AdamAsmaca](AdamAsmaca) | Türkiye'nin 81 ilinden rastgele biriyle adam asmaca |
| [HesapMakinesi](HesapMakinesi) | Konsol tabanlı dört işlem hesap makinesi |
| [SayiTahmin](SayiTahmin) | 0–100 arası sayı tahmin oyunu |
| [SayiAnalizi](SayiAnalizi) | Bir sayının işaret, tek/çift, basamak toplamı, tersi vb. analizi |
| [YakinSayi](YakinSayi) | Dizideki birbirine en yakın iki sayıyı bulma |
| [ParantezKontrol](ParantezKontrol) | Parantez dizisinin dengeli olup olmadığını kontrol etme |
| [SezarSifreleme](SezarSifreleme) | Sezar şifreleme algoritması |
| [HarfSayaci](HarfSayaci) | Metindeki sessiz harfleri sayma (Türkçe karakter destekli) |
| [OturmaDuzeni](OturmaDuzeni) | Rastgele oturma düzeni oluşturma ve en dolu sırayı bulma |
| [YuruyusRotasi](YuruyusRotasi) | 5x5 haritada U/D/R/L komutlarıyla gezinme |

## Çalıştırma

Her klasör IntelliJ IDEA'da ayrı proje olarak açılabilir. Terminalden çalıştırmak için:

```bash
cd SayiTahmin
javac -d out src/*.java
java -cp out Main
```

Bazı alıştırmalar Java 21+ ile gelen parametresiz `static void main()` biçimini kullanıyor. Bunlar için JDK 25 (veya önizleme özellikleri açık JDK 21+) gerekir.

**Dosya okuyan projeler:** AdamAsmaca `sehirler.txt` dosyasını çalışma dizininde arar. Programı klasörün kendisinden çalıştırın.

**DBKullanim:** Çalıştırmak için [MariaDB Connector/J](https://mariadb.com/downloads/connectors/connectors-data-access/java8-connector/) jar dosyasını indirip classpath'e ekleyin. `src/Main.java` içindeki `KULLANICI` ve `SIFRE` alanlarını kendi veritabanı bilgilerinizle değiştirin. Kod `araba` adlı bir veritabanında `cars_id`, `cars_name`, `cars_speed` sütunlu bir `araba` tablosu bekler.
