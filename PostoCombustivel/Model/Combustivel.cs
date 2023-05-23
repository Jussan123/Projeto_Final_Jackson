/* Módulo Model Combustivel
 * Classe Combustivel
 * Descrição: Classe que representa a entidade Combustivel
 * Autor: Lucas José Dias Caetano
 * Data: 22/05/2023
 * Versão: 1.0
 */
using Banco;

namespace Model
{
    public class Combustivel
    {
        public int CombustivelId { get; set; }
        public int TipoCombustivelId { get; set; }
        public TipoCombustivel TipoCombustivel { get; set; }
        public decimal QuantidadeEstoque { get; set; }
        public decimal Preco { get; set; }

        public Combustivel()
        {
        }

        public Combustivel(int TipoCombustivelId, decimal QuantidadeEstoque, decimal Preco)
        {
            this.TipoCombustivelId = TipoCombustivelId;
            this.QuantidadeEstoque = QuantidadeEstoque;
            this.Preco = Preco;

            DataBase db = new DataBase();
            db.Combustiveis.Add(this);
            db.SaveChanges();
        }

        public override bool Equals(object obj)
        {
            if (obj ==null)
            {
                return false;
            }
            if (obj == this)
            {
                return true;
            }
            if (obj.GetType() != this.GetType())
            {
                return false;
            }
            Combustivel combustivel = (Combustivel)obj;
            return this.CombustivelId == combustivel.CombustivelId;
        }

        public override int GetHashCode()
        {
            return this.CombustivelId;
        }

        public override string ToString()
        {
            return "Id: " + this.CombustivelId + " - Id Tipo Combustivel: " + this.TipoCombustivelId + " - Quantidade Estoque: " + this.QuantidadeEstoque + " - Preço: " + this.Preco + "\n";
        }

        //------------------- CRUD -------------------//

        public static List<Combustivel> BuscaCombustivel()
        {
            DataBase db = new DataBase();
            List<Combustivel> combustiveis = (from u in db.Combustiveis select u).ToList();
            return combustiveis;
        }

        public static Combustivel BuscaCombustivelPorId(int CombustivelId)
        {
            DataBase db = new DataBase();
            Combustivel combustivel = db.Combustiveis.Find(CombustivelId);
            return combustivel;
        }

        public static Combustivel UpdateCombustivel(int CombustivelId, int TipoCombustivelId, decimal QuantidadeEstoque, decimal Preco)
        {
            DataBase db = new DataBase();
            Combustivel combustivel = db.Combustiveis.Find(CombustivelId);
            combustivel.TipoCombustivelId = TipoCombustivelId;
            combustivel.QuantidadeEstoque = QuantidadeEstoque;
            combustivel.Preco = Preco;
            db.SaveChanges();
            return combustivel;
        }

        public static void DeleteCombustivel(int CombustivelId)
        {
            DataBase db = new DataBase();
            Combustivel combustivel = db.Combustiveis.Find(CombustivelId);
            db.Combustiveis.Remove(combustivel);
            db.SaveChanges();
        }
    }
}