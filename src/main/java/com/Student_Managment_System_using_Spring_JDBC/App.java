package com.Student_Managment_System_using_Spring_JDBC;



import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Student_Managment_System_using_Spring_JDBC.Config.JdbcConfig;
import com.Student_Managment_System_using_Spring_JDBC.DAO.StudentDao;
import com.Student_Managment_System_using_Spring_JDBC.Model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        StudentDao studentDao=context.getBean(StudentDao.class);
        Scanner scanner=new Scanner(System.in);
        	
        System.out.println("Enter The Name: ");
        String name=scanner.nextLine();
        System.out.println("Enter Email: ");
        String email=scanner.nextLine();
        System.out.println("Enter Password: ");
        String password=scanner.nextLine();
        
        
        		
        		Student s=new Student(email, name, password);
        		
        		
        		studentDao.save(s);
        		
        		
        		
        
        
    }
}
