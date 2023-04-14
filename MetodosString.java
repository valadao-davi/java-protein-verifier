public class MetodosString{
    public static void main (String[] args){
        //tema da aula: Métodos String - Obg -> conhecer os principais
        //1 - length() verifica o tamanho
        String firstName = "Davi ";
        System.out.println(firstName.length());
        //2 - concat() concatena uma String com outra
        String lastName = "Valadão";
        System.out.println(firstName.concat(lastName));
        //3 - equals() verifica se os dois valores são iguais
        System.out.println(firstName.equals(lastName));
        //4 - indexOf() mostra a primeira ocorrencia
        System.out.println(lastName.indexOf("V"));
        //5 - charAt() retorna o caractere localizado
        System.out.println(lastName.charAt(0));
        //6 - substring() retorna partes do texto
        String nameCompleted = "Davi Valadão";
        System.out.println(nameCompleted.substring(4, 7)); 
        //7 - toUpperCase() and toLowerCase() converte pra maiúsculas ou minuscúlos
        String myName = "KAIAN";
        System.out.println(myName.toLowerCase());
        System.out.println(nameCompleted.toUpperCase());
    }
}