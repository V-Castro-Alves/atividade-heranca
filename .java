// Classe base Produto
class Produto {
    protected String nome;
    protected double preco;
    
    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    // Método exibirInfo()
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + String.format("%.2f", preco));
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
}

// Subclasse Livro
class Livro extends Produto {
    private String autor;
    private int numeroPaginas;
    private boolean capaDura;
    private String genero;
    
    // Construtor
    public Livro(String nome, double preco, String autor, int numeroPaginas, boolean capaDura, String genero) {
        super(nome, preco);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.capaDura = capaDura;
        this.genero = genero;
    }
    
    // Sobrescrita por extensão do método exibirInfo()
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama o método da classe pai
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Capa dura: " + (capaDura ? "Sim" : "Não"));
        System.out.println("Gênero: " + genero);
    }
    
    // Getters e Setters específicos
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    public boolean isCapaDura() {
        return capaDura;
    }
    
    public void setCapaDura(boolean capaDura) {
        this.capaDura = capaDura;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
}

// Subclasse Camisa
class Camisa extends Produto {
    private String cor;
    private String tamanho;
    private String material;
    private String marca;
    
    // Construtor
    public Camisa(String nome, double preco, String cor, String tamanho, String material, String marca) {
        super(nome, preco);
        this.cor = cor;
        this.tamanho = tamanho;
        this.material = material;
        this.marca = marca;
    }
    
    // Sobrescrita por extensão do método exibirInfo()
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama o método da classe pai
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Material: " + material);
        System.out.println("Marca: " + marca);
    }
    
    // Getters e Setters específicos
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getTamanho() {
        return tamanho;
    }
    
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public String getMaterial() {
        return material;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
}

// Programa principal para testar o sistema
public class SistemaProdutos {
    public static void main(String[] args) {        
        // Criando um objeto Livro
        Livro livro = new Livro(
            "Can't Hurt Me", 
            45.90, 
            "David Goggins", 
            364, 
            true, 
            "Autobiografia"
        );
        
        // Criando um objeto Camisa
        Camisa camisa = new Camisa(
            "Camisa Polo Básica", 
            89.90, 
            "Azul", 
            "M", 
            "Algodão", 
            "Polo"
        );
        
        // Exibindo informações do livro
        livro.exibirInfo();
        
        // Exibindo informações da camisa
        camisa.exibirInfo();
    }
}