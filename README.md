# Buton Kontrol Paneli
  Bu proje java dilinde yazılmış bir form uygulamasıdır. Butonlar 4x4 bir matris şeklinde uygulamanın panelinde dizilmiştir. Uygulamanın temel amacı bu paneldeki butonların işlevsellik yönünü kullanarak bir kontrol mekanizması oluşturmaktır.
  Projede bu kontrolü sağlarken hayali bir GraphQL şeması kullanılmıştır. GraphQL temel bağlamında server ve clint arasındaki iletişimde server'a gönderilen isteklere karşı yetersiz kaldığı yerde sorgulama ve API çağrıları yapmaya yarayan web servis sorgulama dilidir.
  Bu dilde bağlantı şemalar üzerinden gerçekleştirilir; sorgulama ve diğer işlevler şemalardaki mutation metodlar üzerinden sağlanır.

# Temel Yapı
  Form uygulamasını oluşturmak için boyutları 1280x1024 olmak üzere bir JFrame oluşturulur. Jframe'in özellikleri belirlendikten sonra butonları yerleştirebilmek için JFrame'in içine bir JPanel konulur ve butonlar yerleştirilir. 

# Buton Yapısı
  Panelde toplam 16 adet buton bulunmaktadır. Butonların aktif-pasif simge ve renk olmak üzere 4 ayrı özelliği bulunmaktadır. Butonların hepsi JButton nesnesinden türetildiği için her buton ayrı bir nesnedir. Bu butonların özelliklerini dinamik olarak
  güncelleyebilmek için butonlar ArrayList içine alınır. Program başlatıldığında bütün butonlar pasif olması gerekir bu yüzden pasif renk ve simge özellikleri butonlara tanımlanır. Butonlara tıklanıldığı zaman pasif özelikli butonlar aktif hale gelir eğer buton zaten aktif
  -önceden tıklanılmış- ise tıklanılan aktif kalır ancak onun dışındaki tüm aktif butonlar pasif hale gelir.

# GraphQL Yapısı
  Projede hayali bir GraphQL şeması kullanıldığından projenin içinde butonların şema adreslerini tutan bir HashMap kullanılmıştır. Butonların referansları anatar olarak, adresleri ise değer olarak HashMap'e tanımlanır. Butonlara tıklanıldığında güncel durumları ile ilgili    bilgi mutation metoduyla konsola yazdırılır.

Kodlar İnteliJ, Eclipse, NetBeans gibi java derleyicilerinde derlenerek çalıştırılabilir.

