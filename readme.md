Кофемашина

Необходимо разработать ПО для работы кофемашины и ее управления через API.

Функциональные требования:
● Кофемашина умеет готовить 3 стандартных напитка:
○ эспрессо, ○ американо, ○ капучино.
● Кофемашина умеет контролировать количество и остатки ингредиентов;
● Кофемашина умеет запоминать новые рецепты;
● Кофемашина собирает статистику и знает самый популярный напиток;
● Машина работает только с 8:00 и до 17:00 и не работает по выходным и
праздничным дням. Их необходимо получать по апи https://date.nager.at/Api. Добавить кэш.

Требования к технологиям:
● web-сервис на SpringFramework или SpringBoot,
● java выше 17,
● сборщик Maven,
● БД PostgresSQL (можно другую, с обоснованием),
● для тестирования API подключить SwaggerUI.