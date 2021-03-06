 # lesson-analysis ![Screenshot](https://raw.githubusercontent.com/KAleksandr/lesson_analysis/master/src/main/resources/images/lessonl.png)
Програма для оптимізації аналізу відвіданого уроку.
 Відвідування й аналізування уроку та виховного заходу — це основне джерело знань про якість навчання і виховання в школі, про можливості педагогічного колективу для підвищення своєї професійної компетентності. 
 Спостереження й аналіз уроку та виховного заходу — найскладніші серед посадових обов’язків заступників директорів із об’єктивних причин: доводиться аналізувати уроки з багатьох предметів інваріативної та варіативної частин навчальних планів, предмети за вибором, факультативи, позакласні заходи. 
 Тим паче, що викладання кожного предмета ґрунтується не лише на основі загальних педагогічних закономірностей, а й має специфіку в змісті й методах викладання.

Досить часто аналіз уроків здійснюють у хронологічній послідовності перебігу уроку, фіксують лише зовнішні чинники; часто відсутня обґрунтована мета відвідування уроку та його аналізу; іноді під час аналізу керівники шкіл обмежуються загальними вказівками та несуттєвими зауваженнями; під час спостереження за перебігом уроку не завжди виходять на зв’язок між триєдиною метою уроку і його типом, між метою і змістом навчального матеріалу.

► Такий аналіз можна зробити лише за наявності якісного програмного продукту.

Ідея: _Лебідь Тетяна Миколаївна_ (lebtannik@ukr.net)      
(c) Над створенням програми працював: _Кузьменко Олександр_ (okuzmenkoa@gmail.com)

### Початок роботи ###
1. Завантажити архів з програмою: https://github.com/KAleksandr/lesson_analysis/raw/master/src/main/resources/app/lesson_analysis.rar
2. Розархівувати завантажений архів
3. Завантажити та встановити Sun Java JRE (Якщо не встановлено!) https://java.com/ru/download/ 
3. Запустити *start.bat* (Windows), для інших систем lesson_analysis.jar

### Загальні відомості про програму: ###
Програма реалізована засобами мови програмування Java з використанням бібліотеки графічних компонентів JavaFx. Вибір мови програмування Java пов'язаний насамперед із тим, що програми розроблені засобами даної мови програмування – можуть виконуватись на комп'ютерах з різними операційними системами (наприклад: Linux, Windows, MacOS, тощо).

### Аналіз уроку складається з двох основних програмних компонентів: ###
- Компонент, який містить логіку відображення графічного інтерфейсу та взаємодії з користувачем
- Компонент, що містить логіку формування файлу аналізу уроку із заданого числового коду

### Опис формату вхідних даних: ###
Для роботи з програмою – потрібно запусти start.bat файл та заповнити поля. Аналіз уроку за компонентами заповнити використовуючи довідник (Електронний аналіз уроку). На основі кодів з цього файлу – програма згенерує текст у відповідних рядках. Кожен рядок, повинен починатись із числа, можна викоритовувати декілька чисел розподілених пробілом. 

### Деталі алгоритму роботи програми: ###
Програма використовується в двох режимах, для училища та школи, перемикач `CheckBox`. Під час запуску – програма зчитує файл з реченнями, і формує таблицю відповідності чисел та речень. Під час обробки числового коду – програма аналізує список чисел, і для кожного числа знаходить відповідне речення у таблиці відповідності чисел та речень (якщо користувач помилково ввів число, для якого нема речення у таблиці відповідності – програма просто проігнорує дане число). Потім поля зчитуються, конвертуються і передаються до шаблону. Далі створюється шаблон "Аналізу уроку" та заповнюється відповідними полями, які ввів користувач та реченями які конвертувалися із числових кодів. Даний заповнений документ `Аналіз уроку` зберігається на диску в папку lesson.


### Графічний інтерфейс програми: ###
На даних зображеннях наведено приклад роботи програми.

Форма заповнена в цілях демонстрації роботи програми.
#### Приклад 1 ####
![Screenshot](https://raw.githubusercontent.com/KAleksandr/lesson_analysis/master/src/main/resources/images/lesson_analysis.png)

#### Результатом роботи програми є створений файл "Аналіз уроку".

![Screenshot](https://raw.githubusercontent.com/KAleksandr/lesson_analysis/master/src/main/resources/images/analysisLesson.jpg)
#### Приклад 2 для школи ####
![Screenshot](https://raw.githubusercontent.com/KAleksandr/lesson_analysis/master/src/main/resources/images/lesson_analysis2.png)

![Screenshot](https://raw.githubusercontent.com/KAleksandr/lesson_analysis/master/src/main/resources/images/analysisLesson2.jpg)