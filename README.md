# by "TTT" team


**примечания:** 
2) Тест падает, если h2 перекрываюстся каким-то другим файлом стилей, название файла выводится в консоль. 
Тест падает, если нет headers.css, тест проходится, если ничего не перекрывает заголовок из headers.

## Задачи Hackathon </beCoder> 2022 от Sportmaster Lab

1. Любовь и лошади
Не все лошади из табуна любили воду. А ковбои очень любили своих лошадей. Поэтому ковбои построили специальную лодку для перевозки большого количества лошадей через реку.
Необходимо описать все тесты (тест-кейсы), которые вы проведете, чтобы убедиться в том, что лодка будет служить долго и выполнять свою функцию – перевозить лошадей через реки без их контакта с водой.
Если понадобятся дополнительные (предварительные) эксперименты, опишите их. Если вам не хватает деталей и ограничений – придумайте их. Опишите, что еще могли бы упустить (не предусмотреть в требованиях) ковбои после распития пива и виски.
В процессе тестирования ни одно животное не должно пострадать. Да, лошади умеют плавать, так что при погружении возможны только душевные страдания отдельных особей, что в данном случае допускается.
Представьте, что ковбои потом решили открыть бизнес по изготовлению таких лодок, и каждую лодку они хотят тестировать. Подумайте, можно ли удешевить этот процесс, избавившись от лишних тестов.

2. QA фронту не верит
Есть статичная веб-страница на диске вашего компьютера. Она состоит из файла .html и набора прочих ресурсов в той же папке (изображения, скрипты, стили, шрифты). Разработчики никак не хотят придерживаться соглашения о том, чтобы хранить стили заголовков в файле headers.css.
Надо написать автотест (код), который находит файл стилей (помимо headers.css), который меняет цвет заголовков H2 (по сравнению с вариантом без подключения этого файла).
Дополнительное условие: использовать браузерный рендеринг, Selenium (можно Selenide, Appium и прочие обвязки вокруг веб-драйвера), любой язык программирования.
Подсказка: можно сравнивать отображение заголовков на странице без какого-то файла (файлов) и с ним. Эталоном является цвет заголовков с единственным подключенным файлом стилей, который упоминался выше.

3. ЯМы тестировщики
Написать автотест (код), который проверяет, что на стартовой странице какого-то сайта количество личных местоимений 1-го лица больше, чем количество остальных личных местоимений.


