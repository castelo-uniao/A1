class Carro 
{
    public String cor;
    public int portas;
    public String som;
    public String marca;
    public int ano;

    Carro(String cor, int portas, String som, String marca, int ano)
    {
        this.cor = cor;
        this.portas = portas;
        this.som = som;
        this.marca = marca;
        this.ano = ano;
    }

    public String buzinar()
    {
        return this.som + " " + this.som;
    }
}