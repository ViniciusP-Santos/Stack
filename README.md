# Stack

Trabalho sobre Estrutura de Dados Pilha

O Problema:

Implementar um programa que faça validação de expressões matemáticas digitadas pelo
usuário. Utilizar a implementação da TAD Pilha. As expressões devem conter literais de
A a J, operadores (+ (adição), - (subtração), / (divisão), * (multiplicação), ^
(potenciação)) e delimitadores de escopo ( “(“, ”)”, ”[“, ”]”, ”{“, ”}” ). 

O programa deve prever 2 tipos de validação:

a) Todo delimitador que for aberto deve ser corretamente fechado. Não deve existir
delimitador que não esteja fechado ou delimitador que sobre sem um que abra
corretamente.

b) Expressões contendo parênteses, colchetes e chaves, considerando a precedência
entre os delimitadores: os escopos devem ser abertos e fechados corretamente e
deve-se verificar se os escopos dos colchetes abrangem os parênteses e os
escopos das chaves abrangem os colchetes.

Por exemplo:
- a expressão ((A+D)) *J) não é validada em nenhuma das opções.
- a expressão [({A+D}/B)*J] é validada apenas pela opção a).
- a expressão {[(A+D)/B]*J} é validada pela opções a) e b).
