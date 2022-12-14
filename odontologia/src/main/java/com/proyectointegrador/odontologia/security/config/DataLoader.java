package com.proyectointegrador.odontologia.security.config;


import com.proyectointegrador.odontologia.entity.AppUser;
import com.proyectointegrador.odontologia.entity.AppUserRole;
import com.proyectointegrador.odontologia.security.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    private IUserRepository userRepository;

    @Autowired
    public DataLoader (IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode("password");
        String password2 = passwordEncoder.encode("password2");

        userRepository.save(new AppUser("Mayra","mayto","mayto@mail.com",password, AppUserRole.ADMIN));
        userRepository.save(new AppUser("usuario","user","user@mail.com",password2, AppUserRole.USER));
    }
}
