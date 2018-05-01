import java.util.ArrayList;

class ArrList {

    public static void main(String args[])
    {
        ArrayList <String> alunos = new ArrayList<String>();

        alunos.add("José");
        alunos.add("João");
        alunos.add("Joana");
        alunos.add("Joaquim");
        alunos.add("Jamelão");

        System.out.println(alunos.toString());
        System.out.println(alunos.get(2));
    }
}