package ListaAva.Ex4;

public class Jogador {
 
        private int id_jogador;
        private float pontuacao;
        private int nivel;
        private int codigo;
        private String nome_invocador;

        public Jogador(String nome, float pontuacao, int nivel, int id, int cod)
        {
            this.nome_invocador = nome;
            this.id_jogador = id;
            this.nivel = nivel;
            this.nome_invocador = nome;
            this.codigo = cod;
            this.pontuacao = pontuacao;
        }


        public boolean ConferirCod(int cod)
        {
            if(this.codigo == cod){
                return true;
            }else{
                return false;
            }
        }

        public int nivel()
        {
            return this.nivel;
        }

        public float pontuacao()
        {
            return this.pontuacao;
        }

        public String nome_invocador()
        {
            return this.nome_invocador;
        }

        public int id_jogador()
        {
            return this.id_jogador;
        }

        public int AtualizarNivel(int valor_nv)
        {   
            this.nivel = valor_nv;
            return this.nivel;
        }
        
        public float AtualizarPontuacao(float valor_pt)
        {
            this.pontuacao = valor_pt;
            return this.pontuacao;
        }

}
