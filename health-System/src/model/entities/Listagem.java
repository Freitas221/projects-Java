package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.enums.Genero;
import model.exception.DomainExcepetion;

public class Listagem {

	private String name;
	private LocalDate data;
	private int idade;
	private Genero genero;
	private LocalDate atualDate;
	
	private static final DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Listagem(String name, LocalDate data, int idade, Genero genero, LocalDate atualDate) throws DomainExcepetion  {
		
		if(data.isBefore(atualDate)) {
			throw new DomainExcepetion("A data tem que ser igual a data de hoje.");
		}
		
		this.name = name;
		this.data = data;
		this.idade = idade;
		this.genero = genero;
		this.atualDate = atualDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getData() {
		return data;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public LocalDate getAtualDate() {
		return atualDate;
	}

	public void setAtualDate(LocalDate atualDate) {
		this.atualDate = atualDate;
	}
	
	public String toString() {
		return "\n"+ "Nome: " + name + "\n" + "Data de entrada: " + data.format(sdf) + "\n" + "Idade: " + idade + "\n" + "Gênero: " +genero;
	}
	
	
}