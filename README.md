# Checkpoint 2 - Programação Spring Boot com Persistência
## Integrantes
- *RM 98985* - Felipe Seiki Hashiguti
- *RM 555118* - Lucas Corradini Silveira
- *RM 557254* - Matheus Gregorio Mota
## Partes do código

![image](https://github.com/user-attachments/assets/279aafef-18ee-47fb-a1f7-2fd32059d56f)
<p>Public class criada para persistir os dados no banco de dados.</p>

![image](https://github.com/user-attachments/assets/10c6f675-150d-465a-ae8a-d8be4db5e459)
<p>Public enum (Classificacao) criado para parametrizar as diferentes faixas etárias disponíveis</p>

![image](https://github.com/user-attachments/assets/a58b1a14-9312-4c32-b6de-536c413649b8)
<p>Public enum (TipoBrinquedo) criado para parametrizar os diferentes tipos de brinquedos produzidos</p>

![image](https://github.com/user-attachments/assets/7bd42333-0d7c-4cad-8c1c-d1a4152b1bf0)
<p>Public Interface (BrinquedoRepository) criado para herdar metódos JpaRepository (save, findAll, findById) e persisitir e consultar no banco</p>

![image](https://github.com/user-attachments/assets/226de945-5723-4242-8b16-9f92ccb91d46)
<p>Public class (BrinquedoService) responsável pelas regras de negócio</p>

![image](https://github.com/user-attachments/assets/561ac95b-192d-4b78-9702-b18a4597f53c)
<p>Public class (BrinquedoController) responsável pelo controler de endpoints e requisições</p>

# Endpoints da classe BrinquedoController
- POST /brinquedos – Cadastra um novo brinquedo.
- PUT /brinquedos – Atualiza um brinquedo.
- GET /brinquedos – Lista todos os brinquedos.
- GET /brinquedos/{id} – Retorna um brinquedo pelo ID.
- DELETE /brinquedos/{id} – Remove um brinquedo.
