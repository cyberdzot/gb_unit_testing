__Вопрос 1: Почему использование тестовых заглушек может быть полезным при написании модульных тестов?__

- Изоляция тестов: Тестовыми заглушками можно заменить сложные части системы, которые могут затруднить написание и выполнение тестов. Заглушки позволяют сосредоточиться на тестировании конкретного модуля или компонента, изолируя его от остальной системы.

- Управление зависимостями: Модульные тесты часто зависят от других частей системы, что может затруднить их повторное использование и тестирование. Заглушки помогают контролировать зависимости между тестами, позволяя проводить тестирование независимо от внешних факторов.

- Упрощение тестирования сложных систем: В некоторых случаях тестируемая система может быть слишком сложной для непосредственного тестирования. В этом случае заглушки могут быть использованы для упрощения системы и облегчения тестирования.

- Улучшение покрытия тестами: Заглушки могут помочь расширить покрытие тестами, особенно в системах с большим количеством зависимостей. Они могут быть использованы для имитации поведения зависимостей, чтобы протестировать больше вариантов использования и сценариев.

- Стандартизация интерфейсов: Заглушки также могут помочь стандартизировать интерфейсы между компонентами системы, что облегчает написание тестов и улучшает повторное использование кода.

__Вопрос 2: Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?__

- Для проверки того, был ли метод вызван с определенными аргументами, следует использовать _verify()_. Этот метод позволяет утверждать, что указанный метод был вызван определенное количество раз, с конкретными аргументами или на конкретном объекте.

```java
@Test
void testMethodCall() {
    // Arrange
    MyClassUnderTest cut = new MyClassUnderTest();
    MyDependency dependency = mock(MyDependency.class);
    cut.setDependency(dependency);

    // Act
    cut.performAction();

    // Assert
    verify(dependency).doSomething("argument");
}
```

В этом примере мы создаем тестовую заглушку для класса _MyDependency_ и проверяем, что метод _doSomething()_ был вызван с аргументом _"argument"_.

__Вопрос 3: Какой тип тестовой заглушки следует использовать, 
если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?__

Если вам просто нужно вернуть определённое значение или вызвать исключение в ответ на вызов некоторого метода, вы можете использовать метод _when().thenReturn()_. Следующий пример показывает, как использовать этот метод для возврата фиксированного значения при вызове метода:
```java
import static org.mockito.Mockito.*;

public class Test {
    private SomeService service;
    
    @Before
    void init() {
        service = mock(SomeService.class);
        when(service.doSomething()).thenReturn("some fixed value");
    }
    
    @Test
    void testDoSomething() {
        String result = service.doSomething();
        assertEquals("some fixed value", result);
    }
}
```
Здесь мы используем Mockito для создания тестовой заглушки для класса _SomeService_ и настройки ее так, чтобы метод _doSomething()_ возвращал строку _"some fixed value"_. Затем мы вызываем этот метод в нашем тесте и сравниваем результат с ожидаемым значением.

__Вопрос 4: Какой тип тестовой заглушки вы бы использовали
для имитации взаимодействия с внешним API или базой данных?__

- Для имитации взаимодействия с внешним API или базой данных я бы использовал Mock-объекты. Mock-объекты позволяют имитировать поведение других объектов, не требуя при этом наличия этих объектов в коде. Это может быть полезно, когда вы хотите протестировать код, который взаимодействует с внешними системами, но не хотите, чтобы эти взаимодействия мешали вашему тесту.
Например, если ваш код вызывает API для получения некоторой информации, вы можете создать Mock-объект для этого API и использовать его в своем тесте. Это позволит вам контролировать, какие ответы будут возвращаться вашим кодом, и поможет вам убедиться, что он работает правильно.