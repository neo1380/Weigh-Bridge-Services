package com.weighbridge.weighbridge.security.service;

import com.weighbridge.weighbridge.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
//    @Autowired
//    UserRepository userRepository;

    //    @Transactional
    public UserDetailsImpl loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
        User user = new User( "trueram33", "trueram@gmail.com", "unmai");
        user.setId(123);
        return UserDetailsImpl.build(user);
    }

}
