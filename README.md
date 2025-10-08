# Respostas sobre Encapsulamento em Java

**Autor:** Vinicius Evangelista de Souza

---

## Análise de Alterações na Classe `CorpoHumano`

### Questão 1: Atribuição direta a um atributo privado

**Alteração:** Incluir a linha `c1.massa = "2";` logo após a instanciação do objeto `c1`.

**Ocorrência:** Ocorrerá um **erro de compilação**.

**Conclusão:** O erro acontece porque o atributo `massa` foi declarado como `private` na classe `CorpoHumano`. Isso significa que ele não pode ser acessado diretamente de fora da classe, como na classe `Main`. Essa restrição é a base do **encapsulamento**, que protege o estado interno do objeto contra modificações indevidas. Além disso, a tentativa de atribuir uma `String` (`"2"`) a uma variável do tipo `float` ou `double` também causaria um erro de tipo.

---

### Questão 2: Alterando a visibilidade do atributo

**Alteração:** Mudar a linha `private float Massa` para `public float Massa`.

**Ocorrência:** O código **compilará e executará com sucesso**, permitindo o acesso direto ao atributo `Massa`.

**Conclusão:** Ao mudar a visibilidade de `private` para `public`, a proteção do encapsulamento é removida. Isso permite que o atributo `Massa` seja acessado e modificado diretamente de qualquer outra classe, como a `Main`. Embora o código funcione, essa prática **não é recomendada**, pois elimina a capacidade de validação e controle sobre os dados do objeto.

---

### Questão 3: Alterando a visibilidade de um método `setter`

**Alteração:** Mudar a linha `public setVolume(float volume)` para `private setVolume(float volume)`.

**Ocorrência:** Ocorrerá um **erro de compilação**.

**Conclusão:** O erro acontece porque a classe `Main` tenta chamar o método `setVolume()`, que agora é `private`. Um método `private` só pode ser acessado de dentro da própria classe onde foi declarado. Portanto, a classe `Main` não tem permissão para usar esse método. Isso reforça o princípio do encapsulamento, onde o acesso aos métodos que alteram o estado do objeto é restrito para garantir que as regras de negócio (como validação de dados) sejam sempre aplicadas.
