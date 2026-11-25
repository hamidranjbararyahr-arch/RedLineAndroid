RED LINE - Android Studio project
نسخه آزمایشی VIP با ویرایشگر کارت‌ها

مراحل ساخت APK:
1) پوشه RED_LINE_ANDROID_VIP را از حالت ZIP خارج کنید.
2) Android Studio > Open و همین پوشه را انتخاب کنید.
3) در صورت درخواست، Gradle JDK را روی Embedded JDK بگذارید.
4) اگر SDK نصب نیست: Tools > SDK Manager
   - SDK Platforms: Android 15 (API 35) را نصب کنید.
   - SDK Tools: Android SDK Build-Tools و Android SDK Platform-Tools را نصب کنید.
5) Sync Project with Gradle Files را بزنید و صبر کنید تا وابستگی‌ها دانلود شوند.
6) Build > Build Bundle(s) / APK(s) > Build APK(s)
7) پس از پایان، روی locate کلیک کنید. خروجی معمولاً:
   app/build/outputs/apk/debug/app-debug.apk

اگر Android Studio برای Gradle JDK پرسید، Embedded JDK را انتخاب کنید.
این نسخه آزمایشی است؛ پرداخت واقعی بازار و فعال‌سازی امن VIP هنوز پیاده‌سازی نشده.
