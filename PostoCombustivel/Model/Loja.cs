/* Módulo Model Loja
 * Classe Loja
 * Descrição: Classe que representa a entidade Loja
 * Autor: Jussan Igor da Silva
 * Data: 22/05/2023
 * Versão: 1.0
 */

using Banco;

namespace Model
{
    public class Loja
    {
        public int LojaId { get; set; }
        public string Nome { get; set; }
        public string Endereco { get; set; }
        public string Telefone { get; set; }
        public string Email { get; set; }

        public Loja()
        {
        }

        public Loja(string Nome, string Endereco, string Telefone, string Email)
        {
            this.Nome = Nome;
            this.Endereco = Endereco;
            this.Telefone = Telefone;
            this.Email = Email;

            DataBase db = new DataBase();
            db.Lojas.Add(this);
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
            Loja loja = (Loja)obj;
            return this.LojaId == loja.LojaId;
        }

        public override int GetHashCode()
        {
            return this.LojaId;
        }

        public override string ToString()
        {
            return "Id: " + this.LojaId + " - Nome: " + this.Nome + " - Endereço: " + this.Endereco + " - Telefone: " + this.Telefone + " - Email: " + this.Email + "\n" ;
        }

        //------------------- CRUD -------------------//

        public static List<Loja> BuscaLoja()
        {
            DataBase db = new DataBase();
            List<Loja> lojas = (from u in db.Lojas select u).ToList();
            return lojas;
        }

        public static Loja BuscaLojaId(int LojaId)
        {
            DataBase db = new DataBase();
            return db.Lojas.Find(LojaId);
        }

        public static Loja UpdateLoja(int LojaId, string Nome, string Endereco, string Telefone, string Email)
        {
            DataBase db = new DataBase();
            Loja loja = db.Lojas.Find(LojaId);
            loja.Nome = loja.Nome;
            loja.Endereco = loja.Endereco;
            loja.Telefone = loja.Telefone;
            loja.Email = loja.Email;
            db.SaveChanges();
            return loja;
        }

        public static void DeleteLoja(int LojaId)
        {
            DataBase db = new DataBase();
            Loja loja = db.Lojas.Find(LojaId);
            db.Lojas.Remove(loja);
            db.SaveChanges();
        }
    }
}