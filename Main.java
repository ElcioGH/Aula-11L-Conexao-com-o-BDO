/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package TodoApp;

import controller.ProjectController;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.util.List;
import model.Project;
//import util.ConnectionFactory;

public class Main {
    
    

    public static void main(String[] args) throws SQLException  {
        
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        project.setName("Projeto teste");
        project.setDescription("description");
        projectController.save(project);
        
    //    project.setName("Novo nome do projeto");
    //     projectController.update(project);
        
   //    List<Project> projects = projectController.getALL();
   //    System.out.println("Total de projetos = " + projects.size());
        
   //     Connection c = ConnectionFactory.getConnection();
   //     PreparedStatement statement = null;
        
   //     ConnectionFactory.closeConnection(c, statement);
    }
}
