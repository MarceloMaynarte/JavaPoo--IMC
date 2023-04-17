public class Pessoa {

    //Declaração de variaveis que serão utilizadas
    private String nome;
    private String sobrenome;
    private int idade;
    private double peso;
    private double altura;
    private double IMC;

    //construtores
public Pessoa(String nome, String sobrenome, int idade, double peso, double altura, double IMC){
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
    this.IMC = IMC;
    CalculaIMC();
}
public String getNome(){
    return nome;
}
public void setNome(){
    this.nome = nome;
}
public String getSobrenome(){
    return sobrenome;
}
public void setSobrenome(){
    this.sobrenome  = sobrenome;
}
public int getIdade(){
    return idade;
}
public void setIdade(){
    this.idade = idade;
}
public double getPeso(){
    return peso;
}
public void setPeso(){
    this.peso = peso;
}
public double getAltura(){
    return altura;
}
public void setAltura(){
    this.altura = altura;
}
public double getIMC(){
    return IMC;
}
    //Metodo para realizar o calculo do imc

public void CalculaIMC(){
    IMC = peso / (altura*altura);
}

//Método para realizar a condicional e mostrar a faixa de massa corporal do usuário.
public void InformaObesidade(){
    if(IMC <18.5 ){
        System.out.println("Abaixo do peso.");
    }else if (IMC >=18.5 && IMC <=24.9){
        System.out.println("Peso Normal. ");
    }else if(IMC >=25 && IMC <= 29.9){
        System.out.println("Sobrepeso. ");
    }else if(IMC >=35 && IMC <=39.9){
        System.out.println("Obesidade Grau 1. ");
    }else{
        System.out.println("Obesidade Grau 3. ");
    }
}
}

