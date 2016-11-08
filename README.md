# jsf-client-webservice

Cliente webservice sendo utilizado por aplicação JSF e Primefaces.

1) MB chama o servico do cliente webservice.
2) Aplicação solicita a lista de empregos para o webservice público do governo.
3) Servidor webservice devolve a lista de quinze empregos em formato JSON.
4) Cliente webservice converte a requisição em uma lista da entidade Empregos.
5) Renderiza os empregos no componente dataTable do Primefaces.
