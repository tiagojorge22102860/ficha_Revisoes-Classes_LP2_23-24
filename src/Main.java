public class Main {

    static Pessoa[] tresAmigos(){
        Pessoa[] amigos ={new Pessoa("Luke","Skywalker"),new Pessoa("Han","Solo"),new Pessoa()};
        return amigos;
    }

    static Pessoa[] apenasNomesQueComecamCom(Pessoa[]lista, char letra){
        Pessoa[]filtrado=new Pessoa[lista.length];
        int count = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].nome.startsWith(String.valueOf(letra))){
                filtrado[i]=lista[i];

            }
        }
        for (int i = 0; i < filtrado.length; i++) {
            if (filtrado[i]!=null){
                count++;
            }
        }
        Pessoa[]filtro2=new Pessoa[count];
        int j=0;
        for (int i = 0; i < filtrado.length; i++) {
            if (filtrado[i]!=null){
                filtro2[j]=filtrado[i];
                j++;
            }
        }

        return filtro2;
    }

    static Pessoa[] filtroPessoa(){
        Pessoa[]lista={new Pessoa("Luke","Skywalker"),new Pessoa("Bruce","Lee"),new Pessoa("Lobisomem","Esfomeado")};
        return apenasNomesQueComecamCom(lista,'l');
    }

    public static void main(String[] args) {

    }
}