namespace Model
{
    public class Usuario
    {
        public int UsuarioId { get; set; }
        public string Nome { get; set; }
        public string Senha { get; set; }
        public string Funcao { get; set; }
        public int LojaId { get; set; }
        public Loja Loja { get; set; }

        public Usuario()
        {
        }

        public Usuario(string Nome, string Senha, string Funcao, int LojaId)
        {
            this.Nome = Nome;
            this.Senha = Senha;
            this.Funcao = Funcao;
            this.LojaId = LojaId;

            DataBase db = new DataBase();
            db.Usuarios.Add(this);
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
            Usuario usuario = (Usuario)obj;
            return this.UsuarioId == usuario.UsuarioId;
        }

        public override int GetHashCode()
        {
            return this.UsuarioId;
        }

        public override string ToString()
        {
            return "Id: " + this.UsuarioId + " - Nome: " + this.Nome + " - Senha: " + this.Senha + " - Função: " + this.Funcao + " - Id Loja: " + this.LojaId + "\n" ;
        }

        //------------------- CRUD -------------------//

        public static List<Usuario> BuscaUsuario()
        {
            DataBase db = new DataBase();
            List<Usuario> usuarios = (from u in db.Usuarios select u).ToList();
            return usuarios;
        }

        public static Usuario BuscaUsuarioPorId(int UsuarioId)
        {
            DataBase db = new DataBase();
            return db.Usuarios.Find(UsuarioId);
        }

        public static Usuario Update(int UsuarioId, string Nome, string Senha, string Funcao, int LojaId)
        {
            DataBase db = new DataBase();
            Usuario usuario = db.Usuarios.Find(UsuarioId);
            usuario.Nome = Nome;
            usuario.Senha = Senha;
            usuario.Funcao = Funcao;
            usuario.LojaId = LojaId;
            db.SaveChanges();
            return usuario;
        }

        public static void DeleteUsuario(int UsuarioId)
        {
            DataBase db = new DataBase();
            Usuario usuario = db.Usuarios.Find(UsuarioId);
            db.Usuarios.Remove(usuario);
            db.SaveChanges();
        }
    }
}