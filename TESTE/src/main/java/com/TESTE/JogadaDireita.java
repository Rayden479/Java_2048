package com.TESTE;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class JogadaDireita{

    @RequestMapping("/direita")
    public void jogadaDireita(){
        Interface.moveBlocos(Direcao.DIREITA);

    }

}


