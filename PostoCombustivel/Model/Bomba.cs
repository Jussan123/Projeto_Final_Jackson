/* Módulo Model Bomba
 * Classe Bomba
 * Descrição: Classe que representa a entidade Bomba
 * Autor: Jussan Igor da Silva
 * Data: 22/04/2023
 * Versão: 1.0
 */

using Banco;

namespace Model
{
    public class Bomba
    {
        public int BombaId { get; set; }
        public int TipoCombustivelId { get; set; }
        public TipoCombustivel TipoCombustivel { get; set; }
        public decimal LimiteMaximo { get; set; }
        public decimal LimiteMinimo { get; set; }
        public int MovimentacaoId { get; set; }
        public Movimentacao Movimentacao { get; set; }

        public Bomba()
        {
        }

        public Bomba(int TipoCombustivelId, decimal LimiteMaximo, decimal LimiteMinimo, int MovimentacaoId)
        {
            this.TipoCombustivelId = TipoCombustivelId;
            this.LimiteMaximo = LimiteMaximo;
            this.LimiteMinimo = LimiteMinimo;
            this.MovimentacaoId = MovimentacaoId;

            DataBase db = new DataBase();
            db.Bombas.Add(this);
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
            Bomba bomba = (Bomba)obj;
            return this.BombaId == bomba.BombaId;
        }

        public override int GetHashCode()
        {
            return this.BombaId;
        }

        public override string ToString()
        {
            return "Id: " + this.BombaId + " - Id Tipo Combustivel: " + this.TipoCombustivelId + " - Limite Máximo: " + this.LimiteMaximo + " - Limite Mínimo: " + this.LimiteMinimo + " - Id Entrada/Saida: " + this.MovimentacaoId + "\n" ;
        }

        //------------------- CRUD -------------------//

        public static List<Bomba> BuscaBomba()
        {
            DataBase db = new DataBase();
            List<Bomba> bombas = (from u in db.Bombas select u).ToList();
            return bombas;
        }

        public static Bomba BuscaBomba(int BombaId)
        {
            DataBase db = new DataBase();
            Bomba bomba = (from u in db.Bombas where u.BombaId == BombaId select u).FirstOrDefault();
            return bomba;
        }

        public static void UpdateBomba(int BombaId, int TipoCombustivelId, decimal LimiteMaximo, decimal LimiteMinimo, int MovimentacaoId)
        {
            DataBase db = new DataBase();
            Bomba bombaAtualiza = db.Bombas.Find(BombaId);
            bombaAtualiza.TipoCombustivelId = TipoCombustivelId;
            bombaAtualiza.LimiteMaximo = LimiteMaximo;
            bombaAtualiza.LimiteMinimo = LimiteMinimo;
            bombaAtualiza.MovimentacaoId = MovimentacaoId;
            db.SaveChanges();
        }

        public static void DeletaBomba(int BombaId)
        {
            DataBase db = new DataBase();
            Bomba bomba = (from u in db.Bombas where u.BombaId == BombaId select u).FirstOrDefault();
            db.Bombas.Remove(bomba);
            db.SaveChanges();
        }
    }
}