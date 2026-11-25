RED LINE VIP - ساخت ابری APK

این پروژه برای ساخت APK در GitHub Actions آماده شده است؛ لازم نیست Android SDK روی ویندوز نصب باشد.

مراحل:
1) وارد GitHub شوید و یک مخزن جدید بسازید. پیشنهاد: Private repository تا سورس و کارت‌های بازی عمومی نشوند.
2) فایل ZIP را روی کامپیوتر Extract کنید.
3) وارد پوشه RED_LINE_ANDROID_VIP شوید و تمام محتویات داخل آن (از جمله پوشه مخفی .github) را به مخزن GitHub بارگذاری کنید.
   مهم: خود پوشه RED_LINE_ANDROID_VIP را به‌عنوان یک زیرپوشه داخل مخزن قرار ندهید؛ فایل app و build.gradle باید در ریشه مخزن باشند.
4) در GitHub به زبانه Actions بروید و workflow با نام Build RED LINE APK را باز کنید.
5) روی Run workflow و سپس دکمه سبز Run workflow کلیک کنید.
6) پس از پایان موفق، وارد همان اجرای workflow شوید و از قسمت Artifacts فایل RED-LINE-VIP-test-APK.zip را دانلود کنید.
7) فایل Artifact را Extract کنید؛ داخل آن app-debug.apk قرار دارد.

نکته‌ها:
- این APK نسخه آزمایشی است و پرداخت واقعی بازار یا فعال‌سازی امن VIP ندارد.
- ساخت اولین بار ممکن است چند دقیقه طول بکشد.
- اگر workflow خطا داد، از بخش Build log متن خطا یا اسکرین‌شات بفرستید.
