/* Módulo Model TipoCombustivel
 * Classe TipoCombustivel
 * Descrição: Classe que representa a entidade TipoCombustivel
 * Autor: Lucas José Dias Caetano
 * Data: 22/05/2023
 * Versão: 1.0
 */

using Banco;

namespace Model
{
    public class TipoCombustivel
    {
        public int TipoCombustivelId { get; set; }
        public string NomeCombustivel { get; set; }
        public string Descricao { get; set; }
        public string Codigo { get; set; }

        public TipoCombustivel()
        {
        }

        public TipoCombustivel(string NomeCombustivel, string Descricao, string Codigo)
        {
            this.NomeCombustivel = NomeCombustivel;
            this.Descricao = Descricao;
            this.Codigo = Codigo;

            DataBase db = new DataBase();
            db.TiposCombustivel.Add(this);
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
            TipoCombustivel tipoCombustivel = (TipoCombustivel)obj;
            return this.TipoCombustivelId == tipoCombustivel.TipoCombustivelId;
        }

        public override int GetHashCode()
        {
            return this.TipoCombustivelId;
        }

        public override string ToString()
        {
            return "Id: " + this.TipoCombustivelId + " - Nome: " + this.NomeCombustivel + " - Descrição: " + this.Descricao + " - Código: " + this.Codigo + "\n";
        }

        //------------------- CRUD -------------------//

        public static List<TipoCombustivel> BuscaTipoCombustivel()
        {
            DataBase db = new DataBase();
            List<TipoCombustivel> tiposCombustivel = (from u in db.TiposCombustivel select u).ToList();
            return tiposCombustivel;
        }

        public static TipoCombustivel BuscaTipoCombustivelPorId(int TipoCombustivelId)
        {
            DataBase db = new DataBase();
            return db.TiposCombustivel.Find(TipoCombustivelId);
        }

        public static TipoCombustivel UpdateTipoCombustivel(int TipoCombustivelId, string NomeCombustivel, string Descricao, string Codigo)
        {
            DataBase db = new DataBase();
            TipoCombustivel tipoCombustivel = db.TiposCombustivel.Find(TipoCombustivelId);
            tipoCombustivel.NomeCombustivel = NomeCombustivel;
            tipoCombustivel.Descricao = Descricao;
            tipoCombustivel.Codigo = Codigo;
            db.SaveChanges();
            return tipoCombustivel;
        }

        public static void DeleteTipoCombustivel(int TipoCombustivelId)
        {
            DataBase db = new DataBase();
            TipoCombustivel tipoCombustivel = db.TiposCombustivel.Find(TipoCombustivelId);
            db.TiposCombustivel.Remove(tipoCombustivel);
            db.SaveChanges();
        }
    }
}