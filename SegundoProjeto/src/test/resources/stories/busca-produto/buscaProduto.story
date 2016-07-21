Funcionalidade: Buscar um item, adicioná-lo ao carrinho e logar

Narrativa:
Para obter Simular a busca de um produto e o acesso ao site
Como um usuário válido
Desejo buscar um produto, acicioná-lo ao carrinho e logar no sistema

Cenário: Buscar um produto, adicionar ao carrinho e logar no site
Dado que vou para a tela "Pagina Inicial"
Quando informo "pneu" no campo "Campo Buscar"
Quando clico em "Botao Buscar"
Então será exibido "Você buscou por pneu."
Dado que estou na tela "Pagina de Resultado de Busca"
Quando clico em "Primeiro Item da Busca"
Dado que estou na tela "Pagina Descricao do Produto"
Então será exibido "Detalhes do produto:"
Quando clico em "Botao Adicionar ao Carrinho"
Então será exibido "Produto"
E será exibido "Quantidade"

Cenário: Buscar um produto que não retorna resultado
Dado que vou para a tela "Pagina Inicial"
Quando informo "12321643764125367123" no campo "Campo Buscar"
Quando clico em "Botao Buscar"
Então será exibido "Sua busca não retornou nenhum produto."
