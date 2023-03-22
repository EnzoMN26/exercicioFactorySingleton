package ex2;

enum Categoria { NORMAL, ADVANCED, PREMIUM };

public class Conta{
    Long numero;
    String nomeCorrentista;
    int saldoLivreInicial;
    int salAplicacaoInicial;
    double taxaRemuneracao;
    double taxaSaldoNegativo;
    Categoria categoriaInicial;

    public Conta(Long numero, String nomeCorrentista, int saldoLivreInicial,
    int salAplicacaoInicial, double taxaRemuneracao, double taxaSaldoNegativo,
    Categoria categoriaInicial){
        this.numero = numero;
        this.nomeCorrentista = nomeCorrentista;
        this.saldoLivreInicial = saldoLivreInicial;
        this.salAplicacaoInicial = salAplicacaoInicial;
        this.taxaRemuneracao = taxaRemuneracao;
        this.taxaSaldoNegativo = taxaSaldoNegativo;
        this.categoriaInicial = categoriaInicial;     
    }

    public Conta(Long numero, String nomeCorrentista, int saldoLivreInicial,
    int salAplicacaoInicial, double taxaRemuneracao, double taxaSaldoNegativo){
        this.numero = numero;
        this.nomeCorrentista = nomeCorrentista;
        this.saldoLivreInicial = saldoLivreInicial;
        this.salAplicacaoInicial = salAplicacaoInicial;
        this.taxaRemuneracao = taxaRemuneracao;
        this.taxaSaldoNegativo = taxaSaldoNegativo;
        this.categoriaInicial = Categoria.NORMAL;
   }    
   
   
   public Conta(Long numero, String nomeCorrentista, int saldoLivreInicial,
   int salAplicacaoInicial, double taxaRemuneracao){
    this.numero = numero;
    this.nomeCorrentista = nomeCorrentista;
    this.saldoLivreInicial = saldoLivreInicial;
    this.salAplicacaoInicial = salAplicacaoInicial;
    this.taxaRemuneracao = taxaRemuneracao;
    this.taxaSaldoNegativo = 0;
    this.categoriaInicial = Categoria.NORMAL;
  }    

  public Conta(Long numero, String nomeCorrentista, int saldoLivreInicial,
   int salAplicacaoInicial){
    this.numero = numero;
    this.nomeCorrentista = nomeCorrentista;
    this.saldoLivreInicial = saldoLivreInicial;
    this.salAplicacaoInicial = salAplicacaoInicial;
    this.taxaRemuneracao = 0;
    this.taxaSaldoNegativo = 0;
    this.categoriaInicial = Categoria.NORMAL;
  }

  public Conta(Long numero, String nomeCorrentista, int saldoLivreInicial){
    this.numero = numero;
    this.nomeCorrentista = nomeCorrentista;
    this.saldoLivreInicial = saldoLivreInicial;
    this.salAplicacaoInicial = 0;
    this.taxaRemuneracao = 0;
    this.taxaSaldoNegativo = 0;
    this.categoriaInicial = Categoria.NORMAL;
  }

  public Conta(Long numero, String nomeCorrentista){
    this.numero = numero;
    this.nomeCorrentista = nomeCorrentista;
    this.saldoLivreInicial = 0;
    this.salAplicacaoInicial = 0;
    this.taxaRemuneracao = 0;
    this.taxaSaldoNegativo = 0;
    this.categoriaInicial = Categoria.NORMAL;
  }
}
