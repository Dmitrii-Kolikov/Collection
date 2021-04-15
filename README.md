1. [JSON](#JSON)
2. [Jackson](#Jackson)
    1. [Десириализация JSON по модели дерева узлов](#Jackson1)
    2. [Основные аннотации для сериализации/десириализации](#Jackson2)
3.  [Основные аннотации часть 1](#Jackson3)
    1. [@JsonProperty](#Jackson4)
    2. [@JsonIgnore](#Jackson5)
4. [Основные аннотации часть 2](#Jackson6)
5. [Основные аннотации часть 2](#Jackson7) 
6. [Конфигурация Jackson](#Jackson8)



### JSON <a name="JSON"></a>

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


### Jackson <a name="Jackson"></a>

Jackson - Автоконфигурация для Jackson предоставляется, и Jackson является частью spring-boot-starter-json. Когда Jackson находится на пути к классам, компонент ObjectMapper настраивается автоматически. Для настройки конфигурации ObjectMapper предусмотрено несколько свойств конфигурации.

Подключение Jackson: https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind

### 1 Часть
Десириализация JSON по модели дерева узлов. <a name="Jackson1"></a>

![Джэксон](https://user-images.githubusercontent.com/74898966/114870380-51008f80-9e22-11eb-92c4-98a4690c7fc9.png)

### 2 Часть 
Основные аннотации для сериализации/десириализации <a name="Jackson2"></a>

![Json 2](https://user-images.githubusercontent.com/74898966/114890124-f02e8280-9e34-11eb-82d7-cf8faf656480.png)

### Основные аннотации часть 1 <a name="Jackson3"></a>
### @JsonProperty используется, когда имя поля Java класса не совпадает с именем поля в JSON  <a name="Jackson4"></a>

![джсон3](https://user-images.githubusercontent.com/74898966/114894233-a6e03200-9e38-11eb-84ba-6287463e6a9e.png)


### @JsonIgnore используется, когда требуется пропустить сериализацию/десириализацию поля Jaca класса.  <a name="Jackson5"></a>

![Джсон4](https://user-images.githubusercontent.com/74898966/114893982-6e405880-9e38-11eb-8aef-7be755fe91b5.png)


### Основные аннотации часть 2 <a name="Jackson6"></a>

![джсон5](https://user-images.githubusercontent.com/74898966/114901977-8ebfe100-9e3f-11eb-8ef7-4d3e181ab667.png)

### Основные аннотации часть 3 <a name="Jackson7"></a>

![json6](https://user-images.githubusercontent.com/74898966/114907255-178d4b80-9e45-11eb-82d3-10f166b833e1.png)


### @JsonManagedReference, @JsonBackReference

![json7](https://user-images.githubusercontent.com/74898966/114908217-14468f80-9e46-11eb-9b80-e8133f1c9c77.png)

### @JsonIdentityInfo

![json8](https://user-images.githubusercontent.com/74898966/114908524-625b9300-9e46-11eb-8af2-d0fc357a8a6b.png)


### Конфигурация Jackson <a name="Jackson8"></a>

![json10](https://user-images.githubusercontent.com/74898966/114912794-a18be300-9e4a-11eb-8368-9c1a6ca4e10d.png)

