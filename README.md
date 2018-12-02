# lesson-analysis
Програма для оптимізації аналізу відвіданого уроку.

(c) Над створенням програми працював: Кузьменко Олександр (okuzmenkoa@gmail.com)

### Початок роботи ###
1. Завантажити архів з програмою: https://github.com/KAleksandr/lesson_analysis.git
2. Розархівувати завантажений архів
3. Запустити *start.bat*(Windows), для інших систем lesson_analysis.jar

### Загальні відомості про програму: ###
Програма реалізована засобами мови програмування Java з використанням бібліотеки графічних компонентів JavaFx. Вибір мови програмування Java пов'язаний насамперед із тим, що програми розроблені засобами даної мови програмування – можуть виконуватись на комп'ютерах з різними операційними системами (наприклад: Linux, Windows, MacOS, тощо).

### Аналіз уроку складається з двох основних програмних компонентів: ###
- Компонент, який містить логіку відображення графічного інтерфейсу та взаємодії з користувачем
- Компонент, що містить логіку формування файлу аналізу уроку із заданого числового коду

### Опис формату вхідних даних: ###
Для роботи з програмою – потрібно запусти start.bat файл та заповнити поля. Аналіз уроку за компонентами заповнювати використовуючи довідник (Електронний аналіз уроку). На основі кодів з цього файлу – програма згенерує текст у відповідних рядках. Кожен рядок, повинен починатись із числа, можна викоритовувати декілька чисел розподілених пробілом. 

### Деталі алгоритму роботи програми: ###
Під час запуску – програма зчитує файл з реченнями, і формує табицю відповідності чисел та речень. Під час обробки числового коду – програма аналізує список чисел, і для кожного числа знаходить відповідне речення у таблиці відповідності чисел та речень (якщо користувач помилково ввів число, для якого нема речення у таблиці відповідності – програма просто проігнорує дане число). Створюється шаблон "Аналізу уроку" та заповнюється відповідними полями, які ввів користувач та реченями які конвертувалися із числових кодів. Даний заповнений шаблон зберігається на диску в папку lesson.


### Графічний інтерфейс програми: ###
На даних зображеннях наведено приклад роботи програми:
![Screenshot](https://raw.githubusercontent.com/KAleksandr/lesson_analysis/master/src/main/resources/images/analysisLesson.jpg)
![Screenshot](https://raw.githubusercontent.com/KAleksandr/lesson_analysis/master/src/main/resources/images/lesson_analysis.png)