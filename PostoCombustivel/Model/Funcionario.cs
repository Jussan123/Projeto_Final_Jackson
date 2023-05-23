/* Módulo Model Funcionario
 * Classe Funcionario
 * Descrição: Classe que representa a entidade Funcionario
 * Autor: Lucas José Dias Caetano
 * Data: 22/05/2023
 * Versão: 1.0
 */

using Banco;

namespace Model
{
    public class Funcionario
    {
        public int FuncionarioId { get; set; }
        public string Nome { get; set; }
        public string Senha { get; set; }
        public string Funcao { get; set; }
        public int LojaId { get; set; }
        public Loja Loja { get; set; }

        public Funcionario()
        {
        }

        public Funcionario(string Nome, string Senha, string Funcao, int LojaId)
        {
            this.Nome = Nome;
            this.Senha = Senha;
            this.Funcao = Funcao;
            this.LojaId = LojaId;

            DataBase db = new DataBase();
            db.Funcionarios.Add(this);
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
            Funcionario funcionario = (Funcionario)obj;
            return this.FuncionarioId == funcionario.FuncionarioId;
        }

        public override int GetHashCode()
        {
            return this.FuncionarioId;
        }

        public override string ToString()
        {
            return "Id: " + this.FuncionarioId + " - Nome: " + this.Nome + " - Senha: " + this.Senha + " - Função: " + this.Funcao + " - Id Loja: " + this.LojaId + "\n" ;
        }

        //------------------- CRUD -------------------//

        public static List<Funcionario> BuscaFuncionario()
        {
            DataBase db = new DataBase();
            List<Funcionario> funcionarios = (from u in db.Funcionarios select u).ToList();
            return funcionarios;
        }

        public static Funcionario BuscaFuncionarioPorId(int FuncionarioId)
        {
            DataBase db = new DataBase();
            return db.Funcionarios.Find(FuncionarioId);
        }

        public static Funcionario UpdateFuncionario(int FuncionarioId, string Nome, string Senha, string Funcao, int LojaId)
        {
            DataBase db = new DataBase();
            Funcionario funcionario = db.Funcionarios.Find(FuncionarioId);
            funcionario.Nome = Nome;
            funcionario.Senha = Senha;
            funcionario.Funcao = Funcao;
            funcionario.LojaId = LojaId;
            db.SaveChanges();
            return funcionario;
        }

        public static void DeleteFuncionario(int FuncionarioId)
        {
            DataBase db = new DataBase();
            Funcionario funcionario = db.Funcionarios.Find(FuncionarioId);
            db.Funcionarios.Remove(funcionario);
            db.SaveChanges();
        }
    }
}