# **Atividade Aula 1 - 13/02/2026**

## **1. Comentário do texto 1** 
O texto discute a diferença entre "programação" e "engenharia de software" e evidencia como as engenharias são fundamentadas em rigor técnico e teórico, além de produzirem resultados e produtos reais (físicos, muitas vezes palpáveis) já a engenharia de software, segundo o texto, não seguiu práticas tão rígidas e seus resultados são mais abstratos quando comparados às produções físicas das demais engenharias. Ao final o autor indica que a engenharia de software, à medida que o software se torna mais integrado às nossas vidas, deverá seguir o mesmo rigor habitual das engenarias tradicionais.

## **2. Comentário do texto 2** 
O trecho busca definir Engenharia de Software e enfatiza que ela diz respeito não apenas a escrever código (programar), mas também aos processos e ferramentas que garantem sua manutenção ao longo do tempo. Dessa forma, a engenharia de software, segundo o texto, deve buscar um desenvolvimento sustentável. Três princípios fundamentais garantem essa demanda: Tempo e mudança (diz respeito á como o código se adapta ao longo da vida); Escala e crescimento (como uma organização precisará se adaptar a medida que evolui); Compensações e custos (norteia a tomada de decisões, considerando os princípios anteriores).

## 3. Requisitos não funcionais 
Os requisitos não funcionais dizem respeito à qualidade e desempenho da aplicação. Normalmente o usuário ou o cliente, normalmente leigos, não lidam com essas demandas. Segundo os slides fornecidos, são requisitos não funcionais: 
  * **Portabilidade**, ou seja, a capacidade do software ser executado em diferentes ambientes.
  *  **Escalabilidade**, ou seja, a capacidade de lidar com grande volume de dados sem perda de desempenho.
  *  **Usabilidade**, ou seja, trata-se da facilidade com que o usuário interage e lida com o sistema sem que, no entanto, necessite de um manual ou guia.
  * **Segurança**, ou seja, a capacidade do sistema de proteger dados e operações contra acessos indevidos, garantindo confidencialidade, integridade e disponibilidade das informações.
  *  **Manutenibilidade**, ou seja, a facilidade de realizar correções, melhorias e adaptações no sistema sem comprometer sua estabilidade ou desempenho.

## 4. Portabilidade (Java) X Simplicidade (Pyton) 
Java é conhecido pelo lema “write once, run anywhere”. Isso significa que um programa escrito em Java pode ser executado em diferentes sistemas operacionais sem precisar ser reescrito, contudo, por ser uma linguagem orientada a objetos, apresenta uma complexidade muito maior quando comparada ao Pyton que, em contrapartida, se destaca pela sintaxe clara e bem próxima à linguagem humana. 

## 5. É possível testar tudo?
R: Não, pois existem infinitas hipóteses, portanto os códigos devem ser elaborados considerando, sobretudo, seus possíveis testes. 
int blech (int j) {
   j=j-1; //deveria ser j=j+1
   j=j/30000;
   return j; 
   } 

1. Quantas entradas mostram o erro?
2. 
R: 4
3. Quais são? 
R: 30000, -30000, 29999, -29999.

## 6. Listar e explicar 3 exemplos de tradeoffs
Tradeoffs são escolhas em que se ganha algo, mas se perde em outro aspecto. Dentre elas pode-se destacar:
 * **Desempenho X Consumo
Um sistema pode ser otimizado para rodar muito rápido, mas isso geralmente exige mais memória ou processamento.
 * **Segurança X Usabilidade
Quanto mais seguro um sistema, mais barreiras o usuário enfrenta.
* **Portabilidade vs. Desempenho
Linguagens portáveis permitem rodar o mesmo código em diferentes plataformas, mas linguagens nativas, compiladas diretamente para o hardware, sacrificam essa portabilidade para alcançar desempenho máximo.
