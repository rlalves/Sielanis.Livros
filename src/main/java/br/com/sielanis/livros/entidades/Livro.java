package br.com.sielanis.livros.entidades;

public class Livro {
	private long id;
	private String titulo;
	private String autor;
	private long paginas;
	
	public Livro(long id, String titulo, String autor, long paginas)
	{
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}
	
    // Getter para a propriedade 'id'
    public long getId() {
        return id;
    }

    // Setter para a propriedade 'id'
    public void setId(long id) {
        this.id = id;
    }

    // Getter para a propriedade 'titulo'
    public String getTitulo() {
        return titulo;
    }

    // Setter para a propriedade 'titulo'
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter para a propriedade 'autor'
    public String getAutor() {
        return autor;
    }

    // Setter para a propriedade 'autor'
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Getter para a propriedade 'paginas'
    public long getPaginas() {
        return paginas;
    }

    // Setter para a propriedade 'paginas'
    public void setPaginas(long paginas) {
        this.paginas = paginas;
    }
}
