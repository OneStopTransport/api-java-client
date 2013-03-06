## Requisitos

* Registar conta de utilizador no portal [ost.pt](https://www.ost.pt/) e obter uma **API Key** (Chave para *Servidor*)

* [Eclipse](http://eclipse.org/) como IDE (caso pretenda usar outro, deve adaptar as instruções que se seguem)


## Instruções para importar a biblioteca

1. No **Eclipse** (ou no IDE à escolha), criar um novo projecto (`File -> New -> Java Project`);

2. Com o projecto criado, deverá substituir as pastas `src` e `libs` criadas pelas pastas existentes em **RestLibraryOST**.

   **NOTA**: no caso de encontrar vários erros do tipo `Class not found`, certifique-se que as bibliotecas da pasta _libs_ estão no `Build Path` do projecto.

3. Alterar a variável **APIKEY** na *package* `utils`, no ficheiro `Constants.java` para a chave para servidor obtida na plataforma (pedida nos Requisitos);

4. **IMPORTANTE**: Quando correr o projecto (`Run -> Run As -> Java Application -> Main`), deverá verificar que o **Compiler compilance level** (`Project -> Properties -> Java Compiler`) é compatível com o **JRE** instalado.


## Utilização

Para utilizar a API criada, poderá consultar o ficheiro `Main.java` na *package* `main` para visualizar alguns exemplos.

Como exemplo simples, o código apresentado abaixo permite consultar (e imprimir) as primeiras 25 paragens de transportes públicos devolvidas pela plataforma OST:

```java
int stopNumber = 25;
String stopsStr = OSTConnection.getStops(0, stopNumber, Constants.SMTUC);
StopList stops = (StopList)JSONParsing.parsed(stopsStr, JSONClasses.Stop);
System.out.println(stops);
```

## Bibliotecas utilizadas
* [GSON](http://code.google.com/p/google-gson/)
* [HTTP Client 4.2.3 Apache](http://hc.apache.org/downloads.cgi)
* [Junit](https://github.com/junit-team/junit)
