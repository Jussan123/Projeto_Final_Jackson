namespace Model
{
    public class Bomba
    {
        public int IdBomba { get; set; }
        public int IdTipoCombustivel { get; set; }
        public TipoCombustivel TipoCombustivel { get; set; }
        public decimal LimiteMaximo { get; set; }
        public decimal LimiteMinimo { get; set; }
        public int IdEntradaSaida { get; set; }
        public EntradaSaida EntradaSaida { get; set; }
    }
}