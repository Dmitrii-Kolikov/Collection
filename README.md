# Collection

JSON это сокращение от JavaScript Object Notation — формата передачи данных. Как можно понять из названия, JSON произошел из JavaScript, но он доступен для использования на многих других языках, включая Python, Ruby, PHP и Java. Имеет расширение .json.

Синтаксис и структура
Объект JSON это формат данных — ключ-значение, который обычно рендерится в фигурных скобках. Когда вы работаете с JSON, то вы скорее всего видите JSON объекты в .json файле, но они также могут быть и как JSON объект или строка уже в контексте самой программы.
Вот так выглядит JSON объект:

{
  "first_name" : "Sammy",
  "last_name" : "Shark",
  "location" : "Ocean",
  "online" : true,
  "followers" : 987 
}

Сериализация означает преобразование объекта в строку.
Десириализация - это обратная операция (convert string -> object)

Jackson - Автоконфигурация для Jackson предоставляется, и Jackson является частью spring-boot-starter-json. Когда Jackson находится на пути к классам, компонент ObjectMapper настраивается автоматически. Для настройки конфигурации ObjectMapper предусмотрено несколько свойств конфигурации.

Подключение Jackson: https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind

1 Часть
Десириализация JSON по модели дерева узлов.

![Джэксон](https://user-images.githubusercontent.com/74898966/114870380-51008f80-9e22-11eb-92c4-98a4690c7fc9.png)

2 Часть 
Основные аннотации для сериализации/десириализации

![Json 2](https://user-images.githubusercontent.com/74898966/114890124-f02e8280-9e34-11eb-82d7-cf8faf656480.png)

Основные аннотации. Часть 1
@JsonProperty

![джсон 3](https://user-images.githubusercontent.com/74898966/114892042-9af37080-9e36-11eb-99de-b392991e316c.png)





### @JsonIgnore используется, когда требуется пропустить сериализацию/десириализацию поля Jaca класса.

![Джсон4](https://user-images.githubusercontent.com/74898966/114893526-fbcf7880-9e37-11eb-8267-2e9431b5c25a.png))




1) Рассмотрим десериализацию JSON по модели дерева узлов
2) Познакомимся с основными аннотациями для сериализации и десериализации JSON
3) Конфигурация Jackson
