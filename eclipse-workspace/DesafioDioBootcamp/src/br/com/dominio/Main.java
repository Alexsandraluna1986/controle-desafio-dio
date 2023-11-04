package br.com.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Cursos curso1 = new Cursos();
		curso1.setTitulo("JAVA INICIANTE");
		curso1.setDescricao("Curso de programação");
		curso1.setCargaHoraria(60);
		
		Cursos curso2 = new Cursos();
		curso2.setTitulo("JAVA AVANÇADO");
		curso2.setDescricao("Curso de programação POO");
		curso2.setCargaHoraria(45);
		
		System.out.println (curso1);
		System.out.println (curso2);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Phython INICIANTE");
		mentoria1.setDescricao("Curso de programação");
		mentoria1.setData(LocalDate.now());
		
		Mentoria mentoria2 = new Mentoria();
		mentoria2.setTitulo("Phython AVANÇADO");
		mentoria2.setDescricao("Curso de programação POO");
		mentoria2.setData(LocalDate.now());
		
		
		/*System.out.println (mentoria1);
		System.out.println (mentoria2);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Java Develop");
		bootcamp.setDescricao("programaçao");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		bootcamp.getConteudos().add(mentoria2);
		
		Devs devsandra = new Devs();
		devsandra.setNome("SANDRA");
		devsandra.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos" + devsandra.getConteudosInscristos());
		devsandra.progredir();
		System.out.println("------------");
		System.out.println("Conteudos Inscritos" + devsandra.getConteudosInscristos());
		devsandra.progredir();
		System.out.println("Conteudos Concluidos" + devsandra.getConteudosConcluidos());
		System.out.println("------------");
		System.out.println("XP: "+ devsandra.calcularTotalXp());

		
		Devs joao = new Devs();
		joao.setNome("joao");
		joao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos" + joao.getConteudosInscristos());
		joao.progredir();
		System.out.println("------------");
		System.out.println("Conteudos Inscritos" + joao.getConteudosInscristos());
		joao.progredir();
		System.out.println("Conteudos Concluidos" + joao.getConteudosConcluidos());
		System.out.println("------------");
		System.out.println("XP: "+ joao.calcularTotalXp());

		
		


				
				

	}

}
