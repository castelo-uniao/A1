class Conta
{
    public String cliente;
    public Double saldo;

    Conta(String cliente, Double saldo)
    {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Double exibirSaldo()
    {
        return this.saldo;
    }

    public Boolean sacar(Double val)
    {
        if(this.saldo < val) {
            return false;
        }

        this.saldo = this.saldo - val;
        return true;
    }

    public void depositar(Double val)
    {
        this.saldo = this.saldo + val;
    }

    public void transferir(Double val, Conta conta)
    {
        if(this.sacar(val)) {
            conta.depositar(val);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}