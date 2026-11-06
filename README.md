# Java Çalışmaları

Java öğrenirken yazdığım alıştırmalar. Her klasör ayrı, kendi başına çalışan küçük bir projedir.

Daha kapsamlı Java projelerim ayrı repolarda: [ATM-java](https://github.com/mhmdcngz/ATM-java), [Macera-Oyunu](https://github.com/mhmdcngz/Macera-Oyunu), [Mayin-Tarlasi](https://github.com/mhmdcngz/Mayin-Tarlasi), [OBS](https://github.com/mhmdcngz/OBS).

## Konu Çalışmaları

**[OOP](OOP)**
Bir üniversitedeki çalışanları modelleyen sınıf hiyerarşisi. `Calisan` temel sınıfından `Akademisyenler` (soyut) ve `Memurlar` türüyor, onlardan da `Ogretmen`, `Asistan`, `Guvenlik` ve `Bilgiİslem` türüyor. Kalıtım, soyut sınıf, `protected` erişim ve metot ezme (override) üzerine.

**[Siniflar](Siniflar)**
Java'daki iç içe sınıf türleri: static iç sınıf, non-static iç sınıf, metot içinde tanımlanan yerel sınıf ve anonim sınıf. Her biri ayrı dosyada, `Main` içinde nasıl oluşturuldukları gösteriliyor.

**[Jenerik](Jenerik)**
Tek tip parametreli (`Test<T>`) ve iki tip parametreli (`Test2<T, U>`) jenerik sınıflar, ayrıca farklı tipte dizileri aynı metotla yazdıran jenerik metot.

**[Koleksiyonlar](Koleksiyonlar)**
Java koleksiyon sınıflarının her biri için ayrı örnek: `ArrayList`, `LinkedList`, `Vector`, `HashSet`, `LinkedHashSet`, `TreeSet`, `HashMap`, `LinkedHashMap`, `TreeMap` ve `PriorityQueue`. Kuyruk metotlarının (`offer`, `peek`, `poll`, `remove`) farkları yorum satırlarında not alındı.

**[HataAyiklama](HataAyiklama)**
`try` / `catch` / `finally` blokları, birden fazla `catch` ile farklı hata türlerini yakalama ve `throw` ile hata fırlatma. `Exception` sınıfından türetilmiş özel bir `OgrenciArama` hatası da var.

**[File](File)**
`FileWriter` ve `BufferedWriter` ile bir dosyaya metin yazıp `FileReader` ve `BufferedReader` ile satır satır geri okuma.

**[Threadlar](Threadlar)**
`Runnable` arayüzünü uygulayan bir sınıfla iki thread'i aynı anda çalıştırma. Çıktıda iki işin sırayla değil iç içe ilerlediği görülüyor.

**[GUI](GUI)**
Swing ile ilk pencere denemesi: bir `JFrame`, konumu elle verilmiş bir buton ve tıklanınca konsola yazan bir `ActionListener`.

**[DBKullanim](DBKullanim)**
JDBC ile MariaDB'ye bağlanıp bir tablodan kayıt okuma. Kayıt ekleme kısmı hem birleştirilmiş SQL metniyle hem de `PreparedStatement` ile yazılmış, karşılaştırmak için yorum satırında duruyor.

## Küçük Uygulamalar

**[AdamAsmaca](AdamAsmaca)**
`sehirler.txt` dosyasındaki 81 ilden rastgele biri seçilir, kullanıcı harf tahmin eder. 6 yanlış hakkı var, aynı harfi iki kez girmeye izin verilmiyor.

**[HesapMakinesi](HesapMakinesi)**
Konsolda dört işlem yapan menülü hesap makinesi. Bölmede sonucu küsuratlı, küsuratsız ve kalan olarak ayrı ayrı gösteriyor.

**[SayiTahmin](SayiTahmin)**
Program 0–100 arasında rastgele bir sayı tutar, kullanıcı "artır / azalt" ipuçlarıyla bulmaya çalışır. Sonunda deneme sayısı yazılır.

**[SayiAnalizi](SayiAnalizi)**
Girilen bir sayının işaretini, tek/çift olduğunu, basamak sayısını, tersini, basamaklarının toplamını ve çarpımını, en büyük ve en küçük basamağını bulur.

**[YakinSayi](YakinSayi)**
Kullanıcının girdiği dizide birbirine en yakın iki sayıyı, indeksleriyle ve aralarındaki farkla birlikte bulur.

**[ParantezKontrol](ParantezKontrol)**
Girilen metindeki parantezlerin doğru sırada açılıp kapandığını sayaç yöntemiyle kontrol eder.

**[SezarSifreleme](SezarSifreleme)**
Metni, kullanıcının verdiği anahtar sayısı kadar kaydırarak Sezar yöntemiyle şifreler. Büyük ve küçük harfleri ayrı ele alır.

**[HarfSayaci](HarfSayaci)**
Girilen metindeki sessiz harfleri sayar. Türkçe harfler (ç, ğ, ş) de dahil.

**[OturmaDuzeni](OturmaDuzeni)**
Kullanıcının verdiği satır ve sütun sayısıyla bir sınıf oluşturur, sıraların %80'ini rastgele doldurur ve en dolu satırı bulur.

**[YuruyusRotasi](YuruyusRotasi)**
5x5'lik bir haritada U/D/R/L komutlarıyla gezinme. Harita sınırının dışına çıkılmasını engelliyor ve birden fazla komutu tek seferde (`rrd` gibi) kabul ediyor.
