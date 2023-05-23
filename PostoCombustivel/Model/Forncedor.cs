/* Módulo Model Fornecedor
 * Classe Fornecedor
 * Descrição: Classe que representa a entidade Fornecedor
 * Autor: Lucas José Dias Caetano
 * Data: 22/05/2023
 * Versão: 1.2
 */

 using Banco;

namespace Model
{
    public class Fornecedor
    {
        public int FornecedorId { get; set; }
        public string Nome { get; set; }
        public string Contato { get; set; }
        public string Endereco { get; set; }

        public Fornecedor()
        {
        }

        public Fornecedor(string Nome, string Contato, string Endereco)
        {
            this.Nome = Nome;
            this.Contato = Contato;
            this.Endereco = Endereco;

            DataBase db = new DataBase();
            db.Fornecedores.Add(this);
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
            Fornecedor fornecedor = (Fornecedor)obj;
            return this.FornecedorId == fornecedor.FornecedorId;
        }

        public override int GetHashCode()
        {
            return this.FornecedorId;
        }

        public override string ToString()
        {
            return "Id: " + this.FornecedorId + " - Nome: " + this.Nome + " - Contato: " + this.Contato + " - Endereço: " + this.Endereco + "\n";
        }

        //------------------- CRUD -------------------//

        public static List<Fornecedor> BuscaFornecedor()
        {
            DataBase db = new DataBase();
            List<Fornecedor> fornecedores = (from u in db.Fornecedores select u).ToList();
            return fornecedores;
        }

        public static Fornecedor BuscaFornecedorPorId(int FornecedorId)
        {
            DataBase db = new DataBase();
            return db.Fornecedores.Find(FornecedorId);
        }

        public static Fornecedor UpdateFornecedor(int FornecedorId, string Nome, string Contato, string Endereco)
        {
            DataBase db = new DataBase();
            Fornecedor fornecedor = db.Fornecedores.Find(FornecedorId);
            fornecedor.Nome = Nome;
            fornecedor.Contato = Contato;
            fornecedor.Endereco = Endereco;
            db.SaveChanges();
            return fornecedor;
        }

        public static void DeleteFornecedor(int FornecedorId)
        {
            DataBase db = new DataBase();
            Fornecedor fornecedor = db.Fornecedores.Find(FornecedorId);
            db.Fornecedores.Remove(fornecedor);
            db.SaveChanges();
        }
    }
}