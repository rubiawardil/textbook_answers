# ![banner](https://user-images.githubusercontent.com/81477445/172537390-78c913e9-4c7a-4b68-8473-631097c7ca54.png)

### Tecnologias: 

`Android Nativo (Java)`
`.NET 6 (C#)`
`Docker`
`SQL Server`

## Integrantes: 

- Gean Guilherme dos Santos (fullstack)
- Rúbia Aires Marques Wardil (fullstack)
- Paulo Melo (fullstack)
- Felipe Cordeiro (fullstack)

## MVP

 O MVP é do tipo Mágico de Oz e consiste na criação de uma página no instagram.
O perfil será destinado a estudantes e permitirá que sejam enviadas questões de livros para que o time procure as soluções manualmente e as envie de volta aos usuários. A interação com os usuários será feita a partir da DM e dos stories, mais especificamente através das caixas de perguntas que a rede social disponibiliza para uso.
Será requisitado o código ou nome do livro, capítulo, seção (caso exista) e o número do exercício.
Além do envio direto da solução para os usuários, serão feitos posts com os livros e exercícios mais requisitados, a fim de estimular a interação entre os perfis.

## Backlog do produto 

- Tarefas técnicas:

	- Preparar ambiente de desenvolvimento. (Gean e Paulo)
	- Criar esquema do banco de dados. (Rúbia e Felipe)

- História: Como usuário, eu quero poder me cadastrar e fazer login no sistema. 

	- Criar a interface de cadastro e login. (Gean)  
	- Implementar funcionalidade de registro dos usuários. (Felipe)  
	- Implementar funcionalidade de login. (Rúbia)  

- História: Como usuário, eu quero procurar um livro no sistema. 

	- Criar a interface de busca de livros. (Gean)  
	- Implementar funcionalidade da pesquisa pelo livro. (Paulo)
	- Criar a interface dos resultados da busca. (Rúbia)  
	
- História: Como usuário, eu quero visualizar a resposta e a solução de uma questão. 

	- Criar as interfaces de solução de um exercício. (Paulo)  
	- Criar a interface de visualização da solução do exercício. (Gean)
	- Implementar a busca das respostas no banco de dados. (Felipe) 

- História: Como usuário, eu quero poder avaliar as soluções enviadas por outros usuários. 

	- Criar botão de avaliação de respostas. (Gean) 
	- Implementar o registro da avaliação das respostas e atualização da solução para os demais usuários. (Rúbia)

- História: Como usuário, eu quero poder enviar respostas e soluções ao sistema. 

	- Criar a interface de edição e envio da resposta. (Paulo) 
	- Implementar o registro da resposta do usuário e disponibilizá-la para os demais. (Felipe)

## Protótipo

Disponível em: https://www.figma.com/file/byj5GnZjraBohLwEQUuJWM/Textbook-Answers?node-id=0%3A1

## Arquitetura

### Arquitetura Hexagonal

![arquitetura_hexagonal](https://user-images.githubusercontent.com/81477445/172556938-b05e1187-8e7e-44ae-ae5f-5c1d21bdf939.png)

### Domain-Driven Design

![ddd](https://user-images.githubusercontent.com/81477445/172562440-894c0938-4913-4b7c-a643-d9d0bcf76f22.png)

