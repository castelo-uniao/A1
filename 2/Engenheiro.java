class Engenheiro 
{
    public static void main(String args[])
    {
        Carro car1 = new Carro("azul", 4, "Bee bee", "Fiat", 1992);
        Carro car2 = new Carro("azul", 4, "Bee bee", "Fiat", 1992);
        Carro car3 = new Carro("azul", 4, "Bee bee", "Fiat", 1992);
        Carro car4 = new Carro("azul", 4, "Bee bee", "Fiat", 1992);
        Carro car5 = new Carro("azul", 4, "Bee bee", "Fiat", 1992);

        System.out.println(car2.buzinar());
    }
}