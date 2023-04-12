package ss8_clean_code_and_refactory.mvc.service;

import ss8_clean_code_and_refactory.mvc.repository.IStudentRepository;
import ss8_clean_code_and_refactory.mvc.repository.StudentRepository;

public class StudentService implements IStudentService {
    private IStudentRepository iStudentRepository = new StudentRepository();


    @Override
    public void displayStudent() {
            iStudentRepository.displayStudent();
    }

}
