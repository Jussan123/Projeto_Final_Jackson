/* Módulo Model Movimentação
 * Classe Movimentação
 * Descrição: Classe que representa a entidade Movimentação
 * Autor: Jussan Igor da Silva
 * Data: 22/05/2023
 * Versão: 1.0
 */

using Banco;

namespace Model
{
    public class Movimentacao
    {
        public int MovimentacaoId { get; set; }
        public int CombustivelId { get; set; }
        public Combustivel Combustivel { get; set; }
        public int Quantidade { get; set; }
        public string TipoOperacao { get; set; }
        public DateTime DataHora { get; set; }
        public int LojaId { get; set; }
        public Loja Loja { get; set; }
        public int FornecedorId { get; set; }
        public Fornecedor Fornecedor { get; set; }

        public Movimentacao()
        {
        }

        public Movimentacao(int CombustivelId, int Quantidade, string TipoOperacao, DateTime DataHora, int LojaId, int FornecedorId)
        {
            this.CombustivelId = CombustivelId;
            this.Quantidade = Quantidade;
            this.TipoOperacao = TipoOperacao;
            this.DataHora = DataHora;
            this.LojaId = LojaId;
            this.FornecedorId = FornecedorId;

            DataBase db = new DataBase();
            db.Movimentacoes.Add(this);
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
            Movimentacao movimentacao = (Movimentacao)obj;
            return this.MovimentacaoId == movimentacao.MovimentacaoId;
        }

        public override int GetHashCode()
        {
            return this.MovimentacaoId;
        }

        public override string ToString()
        {
            return "Id: " + this.MovimentacaoId + " - Id Combustivel: " + this.CombustivelId + " - Quantidade: " + this.Quantidade + " - Tipo Operação: " + this.TipoOperacao + " - Data/Hora: " + this.DataHora + " - Id Loja: " + this.LojaId + " - Id Fornecedor: " + this.FornecedorId + "\n" ;
        }

        //------------------- CRUD -------------------//

        public static List<Movimentacao> BuscaMovimentacao()
        {
            DataBase db = new DataBase();
            List<Movimentacao> movimentacoes = (from u in db.Movimentacoes select u).ToList();
            return movimentacoes;
        }

        public static Movimentacao BuscaMovimentacaoPorId(int MovimentacaoId)
        {
            DataBase db = new DataBase();
            return db.Movimentacoes.Find(MovimentacaoId);
        }

        public static Movimentacao UpdateMovimentacao(int MovimentacaoId, int CombustivelId, int Quantidade, string TipoOperacao, DateTime DataHora, int LojaId, int FornecedorId)
        {
            DataBase db = new DataBase();
            Movimentacao movimentacao = db.Movimentacoes.Find(MovimentacaoId);
            movimentacao.CombustivelId = CombustivelId;
            movimentacao.Quantidade = Quantidade;
            movimentacao.TipoOperacao = TipoOperacao;
            movimentacao.DataHora = DataHora;
            movimentacao.LojaId = LojaId;
            movimentacao.FornecedorId = FornecedorId;
            db.SaveChanges();
            return movimentacao;
        }

        public static void DeleteMovimentacao(int MovimentacaoId)
        {
            DataBase db = new DataBase();
            Movimentacao movimentacao = db.Movimentacoes.Find(MovimentacaoId);
            db.Movimentacoes.Remove(movimentacao);
            db.SaveChanges();
        }
    }
}