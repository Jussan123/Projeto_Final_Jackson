namespace Model
{
    public class Combustivel
    {
        public int IdCombustivel { get; set; }
        public int IdTipoCombustivel { get; set; }
        public TipoCombustivel TipoCombustivel { get; set; }
        public int QuantidadeEstoque { get; set; }
        public decimal Preco { get; set; }

    }
}