package client;

import stub.EtudiantWService;
import stub.Student;
import stub.StudentService;

import java.util.List;

public class ClientSOAP {
    public static void main(String[] args) {

        EtudiantWService wsdl=new StudentService().getEtudiantWServicePort();
        List<Student> liste=wsdl.getEtudiants();
        for(Student s:liste){
            System.out.println(s.getNom()+" "+s.getPrenom()+" "+s.getGenre());
        }
    }
}
