import javax.swing.JOptionPane;

class Swi {

    public static void main(String args[])
    {
        String res = JOptionPane.showInputDialog("Informe um número");

        switch (res) {
            case "1":
                System.out.println("Um");
                break;

            case "2":
                System.out.println("Dois");
                break;

            case "3":
                System.out.println("Três");
                break;

            default:
                System.out.println("Valor desconhecido");
                break;
        }
    }
}