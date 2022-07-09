package dev.tolga.p15lazyinstantiationofsingletonbeans.implementation;


import dev.tolga.p15lazyinstantiationofsingletonbeans.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {

    public String rotate(){
        return "Vehicle moving with Michelin tyres";
    }

}
