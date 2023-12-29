## گزارش کار : 

#### در این آزمایش مطابق با پروژه نمونه قرار داده شد ابتدا برنامه را اجرا کردیم سپس با استفاده از برنامه ی YourKit برنامه را پروفایل کردیم. به دلیل  بزرگی حلقه ی لوپ temp و حافظه ی کم لپ تاپمان مجبور به کم تر کردن این حلقه شدیم تا برنامه به درستی و بدون خطا به پایان برسد.
<img width="1440" alt="program run" src="https://github.com/Shayan-Shabanzadeh/SE_lab8/assets/63391129/638e736b-8f3e-4790-9328-0e002545d503">

<img width="1325" alt="first profile" src="https://github.com/Shayan-Shabanzadeh/SE_lab8/assets/63391129/71eba4db-30bd-4de5-ab77-5ab7ffb06b3e">

<img width="1325" alt="first-memory" src="https://github.com/Shayan-Shabanzadeh/SE_lab8/assets/63391129/64ca854f-aaaa-466d-bfb6-01a70ce27b60">


#### در این پروژه با توجه به اطلاعات به دست امده از profiller متوجه شدیم تا حلقه ی لوپ و ارایه استفاده شده فضای حافظه ی بسیاری را به خود اختصاص میدهم در گام بعد تابع temp را بهبود دادیم. برای اینکار مفدار فضای مورد نیاز ارایه را از قبل به array list دادیم. این کار باعث شد تا حافظه ی بسیار کمتری صرف array list ما شود.
<img width="1325" alt="second profile" src="https://github.com/Shayan-Shabanzadeh/SE_lab8/assets/63<img width="1440" alt="temp-improvment" src="https://github.com/Shayan-Shabanzadeh/SE_lab8/assets/63391129/69b6e53d-272d-4e64-a6c5-3590e1159754">
391129/0df211c3-9ee8-40df-a89b-5947811b2705">

<img width="1325" alt="second profile" src="https://github.com/Shayan-Shabanzadeh/SE_lab8/assets/63391129/e827a278-ceab-4f75-8cc2-a8c92a854ffb">


<img width="1325" alt="second-memory" src="https://github.com/Shayan-Shabanzadeh/SE_lab8/assets/63391129/4686178b-db72-4e11-9ca1-cc1b598d9eb8">

#### در بخش دوم ازمایش به تابع sumOfSquares را اضافه کردیم. ای تابع وظیفه محاسبه جمع مجذور ها را بر عهده دارد. از عدد یک تا عدد ورودی مجذور اعداد را جمع باهم دیگر جمع می کند و در انتها نتیجه را نمایش می دهد.اما نکته مهم در روش توسعه این تابع این است که به هیچ وجه بهینه نیست. عکس های پروفایلر ضمیمه می شوند که حاکی از ان است که این تابع بهینه نبوده و فضای حافظه زیادی را نیز اشغال می کند.


---
## نویسندگان:
 - شایان شعبانزاده ۹۸۱۷۰۸۸۴
 - عطا رحیم زاده ۹۸۱۷۰۸۰۵


