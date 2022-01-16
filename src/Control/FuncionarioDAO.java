/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;


/**
 *
 * @author FMatusse
 */
public class FuncionarioDAO {
      EntityManagerFactory emf;
    EntityManager em;

    public FuncionarioDAO() {
    emf = Persistence.createEntityManagerFactory("hotel");
    em=emf.createEntityManager();
    }
    
    
    
    
    public void Salvar(Funcionario funcionario){
        em.getTransaction().begin();
        em.merge(funcionario);
        em.getTransaction().commit();
        emf.close();
    }
    
      public void Remover(Funcionario funcionario){
               em.getTransaction().begin();
          Query q = em.createNativeQuery("DELETE  FROM funcionario WHERE nome="+funcionario.getNome());
          q.executeUpdate();
        em.getTransaction().commit();
        emf.close();
    }
    
}
