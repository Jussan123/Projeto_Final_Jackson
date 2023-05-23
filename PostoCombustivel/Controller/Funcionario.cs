/* Módulo Controller Funcionario
* Descrição: Classe que representa o controller da entidade Funcionario
* Autor: Jussan Igor da Silva
* Data: 23/05/2023
* Versão: 1.0
*/

using Model;

namespace Controller
{
    public class Funcionario
    {
        public static Model.Funcionario CadastraFuncionario(
            string nome,
            string senha,
            string funcao,
            string lojaId,
            string email)
        {
            try{
                if (Model.Loja.BuscaLojaId(int.Parse(lojaId)) == null) throw new Exception("Erro ao cadastrar funcionário, loja não encontrada");
                Model.Funcionario funcionario = new Model.Funcionario(
                    nome,
                    senha,
                    funcao,
                    int.Parse(lojaId),
                    email
                );
                return funcionario;
            } catch (Exception) {
                throw new Exception("Erro ao cadastrar funcionário");
            }
        }

        public static Model.Funcionario AlteraFuncionario(
            string funcionarioId, 
            string nome,
            string senha, 
            string funcao, 
            string lojaId, 
            string email)
        {
            try
            {
                if (Model.Funcionario.BuscaFuncionarioPorId(int.Parse(funcionarioId)) == null) throw new Exception("Erro ao alterar funcionário, funcionário não encontrado");
                if (Model.Loja.BuscaLojaId(int.Parse(lojaId)) == null) throw new Exception("Erro ao alterar funcionário, loja não encontrada");
                return Model.Funcionario.UpdateFuncionario(
                    int.Parse(funcionarioId),
                    nome,
                    senha,
                    funcao,
                    int.Parse(lojaId),
                    email
                );
            } catch (Exception) {
                throw new Exception("Erro ao alterar funcionário");
            }
        }

        public static List<Model.Funcionario> ListaFuncionario()
        {
            try
            {
                return Model.Funcionario.BuscaFuncionario();
            } catch (Exception) {
                throw new Exception("Erro ao listar funcionários");
            }
        }

        public static Model.Funcionario BuscaFuncionarioPorId(string funcionarioId)
        {
            try
            {
                return Model.Funcionario.BuscaFuncionarioPorId(int.Parse(funcionarioId));
            } catch (Exception) {
                throw new Exception("Erro ao buscar funcionário");
            }
        }

        public static void ExcluiFuncionario(string funcionarioId)
        {
            try
            {
                if (Model.Funcionario.BuscaFuncionarioPorId(int.Parse(funcionarioId)) == null) throw new Exception("Erro ao excluir funcionário, funcionário não encontrado");
                Model.Funcionario.DeleteFuncionario(int.Parse(funcionarioId));
            } catch (Exception) {
                throw new Exception("Erro ao excluir funcionário");
            }
        }
    }
}