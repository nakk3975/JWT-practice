package com.ahn.shop.member;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class MyUserDetailService implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var result = memberRepository.findByUsername(username);
        if(result.isEmpty()) {
            throw new UsernameNotFoundException("그런 아이디 없음");
        }
        var user = result.get();

        ArrayList<GrantedAuthority> authorities = new ArrayList<>();
        // 나중에 API에서도 출력가능
        authorities.add(new SimpleGrantedAuthority("일반유저"));

        return new User(user.getUsername(), user.getPassword(), authorities);
    }
}
