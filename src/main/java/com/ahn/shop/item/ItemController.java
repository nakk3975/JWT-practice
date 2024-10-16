package com.ahn.shop.item;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ItemController {

    @GetMapping("/test2")
    String deleteItem() {
        // salt까지 해줌
        var result = new BCryptPasswordEncoder().encode("문자~~~");
        System.out.println(result);
        return "redirect:/about";
    }


}
