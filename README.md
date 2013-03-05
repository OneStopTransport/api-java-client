##Requisitos

* Registar aplicação no portal ost.pt e obter os respectivos Consumer Key e Consumer Secret.


##Instruções para a biblioteca

1. No Eclipse, criar um novo projecto (File->New->Java Project);

2. Com o projecto criado, deverá substituir as pastas src e libs criadas pelas pastas existentes em RestLibraryOST.

3. Alterar as variáveis APIKEY no *package* utils, ficheiro Constants.java para a chave para servidor obtida na plataforma;

4. Quando correr o projecto, deverá verificar que o Compiler compilance level (Project->Properties->Java Compiler) é compatível com o JRE instalado.


##Utilização

Para utilizar a API criada, poderá consultar o ficheiro Main.java na *package* main para visualizar alguns exemplos.
O código de seguida permite consultar as primeiras 25 paragens devolvidas pela plataforma OST:

```java
int stopNumber = 25;
String stopsStr = OSTConnection.getStops(0, stopNumber, Constants.SMTUC);
StopList stops = (StopList)JSONParsing.parsed(stopsStr, JSONClasses.Stop);
System.out.println(stops);
```

##Bibliotecas utilizadas
* [GSON](http://code.google.com/p/google-gson/)
* [HTTP Client 4.2.3 Apache](http://hc.apache.org/downloads.cgi)
* [Junit](https://github.com/junit-team/junit)
