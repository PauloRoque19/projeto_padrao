# Métodos Avançados de Programação

## UNIESP Faculdades

### Professora

* Drª Alana Morais ([alanamm.prof@gmail.com](mailto:alanamm.prof@gmail.com))

### Aluno
Paulo Henrique Roque da Silva


### Padrão Comportamental: 
	Mediator: centraliza operações complexas de comunicação e controle entre objetos relacionados.
	

## Padrão Mediator

### Problema: 

Considere a implementação de caixas de diálogo em uma interface gráfica de usuário. Uma caixa de diálogo usa 
uma janela para apresentar uma coleção de widgets, tais como botões, menus e campos de entrada.
 
 ![The quick brown fox](https://user-images.githubusercontent.com/55522424/83318158-6a97e900-a208-11ea-9df5-755f4f67e9d1.png)
 
Frequentemente, existem dependências entre os widgets no diálogo. Por exemplo, um botão torna-se desabilitado quando um certo 
campo de entrada está vazio. A seleção de uma entrada em uma lista de escolhas pode mudar o conteúdo de um campo de entrada. Reciprocamente, digitar texto no campo de entrada pode selecionar automa- ticamente uma ou mais entradas correspondentes na 
list box. Uma vez que aparece texto no campo de entrada, outros botões podem se tornar habilitados, permitindo ao usuário fazer 
alguma coisa com o texto, tal como mudar ou deletar a coisa à qual o mesmo se refere.

Diferentes caixas de diálogo terão diferentes dependências entre widgets. Assim, muito embora diálogos exibam os mesmos 
tipos de widgets, não podem simplesmente reutilizar as classes widget disponíveis no ambiente de desenvolvi- mento; elas devem 
ser customizadas para refletir as dependências específicas do diálogo. A customização individual das mesmas através de subclasses 
seria tediosa, uma vez que muitas classes estão envolvidas.

Você pode evitar esses problemas encapsulando o comportamento coletivo num objeto mediator separado. Um mediator, 
ou mediador,é responsável pelo controle e coordenação das interações de um grupo de objetos. O mediador funciona como 
um intermediário que evita que os objetos do grupo referenciem uns aos outros explicitamente. Os objetos somente conhecem 
o mediador, desta forma reduzindo o número de interconexões.

Quando usar o design patterns Mediator:


• um conjunto de objetos se comunica de maneiras bem-definidas, porém complexas. As interdependências resultantes são desestruturadas e difíceis de entender.
• a reutilização de um objeto é difícil porque ele referencia e se comunica com muitos outros objetos.
• um comportamento que está distribuído entre várias classes deveria ser customizável, ou adaptável, sem excessiva especialização em subclasses.



### Solução: 


Definir um objeto que encapsula a forma como um conjunto de objetos interage. O Mediator promove o acoplamento fraco ao evitar que os objetos se refiram uns aos outros explicitamente e permite variar suas interações independentemente. Os objetos só conhece o Mediator que faz a intercomunições entre esses objetos;


### Consequências: 

O padrão Mediator tem os seguintes benefícios e problemas:

1. Ele limita o uso de subclasses.Um mediador localiza o comportamento que,de outra forma, estaria distribuído entre vários objetos. Mudar este comporta- mento exige a introdução de subclasses somente para o Mediador; classes Colleague podem ser reutilizadas como estão.

2. Ele desacopla colegas. Um mediador promove um acoplamento fraco entre colegas.Você pode variar e reutilizar as classes Colleague e Mediator independentemente.
3. Ele simplifica o protocolo dos objetos.Um mediador substitui interações muitos-para-muitos por interações um-para-muitos entre o mediador e seus colegas. Relacionamentos um-para-muitos são mais fáceis de compreender, manter e estender.



### Exemplo: 

https://github.com/PauloRoque19/projeto_padrao
