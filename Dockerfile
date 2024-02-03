FROM openjdk:11
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp/src/main/com/bancos
# executa o comando javac.exe Bacen.java para compilar a classe
RUN javac Bacen.java
# executa o comando java.exe Bacen para executar a classe
CMD ["java", "Bacen"] 
