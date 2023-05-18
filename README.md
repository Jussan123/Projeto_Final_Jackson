# SENAC - Exercícios POO

Prezados alunos, este repositório será nossa forma de validação da execução dos exercícios da disciplina de POO. Desta forma, utilizem ele para como _template_ para a execução dos seus exercícios.

Junto deste repositório, estão os testes de cada exercício, bem como uma _action_ do Github para validar a completude dos testes. Não se preocupem se ocorrer erro em um primento momento, foquem nos testes dos métodos e classes que estão implementando ou já implementaram. O _action_ é apenas um "termômetro" do quando vocês já completaram.

Abaixo listo alguns comando importantes para auxiliar vocês na execução, lembrando que toda a execução também pode ser feita pelo VSCode.


## Build comand
```
javac -d target -cp target:./lib/junit-platform-console-standalone-1.9.0-RC1.jar:./lib/hamcrest-core-1.3:./lib/junit-4.13.2.jar src/*.java

cp -r ./src/archives ./target
```

## JUnit Commnad
```
java -jar ./lib/junit-platform-console-standalone-1.9.0-RC1.jar --class-path target --scan-class-path

```