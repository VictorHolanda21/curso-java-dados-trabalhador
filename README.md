
# Sobre

Programa criado através do curso "[Java COMPLETO Programação Orientada a Objetos + Projetos](https://www.udemy.com/course/java-curso-completo/)" de [Nelio Alves](https://github.com/acenelio/composition1-java)

# Funcionamento

```mermaid
classDiagram
	Worker -->"1" Departament
	Worker -->"*" HourContract
	
	class Worker{
		- name String
		- level WorkerLevel
		- baseSalary Double 
		- departament Departament
		-List~HourContract~  contracts
		+ addContract(contract: HourContract): void
		+ removeContract(contract: HourContract) void
		+ income(year: Integer, month: Integer) double
	}
	
	class Departament{
		- name String
	}


	class HourContract{
		- date Date
		- valuePerHour Double
		- hours Integer
		+ totalValue() Double
	}
	
	class  WorkerLevel{  
		 <<enumeration>>  
		 JUNIOR  
		 MID_LEVEL  
		 SENIOR  
	}
	
```
