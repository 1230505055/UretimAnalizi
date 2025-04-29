#  Üretim Planlama Algoritması

Bu proje, **dinamik programlama (DP)** yöntemini kullanarak bir üretim hattındaki işlerin minimum toplam sürede tamamlanmasını amaçlar. Her iş, farklı makinelerde farklı sürelerde tamamlanabilir ve makineler arası geçişlerin maliyeti de hesaba katılır.

##  Amaç

- `n` adet işi
- `m` adet makine kullanarak
- Geçiş maliyetlerini de dikkate alarak
- **Toplam süreyi minimize etmektir.**

## Özellikler

- **İş Sayısı (n):** 4 (örnek sabit değer)
- **Makine Sayısı (m):** 3 (örnek sabit değer)
- **İş Süreleri:** `Zaman[i][j]` → `i`. işin `j`. makinede tamamlanma süresi
- **Geçiş Maliyetleri:** `Maliyeti[k][j]` → önceki işin `k`. makinesinden şu anki işin `j`. makinesine geçişin maliyeti

## Kullanılan Yöntem: Dinamik Programlama

Dinamik programlama tablosu (`dp[i][j]`), `i`. işin `j`. makinede tamamlanmasının ardından elde edilecek **minimum toplam süreyi** tutar.

### Hesaplama Adımları:

1. İlk iş için her makinedeki süre doğrudan yazılır.
2. Sonraki işler için, önceki işin tüm makinelerinden geçiş maliyeti + şu anki makinedeki süre hesaplanır.
3. En düşük olan seçilir ve tablo güncellenir.
