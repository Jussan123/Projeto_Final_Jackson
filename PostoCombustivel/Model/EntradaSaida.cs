namespace Model
{
    public class EntradaSaida
    {
        public int IdEntradaSaida { get; set; }
        public int IdCombustivel { get; set; }
        public Combustivel Combustivel { get; set; }
        public int Quantidade { get; set; }
        public string TipoOperacao { get; set; }
        public DateTime DataHora { get; set; }
        public int LojaId { get; set; }
        public Loja Loja { get; set; }
        public int IdFornecedor { get; set; }
        public Fornecedor Fornecedor { get; set; }
    }
}