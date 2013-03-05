##Requisitos

* Registar aplicação no portal ost.pt e obter os respectivos Consumer Key e Consumer Secret.


##Instruções para a biblioteca

1. No Eclipse, importar o projecto a partir de código existente (File->Import->General->Existing Projects into Workspace);

2. Alterar as variáveis APIKEY no *package* utils, ficheiro Constants.java para a chave para servidor obtida na plataforma;

3. Quando correr o projecto, deverá verificar que o Compiler compilance level (Project->Properties->Java Compiler) é compatível com o JRE instalado.


##Bibliotecas utilizadas
* [GSON](http://code.google.com/p/google-gson/)
* [HTTP Client 4.2.3 Apache](http://hc.apache.org/downloads.cgi)
